package ipfix

object Main extends App {
//  ieGen()
  runSystem()

  def runSystem(): Unit = {
    import java.net.InetSocketAddress
    import akka.actor.ActorSystem
    import ipfix.ie.DefaultIEMap
    import ipfix.actors.{StoragePool, Server}

    implicit val system = ActorSystem("ipfix")

    val connStr = "jdbc:postgresql://postgres:5432/test?user=test&password=test"
    val address = new InetSocketAddress("172.16.1.146", 2055)

    val storage = system.actorOf(StoragePool(4, "org.postgresql.Driver", connStr, DefaultIEMap), "storage")
    system.actorOf(Server(address, storage, DefaultIEMap), "server")
  }

  def ieGen(): Unit = {
    import ipfix.ie.Generator
    val iegen = new Generator("src/main/resources/ipfix-information-elements.csv")
    iegen.genPostgreSQL("src/main/sql/flows_table.sql", "flows")
    iegen.genClasses("src/main/scala/ipfix/ie/Elements.scala", "Elements")
    iegen.genIEMap("src/main/scala/ipfix/ie/DefaultIEMap.scala", "DefaultIEMap")
  }
}