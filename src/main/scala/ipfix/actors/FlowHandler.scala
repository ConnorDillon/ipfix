package ipfix.actors

import akka.actor.Props
import ipfix.protocol.FlowSet

class FlowHandler(fn: FlowSet => Unit) extends BaseFlowHandler {
  def handle(f: FlowSet) = fn(f)
}

object FlowHandler {
  def apply(fn: FlowSet => Unit): Props = Props(new FlowHandler(fn))
}