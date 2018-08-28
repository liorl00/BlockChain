import akka.actor.Actor
import MainActor.Start

class MainActor extends Actor {
  override def receive: Receive = {
    case Start =>
  }
}

object MainActor {
  case class Start()
}
