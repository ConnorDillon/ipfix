package ipfix.protocol

import akka.util.ByteString

case class Message(length: Int, data: ByteString)

object Message {
  val headerSize = 16
}