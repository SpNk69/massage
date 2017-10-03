
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

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="de">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Vida Massagen sind Gesundheit und Vergnügen für Ihren Körper. Es ist ideal für diejenigen, die sich entspannen, Kraft wiederherstellen und den Körper entspannen wollen. Versuchen Sie es heute!">
    <meta name="keywords" content="Spa Massagen, Gesundheit, Manuelle Lymphdrainagemassage, Hot and Cold Stone, Rückenmassage, Anti-Cellulite, Entspannende, Ayurvedische, Lendenwirbel, Gesicht, Kopf, Hände, Bein, Schulter, Fuss, Bauch, Hals,  Gesäß, Oberschenkel.">

    <meta name="author" content="">

    <title>Vida Massage</title>

    <!-- Bootstrap Core CSS -->
    <link href='"""),_display_(/*24.18*/routes/*24.24*/.Assets.at("stylesheets/vendor/bootstrap/css/bootstrap.min.css")),format.raw/*24.88*/("""' rel="stylesheet">

    <!-- Custom Fonts -->
    <link href='"""),_display_(/*27.18*/routes/*27.24*/.Assets.at("stylesheets/vendor/font-awesome/css/font-awesome.min.css")),format.raw/*27.94*/("""' rel="stylesheet" type="text/css">


    <link rel="stylesheet" href=""""),_display_(/*30.35*/routes/*30.41*/.Assets.at("stylesheets/css/w3.css")),format.raw/*30.77*/("""">


    <!-- Theme CSS -->
    <link href='"""),_display_(/*34.18*/routes/*34.24*/.Assets.at("stylesheets/css/grayscale.min.css")),format.raw/*34.71*/("""' rel="stylesheet">
    <link href='"""),_display_(/*35.18*/routes/*35.24*/.Assets.at("stylesheets/css/special.css")),format.raw/*35.65*/("""' rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

    <![endif]-->

</head>
    <body>
        """),format.raw/*48.32*/("""
        """),_display_(/*49.10*/content),format.raw/*49.17*/("""
    """),format.raw/*50.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 03 22:34:11 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/main2de.scala.html
                  HASH: 6da597f2d3a83580958b1f97aedb2b8c51855a7f
                  MATRIX: 1208->259|1333->289|1361->291|2206->1109|2221->1115|2306->1179|2397->1243|2412->1249|2503->1319|2602->1391|2617->1397|2674->1433|2746->1478|2761->1484|2829->1531|2893->1568|2908->1574|2970->1615|3426->2133|3463->2143|3491->2150|3523->2155
                  LINES: 33->7|38->7|40->9|55->24|55->24|55->24|58->27|58->27|58->27|61->30|61->30|61->30|65->34|65->34|65->34|66->35|66->35|66->35|78->48|79->49|79->49|80->50
                  -- GENERATED --
              */
          