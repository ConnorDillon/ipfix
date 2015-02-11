package ipfix.actors

import akka.actor.{ActorRef, Props}
import ipfix.ByteIterCounter
import ipfix.ie.IEMap
import ipfix.protocol._

class Loader(flowHandler: ActorRef, ieMap: IEMap) extends BaseActor {
  val templates = collection.mutable.Map[Int, Template]()

  def receive = {
    case Message(length, data) =>
      log.debug(s"got msg: length = $length (${data.length})")
      val byteIter = ByteIterCounter(data)
      while (byteIter.count < length) {
        val id: Int = byteIter.getU16AsInt
        id match {
          case x if x == Template.id =>
            updateTemplates(loadSet(Template.headerSize, loadTemplate, byteIter))
          case x if x == OptionsTemplate.id =>
            updateTemplates(loadSet(OptionsTemplate.headerSize, loadOptionsTemplate, byteIter))
          case x if x > 255 =>
            templates.get(x) match {
              case Some(template) =>
                flowHandler ! FlowSet(template, loadSet(template.minDataRecordSize, loadFlow(template), byteIter))
              case None =>
                3 to length foreach { _ => byteIter.next() }
            }
        }
      }
  }

  def loadSet[T <: Record](minSize: Int, fn: ByteIterCounter => T, byteIter: ByteIterCounter): List[T] = {
    val length = byteIter.getU16AsInt
    val records = collection.mutable.ListBuffer[T]()
    while (byteIter.count + minSize <= length) {
      log.debug(s"load record: byteIter.count: ${byteIter.count} + minSize: $minSize <= length: $length")
      records append fn(byteIter)
    }
    while (byteIter.count < length) {
      log.debug(s"clear padding: byteIter.count: ${byteIter.count} < length: $length")
      byteIter.next()
    }
    records.toList
  }

  def loadFlow(template: Template)(byteIter: ByteIterCounter): Flow = {
    val fields = template.fields.map { spec =>
      val length = if (spec.fieldLength < 65535) spec.fieldLength
                   else loadVarLength(byteIter)
      ieMap.load(spec.id, length, byteIter)
    }
    Flow(fields)
  }
  
  def updateTemplates(ts: List[Template]): Unit = {
    ts foreach { x =>
      templates(x.id) = x
      log.info(s"updated templates: ${x.id} = ${templates(x.id).toString}")
    }
  }

  def loadTemplate(byteIter: ByteIterCounter): Template = {
    val id = byteIter.getU16AsInt
    val fieldCount = byteIter.getU16AsInt
    val fields = List.fill(fieldCount)(loadFieldSpec(byteIter))
    new Template(id, fields)
  }

  def loadOptionsTemplate(byteIter: ByteIterCounter): OptionsTemplate = {
    val id = byteIter.getU16AsInt
    val scopeCount = byteIter.getU16AsInt
    val fieldCount = byteIter.getU16AsInt
    val scopeFields = List.fill(scopeCount)(loadScopeFieldSpec(byteIter))
    val fields = List.fill(fieldCount - scopeCount)(loadFieldSpec(byteIter))
    new OptionsTemplate(id, scopeFields ::: fields)
  }

  def loadFieldSpec(byteIter: ByteIterCounter): FieldSpecifier = {
    val id = byteIter.getU16AsInt
    val length = byteIter.getU16AsInt
    val enterpriseID = if (id > 32768) Some(byteIter.getInt) else None
    new FieldSpecifier(id, length, enterpriseID)
  }

  def loadScopeFieldSpec(byteIter: ByteIterCounter): ScopeFieldSpecifier = {
    val id = byteIter.getU16AsInt
    val length = byteIter.getU16AsInt
    val enterpriseID = if (id > 32768) Some(byteIter.getInt) else None
    new ScopeFieldSpecifier(id, length, enterpriseID)
  }

  private def loadVarLength(byteIterator: ByteIterCounter): Int = {
    val length = byteIterator.getU8AsInt
    if (length < 255) length
    else byteIterator.getU16AsInt
  }
}

object Loader {
  def apply(flowHandler: ActorRef, ieMap: IEMap): Props = Props(new Loader(flowHandler, ieMap))
}