
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
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Vidos Masažai</title>

    <!-- Bootstrap Core CSS -->
    <link href='"""),_display_(/*22.18*/routes/*22.24*/.Assets.at("stylesheets/vendor/bootstrap/css/bootstrap.min.css")),format.raw/*22.88*/("""' rel="stylesheet">

    <!-- Custom Fonts -->
    <link href='"""),_display_(/*25.18*/routes/*25.24*/.Assets.at("stylesheets/vendor/font-awesome/css/font-awesome.min.css")),format.raw/*25.94*/("""' rel="stylesheet" type="text/css">


    <link rel="stylesheet" href=""""),_display_(/*28.35*/routes/*28.41*/.Assets.at("stylesheets/css/w3.css")),format.raw/*28.77*/("""">


    <!-- Theme CSS -->
    <link href='"""),_display_(/*32.18*/routes/*32.24*/.Assets.at("stylesheets/css/grayscale.min.css")),format.raw/*32.71*/("""' rel="stylesheet">
    <link href='"""),_display_(/*33.18*/routes/*33.24*/.Assets.at("stylesheets/css/special.css")),format.raw/*33.65*/("""' rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

    <![endif]-->

</head>
    <body>
        """),format.raw/*46.32*/("""
        """),_display_(/*47.10*/content),format.raw/*47.17*/("""
    """),format.raw/*48.5*/("""</body>
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
                  DATE: Sat Sep 23 20:14:55 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/main2.scala.html
                  HASH: ce227ce98b30d075fbd7271492879a7c14e4d2e9
                  MATRIX: 1206->259|1331->289|1359->291|1746->651|1761->657|1846->721|1937->785|1952->791|2043->861|2142->933|2157->939|2214->975|2286->1020|2301->1026|2369->1073|2433->1110|2448->1116|2510->1157|2966->1675|3003->1685|3031->1692|3063->1697
                  LINES: 33->7|38->7|40->9|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|63->32|63->32|63->32|64->33|64->33|64->33|76->46|77->47|77->47|78->48
                  -- GENERATED --
              */
          