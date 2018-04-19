package controllers

import javax.inject._
import play.api.mvc._

//  BaseController is a trait that this class extends
// Action {} is possible because of a apply method defined in the Action object that takes a block def apply(block: => Result): Action[AnyContent].
class IndexController @Inject() (val controllerComponents: ControllerComponents) extends BaseController {
  def index() = Action {
    val user = Map("username" -> "jeff")
    var posts = List(
      Map(
        "author" -> "Shekhar",
        "body" -> "Getting started with Play"
      ),
      Map(
        "author" -> "Rahul",
        "body" -> "Getting started with docker"
      )
    )
    
    Ok(views.html.index("Welcome to Blogy", user, posts))
  }
}
