package ipfix.actors

import akka.actor.{Props, Terminated}
import akka.routing.{RoundRobinRoutingLogic, Router}

trait ActorPool extends BaseRouter {
  var router = Router(RoundRobinRoutingLogic())

  val routeeProps: Props

  val poolSize: Int

  1 to poolSize foreach(_ => addRoutee())

  def addRoutee(): Unit = addRoutee(context.actorOf(routeeProps))

  override def terminate: Receive = {
    case Terminated(a) =>
      remRoutee(a)
      addRoutee()
  }
}
