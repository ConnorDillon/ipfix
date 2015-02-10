package ipfix.actors

import akka.actor.Actor
import akka.event.Logging

trait BaseActor extends Actor {
  implicit val system = context.system

  val log = Logging(system, this)
  log.info("starting")

  def unexpected: Receive = { case x => log.error("unexpected: " + x.toString) }

  override def postStop(): Unit = log.info("stopped")
}