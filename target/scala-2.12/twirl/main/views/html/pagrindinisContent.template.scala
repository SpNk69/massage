
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
    <a href="#kainos" class="btn btn-circle page-scroll">
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
                    <hr>

    <p></p>


            <div >

            </div>


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




                            """),_display_(/*494.30*/helper/*494.36*/.form(action = routes.HomeController.submitLT(),'class -> "form-horizontal")/*494.112*/ {_display_(Seq[Any](format.raw/*494.114*/("""




                            """),_display_(/*499.30*/helper/*499.36*/.input(contactForm("Vardas"),'class->"form-control")/*499.88*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*499.117*/("""
                            """),format.raw/*500.29*/("""<input type="text" name=""""),_display_(/*500.55*/contactForm/*500.66*/.field("firstName").name),format.raw/*500.90*/(""""  placeholder="Jūsų vardas" id=""""),_display_(/*500.124*/id),format.raw/*500.126*/("""" """),_display_(/*500.129*/toHtmlArgs(args)),_display_(/*500.146*/if(contactForm.hasErrors)/*500.171*/ {_display_(Seq[Any](format.raw/*500.173*/("""
                            """),format.raw/*501.29*/("""<option value='"""),_display_(/*501.45*/contactForm/*501.56*/.field("firstName").value),format.raw/*501.81*/("""'></option>""")))}),format.raw/*501.93*/("""
                            """)))}),format.raw/*502.30*/("""



                            """),format.raw/*506.29*/("""<div id="xxx">
                            """),_display_(/*507.30*/for(error <- contactForm("firstName").errors) yield /*507.75*/ {_display_(Seq[Any](format.raw/*507.77*/("""
                            """),format.raw/*508.29*/("""<p id="xxxx">"""),_display_(/*508.43*/error/*508.48*/.format(messages())),format.raw/*508.67*/("""</p>
                                """)))}),format.raw/*509.34*/("""</div>



                            """),_display_(/*513.30*/helper/*513.36*/.input(contactForm("Elektroninis paštas"),'class->"form-control")/*513.101*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*513.130*/("""
                            """),format.raw/*514.29*/("""<input type="text" name=""""),_display_(/*514.55*/contactForm/*514.66*/.field("email").name),format.raw/*514.86*/(""""  placeholder="Jūsų elektroninis paštas" id=""""),_display_(/*514.133*/id),format.raw/*514.135*/("""" """),_display_(/*514.138*/toHtmlArgs(args)),_display_(/*514.155*/if(contactForm.hasErrors)/*514.180*/ {_display_(Seq[Any](format.raw/*514.182*/("""
                            """),format.raw/*515.29*/("""<option value='"""),_display_(/*515.45*/contactForm/*515.56*/.field("email").value),format.raw/*515.77*/("""'></option>""")))}),format.raw/*515.89*/("""
                            """)))}),format.raw/*516.30*/("""



                            """),format.raw/*520.29*/("""<div id="xxx">
                            """),_display_(/*521.30*/for(error <- contactForm("email").errors) yield /*521.71*/ {_display_(Seq[Any](format.raw/*521.73*/("""
                            """),format.raw/*522.29*/("""<p id="xxxx">"""),_display_(/*522.43*/error/*522.48*/.format(messages())),format.raw/*522.67*/("""</p>
                                """)))}),format.raw/*523.34*/("""</div>







                            """),_display_(/*531.30*/helper/*531.36*/.input(field = contactForm("Klausimas"))/*531.76*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*531.105*/("""
                            """),format.raw/*532.29*/("""<div>
                                <textarea class="form-control" name=""""),_display_(/*533.71*/contactForm("textbox")/*533.93*/.name),format.raw/*533.98*/("""" id=""""),_display_(/*533.105*/id),format.raw/*533.107*/("""" placeholder="Jūsų žinutė" rows='5' cols='80'>"""),_display_(/*533.155*/if(contactForm.hasErrors)/*533.180*/{_display_(_display_(/*533.182*/contactForm/*533.193*/.field("textbox").value))}),format.raw/*533.217*/("""</textarea>
                            </div>
                            """)))}),format.raw/*535.30*/("""
                            """),format.raw/*536.29*/("""<div id="xxx">
                                """),_display_(/*537.34*/for(error <- contactForm("textbox").errors) yield /*537.77*/ {_display_(Seq[Any](format.raw/*537.79*/("""
                                """),format.raw/*538.33*/("""<p id="xxxx">"""),_display_(/*538.47*/error/*538.52*/.format(messages())),format.raw/*538.71*/("""</p>
                                """)))}),format.raw/*539.34*/("""</div>



                                <button type="submit"  class="btn btn-default" >Siųsti žinute</button>

                            <div id="flash">"""),_display_(/*545.46*/flash/*545.51*/.get("success")),format.raw/*545.66*/("""</div>

                            """),_display_(/*547.30*/if(contactForm.hasGlobalErrors)/*547.61*/ {_display_(Seq[Any](format.raw/*547.63*/("""
                            """),format.raw/*548.29*/("""<div id="xxx">
                            <p class="error" >
                                """),_display_(/*550.34*/for(error <- contactForm.globalErrors) yield /*550.72*/ {_display_(Seq[Any](format.raw/*550.74*/("""
                            """),format.raw/*551.29*/("""<p>"""),_display_(/*551.33*/error/*551.38*/.format(messages())),format.raw/*551.57*/("""</p>
                            """),_display_(/*552.30*/for(error <- contactForm("email").errors) yield /*552.71*/ {_display_(Seq[Any](format.raw/*552.73*/("""
                            """),format.raw/*553.29*/("""<p>"""),_display_(/*553.33*/error/*553.38*/.format(messages())),format.raw/*553.57*/("""</p>
                            """)))}),format.raw/*554.30*/("""
                            """)))}),format.raw/*555.30*/("""
                            """),format.raw/*556.29*/("""</p>
                            </div>
                            """)))}),format.raw/*558.30*/("""
                            """)))}),format.raw/*559.30*/("""


                            """),format.raw/*562.29*/("""<p></p>
                            <h3>Mūsų socialiniai tinklai</h3>
                            <ul class="list-inline banner-social-buttons">
                                <li><a href="www.google.com" class="btn btn-default btn-lg"><i class="fa fa-twitter"> <span class="network-name">Twitter</span></i></a></li>
                                <li><a href=""""),_display_(/*566.47*/routes/*566.53*/.HomeController.toFaceBook),format.raw/*566.79*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
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
    """),_display_(/*612.6*/if(contactForm.hasErrors)/*612.31*/{_display_(Seq[Any](format.raw/*612.32*/("""<script src=""""),_display_(/*612.46*/routes/*612.52*/.Assets.at("javascripts/js/returnToFormOnFail.js")),format.raw/*612.102*/(""""></script>""")))}),format.raw/*612.114*/("""</script>
</section>





<section>
<!-- Map Section -->
<div id="mappp" class="text-center">
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
<script src='"""),_display_(/*644.15*/routes/*644.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*644.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*647.15*/routes/*647.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*647.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="""),_display_(/*650.14*/routes/*650.20*/.Assets.at("javascripts/js/jquery.easing.min.js")),format.raw/*650.69*/(""""></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->

<!-- Theme JavaScript -->
<script src='"""),_display_(/*655.15*/routes/*655.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*655.66*/("""'></script>

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
                  DATE: Sat Sep 23 21:29:02 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/pagrindinisContent.scala.html
                  HASH: d64146c6067f39478de9f1d747c29d7e2a430ada
                  MATRIX: 1047->1|1183->66|1228->64|1255->83|1302->122|1352->135|1383->140|1914->644|1929->650|1979->679|3314->1987|3329->1993|3379->2022|3419->2035|3435->2041|3494->2078|3658->2215|3673->2221|3723->2250|3763->2263|3779->2269|3838->2306|4006->2447|4021->2453|4072->2483|4113->2496|4129->2502|4188->2539|4398->2723|4411->2728|4447->2743|4475->2744|5450->3691|5466->3697|5520->3729|7697->5878|7713->5884|7775->5923|10811->8931|10827->8937|10884->8971|12869->10928|12885->10934|12942->10968|13851->11849|13867->11855|13929->11894|17596->15533|17612->15539|17669->15573|19152->17028|19168->17034|19225->17068|20077->17892|20093->17898|20150->17932|21013->18767|21029->18773|21091->18812|24671->22364|24687->22370|24774->22446|24816->22448|24878->22482|24894->22488|24956->22540|25025->22569|25083->22598|25137->22624|25158->22635|25204->22659|25267->22693|25292->22695|25324->22698|25363->22715|25399->22740|25441->22742|25499->22771|25543->22787|25564->22798|25611->22823|25655->22835|25717->22865|25778->22897|25850->22941|25912->22986|25953->22988|26011->23017|26053->23031|26068->23036|26109->23055|26179->23093|26246->23132|26262->23138|26338->23203|26407->23232|26465->23261|26519->23287|26540->23298|26582->23318|26658->23365|26683->23367|26715->23370|26754->23387|26790->23412|26832->23414|26890->23443|26934->23459|26955->23470|26998->23491|27042->23503|27104->23533|27165->23565|27237->23609|27295->23650|27336->23652|27394->23681|27436->23695|27451->23700|27492->23719|27562->23757|27633->23800|27649->23806|27699->23846|27768->23875|27826->23904|27930->23980|27962->24002|27989->24007|28025->24014|28050->24016|28127->24064|28163->24089|28195->24091|28217->24102|28266->24126|28374->24202|28432->24231|28508->24279|28568->24322|28609->24324|28671->24357|28713->24371|28728->24376|28769->24395|28839->24433|29026->24592|29041->24597|29078->24612|29143->24649|29184->24680|29225->24682|29283->24711|29406->24806|29461->24844|29502->24846|29560->24875|29592->24879|29607->24884|29648->24903|29710->24937|29768->24978|29809->24980|29867->25009|29899->25013|29914->25018|29955->25037|30021->25071|30083->25101|30141->25130|30242->25199|30304->25229|30364->25260|30756->25624|30772->25630|30820->25656|32266->27076|32301->27101|32341->27102|32383->27116|32399->27122|32472->27172|32517->27184|32930->27569|32946->27575|33017->27624|33107->27686|33123->27692|33207->27754|33288->27807|33304->27813|33375->27862|33628->28087|33644->28093|33711->28138
                  LINES: 30->1|33->2|36->1|37->3|37->3|37->3|42->8|52->18|52->18|52->18|87->53|87->53|87->53|87->53|87->53|87->53|91->57|91->57|91->57|91->57|91->57|91->57|95->61|95->61|95->61|95->61|95->61|95->61|109->75|109->75|109->75|110->76|136->102|136->102|136->102|193->159|193->159|193->159|240->206|240->206|240->206|273->239|273->239|273->239|298->264|298->264|298->264|352->318|352->318|352->318|374->340|374->340|374->340|395->361|395->361|395->361|417->383|417->383|417->383|528->494|528->494|528->494|528->494|533->499|533->499|533->499|533->499|534->500|534->500|534->500|534->500|534->500|534->500|534->500|534->500|534->500|534->500|535->501|535->501|535->501|535->501|535->501|536->502|540->506|541->507|541->507|541->507|542->508|542->508|542->508|542->508|543->509|547->513|547->513|547->513|547->513|548->514|548->514|548->514|548->514|548->514|548->514|548->514|548->514|548->514|548->514|549->515|549->515|549->515|549->515|549->515|550->516|554->520|555->521|555->521|555->521|556->522|556->522|556->522|556->522|557->523|565->531|565->531|565->531|565->531|566->532|567->533|567->533|567->533|567->533|567->533|567->533|567->533|567->533|567->533|567->533|569->535|570->536|571->537|571->537|571->537|572->538|572->538|572->538|572->538|573->539|579->545|579->545|579->545|581->547|581->547|581->547|582->548|584->550|584->550|584->550|585->551|585->551|585->551|585->551|586->552|586->552|586->552|587->553|587->553|587->553|587->553|588->554|589->555|590->556|592->558|593->559|596->562|600->566|600->566|600->566|646->612|646->612|646->612|646->612|646->612|646->612|646->612|678->644|678->644|678->644|681->647|681->647|681->647|684->650|684->650|684->650|689->655|689->655|689->655
                  -- GENERATED --
              */
          