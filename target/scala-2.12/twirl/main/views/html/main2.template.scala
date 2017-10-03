
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

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="lt">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Vidos masažai tai sveikata ir malonumas Jūsų kūnui. Tai puikiai tinka norintiems pailsėti, atgauti jėgas ir atpalaiduoti kūną. Išbandykite jau šiandien!">
    <meta name="keywords" content="Spa Masažai, Sveikata, Limfodrenažinis, Karštų-šaltų akmenš, Klasikinis segmentinis, Anticeliulitinis, Nugaros, Atpalaiduojantis, Ajurvedinis, Juosmens, Veido, Galvos, Rankų, Kojų, Pečių, Pėdų, Pilvo, Kaklo, Sėdmenų, Šlaunų.">
    <meta name="author" content="">

    <title>Vidos Masažai</title>

    <!-- Bootstrap Core CSS -->
    <link href='"""),_display_(/*23.18*/routes/*23.24*/.Assets.at("stylesheets/vendor/bootstrap/css/bootstrap.min.css")),format.raw/*23.88*/("""' rel="stylesheet">

    <!-- Custom Fonts -->
    <link href='"""),_display_(/*26.18*/routes/*26.24*/.Assets.at("stylesheets/vendor/font-awesome/css/font-awesome.min.css")),format.raw/*26.94*/("""' rel="stylesheet" type="text/css">


    <link rel="stylesheet" href=""""),_display_(/*29.35*/routes/*29.41*/.Assets.at("stylesheets/css/w3.css")),format.raw/*29.77*/("""">
    <link  href='"""),_display_(/*30.19*/routes/*30.25*/.Assets.at("stylesheets/css/w3.css")),format.raw/*30.61*/("""' rel="stylesheet" type="text/css">

    <!-- Theme CSS -->
    <link href='"""),_display_(/*33.18*/routes/*33.24*/.Assets.at("stylesheets/css/grayscale.min.css")),format.raw/*33.71*/("""' rel="stylesheet">
    <link href='"""),_display_(/*34.18*/routes/*34.24*/.Assets.at("stylesheets/css/special.css")),format.raw/*34.65*/("""' rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

    <![endif]-->

</head>
    <body>
        """),format.raw/*47.32*/("""
        """),_display_(/*48.10*/content),format.raw/*48.17*/("""
    """),format.raw/*49.5*/("""</body>
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
                  DATE: Tue Oct 03 22:19:17 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/main2.scala.html
                  HASH: 142dff5820f56159251269dfcf6786a8e9b94583
                  MATRIX: 1206->259|1331->289|1359->291|2160->1065|2175->1071|2260->1135|2351->1199|2366->1205|2457->1275|2556->1347|2571->1353|2628->1389|2676->1410|2691->1416|2748->1452|2852->1529|2867->1535|2935->1582|2999->1619|3014->1625|3076->1666|3532->2184|3569->2194|3597->2201|3629->2206
                  LINES: 33->7|38->7|40->9|54->23|54->23|54->23|57->26|57->26|57->26|60->29|60->29|60->29|61->30|61->30|61->30|64->33|64->33|64->33|65->34|65->34|65->34|77->47|78->48|78->48|79->49
                  -- GENERATED --
              */
          