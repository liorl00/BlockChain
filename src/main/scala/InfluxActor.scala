import InfluxActor.FirstMsg
import akka.actor.Actor

class InfluxActor extends Actor {
  override def receive: Receive = {
    case FirstMsg => println("FirstMsg")
    case _ =>
  }
}

object InfluxActor{
  case class FirstMsg()
}