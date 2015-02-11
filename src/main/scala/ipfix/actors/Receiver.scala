package ipfix.actors

import akka.actor.{ActorRef, Props}
import akka.io.Tcp.{ConnectionClosed, Received, Register}
import akka.util.ByteString
import ipfix.ByteIterCounter
import ipfix.ie.IEMap
import ipfix.protocol.Message

class Receiver(conn: ActorRef, flowHandler: ActorRef, ieMap: IEMap) extends BaseActor {
  val loader = context.actorOf(Loader(flowHandler, ieMap), "loader")

  var partialMessage = ByteString()

  conn ! Register(self)

  def receive = {
    case Received(byteString) =>
      log.debug(s"received: ${byteString.length} bytes")
      loadMessage(byteString)
    case _: ConnectionClosed =>
      context stop self
  }

  def loadMessage(byteString: ByteString): Unit = {
    val msg = partialMessage ++ byteString
    partialMessage = ByteString()

    val msgLength = msg.length
    if (msgLength < Message.headerSize) {
      log.debug(s"msgLength: $msgLength < Message.headerSize ${Message.headerSize}")
      partialMessage = msg
    } else {
      val (header, data) = msg.splitAt(Message.headerSize)
      val headerIter = ByteIterCounter(header)
      val version = headerIter.getU16AsInt
      if (version == 10) {
        val length = headerIter.getU16AsInt
        val dataLength = length - Message.headerSize

        if (msgLength < length) {
          log.debug(s"msgLength: $msgLength < length: $length")
          partialMessage = msg
        } else if (msgLength > length) {
          log.debug(s"msgLength: $msgLength > length: $length")
          val (first, next) = data.splitAt(dataLength)
          loader ! Message(dataLength, first)
          loadMessage(next)
        } else {
          log.debug(s"msgLength: $msgLength == length: $length")
          loader ! Message(dataLength, data)
        }
      } else {
        log.error("message not version 10 (IPFIX)")
      }
    }
  }
}

object Receiver {
  def apply(conn: ActorRef, flowHandler: ActorRef, ieMap: IEMap): Props = Props(new Receiver(conn, flowHandler, ieMap))
}
