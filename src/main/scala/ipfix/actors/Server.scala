package ipfix.actors

import java.net.InetSocketAddress

import akka.actor.{ActorRef, Props}
import akka.io.Tcp.{Bind, Bound, CommandFailed, Connected}
import akka.io.{IO, Tcp}
import ipfix.ie.IEMap

class Server(address: InetSocketAddress, storage: ActorRef, iEMap: IEMap) extends BaseActor {
  bind()

  def receive = binding

  def binding: Receive = {
    case Bound(addr) =>
      log.info(s"server bound on: $addr")
      context.become(listening)
    case CommandFailed(bind: Bind) =>
      log.error(s"server failed to bind on: ${bind.localAddress}")
      context stop self
  }

  def listening: Receive = {
     case info: Connected =>
       log.info(s"accepted connection from: $info")
       handle(sender(), info)
  }

  def bind(): Unit = IO(Tcp) ! Bind(self, address)

  def handle(conn: ActorRef, info: Connected): Unit = {
    context.actorOf(Receiver(conn, storage, iEMap), "receiver-" + info.remoteAddress.toString.tail)
  }
}

object Server {
  def apply(addr: InetSocketAddress, storage: ActorRef, iEMap: IEMap): Props = Props(new Server(addr, storage, iEMap))
}