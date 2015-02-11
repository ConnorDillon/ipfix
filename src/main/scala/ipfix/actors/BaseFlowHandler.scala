package ipfix.actors

import ipfix.protocol.FlowSet

trait BaseFlowHandler extends BaseActor {
  def handle(flows: FlowSet): Unit

  def receive = { case f: FlowSet => handle(f) }
}