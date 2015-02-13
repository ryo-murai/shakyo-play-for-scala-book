package controllers

import play.api.mvc.{ Action, Controller, Flash }

object Chap4 extends Controller {
  def version = Action {
    Ok("Version 2.0")
  }

  def json = Action {
    import play.api.libs.json.Json

    val success = Map("status" -> "success")
    val json = Json.toJson(success)
    Ok(json)
  }

  def xml = Action {
    Ok(<status>success</status>)
  }
}
