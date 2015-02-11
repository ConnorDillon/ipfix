package ipfix.actors

import akka.actor.{ActorRef, Props}
import akka.routing.{BroadcastRoutingLogic, Router}
import ipfix.protocol.FlowSet

class FlowRouter(flowHandlers: List[ActorRef]) extends BaseRouter {
  import FlowRouter._

  var router = Router(BroadcastRoutingLogic())

  flowHandlers foreach addRoutee

  def receive = terminate orElse {
    case f: FlowSet => router.route(f, sender())
    case Register(a) => addRoutee(a)
    case Unregister(a) => remRoutee(a)
  }
}

object FlowRouter {
  def apply(): Props = Props(new FlowRouter(List()))
  def apply(flowHandlers: List[ActorRef]): Props = Props(new FlowRouter(flowHandlers))

  case class Register(actor: ActorRef)
  case class Unregister(actor: ActorRef)
}