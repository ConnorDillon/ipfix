package ipfix.actors

import akka.actor.{ActorRef, Props, Terminated}
import akka.routing.{BroadcastRoutingLogic, Router}
import ipfix.protocol.FlowSet

class FlowRouter(flowHandlers: List[ActorRef]) extends BaseActor {
  import FlowRouter._

  var router = Router(BroadcastRoutingLogic())

  flowHandlers foreach addRoutee

  def receive = {
    case f: FlowSet => router.route(f, sender())
    case Register(a) => addRoutee(a)
    case Unregister(a) => remRoutee(a)
    case Terminated(a) => remRoutee(a)
  }

  def addRoutee(a: ActorRef): Unit = {
    log.info(s"adding routee: $a")
    router = router.addRoutee(a)
    context watch a
  }

  def remRoutee(a: ActorRef): Unit = {
    log.info(s"removing routee: $a")
    router = router.removeRoutee(a)
  }
}

object FlowRouter {
  def apply(): Props = Props(new FlowRouter(List()))
  def apply(flowHandlers: List[ActorRef]): Props = Props(new FlowRouter(flowHandlers))

  case class Register(actor: ActorRef)
  case class Unregister(actor: ActorRef)
}