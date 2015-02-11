package ipfix.actors

import akka.actor.{ActorRef, Terminated}
import akka.routing.Router

trait BaseRouter extends BaseActor {
  var router: Router

  def terminate: Receive = {
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
