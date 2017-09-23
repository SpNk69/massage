
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

object russianPagrindinis extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a single argument, a String containing a
* message to display.
*/
  def apply/*5.2*/(message: String)(contactForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.41*/("""

"""),format.raw/*11.3*/("""



"""),_display_(/*15.2*/main2ru(message)/*15.18*/ {_display_(Seq[Any](format.raw/*15.20*/("""


"""),format.raw/*21.3*/("""
"""),_display_(/*22.2*/russianContent(message, style = "java",contactForm)),format.raw/*22.53*/("""

""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(message:String,contactForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.twirl.api.HtmlFormat.Appendable = apply(message)(contactForm)

  def f:((String) => (Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (message) => (contactForm) => apply(message)(contactForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 23 20:14:55 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/russianPagrindinis.scala.html
                  HASH: 5e8149d094cd2e62355859aa4f74bcb9af0a2343
                  MATRIX: 1126->92|1260->131|1289->323|1320->328|1345->344|1385->346|1415->457|1443->459|1515->510|1548->513
                  LINES: 33->5|38->5|40->11|44->15|44->15|44->15|47->21|48->22|48->22|50->24
                  -- GENERATED --
              */
          