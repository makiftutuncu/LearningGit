package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.main())
  }
  def anotherIndex = Action {
    Ok(views.html.main())
  }
}