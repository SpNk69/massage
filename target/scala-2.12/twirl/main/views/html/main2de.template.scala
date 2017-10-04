
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

object main2de extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""
"""),format.raw/*8.1*/("""<!DOCTYPE html>
<html lang=de>
<head>
    <meta charset=utf-8>
    <meta http-equiv=X-UA-Compatible content="IE=edge">
    <meta name=viewport content="width=device-width, initial-scale=1">
    <meta name=description content="Vida Massagen sind Gesundheit und Vergnügen für Ihren Körper. Es ist ideal für diejenigen, die sich entspannen, Kraft wiederherstellen und den Körper entspannen wollen. Versuchen Sie es heute!">
    <meta name=keywords content="Spa Massagen, Gesundheit, Manuelle Lymphdrainagemassage, Hot and Cold Stone, Rückenmassage, Anti-Cellulite, Entspannende, Ayurvedische, Lendenwirbel, Gesicht, Kopf, Hände, Bein, Schulter, Fuss, Bauch, Hals,  Gesäß, Oberschenkel.">
    <meta name=author content>
    <title>Vida Massage</title>
    <link  href=""""),_display_(/*18.19*/routes/*18.25*/.Assets.at("favicon.ico")),format.raw/*18.50*/("""" rel="shortcut icon" type="image/x-icon">
    <link href='"""),_display_(/*19.18*/routes/*19.24*/.Assets.at("stylesheets/vendor/bootstrap/css/bootstrap.min.css")),format.raw/*19.88*/("""' rel=stylesheet>
    <link href='"""),_display_(/*20.18*/routes/*20.24*/.Assets.at("stylesheets/vendor/font-awesome/css/font-awesome.min.css")),format.raw/*20.94*/("""' rel=stylesheet type=text/css>
    <link rel=stylesheet href=""""),_display_(/*21.33*/routes/*21.39*/.Assets.at("stylesheets/css/w3.css")),format.raw/*21.75*/("""">
    <link href='"""),_display_(/*22.18*/routes/*22.24*/.Assets.at("stylesheets/css/grayscale.min.css")),format.raw/*22.71*/("""' rel=stylesheet>
    <link href='"""),_display_(/*23.18*/routes/*23.24*/.Assets.at("stylesheets/css/special.css")),format.raw/*23.65*/("""' rel=stylesheet>
    <!--[if lt IE 9]>
    <script src=https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js></script>
    <script src=https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js></script>
    <![endif]-->
</head>
<body>
"""),format.raw/*31.23*/("""
"""),_display_(/*32.2*/content),format.raw/*32.9*/("""
"""),format.raw/*33.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 04 19:26:54 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/main2de.scala.html
                  HASH: 948ad4ae9d664e321b9a7a1ebbea052c30be623c
                  MATRIX: 1204->255|1329->285|1356->286|2149->1052|2164->1058|2210->1083|2297->1143|2312->1149|2397->1213|2459->1248|2474->1254|2565->1324|2656->1388|2671->1394|2728->1430|2775->1450|2790->1456|2858->1503|2920->1538|2935->1544|2997->1585|3266->1907|3294->1909|3321->1916|3349->1917
                  LINES: 33->7|38->7|39->8|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|61->31|62->32|62->32|63->33
                  -- GENERATED --
              */
          