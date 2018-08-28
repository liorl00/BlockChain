import akka.actor.{ActorSystem, Props}
import akka.stream.ActorMaterializer
import MainActor.Start
import scala.concurrent.ExecutionContext

object BlockChainApp extends App {
  implicit val system: ActorSystem = ActorSystem()
  implicit val materializer: ActorMaterializer = ActorMaterializer()
  implicit val context: ExecutionContext = system.dispatcher

  system.actorOf(Props[MainActor], "mainActor")
  system.actorSelection("user/mainActor") ! Start
}
