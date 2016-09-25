package controllers

import javax.inject._

import org.usescala.models.{LifeCalendar, Node}
import play.api.mvc._

@Singleton
class HomeController @Inject()(webJarAssets: WebJarAssets) extends Controller {

  def index = Action {

    val nodes: List[List[Node]] = List.range(0, 10) map {i =>
      List.fill(10)(new Node {})
    }

    val lifeCalendar = LifeCalendar(nodes)

    Ok(views.html.lifeCalendar(lifeCalendar)(webJarAssets))
  }
}