
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object pagrindinis extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a single argument, a String containing a
* message to display.
*/
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.3*/("""
"""),_display_(/*12.2*/main2(message)/*12.16*/ {_display_(Seq[Any](format.raw/*12.18*/("""

"""),format.raw/*17.3*/("""
"""),_display_(/*18.2*/pagrindinisContent(message, style = "java")),format.raw/*18.45*/("""

""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jul 15 19:09:24 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/pagrindinis.scala.html
                  HASH: 619fea2662e475ea326b4a43181d31a6d90e18e8
                  MATRIX: 1040->92|1152->109|1181->301|1209->303|1232->317|1272->319|1301->429|1329->431|1393->474|1426->477
                  LINES: 31->5|36->5|38->11|39->12|39->12|39->12|41->17|42->18|42->18|44->20
                  -- GENERATED --
              */
          