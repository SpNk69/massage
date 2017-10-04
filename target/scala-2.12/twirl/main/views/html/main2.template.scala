
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

object main2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

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
<html lang=lt>
<head>
    <meta charset=utf-8>
    <meta http-equiv=X-UA-Compatible content="IE=edge">
    <meta name=viewport content="width=device-width, initial-scale=1">
    <meta name=description content="Vidos masažai tai sveikata ir malonumas Jūsų kūnui. Tai puikiai tinka norintiems pailsėti, atgauti jėgas ir atpalaiduoti kūną. Išbandykite jau šiandien!">
    <meta name=keywords content="Spa Masažai, Sveikata, Limfodrenažinis, Karštų-šaltų akmenš, Klasikinis segmentinis, Anticeliulitinis, Nugaros, Atpalaiduojantis, Ajurvedinis, Juosmens, Veido, Galvos, Rankų, Kojų, Pečių, Pėdų, Pilvo, Kaklo, Sėdmenų, Šlaunų.">
    <meta name=author content>
    <title>Vidos Masažai</title>
    <link  href=""""),_display_(/*18.19*/routes/*18.25*/.Assets.at("favicon.ico")),format.raw/*18.50*/("""" rel="shortcut icon" type="image/x-icon">
    <link href='"""),_display_(/*19.18*/routes/*19.24*/.Assets.at("stylesheets/vendor/bootstrap/css/bootstrap.min.css")),format.raw/*19.88*/("""' rel=stylesheet>
    <link href='"""),_display_(/*20.18*/routes/*20.24*/.Assets.at("stylesheets/vendor/font-awesome/css/font-awesome.min.css")),format.raw/*20.94*/("""' rel=stylesheet type=text/css>
    <link rel=stylesheet href=""""),_display_(/*21.33*/routes/*21.39*/.Assets.at("stylesheets/css/w3.css")),format.raw/*21.75*/("""">
    <link href='"""),_display_(/*22.18*/routes/*22.24*/.Assets.at("stylesheets/css/w3.css")),format.raw/*22.60*/("""' rel=stylesheet type=text/css>
    <link href='"""),_display_(/*23.18*/routes/*23.24*/.Assets.at("stylesheets/css/grayscale.min.css")),format.raw/*23.71*/("""' rel=stylesheet>
    <link href='"""),_display_(/*24.18*/routes/*24.24*/.Assets.at("stylesheets/css/special.css")),format.raw/*24.65*/("""' rel=stylesheet>
    <!--[if lt IE 9]>
    <script src=https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js></script>
    <script src=https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js></script>
    <![endif]-->
</head>
<body>
"""),format.raw/*32.23*/("""
"""),_display_(/*33.2*/content),format.raw/*33.9*/("""
"""),format.raw/*34.1*/("""</body>
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
                  DATE: Wed Oct 04 20:58:39 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/main2.scala.html
                  HASH: 041cd163d4b079bcbd1a2292ba3c7ab5bb4a6d78
                  MATRIX: 1202->255|1327->285|1354->286|2104->1009|2119->1015|2165->1040|2252->1100|2267->1106|2352->1170|2414->1205|2429->1211|2520->1281|2611->1345|2626->1351|2683->1387|2730->1407|2745->1413|2802->1449|2878->1498|2893->1504|2961->1551|3023->1586|3038->1592|3100->1633|3369->1955|3397->1957|3424->1964|3452->1965
                  LINES: 33->7|38->7|39->8|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|62->32|63->33|63->33|64->34
                  -- GENERATED --
              */
          