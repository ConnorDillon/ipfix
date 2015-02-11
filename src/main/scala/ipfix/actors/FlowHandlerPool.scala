package ipfix.actors

import akka.actor.Props
import ipfix.protocol.FlowSet

class FlowHandlerPool(val poolSize: Int, val routeeProps: Props) extends ActorPool {
  def handleFlow: Receive = { case f: FlowSet => router.route(f, sender()) }

  def receive = handleFlow orElse terminate
}

object FlowHandlerPool {
  def apply(poolSize: Int, routeeProps: Props): Props = Props(new FlowHandlerPool(poolSize, routeeProps))
}