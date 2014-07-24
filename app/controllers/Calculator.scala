package controllers

import play.api.mvc.{Action, Controller}

/**
 * User: mehmetakiftutuncu - 24/07/14 - 12:21
 */
object Calculator extends Controller {
  def sum(i: Int, j: Int) = Action {
    Ok(s"Result is ${i + j}")
  }

  def multiply(i: Int, j: Int) = Action {
    Ok(s"Result is ${i * j}")
  }
}
