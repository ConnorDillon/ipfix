package ipfix.ie

import ipfix.ByteIterCounter
import ipfix.protocol.Field

trait IEMap {
  val ieByID: Map[Int, IE]
  def load(id: Int, length: Int, byteIter: ByteIterCounter): Field = ieByID(id).load(byteIter, length)
}