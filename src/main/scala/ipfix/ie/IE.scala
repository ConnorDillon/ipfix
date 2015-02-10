package ipfix.ie

import ipfix._
import ipfix.protocol.Field

abstract class IE(val id: Int, val name: String, val dataType: DataType, val semantics: Semantics,
                  val units: Units, val isKey: Boolean = false) {
  val colName = SnakeCase(name)
  def load(byteIter: ByteIterCounter, length: Int): Field
}