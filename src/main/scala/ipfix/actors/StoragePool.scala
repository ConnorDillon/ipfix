package ipfix.actors

import akka.actor.{Props, Terminated}
import akka.routing.{RoundRobinRoutingLogic, Router}
import ipfix.ie.IEMap
import ipfix.protocol.FlowSet

class StoragePool(poolSize: Int, dbDriver: String, connStr: String, ieMap: IEMap) extends BaseRouter {
  var router = Router(RoundRobinRoutingLogic())
  
  1 to poolSize foreach(_ => addRoutee())

  def receive = {
    case f: FlowSet =>
      router.route(f, sender())
    case Terminated(a) =>
      remRoutee(a)
      addRoutee()
  }

  def addRoutee(): Unit = addRoutee(context.actorOf(Storage(dbDriver, connStr, ieMap)))
}

object StoragePool {
  def apply(poolSize: Int, dbDriver: String, connStr: String, ieMap: IEMap): Props =
    Props(new StoragePool(poolSize, dbDriver, connStr, ieMap))
}