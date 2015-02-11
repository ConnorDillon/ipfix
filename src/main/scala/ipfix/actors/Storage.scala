package ipfix.actors

import java.sql.{DriverManager, PreparedStatement}
import akka.actor.Props
import ipfix.ie.IEMap
import ipfix.protocol._

class Storage(dbDriver: String, connStr: String, ieMap: IEMap) extends BaseActor {
  Class.forName(dbDriver)
  val conn = DriverManager.getConnection(connStr)
  conn.setAutoCommit(true)

  def receive = {
    case FlowSet(template, flows) => insert(prepareInsert(template), flows)
  }

  def prepareInsert(template: Template): PreparedStatement = {
    val ies = template.fields.map(x => ieMap.ieByID(x.id))
    val colNames = ies.map(_.colName).mkString(", ")
    val placeHolders = ies.map(_.dataType.placeHolder).mkString(", ")
    val prepStr = s"INSERT INTO flows ($colNames) VALUES ($placeHolders);"
    log.info(s"preparing statement for template: ${template.id}: $prepStr")
    conn.prepareStatement(prepStr)
  }

  def insert(stmnt: PreparedStatement, flows: List[Flow]): Unit = {
    flows foreach { flow =>
      flow.fields.zipWithIndex foreach { case (field: Field, idx: Int) =>
        field.insert(stmnt, idx + 1)
      }
      stmnt.addBatch()
      log.info(s"add batch: $stmnt")
    }
    val results = stmnt.executeBatch()
    log.info(s"batch insert results: ${results.toList}")
  }

  override def postStop(): Unit = {
    conn.close()
    log.info("connection closed")
    super.postStop()
  }
}

object Storage {
  def apply(dbDriver: String, connStr: String, ieMap: IEMap): Props = Props(new Storage(dbDriver, connStr, ieMap))
}