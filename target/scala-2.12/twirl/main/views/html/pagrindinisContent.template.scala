
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

object pagrindinisContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "java"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""

"""),format.raw/*5.1*/("""<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

<!-- Navigation -->
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                Menu <i class="fa fa-bars"></i>
            </button>
            <a class="navbar-brand page-scroll" href="#page-top">
                <i class="fa fa-play-circle"></i> <span class="light">Vidos</span> Masažai
            </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
            <ul class="nav navbar-nav">
                <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                <li class="hidden">
                    <a href="#page-top"></a>
                </li>
                <li>
                    <a class="page-scroll" href="#about">Apie Mane</a>
                </li>
                <li>
                    <a class="page-scroll" href="#download">Masažai</a>
                </li>
                <li>
                    <a class="page-scroll" href="#contact">Kainos</a>
                </li>
                <li>
                    <a class="page-scroll" href="#contact">Klausk</a>
                </li>
                <li>
                    <a class="page-scroll" href="#contact">Kontaktai</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<!-- Intro Header -->
<header class="intro">
    <div class="intro-body">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <h1 class="brand-heading">Vidos Masazai (pakeisti galim)</h1>
                    <p class="intro-text">Ka nors cia parasyti</p>
                    <a href="#about" class="btn btn-circle page-scroll">
                        <i class="fa fa-angle-double-down animated"></i>
                    </a>
                </div>
            </div>
        </div>
    </div>
</header>

<!-- About Section -->
<section id="about" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-4" >

            <h2 align="center"><u>Išsilavinimas:</u></h2>
            <ul>
                <li>"Vilniaus aukštesnioji medicinos mokykla", Lietuva.</li>
                <li>Klaipėdos universitetas. Bakalauro laipsnis "Visuomenės sveikata".</li>
            </ul>

            <h2 align="center"><u>Darbo Patirtis</u></h2>
            <ul>
                <li>27 metai: Medicinos sesuo.</li>
                <li>6 metai: Visuomenės sveikatos priežiūros specialistė.</li>
                <li>6 metai: Masažuotoja.</li>
            </ul>

            <h2 align="center"><u>Kursai:</u></h2>
            <ul>
                <li >2010 metai - "Baltic SPA Professional" Kursai (Latvija), SPA masažai.</li>
                <li>2012 metai - Slaugos darbuotojų tobulinimosi ir specializacijos centras. </li>
                <li>Pažymėjimas Nr. KV 120146 - suteikta teisė daryti gydomuosius masažus.</li>
            </ul>
        </div>
        <div class="col-lg-4 ">
            <img src='"""),_display_(/*91.24*/routes/*91.30*/.Assets.at("images/img/as2.jpg")),format.raw/*91.62*/("""' class="img-circle" alt="Medicine massage" height="600" >

        </div>
        <div class="col-lg-4 ">

            <h2 align="center"><u>SPA Sertifikatai</u></h2>
            <ul>

                <li>Klasikinis segmentinis masažas</li>
                <li>Karštų-šaltų akmenų masažas </li>
                <li>Limfodrenažinis masažas</li>
                <li>Thai pėdų masažas</li>
                <li>Tradicinis ajurvedinis masažas </li>
            </ul>
            <h2 align="center"><u>Gydomieji masažai:</u> </h2>
            <ul>
            <li>Sergant sąnarių, stuburo, nervų, širdies-kraujagyslių, kvėpavimo sistemų ligomis</li>
                <li>Medžiagų apykaitos sutrikimo atvejais</li>
                <li>Segmentinis masažas</li>
                <li>Jungiamojo audinio masažas</li>
                <li>Vaikų masažas</li>
                <li>Sportinis masažas</li>
            </ul>
        </div>
    </div>
</section>

