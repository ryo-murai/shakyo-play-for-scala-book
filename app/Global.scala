import akka.actor.{ Actor, Props }
import java.util.Date
import play.api.GlobalSettings
import play.api.i18n.Lang
import play.api.libs.concurrent.Akka
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.mvc.Flash
import play.twirl.api.Html
import models.{ Warehouse, PickList }

object Global extends GlobalSettings {

  override def onStart(application: play.api.Application) {
    import scala.concurrent.duration._
    import play.api.Play.current

    for (warehouse <- Warehouse.find()) {
      val actor = Akka.system.actorOf(
        Props(new PickListActor(warehouse))
      )

      Akka.system.scheduler.schedule(
        0.seconds, 30.minutes, actor, "send"
      )
    }
  }
}

class PickListActor(warehouse: String) extends Actor {
  def receive = {
    case "send" => {
      val pickList = PickList.find(warehouse)

      val html = views.html.picklists.list(warehouse, pickList, new Date)(Flash.emptyCookie, Lang.defaultLang)
      send(html)
    }

    case _ => play.api.Logger.warn("unsupported message type")
  }

  def send(html: Html) {

    // ...
    play.api.Logger.debug(s"sending html: $html")
  }
}
