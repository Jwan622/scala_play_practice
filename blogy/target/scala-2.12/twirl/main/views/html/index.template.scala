
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Map[String, String],List[Map[String, String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: Map[String, String], posts: List[Map[String, String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.78*/("""

"""),_display_(/*3.2*/layout(title)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
  """),_display_(/*4.4*/if(user.get("username").isDefined)/*4.38*/{_display_(Seq[Any](format.raw/*4.39*/("""
    """),format.raw/*5.5*/("""<h1>Hello, """),_display_(/*5.17*/user/*5.21*/.get("username")),format.raw/*5.37*/("""</h1>
  """)))}/*6.5*/else/*6.10*/{_display_(Seq[Any](format.raw/*6.11*/("""
    """),format.raw/*7.5*/("""<h1>Hello, Guest!</h1>
  """)))}),format.raw/*8.4*/("""

  """),_display_(/*10.4*/for(post <- posts) yield /*10.22*/ {_display_(Seq[Any](format.raw/*10.24*/("""
    """),format.raw/*11.5*/("""<div><p>"""),_display_(/*11.14*/post/*11.18*/.getOrElse("author", "Guest")),format.raw/*11.47*/(""" """),format.raw/*11.48*/("""says: <b>"""),_display_(/*11.58*/post/*11.62*/.getOrElse("body", "Sup")),format.raw/*11.87*/("""</b></p></div>
  """)))}),format.raw/*12.4*/("""
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(title:String,user:Map[String, String],posts:List[Map[String, String]]): play.twirl.api.HtmlFormat.Appendable = apply(title,user,posts)

  def f:((String,Map[String, String],List[Map[String, String]]) => play.twirl.api.HtmlFormat.Appendable) = (title,user,posts) => apply(title,user,posts)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 18:42:02 EDT 2018
                  SOURCE: /Users/jwan/Desktop/programming/scala_play/blogy/app/views/index.scala.html
                  HASH: dba9407e57025c42ac3cac058ab48254db40ba44
                  MATRIX: 775->1|946->77|974->80|995->93|1034->95|1063->99|1105->133|1143->134|1174->139|1212->151|1224->155|1260->171|1286->181|1298->186|1336->187|1367->192|1422->218|1453->223|1487->241|1527->243|1559->248|1595->257|1608->261|1658->290|1687->291|1724->301|1737->305|1783->330|1831->348|1863->350
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|33->8|35->10|35->10|35->10|36->11|36->11|36->11|36->11|36->11|36->11|36->11|36->11|37->12|38->13
                  -- GENERATED --
              */
          