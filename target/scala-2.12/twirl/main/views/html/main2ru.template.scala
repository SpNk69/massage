
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

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="ru">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Массажы Виды - это здоровье и удовольствие для вашего тела. Он идеально подходит для тех, кто хочет расслабиться, восстановить силы и расслабить тело. Попробуйте это сегодня!">
    <meta name="keywords" content="Спа-массажы, Здоровье, Лимфодренаж, горячими – холодными комнями, Классический - Сегментный, Антицеллюлитный, Cпины, Расслабляющий, Аюрведический, Поясницы, лица, головы, рук, Ног, Плечо, стоп, живота,
шеи, Ягодицы, Бедры.">

    <meta name="author" content="">

    <title>Vida Массажы </title>

    <!-- Bootstrap Core CSS -->
    <link href='"""),_display_(/*25.18*/routes/*25.24*/.Assets.at("stylesheets/vendor/bootstrap/css/bootstrap.min.css")),format.raw/*25.88*/("""' rel="stylesheet">

    <!-- Custom Fonts -->
    <link href='"""),_display_(/*28.18*/routes/*28.24*/.Assets.at("stylesheets/vendor/font-awesome/css/font-awesome.min.css")),format.raw/*28.94*/("""' rel="stylesheet" type="text/css">


    <link rel="stylesheet" href=""""),_display_(/*31.35*/routes/*31.41*/.Assets.at("stylesheets/css/w3.css")),format.raw/*31.77*/("""">


    <!-- Theme CSS -->
    <link href='"""),_display_(/*35.18*/routes/*35.24*/.Assets.at("stylesheets/css/grayscale.min.css")),format.raw/*35.71*/("""' rel="stylesheet">
    <link href='"""),_display_(/*36.18*/routes/*36.24*/.Assets.at("stylesheets/css/special.css")),format.raw/*36.65*/("""' rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

    <![endif]-->

</head>
    <body>
        """),format.raw/*49.32*/("""
        """),_display_(/*50.10*/content),format.raw/*50.17*/("""
    """),format.raw/*51.5*/("""</body>
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
                  DATE: Tue Oct 03 22:35:52 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/main2ru.scala.html
                  HASH: 01eb193bb16a02d1ac10afb04e3bf8e4aaed881b
                  MATRIX: 1208->259|1333->289|1361->291|2183->1086|2198->1092|2283->1156|2374->1220|2389->1226|2480->1296|2579->1368|2594->1374|2651->1410|2723->1455|2738->1461|2806->1508|2870->1545|2885->1551|2947->1592|3403->2110|3440->2120|3468->2127|3500->2132
                  LINES: 33->7|38->7|40->9|56->25|56->25|56->25|59->28|59->28|59->28|62->31|62->31|62->31|66->35|66->35|66->35|67->36|67->36|67->36|79->49|80->50|80->50|81->51
                  -- GENERATED --
              */
          