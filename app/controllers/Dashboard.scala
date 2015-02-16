package controllers

import play.api.mvc.{ Action, Controller }
//import concurrent.{ ExecutionContext, Future }

object Dashboard extends Controller {
  def backlog(warehouse: String) = Action.async {
    import scala.concurrent.ExecutionContext.Implicits.global

    scala.concurrent.Future {
      Ok(models.Order.backlog(warehouse))
    }
  }
}
