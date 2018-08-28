name := "BlockChain"

version := "0.1"

scalaVersion := "2.12.6"

val akkaVersion = "2.5.15"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion
)