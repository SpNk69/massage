
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

object main2ru extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

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
<html lang=ru>
<head>
    <meta charset=utf-8>
    <meta http-equiv=X-UA-Compatible content="IE=edge">
    <meta name=viewport content="width=device-width, initial-scale=1">
    <meta name=description content="Массажы Виды - это здоровье и удовольствие для вашего тела. Он идеально подходит для тех, кто хочет расслабиться, восстановить силы и расслабить тело. Попробуйте это сегодня!">
    <meta name=keywords content="Спа-массажы, Здоровье, Лимфодренаж, горячими – холодными комнями, Классический - Сегментный, Антицеллюлитный, Cпины, Расслабляющий, Аюрведический, Поясницы, лица, головы, рук, Ног, Плечо, стоп, живота,
шеи, Ягодицы, Бедры.">
    <meta name=author content>
    <title>Vida Массажы </title>
    <link  href=""""),_display_(/*19.19*/routes/*19.25*/.Assets.at("favicon.ico")),format.raw/*19.50*/("""" rel="shortcut icon" type="image/x-icon">
    <link href='"""),_display_(/*20.18*/routes/*20.24*/.Assets.at("stylesheets/vendor/bootstrap/css/bootstrap.min.css")),format.raw/*20.88*/("""' rel=stylesheet>
    <link href='"""),_display_(/*21.18*/routes/*21.24*/.Assets.at("stylesheets/vendor/font-awesome/css/font-awesome.min.css")),format.raw/*21.94*/("""' rel=stylesheet type=text/css>
    <link rel=stylesheet href=""""),_display_(/*22.33*/routes/*22.39*/.Assets.at("stylesheets/css/w3.css")),format.raw/*22.75*/("""">
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
                  DATE: Wed Oct 04 19:26:54 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/main2ru.scala.html
                  HASH: fa0f4f5d793d74755feb675d9109a6ddae51e607
                  MATRIX: 1204->255|1329->285|1356->286|2126->1029|2141->1035|2187->1060|2274->1120|2289->1126|2374->1190|2436->1225|2451->1231|2542->1301|2633->1365|2648->1371|2705->1407|2752->1427|2767->1433|2835->1480|2897->1515|2912->1521|2974->1562|3243->1884|3271->1886|3298->1893|3326->1894
                  LINES: 33->7|38->7|39->8|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|62->32|63->33|63->33|64->34
                  -- GENERATED --
              */
          