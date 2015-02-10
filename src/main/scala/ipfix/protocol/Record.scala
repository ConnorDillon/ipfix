package ipfix.protocol

sealed trait Record

case class Flow(fields: List[Field]) extends Record

class Template(val id: Int, val fields: List[FieldSpecifier]) extends Record {
  val minDataRecordSize: Int = fields.map(_.fieldLength).filter(_ != 65535).sum
  override def toString = s"Template(id: $id, fields: $fields)"
}

object Template {
  val id = 2
  val headerSize = 8
}

class OptionsTemplate(id: Int, fields: List[FieldSpecifier]) extends Template(id, fields)

object OptionsTemplate {
  val id = 3
  val headerSize = 10
}