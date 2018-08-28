import akka.actor.{Actor, Props}
import MainActor.Start
import BlockChainApp.system
import InfluxActor.FirstMsg

class MainActor extends Actor {
  override def receive: Receive = {
    case Start => println("Start")
  }
  system.actorOf(Props[InfluxActor], "InfluxActor")
  system.actorSelection("user/InfluxActor") ! FirstMsg
}

object MainActor {
  case class Start()
}
