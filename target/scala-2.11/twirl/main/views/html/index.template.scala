
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),format.raw/*5.49*/("""
    """),format.raw/*6.5*/("""<h1>Hi</h1>

""")))}),format.raw/*8.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jan 02 15:43:23 CET 2015
                  SOURCE: /Users/florianpires/DEV/GIT/xkey-configurator/app/views/index.scala.html
                  HASH: 60fd13c61209c28c7e59a3c4405ee03e3012f400
                  MATRIX: 723->1|828->18|856->21|887->44|926->46|959->96|990->101|1033->115
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|34->6|36->8
                  -- GENERATED --
              */
          