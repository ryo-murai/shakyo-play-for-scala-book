package controllers

import play.api.mvc.{ Action, Controller, Flash }
import play.twirl.api.Html
import java.util.Date
import models.PickList
import scala.concurrent.{ ExecutionContext, Future }

object PickLists extends Controller {
  def index = Action { implicit request =>
    Ok(views.html.picklists.index("warehouse12345"))
  }

  def preview(warehouse: String) = Action { implicit request =>
    val pickList = PickList.find(warehouse)
    val timestamp = new java.util.Date
    Ok(views.html.picklists.list(warehouse, pickList, timestamp))
  }

  def sendAsync(warehouse: String) = Action { implicit request =>
    import ExecutionContext.Implicits.global
    Future {
      val pickList = PickList.find(warehouse)
      send(views.html.picklists.list(warehouse, pickList, new Date))
    }
    Redirect(routes.PickLists.index())
  }

  private def send(html: Html) {
    // send the html by e-mail etc.

    play.api.Logger.debug(s"sending the html $html")
  }
}