<!-- Download Section -->
<section id="download" class="content-section text-center">
    <div class="download-section">
        <h2>Masažai</h2>
        <div class="container">

            <div class="row">

                <div class="col-lg-4 ">


            <button type="button" class="btn btn-info" data-toggle="collapse" data-target="#demo">Limfodrenažinis masažas</button>
            <div id="demo" class="collapse">
                <div class="text-center"> <img src='"""),_display_(/*131.54*/routes/*131.60*/.Assets.at("images/img/massage164.jpg")),format.raw/*131.99*/("""' class="img-circle" alt="Medicine massage" width="250" height="250"></a></div>
                <div id="lopas">
                <p class="text-justify">
                <ul>
                  <li>Tai saugus efektyvus būdas sustiprinti sveikatą bei palaikyti gerą savijautą. Sveikiems žmonėms - tai profilaktinė priemonė, palaikanti normalią medžiagų apykaitą.</li>
                <li> Masažo metu suaktyvinami pažeistų minkštųjų audinių regeneracijos procesai,  slopinami uždegiminiai procesai, sustiprinamas imunitetas, pagerinamas audinių aprūpinimas deguonimi.</li>
                <li>  Limfodrenažinis masažas tinka visiems, kurie jaučia kojų pabrinkimą, patinimą ar tiesiog nuovargį. Po ilgos dienos jis puikiai atpalaiduoja pavargusias kojas ir suteikia lengvumo pojūtį. Taip pat tinka žmonėms, kurių kojos visada šaltos.</li>
                <li> Šis masažas grožio tikslais naudojamas celiulito gydymui ir profilaktikai, odos stangrinimui, apimčių mažinimui, bendrai savijautai gerinti ir mažinti patinimus  po plastinių operacijų.</li>
                <li>  Šis masažas atliekamas moterims ir vyrams.
                <li>  Gydymui ši procedūra skiriama kasdien, profilaktiškai - 2-3 kartus per savaitę. Norimas efektas pasiekiamas po 15 procedūrų.</li></p>

                    </ul></div></div>
            </div>

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-info" data-toggle="collapse" data-target="#demo2">Karštų-šaltų akmenų masažas</button>
                    <div id="demo2" class="collapse">
                        <div class="text-center"> <img src='"""),_display_(/*150.62*/routes/*150.68*/.Assets.at("images/img/mas3.jpeg")),format.raw/*150.102*/("""' class="img-circle" alt="Medicine massage" width="250" height="250"></a></div>
                        <div id="lopas">
                            <p class="text-justify">
                        <ul>
                        <li>     Akmenys turi savybę iš raumenų pašalinti toksines medžiagas, susikaupusias dėl streso ir nesveiko gyvenimo būdo, gerina miegą, padeda  sureguliuoti  kraujospūdį, teigiamai   veikia   širdies  ritmą,  sužadinamos natūralios organizmo galios, padedančios įveikti ligas, paspartinamas gijimo procesas.
                            Ši terapija veikia daugelį organizmo grandžių:</li>
                        <li> Stimuliuoja imuninę sistemą;</li>
                        <li> Suaktyvina kraujotaką;</li>
                        <li>Pagerėja aprūpinimas deguonimi;</li>
                        <li> Lengvai ir maloniai numalšina raumenų, nugaros, galvos ir kaklo skausmus;</li>
                        <li> Teigiamai veikia nervinę sistemą;</li>
                        <li>Gerindama metabolizmą, padeda atsikratyti riebalų pertekliaus.</li>
                        <li>Šis   masažas  ypač   tinka pervargus, patyrus gilų stresą,  jaučiant  nervingumą,  apatiją,  miego sutrikimus.</li>

                        </ul>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-info" data-toggle="collapse" data-target="#demo3">Klasikinis Segmentinis masažas</button>
                    <div id="demo3" class="collapse">
                        <div class="text-center"> <img src='"""),_display_(/*174.62*/routes/*174.68*/.Assets.at("images/img/mas2.jpg")),format.raw/*174.101*/("""' class="img-circle" alt="Medicine massage" width="250" height="250"></a></div>
                        <div id="lopas">
                        <p class="text-justify">
                            <ul><li>Klasikinis lalallalalalalallalalala ir t.t. </li></ul>

                    </div></div>
                </div>



                </div>
            </div>
        </div>

</section>

<!-- Contact Section -->
<section id="contact" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
            <h2>Contact Start Bootstrap</h2></p>
            <p>Feel free to email us to provide some feedback on our templates, give us suggestions for new templates and themes, or to just say hello!</p>

            </p>
            <ul class="list-inline banner-social-buttons">
                <li>
                    <a href="https://twitter.com/SBootstrap" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                </li>
                <li>
                    <a href="https://github.com/IronSummitMedia/startbootstrap" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                </li>
                <li>
                    <a href="https://plus.google.com/+Startbootstrap/posts" class="btn btn-default btn-lg"><i class="fa fa-google-plus fa-fw"></i> <span class="network-name">Google+</span></a>
                </li>
            </ul>
        </div>
    </div>
</section>

<!-- Map Section -->
<div id="map"></div>

<!-- Footer -->
<footer>
    <div class="container text-center">
        <p>Copyright &copy; Your Website 2016</p>
    </div>
</footer>

<!-- jQuery -->
<script src='"""),_display_(/*224.15*/routes/*224.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*224.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*227.15*/routes/*227.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*227.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRngKslUGJTlibkQ3FkfTxj3Xss1UlZDA&sensor=false"></script>

<!-- Theme JavaScript -->
<script src='"""),_display_(/*236.15*/routes/*236.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*236.66*/("""'></script>

</body>



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
                  DATE: Sat Jul 15 23:58:40 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/pagrindinisContent.scala.html
                  HASH: 567b62c2732b1ed7a8f5bd1a327c44e2783eb504
                  MATRIX: 968->1|1104->42|1132->45|1179->84|1229->97|1257->99|4707->3522|4722->3528|4775->3560|6227->4984|6243->4990|6304->5029|7961->6658|7977->6664|8034->6698|9696->8332|9712->8338|9768->8371|11585->10160|11601->10166|11672->10215|11762->10277|11778->10283|11862->10345|12389->10844|12405->10850|12472->10895
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|123->91|123->91|123->91|163->131|163->131|163->131|182->150|182->150|182->150|206->174|206->174|206->174|256->224|256->224|256->224|259->227|259->227|259->227|268->236|268->236|268->236
                  -- GENERATED --
              */
          