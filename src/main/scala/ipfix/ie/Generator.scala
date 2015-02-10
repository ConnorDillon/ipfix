package ipfix.ie

import java.io.{FileReader, PrintWriter}
import com.opencsv.CSVReader

class Generator(csvFile: String) {
  private val ieList = parse

  private def parse: List[IE] = {
    val reader = new CSVReader(new FileReader(csvFile))
    val iter = reader.iterator()
    val ies = collection.mutable.ListBuffer[IE]()
    while (iter.hasNext) {
      val line = iter.next()
      val id = line(0)
      val name = line(1)
      val typ = line(2)
      val badTypes = List("basicList", "subTemplateList", "subTemplateMultiList")
      if (name.nonEmpty && typ.nonEmpty && name != "Reserved" && !badTypes.contains(typ)) {
        try {
          ies.append(new IE(id.toInt, name, typ, line(3), line(6)))
        } catch {
          case _: java.lang.NumberFormatException => ()
        }
      }
    }
    ies.toList
  }

  def genPostgreSQL(fileName: String, tableName: String): Unit = {
    val columns = ieList.map(_.genSQL).mkString(", ")
    save(fileName, s"CREATE TABLE $tableName ($columns\n);")
  }

  def genClasses(fileName: String, objectName: String): Unit = {
    val classes = ieList.map(_.genScala).mkString("\n\n")
    val pack = "package ipfix.ie"
    val imports = "import java.net.InetAddress\nimport java.sql.Timestamp\n" +
                  "import ipfix.ByteIterCounter\nimport ipfix.protocol._"
    save(fileName, s"$pack\n\n$imports\n\nobject $objectName {\n$classes\n}")
  }
  
  def genIEMap(fileName: String, objectName: String): Unit = {
    val maps = ieList.map(_.genIEMap).mkString(",\n")
    val pack = "package ipfix.ie"
    val imports = "import ipfix.ie.Elements._"
    save(fileName, s"$pack\n\n$imports\n\nobject $objectName extends IEMap {\n  val ieByID = Map(\n$maps\n  )\n}")
  }

  private def save(fileName: String, contents: String): Unit = {
    val writer = new PrintWriter(fileName, "UTF-8")
    writer.println(contents)
    writer.close()
  }

  private class IE(val id: Int, name: String, typ: String, smntcs: String, unts: String) {
    val typeMap = Map(
      "octetArray" -> ("Array[Byte]", "BytesField", "bytea"),
      "unsigned8" -> ("Int", "IntField", "integer"),
      "unsigned16" -> ("Int", "IntField", "integer"),
      "unsigned32" -> ("Int", "IntField", "integer"),
      "unsigned64" -> ("Long", "LongField", "bigint"),
      "signed8" -> ("Int", "IntField", "integer"),
      "signed16" -> ("Int", "IntField", "integer"),
      "signed32" -> ("Int", "IntField", "integer"),
      "signed64" -> ("Long", "LongField", "bigint"),
      "float32" -> ("Float", "FloatField", "real"),
      "float64" -> ("Double", "DoubleField", "double precision"),
      "boolean" -> ("Boolean", "BoolField", "boolean"),
      "macAddress" -> ("Array[Byte]", "BytesField", "macaddr"),
      "string" -> ("String", "StringField", "text"),
      "dateTimeSeconds" -> ("Timestamp", "DateField", "timestamp"),
      "dateTimeMilliseconds" -> ("Timestamp", "DateField", "timestamp"),
      "dateTimeMicroseconds" -> ("Timestamp", "DateField", "timestamp"),
      "dateTimeNanoseconds" -> ("Timestamp", "DateField", "timestamp"),
      "ipv4Address" -> ("InetAddress", "InetField", "inet"),
      "ipv6Address" -> ("InetAddress", "InetField", "inet")
    )

    val validUnits = List("bits", "entries", "flows", "octets", "frames", "hops", "messages", "microseconds",
                          "milliseconds", "nanoseconds", "seconds", "packets")
    val className = firstUpper(name)
    val colName = SnakeCase(name)

    val units = {
      if (validUnits.contains(unts)) firstUpper(unts)
      else "NoUnits"
    }
    val semantics = {
      if (smntcs.nonEmpty) firstUpper(smntcs)
      else "NoSemantics"
    }
    val (valType, fieldType, postgresType) = typeMap(typ)
    val dataType = {
      val x = firstUpper(typ)
      if (x == "String" || x == "Boolean") x + "IE"
      else x
    }

    private def firstUpper(x: String): String = x.head.toUpper + x.tail

    def genIEMap: String = s"    $id -> $className"

    def genSQL: String = s"\n\t$colName $postgresType"
    
    def genScala: String = s"""  case class $className(value: $valType) extends $fieldType {
    val info = $className
  }
  
  object $className extends IE($id, "$name", $dataType, $semantics, $units) {
    def load(b: ByteIterCounter, l: Int) = $className($dataType.load(b, l))
  }"""
  }
}