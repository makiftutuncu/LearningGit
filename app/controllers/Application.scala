package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.main())
  }

  def fooBar = Action {
    Ok("Foo and bar!")
  }

  def anotherIndex = Action {
    Ok(views.html.main())
  }
}