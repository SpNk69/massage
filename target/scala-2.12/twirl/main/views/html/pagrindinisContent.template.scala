
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

object pagrindinisContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "java", contactForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.65*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""




"""),format.raw/*8.1*/("""<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top" xmlns="http://www.w3.org/1999/html">

<!-- Navigation -->
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                Menu <i class="fa fa-bars"></i>
            </button>

            <a class="navbar-brand page-scroll" href='"""),_display_(/*18.56*/routes/*18.62*/.HomeController.pagrindinisLT),format.raw/*18.91*/("""'>
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
                    <a class="page-scroll" href="#apie">Apie Mane</a>
                </li>
                <li>
                    <a class="page-scroll" href="#masazai">Masažai</a>
                </li>

                <li>
                    <a class="page-scroll" href="#galerija">Galerija</a>
                </li>


                <li>
                    <a class="page-scroll" href="#kainos">Kainos</a>
                </li>
                <li>
                    <a class="page-scroll" href="#klausk">Klausk</a>
                </li>
                <li>
                    <a class="page-scroll" href="#kontaktai">Kontaktai</a>
                </li>

                <li>
                    <a class="page-scroll" href='"""),_display_(/*53.51*/routes/*53.57*/.HomeController.germanVersion),format.raw/*53.86*/("""'><img src='"""),_display_(/*53.99*/routes/*53.105*/.Assets.at("images/img/flag-de2.png")),format.raw/*53.142*/("""' class="flag flag-lt" alt="German" /></a>
                </li>

                <li>
                    <a class="page-scroll" href='"""),_display_(/*57.51*/routes/*57.57*/.HomeController.pagrindinisLT),format.raw/*57.86*/("""'><img src='"""),_display_(/*57.99*/routes/*57.105*/.Assets.at("images/img/flag-lt2.png")),format.raw/*57.142*/("""' class="flag flag-lt" alt="Lithuanian" /></a>
                </li>

                <li>
                    <a class="page-scroll" href=""""),_display_(/*61.51*/routes/*61.57*/.HomeController.russianVersion),format.raw/*61.87*/(""""><img src='"""),_display_(/*61.100*/routes/*61.106*/.Assets.at("images/img/flag-rus.png")),format.raw/*61.143*/("""' class="flag flag-lt" alt="Russian" /></a>
                </li>


            </ul>


        </div>

        <!-- /.navbar-collapse -->
    </div>

    <!-- /.container -->
</nav>
"""),_display_(/*75.2*/flash/*75.7*/.get("success")),format.raw/*75.22*/("""
"""),format.raw/*76.1*/("""<!-- Intro Header -->
<header class="intro">
    <div class="intro-body">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <h1 class="brand-heading"></h1>
                    <p class="intro-text">Masažas yra vienas iš ypatingų veiksnių žmogaus gyvenime, padedančių palaikyti puikią kūno ir dvasios būseną. Ir nieko nėra geresnio, kaip po sunkios ir išvargintos darbo dienos atsipalaiduoti ir atgaivinti savo kūną masažo procedūromis.</p>
                    <a href="#apie" class="btn btn-circle page-scroll">
                        <i class="fa fa-angle-double-down animated"></i>
                    </a>
                </div>
            </div>
        </div>
    </div>
</header>



<!-- About Section -->
<section id="apie" class="container content-section text-center">
    <div class="row">



        <div class="col-lg-6 ">
            <img src='"""),_display_(/*102.24*/routes/*102.30*/.Assets.at("images/img/as2.jpg")),format.raw/*102.62*/("""' class="img-circle" alt="Medicine massage" height="600">

        </div>

        <div class="col-lg-6">

            <h3 align="center"><u>Išsilavinimas</u></h3>
            <ul><li>"Vilniaus aukštesnioji medicinos mokykla", Lietuva.</li>
                <li>Klaipėdos universitetas. Bakalauro laipsnis "Visuomenės sveikata".</li>
                <li>2010 metai - "Baltic SPA Professional" Kursai (Latvija), SPA masažai.</li>
                <li>2012 metai - Slaugos darbuotojų tobulinimosi ir specializacijos centras.</li>
                <li>Pažymėjimas Nr. KV 120146 - suteikta teisė daryti gydomuosius masažus.</li>
            </ul>
            <p></p>
            <h3 align="center" ><u>Darbo Patirtis</u></h3>
            <ul align="center">
                <li>27 metai: Medicinos sesuo.</li>
                <li>7 metai: Visuomenės sveikatos priežiūros specialistė.</li>
                <li>7 metai: Masažuotoja.</li>
            </ul>
            <p></p>
            <h3 align="center"><u>SPA Sertifikatai</u></h3>
            <ul>

                <li>Klasikinis segmentinis masažas</li>
                <li>Karštų-šaltų akmenų masažas</li>
                <li>Limfodrenažinis masažas</li>
                <li>Thai pėdų masažas</li>
                <li>Tradicinis ajurvedinis masažas</li>
            </ul>


        </div>


    </div>
    <a href="#masazai" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
</section>

<!-- Download Section -->
<section id="masazai" class="content-section text-center">
    <div class="download-section">
        <h2 id="vienas">Sveikatą gerinantys masažai</h2>
        <div class="container">

            <div class="row">

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#limfodrenazinis">
                        Limfodrenažinis masažas
                    </button>
                    <p></p>
                    <div id="limfodrenazinis" class="collapse">
                        <!--<div class="text-center"><img src='"""),_display_(/*159.65*/routes/*159.71*/.Assets.at("images/img/massage164.jpg")),format.raw/*159.110*/("""'
                                                      class="img-circle" alt="Medicine massage" width="250"
                                                      height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">



                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo" >
                                Limfodrenažinis kūno masažas
                            </button>
                            <div id="limfo" class="collapse customWidth">      <p class="massageText customWidth">Tai saugus efektyvus būdas sustiprinti sveikatą bei palaikyti gerą savijautą.
                                Sveikiems žmonėms - tai profilaktinė priemonė, palaikanti normalią medžiagų
                                apykaitą.</br>

                                Masažo metu suaktyvinami pažeistų minkštųjų audinių regeneracijos procesai,
                                slopinami uždegiminiai procesai, sustiprinamas imunitetas, pagerinamas audinių
                                aprūpinimas deguonimi.</br>
                                Limfodrenažinis masažas tinka visiems, kurie jaučia kojų pabrinkimą, patinimą ar
                                tiesiog nuovargį. Po ilgos dienos jis puikiai atpalaiduoja pavargusias kojas ir
                                suteikia lengvumo pojūtį. Taip pat tinka žmonėms, kurių kojos visada šaltos.</br>
                                Šis masažas grožio tikslais naudojamas celiulito gydymui ir profilaktikai, odos
                                stangrinimui, apimčių mažinimui, bendrai savijautai gerinti ir mažinti patinimus po
                                plastinių operacijų.</br>
                                Šis masažas atliekamas moterims ir vyrams.
                                Gydymui ši procedūra skiriama kasdien, profilaktiškai - 2-3 kartus per savaitę.
                                Norimas efektas pasiekiamas po 15 procedūrų.
                            </p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo2" >
                                Limfodrenažinis veido masažas
                            </button>
                            <div id="limfo2" class="collapse customWidth"><p class="massageText">Tekstas</p> </div>

                           </div>
                    </div>
                    <p></p>
                </div>


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#karstusaltu">Karštų-šaltų
                        akmenų masažas
                    </button>
                    <p></p>
                    <div id="karstusaltu" class="collapse">
                      <!--  <div class="text-center"><img src='"""),_display_(/*206.65*/routes/*206.71*/.Assets.at("images/img/mas3.jpeg")),format.raw/*206.105*/("""' class="img-circle"
                                                      alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Akmenys turi savybę iš raumenų pašalinti toksines medžiagas, susikaupusias dėl
                                    streso ir nesveiko gyvenimo būdo, gerina miegą, padeda sureguliuoti kraujospūdį,
                                    teigiamai veikia širdies ritmą, sužadinamos natūralios organizmo galios, padedančios
                                    įveikti ligas, paspartinamas gijimo procesas.
                                    Ši terapija veikia daugelį organizmo grandžių:</br>

                                 Stimuliuoja imuninę sistemą;</br>
                                 Suaktyvina kraujotaką;</br>
                                Pagerėja aprūpinimas deguonimi;</br>
                                Lengvai ir maloniai numalšina raumenų, nugaros, galvos ir kaklo skausmus;</br>
                                Teigiamai veikia nervinę sistemą;</br>
                                Gerindama metabolizmą, padeda atsikratyti riebalų pertekliaus.</br>
                                Šis masažas ypač tinka pervargus, patyrus gilų stresą, jaučiant nervingumą, apatiją,
                                miego sutrikimus.</p>


                        </div>
                    </div>
                    <p></p>
                </div>

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#segmentinis">Klasikinis
                        Segmentinis nugaros masažas
                    </button>
                    <p></p>
                    <div id="segmentinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*239.67*/routes/*239.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*239.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Atpalaiduoja įtemptus nugaros raumenis, gerina audinio struktūrą, gerina kūno padėtį</p>


                        </div>
                    </div>
                </div>


            </div>

        <div class="row">


            <div class="col-lg-4 ">


                <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#demo33" >
                    Atskirų kūno dalių masažai
                </button>
                <p></p>
                <div id="demo33" class="collapse">
                  <!--  <div class="text-center"><img src='"""),_display_(/*264.61*/routes/*264.67*/.Assets.at("images/img/massage164.jpg")),format.raw/*264.106*/("""'
                                                  class="img-circle" alt="Medicine massage" width="250"
                                                  height="250"></a></div>-->
                    <div class="customBackGroundOfDiv" align="center">
                        <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#galva" >
                            Galvos masažas
                        </button>
                        <div id="galva" class="collapse customWidth"><p class="massageText">Sumažina stresą, galvos skausmus, gerina kraujo apytaką.</p> </div>

                        <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#peciai" >
                            Pečių – kaklo juostos masažas
                        </button>
                        <div id="peciai" class="collapse customWidth"><p class="massageText">Efektyviausia gydymo ir nemalonių simptomų šalinimo  priemonė. Jau po pirmo kaklo masažo seanso jus pajusite bendrą savijautos pagerėjimą.  Po pilno masažo kurso skausmingi pojūčiai išnyksta, atsiranda žvalumas, padidėja darbingumas, išnyksta nemiga ir irzlumas. Kaklo masažas yra puiki priemonė atsikratyti galvos skausmo.</p> </div>




                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#krutines" >
                                Krūtinės masažas
                            </button>
                        <div id="krutines" class="collapse customWidth"><p class="massageText">Mažina įtampą krūtinėje, o taip pat sumažina kvėpavimo sutrikimus (bronchitas, gripas, astma ir kt.).</p> </div>


                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pilvo" >
                                Pilvo masažas
                            </button>
                            <div id="pilvo" class="collapse customWidth"><p class="massageText">Stimuliuoja virškinimą, turi teigiamą poveikį vidinių organų veiklai, gerina virškinimo trakto funkcijas ir tulžies sekreciją, padeda su vidurių užkietėjimais arba dujų susikaupimo žarnyne</div>


                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#juosmens" >
                                Juosmeninis sėdmenų, kojų masažas
                            </button>
                        <div id="juosmens" class="collapse customWidth"><p class="massageText">Sumažina skausmą, gerina kraujo apytaką, palengvina ir mažina nervinių šaknų uždegimą.</p></div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pedu" >
                                Pėdų masažas
                            </button>
                        <div id="pedu" class="collapse customWidth"><p class="massageText"></p></div>



                    </div>
                </div>
                <p></p>
            </div>


            <div class="col-lg-4 ">


                <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#vyresnio">Masažas vyresnio amžiaus žmonėms
                </button>
                <p></p>
                <div id="vyresnio" class="collapse">
                    <!--  <div class="text-center"><img src='"""),_display_(/*318.63*/routes/*318.69*/.Assets.at("images/img/mas3.jpeg")),format.raw/*318.103*/("""' class="img-circle"
                                                    alt="Medicine massage" width="250" height="250"></a></div>-->
                    <div class="customBackGroundOfDiv " align="center">

                        <p class="massageText customWidth"> Masažas yra būtina ir labai naudinga procedūra pagyvenusiems žmonėms, pensininkams. Tyrimai parodė, kad masažas lėtina senėjimo procesą. Taip pat masažas veikia raminančiai visą organizmą ir gali sumažinti skausmus. Masažas gali padėti žmonėms, kenčiantiems raumenų skausmus ar sergantiems atritu. Kada žmogus kenčia, jis tampa vis mažiau aktyvus, nukenčia gyvenimo kokybė ir sveikata. Masažas gerina kraujotaką,  pašalina raumenų nuovargį ir raumenys įgauna tonusą. Dėl to pagerėja pagyvenusio žmogaus gyvenimo kokybė.
                            </br>Prieš masažą Jums gerai būtų pasikonsultuoti su savo gydytoju. Kai tik gausite gydytojo leidimą masažui, jus drąsiai galite kreiptis pas mane.  </p>


                    </div>
                </div>
                <p></p>
            </div>



            <div class="col-lg-4 ">


                <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#atpalaiduojantis">Atpalaiduojantis viso kūno masažas
                </button>
                <p></p>
                <div id="atpalaiduojantis" class="collapse">
                    <!--  <div class="text-center"><img src='"""),_display_(/*340.63*/routes/*340.69*/.Assets.at("images/img/mas3.jpeg")),format.raw/*340.103*/("""' class="img-circle"
                                                    alt="Medicine massage" width="250" height="250"></a></div>-->
                    <div class="customBackGroundOfDiv " align="center">

                        <p class="massageText customWidth"> Aprašymas</p>

                    </div>
                </div>
                <p></p>
            </div>
        </div>

            <div class="row">

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#ajurvedinis">Ajurvedinis krūtų masažas moterims
                    </button>
                    <p></p>
                    <div id="ajurvedinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*361.67*/routes/*361.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*361.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Aprašymas</p>

                        </div>
                    </div>
                    <p></p>
                </div>




                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#anticeliulitinis" >
                        Anticeliulitinis masažas
                    </button>
                    <p></p>
                    <div id="anticeliulitinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*383.67*/routes/*383.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*383.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#sedmenys" >
                                Sėdmenims, šlaunims
                            </button>
                            <div id="sedmenys" class="collapse customWidth"><p class="massageText">Tekstas</p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pilvui" >
                                Pilvui
                            </button>
                            <div id="pilvui" class="collapse customWidth"><p class="massageText">Tekstas</p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#rankos" >
                                Rankoms
                            </button>
                            <div id="rankos" class="collapse customWidth"><p class="massageText">Tekstas</p> </div>



                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#tibeto" >
                                Naudojant Tibeto vakuumine Taure
                            </button>
                            <div id="tibeto" class="collapse customWidth"><p class="massageText">Tekstas</p> </div>

                        </div>
                    </div>
                    <p></p>
                </div>

            </div>

        </div>
        </div>
    </div>
    <a href="#kainos" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>

</section >


<section id="galerija" class="content-section text-center">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <div class="contact-section">
                <div class="container">
                    <hr>
                    <h2>Galerija</h2>
                    <hr>


                </div>


            </div>
        </div>
    </div>
    <a href="#klausk" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>

</section>




<section id="kainos" class="content-section text-center">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <div class="contact-section">
                <div class="container">
                    <hr>
                    <h2>Kainos</h2>

    <p></p>
                    <table class="table table-inverse">

                        <tr>
                            <th scope="row"></th>
                            <td>30min</td>
                            <td>60min</td>
                            <td>90min</td>
                            <td>120min</td>
                        </tr>
                        <tbody>
                        <tr>
                            <th scope="row">Atskirų kūno dalių</th>
                            <td>30 CHF</td>
                            <td>60 CHF</td>
                            <td>90 CHF</td>
                            <td>120 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row">Karštų-šaltų akmenų (~120min.)</th>
                            <td>-</td>
                            <td>-</td>
                            <td>-</td>
                            <td>250 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row">Limfodrenažinis kūno masažas</th>
                            <td>50 CHF</td>
                            <td>80 CHF</td>
                            <td>120 CHF</td>
                            <td>150 CHF</td>
                        </tr>

                        <tr>
                            <th scope="row">Limfodrenažinis veido masažas</th>
                            <td>30 CHF</td>
                            <td>50 CHF</td>
                            <td>80 CHF</td>
                            <td>110 CHF</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                </div>
            <div >

            </div>


            </div>
        </div>
    </div>
    <a href="#klausk" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>

</section>


<section id="klausk" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-12">
            <div class="contact-section">
                <div class="container">

                    <h2>Užduokite savo klausimą!</h2>
                    <p></p>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">




                            """),_display_(/*532.30*/helper/*532.36*/.form(action = routes.HomeController.submitLT(),'class -> "form-horizontal")/*532.112*/ {_display_(Seq[Any](format.raw/*532.114*/("""




                            """),_display_(/*537.30*/helper/*537.36*/.input(contactForm("Vardas"),'class->"form-control")/*537.88*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*537.117*/("""
                            """),format.raw/*538.29*/("""<input type="text" name=""""),_display_(/*538.55*/contactForm/*538.66*/.field("firstName").name),format.raw/*538.90*/(""""  placeholder="Jūsų vardas" id=""""),_display_(/*538.124*/id),format.raw/*538.126*/("""" """),_display_(/*538.129*/toHtmlArgs(args)),_display_(/*538.146*/if(contactForm.hasErrors)/*538.171*/ {_display_(Seq[Any](format.raw/*538.173*/("""
                            """),format.raw/*539.29*/("""<option value='"""),_display_(/*539.45*/contactForm/*539.56*/.field("firstName").value),format.raw/*539.81*/("""'></option>""")))}),format.raw/*539.93*/("""
                            """)))}),format.raw/*540.30*/("""



                            """),format.raw/*544.29*/("""<div id="xxx">
                            """),_display_(/*545.30*/for(error <- contactForm("firstName").errors) yield /*545.75*/ {_display_(Seq[Any](format.raw/*545.77*/("""
                            """),format.raw/*546.29*/("""<p id="xxxx">"""),_display_(/*546.43*/error/*546.48*/.format(messages())),format.raw/*546.67*/("""</p>
                                """)))}),format.raw/*547.34*/("""</div>



                            """),_display_(/*551.30*/helper/*551.36*/.input(contactForm("Elektroninis paštas"),'class->"form-control")/*551.101*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*551.130*/("""
                            """),format.raw/*552.29*/("""<input type="text" name=""""),_display_(/*552.55*/contactForm/*552.66*/.field("email").name),format.raw/*552.86*/(""""  placeholder="Jūsų elektroninis paštas" id=""""),_display_(/*552.133*/id),format.raw/*552.135*/("""" """),_display_(/*552.138*/toHtmlArgs(args)),_display_(/*552.155*/if(contactForm.hasErrors)/*552.180*/ {_display_(Seq[Any](format.raw/*552.182*/("""
                            """),format.raw/*553.29*/("""<option value='"""),_display_(/*553.45*/contactForm/*553.56*/.field("email").value),format.raw/*553.77*/("""'></option>""")))}),format.raw/*553.89*/("""
                            """)))}),format.raw/*554.30*/("""



                            """),format.raw/*558.29*/("""<div id="xxx">
                            """),_display_(/*559.30*/for(error <- contactForm("email").errors) yield /*559.71*/ {_display_(Seq[Any](format.raw/*559.73*/("""
                            """),format.raw/*560.29*/("""<p id="xxxx">"""),_display_(/*560.43*/error/*560.48*/.format(messages())),format.raw/*560.67*/("""</p>
                                """)))}),format.raw/*561.34*/("""</div>







                            """),_display_(/*569.30*/helper/*569.36*/.input(field = contactForm("Klausimas"))/*569.76*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*569.105*/("""
                            """),format.raw/*570.29*/("""<div>
                                <textarea class="form-control" name=""""),_display_(/*571.71*/contactForm("textbox")/*571.93*/.name),format.raw/*571.98*/("""" id=""""),_display_(/*571.105*/id),format.raw/*571.107*/("""" placeholder="Jūsų žinutė" rows='5' cols='80'>"""),_display_(/*571.155*/if(contactForm.hasErrors)/*571.180*/{_display_(_display_(/*571.182*/contactForm/*571.193*/.field("textbox").value))}),format.raw/*571.217*/("""</textarea>
                            </div>
                            """)))}),format.raw/*573.30*/("""
                            """),format.raw/*574.29*/("""<div id="xxx">
                                """),_display_(/*575.34*/for(error <- contactForm("textbox").errors) yield /*575.77*/ {_display_(Seq[Any](format.raw/*575.79*/("""
                                """),format.raw/*576.33*/("""<p id="xxxx">"""),_display_(/*576.47*/error/*576.52*/.format(messages())),format.raw/*576.71*/("""</p>
                                """)))}),format.raw/*577.34*/("""</div>



                                <button type="submit"  class="btn btn-default" >Siųsti žinute</button>

                            <div id="flash">"""),_display_(/*583.46*/flash/*583.51*/.get("success")),format.raw/*583.66*/("""</div>

                            """),_display_(/*585.30*/if(contactForm.hasGlobalErrors)/*585.61*/ {_display_(Seq[Any](format.raw/*585.63*/("""
                            """),format.raw/*586.29*/("""<div id="xxx">
                            <p class="error" >
                                """),_display_(/*588.34*/for(error <- contactForm.globalErrors) yield /*588.72*/ {_display_(Seq[Any](format.raw/*588.74*/("""
                            """),format.raw/*589.29*/("""<p>"""),_display_(/*589.33*/error/*589.38*/.format(messages())),format.raw/*589.57*/("""</p>
                            """),_display_(/*590.30*/for(error <- contactForm("email").errors) yield /*590.71*/ {_display_(Seq[Any](format.raw/*590.73*/("""
                            """),format.raw/*591.29*/("""<p>"""),_display_(/*591.33*/error/*591.38*/.format(messages())),format.raw/*591.57*/("""</p>
                            """)))}),format.raw/*592.30*/("""
                            """)))}),format.raw/*593.30*/("""
                            """),format.raw/*594.29*/("""</p>
                            </div>
                            """)))}),format.raw/*596.30*/("""
                            """)))}),format.raw/*597.30*/("""


                            """),format.raw/*600.29*/("""<p></p>
                            <h3>Mūsų socialiniai tinklai</h3>
                            <ul class="list-inline banner-social-buttons">
                                <li><a href="www.google.com" class="btn btn-default btn-lg"><i class="fa fa-twitter"> <span class="network-name">Twitter</span></i></a></li>
                                <li><a href=""""),_display_(/*604.47*/routes/*604.53*/.HomeController.toFaceBook),format.raw/*604.79*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
                                <li><a href="#" class="btn btn-default btn-lg"><i class="fa fa-youtube-play"> <span class="network-name">Youtube</span></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>


        </div>
        </div>
    </div>
    <a href="#kontaktai" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>







</section>


<section>
    <hr>
    <!-- Map Section -->
    <div id="kontaktai" class="text-center">
        <div class="row">
            <div class="col-lg-12">
                <p></p>
                <h2>Kontaktinė informacija</h2>
                <p style="color:#fff;">
                    <strong><i class="fa fa-map-marker"></i> Adresas</strong><br>
                    Villenstrasse 35, Šafhauzenas, 8200, Šveicarija
                </p>
                <p style="color:#fff;"><strong><i class="fa fa-phone"></i> Telefono numeris</strong><br>
                    +41 797897010</p>
                <p style="color:#fff;">
                    <strong><i class="fa fa-envelope"></i>  Elektroninis paštas</strong><br>
                    info@vidamassage.ch</p>
                <p></p>
            </div>
        </div>
    </div>
<hr>
    """),_display_(/*650.6*/if(contactForm.hasErrors)/*650.31*/{_display_(Seq[Any](format.raw/*650.32*/("""<script src=""""),_display_(/*650.46*/routes/*650.52*/.Assets.at("javascripts/js/returnToFormOnFail.js")),format.raw/*650.102*/(""""></script>""")))}),format.raw/*650.114*/("""</script>
</section>





<section>
<!-- Map Section -->
<div id="map" class="text-center">
    <div class="row">
        <div class="col-lg-12">
<h2>Žemėlapis</h2>



        </div>
    </div>
</div>

</section>



<!-- Footer -->
<footer>
    <div class="container text-center">
        <p>Copyright &copy; Vida Massage 2017</p>
    </div>
</footer>

<!-- jQuery -->
<script src='"""),_display_(/*682.15*/routes/*682.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*682.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*685.15*/routes/*685.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*685.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="""),_display_(/*688.14*/routes/*688.20*/.Assets.at("javascripts/js/jquery.easing.min.js")),format.raw/*688.69*/(""""></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->

<!-- Theme JavaScript -->
<script src='"""),_display_(/*693.15*/routes/*693.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*693.66*/("""'></script>

</body>


""")))}))
      }
    }
  }

  def render(message:String,style:String,contactForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.twirl.api.HtmlFormat.Appendable = apply(message,style,contactForm)

  def f:((String,String,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (message,style,contactForm) => apply(message,style,contactForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 23 20:14:55 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/pagrindinisContent.scala.html
                  HASH: a97144ba0947226d225ff3de049c8807bfe24799
                  MATRIX: 1047->1|1183->66|1228->64|1255->83|1302->122|1352->135|1383->140|1914->644|1929->650|1979->679|3314->1987|3329->1993|3379->2022|3419->2035|3435->2041|3494->2078|3658->2215|3673->2221|3723->2250|3763->2263|3779->2269|3838->2306|4006->2447|4021->2453|4072->2483|4113->2496|4129->2502|4188->2539|4398->2723|4411->2728|4447->2743|4475->2744|5450->3691|5466->3697|5520->3729|7697->5878|7713->5884|7775->5923|10811->8931|10827->8937|10884->8971|12869->10928|12885->10934|12942->10968|13851->11849|13867->11855|13929->11894|17596->15533|17612->15539|17669->15573|19152->17028|19168->17034|19225->17068|20077->17892|20093->17898|20150->17932|21013->18767|21029->18773|21091->18812|26347->24040|26363->24046|26450->24122|26492->24124|26554->24158|26570->24164|26632->24216|26701->24245|26759->24274|26813->24300|26834->24311|26880->24335|26943->24369|26968->24371|27000->24374|27039->24391|27075->24416|27117->24418|27175->24447|27219->24463|27240->24474|27287->24499|27331->24511|27393->24541|27454->24573|27526->24617|27588->24662|27629->24664|27687->24693|27729->24707|27744->24712|27785->24731|27855->24769|27922->24808|27938->24814|28014->24879|28083->24908|28141->24937|28195->24963|28216->24974|28258->24994|28334->25041|28359->25043|28391->25046|28430->25063|28466->25088|28508->25090|28566->25119|28610->25135|28631->25146|28674->25167|28718->25179|28780->25209|28841->25241|28913->25285|28971->25326|29012->25328|29070->25357|29112->25371|29127->25376|29168->25395|29238->25433|29309->25476|29325->25482|29375->25522|29444->25551|29502->25580|29606->25656|29638->25678|29665->25683|29701->25690|29726->25692|29803->25740|29839->25765|29871->25767|29893->25778|29942->25802|30050->25878|30108->25907|30184->25955|30244->25998|30285->26000|30347->26033|30389->26047|30404->26052|30445->26071|30515->26109|30702->26268|30717->26273|30754->26288|30819->26325|30860->26356|30901->26358|30959->26387|31082->26482|31137->26520|31178->26522|31236->26551|31268->26555|31283->26560|31324->26579|31386->26613|31444->26654|31485->26656|31543->26685|31575->26689|31590->26694|31631->26713|31697->26747|31759->26777|31817->26806|31918->26875|31980->26905|32040->26936|32432->27300|32448->27306|32496->27332|33942->28752|33977->28777|34017->28778|34059->28792|34075->28798|34148->28848|34193->28860|34604->29243|34620->29249|34691->29298|34781->29360|34797->29366|34881->29428|34962->29481|34978->29487|35049->29536|35302->29761|35318->29767|35385->29812
                  LINES: 30->1|33->2|36->1|37->3|37->3|37->3|42->8|52->18|52->18|52->18|87->53|87->53|87->53|87->53|87->53|87->53|91->57|91->57|91->57|91->57|91->57|91->57|95->61|95->61|95->61|95->61|95->61|95->61|109->75|109->75|109->75|110->76|136->102|136->102|136->102|193->159|193->159|193->159|240->206|240->206|240->206|273->239|273->239|273->239|298->264|298->264|298->264|352->318|352->318|352->318|374->340|374->340|374->340|395->361|395->361|395->361|417->383|417->383|417->383|566->532|566->532|566->532|566->532|571->537|571->537|571->537|571->537|572->538|572->538|572->538|572->538|572->538|572->538|572->538|572->538|572->538|572->538|573->539|573->539|573->539|573->539|573->539|574->540|578->544|579->545|579->545|579->545|580->546|580->546|580->546|580->546|581->547|585->551|585->551|585->551|585->551|586->552|586->552|586->552|586->552|586->552|586->552|586->552|586->552|586->552|586->552|587->553|587->553|587->553|587->553|587->553|588->554|592->558|593->559|593->559|593->559|594->560|594->560|594->560|594->560|595->561|603->569|603->569|603->569|603->569|604->570|605->571|605->571|605->571|605->571|605->571|605->571|605->571|605->571|605->571|605->571|607->573|608->574|609->575|609->575|609->575|610->576|610->576|610->576|610->576|611->577|617->583|617->583|617->583|619->585|619->585|619->585|620->586|622->588|622->588|622->588|623->589|623->589|623->589|623->589|624->590|624->590|624->590|625->591|625->591|625->591|625->591|626->592|627->593|628->594|630->596|631->597|634->600|638->604|638->604|638->604|684->650|684->650|684->650|684->650|684->650|684->650|684->650|716->682|716->682|716->682|719->685|719->685|719->685|722->688|722->688|722->688|727->693|727->693|727->693
                  -- GENERATED --
              */
          