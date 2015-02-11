package ipfix

import ipfix.actors.FlowRouter

object Main extends App {
//  ieGen()
  runSystem()

  def runSystem(): Unit = {
    import java.net.InetSocketAddress
    import akka.actor.ActorSystem
    import ipfix.ie.DefaultIEMap
    import ipfix.actors.{FlowHandlerPool, Storage, Server}

    implicit val system = ActorSystem("ipfix")

    val connStr = "jdbc:postgresql://postgres:5432/test?user=test&password=test"
    val address = new InetSocketAddress("172.16.1.146", 2055)

    val storage = Storage("org.postgresql.Driver", connStr, DefaultIEMap)
    val storagePool = system.actorOf(FlowHandlerPool(4, storage), "storage")
    val flowRouter = system.actorOf(FlowRouter(List(storagePool)), "flowRouter")
    system.actorOf(Server(address, flowRouter, DefaultIEMap), "server")
  }

  def ieGen(): Unit = {
    import ipfix.ie.Generator
    val iegen = new Generator("src/main/resources/ipfix-information-elements.csv")
    iegen.genPostgreSQL("src/main/sql/flows_table.sql", "flows")
    iegen.genClasses("src/main/scala/ipfix/ie/Elements.scala", "Elements")
    iegen.genIEMap("src/main/scala/ipfix/ie/DefaultIEMap.scala", "DefaultIEMap")
  }
}