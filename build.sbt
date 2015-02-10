name := "ipfix"

scalaVersion := "2.11.5"

scalacOptions ++= Seq("-feature")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "com.opencsv" % "opencsv" % "3.2",
  "postgresql" % "postgresql" % "9.1-901.jdbc4"
)