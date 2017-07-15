
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

object welcome2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "java"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""



"""),format.raw/*7.1*/("""<head>

    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">

    <meta charset="utf-8">



    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Latest compiled and minified CSS -->

    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <link rel="stylesheet" href='public/stylesheets/css.css'>

    <link rel="stylesheet" href='public/stylesheets/languages.min.css'>

    <link rel="stylesheet" href='public/stylesheets/style.css'>

    <!-- jQuery library -->

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>



    <!-- Latest compiled JavaScript -->

    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>



</head>
<section id="top">
    <div class="wrapper">
        <h1><a href="https://playframework.com/documentation/"""),_display_(/*42.63*/version),format.raw/*42.70*/("""/Home">"""),_display_(/*42.78*/message),format.raw/*42.85*/("""</a></h1>
    </div>
</section>

    <div id="content2" class="wrapper doc">
        <body>





        <nav class="navbar navbar-inverse">

            <div class="container-fluid">

                <div class="navbar-header">

                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">

                        <span class="icon-bar"></span>

                        <span class="icon-bar"></span>

                        <span class="icon-bar"></span>

                    </button>

                    <!-- <a class="navbar-brand" href="index11.html">Vidos Masažai</a> -->

                </div>

                <div class="collapse navbar-collapse" id="myNavbar">

                    <ul class="nav navbar-nav">

                        <li class="active"><a href="../lt/index1.php">Pagrindinis</a></li>

                        <li><a href="../lt/index2.php">Masažai</a></li>

                        <li><a href="../lt/index3.php">Kontaktai</a></li>

                        <li><a href="../lt/index4.php">Apie</a></li>

                        <li><a href="../lt/kainos.php">Kainos</a></li>

                    </ul>

                    <ul class="nav navbar-nav navbar-right">

                        <li id="kalba"><a href="../images/index1.php"><span class="lang-sm lang-lbl" lang="de" style="color:green" ></span></a></li>

                        <li id="kalba"><a href="../images/index1.php"><span class="lang-sm lang-lbl" lang="lt" style="color:green" ></span></a></li>

                        <li id="kalba"><a href="../images/index1.php"><span class="lang-sm lang-lbl" lang="ru" style="color:green" ></span></a></li>

                        <li id="kalba"><a href="../images/index1.php"><span class="lang-sm lang-lbl" lang="en" style="color:green" ></span></a></li>



                    </ul>

                </div>

            </div>

        </nav>



        <div class="container">

            <br>

            <div id="myCarousel" class="carousel slide" data-ride="carousel">

                <!-- Indicators -->

                <ol class="carousel-indicators">

                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>

                    <li data-target="#myCarousel" data-slide-to="1"></li>

                    <li data-target="#myCarousel" data-slide-to="2"></li>

                    <li data-target="#myCarousel" data-slide-to="3"></li>

                </ol>



                <!-- Wrapper for slides -->

                <div class="carousel-inner" role="listbox">

                    <div class="item active">

                        <img src='public/images/pic1.jpg' alt="Massage1" >

                        <div class="carousel-caption">



                            <h3>Net trumpalaikis masažas atstato organizmą, šąlina raumenų nuovargį.</h3>



                        </div>

                    </div>



                    <div class="item">

                        <img src="../pics/pic2.jpg" alt="Massage2">

                        <div class="carousel-caption">

                            <h3>Masažas yra vienas iš ypatingų veiksnių žmogaus gyvenime, padedančių palaikyti puikią kūno ir dvasios būsena.</h3>



                        </div>

                    </div>



                    <div class="item">

                        <img src="../pics/pic3.jpg" alt="Massage3" >

                        <div class="carousel-caption">

                            <h3>Masažas skatiną atsipalaidimą ir gerina miego kokybę.</h3>



                        </div>

                    </div>



                    <div class="item">

                        <img src="../pics/pic4.jpg" alt="Massage4" >

                        <div class="carousel-caption">

                            <h3>Masažas pagerina kraujotaką, pagreitiną darbingumo atkūrimo procesą, padeda sumažinti įvairius skausmus</h3>



                        </div>

                    </div>

                </div>



                <!-- Left and right controls -->

                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">

                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>

                    <span class="sr-only">Agal</span>

                </a>

                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">

                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>

                    <span class="sr-only">Pirmyn</span>

                </a>

            </div>

        </div>







        </body>

    </div>
""")))}))
      }
    }
  }

  def render(message:String,style:String): play.twirl.api.HtmlFormat.Appendable = apply(message,style)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => apply(message,style)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jul 15 19:09:24 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/welcome2.scala.html
                  HASH: 626b4189a8b360f38de36f3657241924e3b2620c
                  MATRIX: 958->1|1094->42|1122->45|1169->84|1219->97|1249->101|2193->1018|2221->1025|2256->1033|2284->1040
                  LINES: 28->1|33->1|35->3|35->3|35->3|39->7|74->42|74->42|74->42|74->42
                  -- GENERATED --
              */
          