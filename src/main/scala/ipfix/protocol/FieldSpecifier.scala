package ipfix.protocol

class FieldSpecifier(val id: Int, val fieldLength: Int, val entNr: Option[Int]) {
  override def toString = s"Spec(id: $id, length: $fieldLength, entNr: $entNr)"
}

class ScopeFieldSpecifier(id: Int, fieldLength: Int, entNr: Option[Int]) extends FieldSpecifier(id, fieldLength, entNr)