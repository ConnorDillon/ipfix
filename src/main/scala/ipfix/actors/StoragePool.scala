package ipfix.actors

import akka.actor.{ActorRef, Props, Terminated}
import akka.routing.{ActorRefRoutee, RoundRobinRoutingLogic, Router}
import ipfix.ie.IEMap
import ipfix.protocol.FlowSet

class StoragePool(poolSize: Int, dbDriver: String, connStr: String, ieMap: IEMap) extends BaseActor {
  var router = Router(RoundRobinRoutingLogic(), Vector.fill(poolSize)(ActorRefRoutee(getRoutee)))

  def receive = {
    case x: FlowSet =>
      router.route(x, sender())
    case Terminated(a) =>
      router = router.removeRoutee(a)
      router = router.addRoutee(getRoutee)
  }

  def getRoutee: ActorRef = {
    val routee = context.actorOf(Storage(dbDriver, connStr, ieMap))
    context watch routee
    routee
  }
}

object StoragePool {
  def apply(poolSize: Int, dbDriver: String, connStr: String, ieMap: IEMap): Props =
    Props(new StoragePool(poolSize, dbDriver, connStr, ieMap))
}