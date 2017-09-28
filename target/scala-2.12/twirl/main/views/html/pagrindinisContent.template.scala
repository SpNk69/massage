
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
                    <a class="page-scroll" href='"""),_display_(/*53.51*/routes/*53.57*/.HomeController.germanVersion),format.raw/*53.86*/("""'><img src='"""),_display_(/*53.99*/routes/*53.105*/.Assets.at("images/img/flag-de2.png")),format.raw/*53.142*/("""' alt="Vokiečių kalba" /></a>
                </li>

                <li>
                    <a class="page-scroll" href='"""),_display_(/*57.51*/routes/*57.57*/.HomeController.pagrindinisLT),format.raw/*57.86*/("""'><img src='"""),_display_(/*57.99*/routes/*57.105*/.Assets.at("images/img/flag-lt2.png")),format.raw/*57.142*/("""' alt="Lietuvių kalba" /></a>
                </li>

                <li>
                    <a class="page-scroll" href=""""),_display_(/*61.51*/routes/*61.57*/.HomeController.russianVersion),format.raw/*61.87*/(""""><img src='"""),_display_(/*61.100*/routes/*61.106*/.Assets.at("images/img/flag-rus.png")),format.raw/*61.143*/("""' alt="Rusų kalba" /></a>
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
<section id="apie" class="container content-section text-center ">
    <div class="row ">



        <div class="col-lg-6 ">
            <img src='"""),_display_(/*102.24*/routes/*102.30*/.Assets.at("images/img/Vida.jpg")),format.raw/*102.63*/("""' class="img-circle" alt="Vida Polescuk" height="600">

        </div>
        <p></p>

        <div class="col-lg-6">

            <h3 align="center"><u>Išsilavinimas</u></h3>
            <ul><li>"Vilniaus aukštesnioji medicinos mokykla", Lietuva.</li>
                <li>Klaipėdos universitetas. Bakalauro laipsnis "Visuomenės sveikata".</li>
                <li>2010 metai - "Baltic SPA Professional" Kursai (Latvija), SPA masažai.</li>
                <li>2012 metai - Slaugos darbuotojų tobulinimosi ir specializacijos centras: Pažymėjimas Nr. KV 120146 - suteikta teisė daryti gydomuosius masažus.</li>

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
                <li>Tradicinis ajurvedinis Keralos masažas</li>
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
                        <!--<div class="text-center"><img src='"""),_display_(/*160.65*/routes/*160.71*/.Assets.at("images/img/massage164.jpg")),format.raw/*160.110*/("""'
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
                            <div id="limfo2" class="collapse customWidth"><p class="massageText">

                                Esant nuolatiniam stresui ir nuovargiui, veido raumenys sustingsta ,,liūdesio" kaukėje. Sunkėja limfos nutekėjimas, o kartu toksinių medžiagų apykaitos produktų šalinimas.</br>


                                Veido limfodrenažas suteikia puikių rezultatų:</br>
                                veido pabrinimais,</br>
                                išsausėjusia oda,</br>
                                ankstyvuoju senejimu,</br>
                                tamsiais ratilais ir maišeliais po akimis,</br>
                                sumažėjusiu audinių bei raumenų elastingumu,</br>
                                kovojant su kuperoze.</br>
                                Sumažinę veido suglebimą, sulaukiame ryškaus standinamojo efekto, išsilygina raukšlės.</p> </div>

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
                      <!--  <div class="text-center"><img src='"""),_display_(/*219.65*/routes/*219.71*/.Assets.at("images/img/mas3.jpeg")),format.raw/*219.105*/("""' class="img-circle"
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


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#segmentinis">Klasikinis – segmentinis nugaros masažas
                    </button>
                    <p></p>
                    <div id="segmentinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*251.67*/routes/*251.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*251.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Šis masažas idealiai tinka žmonėms, kurie visą dieną praleidžia stovėdami, sėdėdami pavyzdžiui: prie kompiuterio arba vairuodami automobilį taip pat dirbantiems sėdimą ar sunkų fizinį darbą, kai visa įtampa susikaupia stuburo dalyje, kaklo ir pečių, juosmens ir sėdmenų srityse, ir dėl to susiformuoja skausmingi raumenų mazgai. Šis masažas ypač tinka po treniruočių  kai būna ilgalaikis ir trumpalaikis skausmas. Be to, dėl netaisyklingos stuburo padėties dažnai skauda galvą.
                            </br> Periodiškai atliekamas masažas padės atsikratyti dažnų nugaros ir galvos skausmų, atpalaiduoti įtemptas raumenų grupes.
                                </br>    Po masažo atslūgsta nugaros, galvos, pečių, sėdmenų skausmai.
                                </br>  Po masažo Jūs jausitės pailsėję ir energingi. </p>


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
                  <!--  <div class="text-center"><img src='"""),_display_(/*279.61*/routes/*279.67*/.Assets.at("images/img/massage164.jpg")),format.raw/*279.106*/("""'
                                                  class="img-circle" alt="Medicine massage" width="250"
                                                  height="250"></a></div>-->
                    <div class="customBackGroundOfDiv" align="center">
                        <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#galva" >
                            Galvos masažas
                        </button>
                        <div id="galva" class="collapse customWidth"><p class="massageText">Sumažina stresą, galvos skausmus, gerina kraujo apytaką.</p> </div>

                        <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#peciai" >
                            Pečių – kaklo – rankų  masažas
                        </button>
                        <div id="peciai" class="collapse customWidth"><p class="massageText">Efektyviausia  nemalonių simptomų šalinimo  priemonė. Jau po pirmo karto jus pajusite bendrą savijautos pagerėjimą. Po pilno masažo kurso skausmingi pojūčiai išnyksta, atsiranda žvalumas, padidėja darbingumas, išnyksta nemiga ir irzlumas. Tai yra puiki priemonė atsikratyti galvos, kaklo, pečių skausmo, rankų tirpimo jausmo.  </p> </div>





                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pilvo" >
                                Pilvo masažas
                            </button>
                            <div id="pilvo" class="collapse customWidth"><p class="massageText">Stimuliuoja virškinimą, turi teigiamą poveikį vidinių organų veiklai, gerina virškinimo trakto funkcijas ir tulžies sekreciją, padeda su vidurių užkietėjimais arba dujų susikaupimo žarnyne</div>


                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#juosmens" >
                                Juosmens - sėdmenų - kojų  masažas
                            </button>
                        <div id="juosmens" class="collapse customWidth"><p class="massageText">Gerina kraujo ir limfos apytaką juosmens bei kojų srityse, atpalaiduoja įsitempusius  raumenis, mažina juosmens, sėdmenų, kojų skausmą, stiprina nusilpusius raumenis.
                            Sumažina skausmą po operacijos, mažina nervinių šaknų uždegimą.</p></div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pedu" >
                                Atpalaiduojantis pėdų masažas
                            </button>
                        <div id="pedu" class="collapse customWidth"><p class="massageText">Taikomas pavargusioms, skausmingoms pėdoms atpalaiduoti, kūno gyvybiniam tonusui padidinti, imunitetui stiprinti. Ši procedūra tinka daug vaikštantiems, dirbantiems stovimą arba žmonėms šąlančiomis kojomis. Pėdų masažas padeda atsigauti ir pailsėti visam organizmui.</p></div>



                    </div>
                </div>
                <p></p>
            </div>


            <div class="col-lg-4 ">


                <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#vyresnio">Masažas vyresnio amžiaus žmonėms
                </button>
                <p></p>
                <div id="vyresnio" class="collapse">
                    <!--  <div class="text-center"><img src='"""),_display_(/*329.63*/routes/*329.69*/.Assets.at("images/img/mas3.jpeg")),format.raw/*329.103*/("""' class="img-circle"
                                                    alt="Medicine massage" width="250" height="250"></a></div>-->
                    <div class="customBackGroundOfDiv " align="center">

                        <p class="massageText customWidth">Masažas yra būtina ir labai naudinga procedūra pagyvenusiems žmonėms, pensininkams. Tyrimai parodė, kad masažas lėtina senėjimo procesą. Taip pat masažas veikia raminančiai visą organizmą ir gali sumažinti skausmus. Masažas gali padėti žmonėms, kenčiantiems raumenų skausmus ar sergantiems atritu. Kada žmogus kenčia, jis tampa vis mažiau aktyvus, nukenčia gyvenimo kokybė ir sveikata. Masažas gerina kraujotaką,  pašalina raumenų nuovargį ir raumenys įgauna tonusą. Dėl to pagerėja pagyvenusio žmogaus gyvenimo kokybė.
                            </br>Prieš masažą Jums gerai būtų pasikonsultuoti su savo gydytoju. Kai tik gausite gydytojo leidimą masažui, jus drąsiai galite kreiptis pas mane.  </p>


                    </div>
                </div>
                <p></p>
            </div>



            <div class="col-lg-4 ">


                <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#atpalaiduojantis">Atpalaiduojantis viso kūno  masažas
                </button>
                <p></p>
                <div id="atpalaiduojantis" class="collapse">
                    <!--  <div class="text-center"><img src='"""),_display_(/*351.63*/routes/*351.69*/.Assets.at("images/img/mas3.jpeg")),format.raw/*351.103*/("""' class="img-circle"
                                                    alt="Medicine massage" width="250" height="250"></a></div>-->
                    <div class="customBackGroundOfDiv " align="center">

                        <p class="massageText customWidth"> Atpalaiduojantis masažas tinka visiems, norintiems atsipalaiduoti po sunkios dienos, užsimiršti bei pabėgti nuo kasdienės rutinos. Pašalina įtampą ir stresą, atslūgsta nugaros ir galvos skausmai, atsipalaiduoja raumenys, teigiamai veikia vidinę organizmo būseną,  pagerina nuotaiką bei grąžina energiją. </p>

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
                        <!--  <div class="text-center"><img src='"""),_display_(/*372.67*/routes/*372.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*372.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Yra skirtas krūtinės sričiai. Jis atliekamas ne tik norint pagražinti krūtinę, sustangrinti krūtis, suteikti joms gražią formą, bet ir siekiant gilesnių terapinių tikslų. Šis masažas daro teigiamą įtaką visų moters reprodukcinių organų sistemai bei padeda subalansuoti hormonų sistemos veiklą. Labai sumažina nemalonų krūtų jautrumą, susijusį su menstruacijų ciklu. Praktiškai išnyksta krūtų vėžio rizika. Švelnėja implantų surandėjimai.
                            </br> Toks masažas pagerina savijautą, padaro krūtis gražesnes, suteikia pasitikėjimo ir padeda geriau jaustis kaip moteriai.</p>

                        </div>
                    </div>
                    <p></p>
                </div>




                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#anticeliulitinis" >
                        Anticeliulitinis masažas rankomis
                    </button>
                    <p></p>
                    <div id="anticeliulitinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*395.67*/routes/*395.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*395.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">



                           <p class="massageText customWidth"> Tai ypač efektyvus kovos su celiulitu būdas, taikomas tam tikrų probleminių sričių – šlaunų, sėdmenų ir pilvo – netolygiam poodiniam sluksniui (celiulitui) mažinti.
                                </br>    Masažas aktyvina limfotaką, padidina raumenų susitraukimą ir tonusą dėl to, mažėja celiulitas ir patinimai. Išvalo organizmą nuo šlakų bei suteikia ryškiai išreikštą kosmetinį efektą.
                               </br>   Masažas su Tibeto moline taure yra pats švelniausias – nepalieka mėlynių, nežaloja kapiliarų.</br>
                           Naudojant Tibeto molinę vakuuminę taurę.</p> </div>





                        </div>
                    </div>
                    <p></p>
                </div>

            </div>

        </div>
        <a href="#kainos" class="btn btn-circle page-scroll">
            <i class="fa fa-angle-double-down animated"></i>
        </a>
        </div>

    </div>


</section >


<section id="galerija" class="content-section text-center">

    <div class="row">

        <div class="col-md-8 col-md-offset-2">
            <hr>
            <h2>Galerija</h2>
            <hr>

            <p></p>


            <div class="col-lg-4 ">
                        <a href=""""),_display_(/*443.35*/routes/*443.41*/.Assets.at("images/img/1nr.jpg")),format.raw/*443.73*/(""""> <img src=""""),_display_(/*443.87*/routes/*443.93*/.Assets.at("images/img/1nr.jpg")),format.raw/*443.125*/("""" class="w3-image w3-round" alt="Buda" ></a>
                    </div>

<p></p>
                    <div class="col-lg-4 ">
                        <a href=""""),_display_(/*448.35*/routes/*448.41*/.Assets.at("images/img/Skype1.jpg")),format.raw/*448.76*/(""""> <img src=""""),_display_(/*448.90*/routes/*448.96*/.Assets.at("images/img/Skype1.jpg")),format.raw/*448.131*/("""" class="w3-image w3-round" alt="Buda" ></a>
                    </div>
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*453.27*/routes/*453.33*/.Assets.at("images/img/3nr.jpg")),format.raw/*453.65*/(""""> <img src=""""),_display_(/*453.79*/routes/*453.85*/.Assets.at("images/img/3nr.jpg")),format.raw/*453.117*/("""" class="w3-image w3-round" alt="Buda" ></a>
            </div>


        </div>
    </div>
        <div class="row">

            <div class="col-md-8 col-md-offset-2">
                <p></p>

                <div class="col-lg-4 ">
                    <a href=""""),_display_(/*465.31*/routes/*465.37*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*465.74*/(""""> <img src=""""),_display_(/*465.88*/routes/*465.94*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*465.131*/("""" class="w3-image w3-round" alt="Buda" ></a>
                </div>
                <p></p>

                <div class="col-lg-4 ">
                    <a href=""""),_display_(/*470.31*/routes/*470.37*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*470.74*/(""""> <img src=""""),_display_(/*470.88*/routes/*470.94*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*470.131*/("""" class="w3-image w3-round" alt="Buda" ></a>
                </div>
                <p></p>

                <div class="col-lg-4 ">
                    <a href=""""),_display_(/*475.31*/routes/*475.37*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*475.74*/(""""> <img src=""""),_display_(/*475.88*/routes/*475.94*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*475.131*/("""" class="w3-image w3-round" alt="Buda" ></a>
                </div>
                <p></p>




            </div>




        </div>

    <div class="row">

        <div class="col-md-8 col-md-offset-2">
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*495.27*/routes/*495.33*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*495.70*/(""""> <img src=""""),_display_(/*495.84*/routes/*495.90*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*495.127*/("""" class="w3-image w3-round" alt="Buda" ></a>
            </div>
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*500.27*/routes/*500.33*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*500.70*/(""""> <img src=""""),_display_(/*500.84*/routes/*500.90*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*500.127*/("""" class="w3-image w3-round" alt="Buda" ></a>
            </div>
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*505.27*/routes/*505.33*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*505.70*/(""""> <img src=""""),_display_(/*505.84*/routes/*505.90*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*505.127*/("""" class="w3-image w3-round" alt="Buda" ></a>
            </div>
            <p></p>




        </div>





    </div>




    <a href="#kainos" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>

    </div>

</section>




<section  class="content-section text-center">
    <div class="contact-section " id="kainos">
    <div class="row" >
        <div class="col-md-8  col-md-offset-2 " >
            <div class="" >
                <hr>
                <h2>Kainos</h2>
                <hr>

                <div class="w3-container customBackGroundOfDiv">

                    <p></p>
                    <h5 align="center"><u>Spa masažai</u></h5>

                    <table class="table table-inverse">
                        <th scope="row"><u>Spa Masažai</u></th>
                        <td><b><u>Trukmė</u></b></td>
                        <td><b><u>Kaina</u></b></td>
                        <tbody>
                        <tr>
                            <th scope="row">Karštų-šaltų akmenų masažas</th>
                            <td>120min</td>
                            <td>150 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row">Limfodrenažinis kūno masažas</th>
                            <td>120min</td>

                            <td>120 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row">Limfodrenažinis veido masažas</th>
                            <td>120min</td>

                            <td>70 CHF</td>
                        </tr>

                        <tr>
                            <th scope="row">Ajurvedinis krūtų masažas mot.</th>
                            <td>120min</td>

                            <td>80 CHF</td>
                        </tr>

                        <tr>
                            <th scope="row">Klasikinis segmentinis nugaros masažas</th>
                            <td>120min</td>

                            <td>120 CHF</td>
                        </tr>



                        <tr>
                            <th scope="row">Atpalaiduojantis viso kūno masažas</th>
                            <td>120min</td>

                            <td>130 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row">Atpalaiduojantis pėdų masažas</th>
                            <td>120min</td>

                            <td>70 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row">Masažas vyresnio amžiaus žmonėms</th>
                            <td>120min</td>

                            <td>100 CHF</td>
                        </tr>

                        </tbody>
                    </table>



                    <h5 align="center"><b><u>Kiti masažai</u></b></h5>

                    <table class="table table-inverse">
                        <th scope="row"><u>Atskirų kūno dalių masažai:</u> </th>
                        <td><b><u>30min</u></b></td>
                        <td><b><u>60min</u></b></td>
                        <td><b><u>90min</u></b></td>
                        <tbody>

                        <tr>
                            <th scope="row">Juosmens</th>
                            <td>50 CHF</td>
                            <td>80 CHF</td>
                            <td>100 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row">Pečių</th>
                            <td>50 CHF</td>
                            <td>80 CHF</td>
                            <td>100 CHF</td>
                        </tr>
                        <p></p>

                        <th scope="row"><u>Anticeliulitinis masažai:<u></th>
                        <td></td>
                        <td></td>
                        <td></td>
                        <tbody>

                        <tr>
                            <th scope="row">Sėdmenų</th>
                            <td>50 CHF</td>
                            <td>80 CHF</td>
                            <td>100 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row">Šlaunų</th>
                            <td>50 CHF</td>
                            <td>80 CHF</td>
                            <td>100 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row">Pilvo</th>
                            <td>50 CHF</td>
                            <td>80 CHF</td>
                            <td>100 CHF</td>
                        </tr>

                        </tbody>
                    </table>



                    <h5 align="center"><b><u>DOVANŲ KUPONAI</u></b></h5>

                    <table class="table table-inverse">


                        <tr>
                            <th scope="row"><u>Dovanų kuponai</u> </th>
                            <td>120 CHF</td>
                            <td>250 CHF</td>
                            <td>* CHF</td>
                        <tr>
                            <th scope="row">* - jusu pasirinkta suma</th>
                        </tr>

                    </table>

                </div>

            </div>

        </div>
    </div>
        <a href="#klausk" class="btn btn-circle page-scroll">
            <i class="fa fa-angle-double-down animated"></i>
        </a>
    </div>

</section>


<section id="klausk" class="container content-section text-center  ">
    <div class="row">
        <div class="col-lg-12" >
            <div class="">
                <div class="container">

                    <h2>Užduokite savo klausimą!</h2>
                    <p></p>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">




                            """),_display_(/*708.30*/helper/*708.36*/.form(action = routes.HomeController.submitLT(),'class -> "form-horizontal")/*708.112*/ {_display_(Seq[Any](format.raw/*708.114*/("""




                            """),_display_(/*713.30*/helper/*713.36*/.input(contactForm("Vardas"),'class->"form-control")/*713.88*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*713.117*/("""
                            """),format.raw/*714.29*/("""<input type="text" name=""""),_display_(/*714.55*/contactForm/*714.66*/.field("firstName").name),format.raw/*714.90*/(""""  placeholder="Jūsų vardas" id=""""),_display_(/*714.124*/id),format.raw/*714.126*/("""" """),_display_(/*714.129*/toHtmlArgs(args)),_display_(/*714.146*/if(contactForm.hasErrors)/*714.171*/ {_display_(Seq[Any](format.raw/*714.173*/("""
                            """),format.raw/*715.29*/("""<option value='"""),_display_(/*715.45*/contactForm/*715.56*/.field("firstName").value),format.raw/*715.81*/("""'></option>""")))}),format.raw/*715.93*/("""
                            """)))}),format.raw/*716.30*/("""



                            """),format.raw/*720.29*/("""<div id="xxx">
                            """),_display_(/*721.30*/for(error <- contactForm("firstName").errors) yield /*721.75*/ {_display_(Seq[Any](format.raw/*721.77*/("""
                            """),format.raw/*722.29*/("""<p id="xxxx">"""),_display_(/*722.43*/error/*722.48*/.format(messages())),format.raw/*722.67*/("""</p>
                                """)))}),format.raw/*723.34*/("""</div>



                            """),_display_(/*727.30*/helper/*727.36*/.input(contactForm("Elektroninis paštas"),'class->"form-control")/*727.101*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*727.130*/("""
                            """),format.raw/*728.29*/("""<input type="text" name=""""),_display_(/*728.55*/contactForm/*728.66*/.field("email").name),format.raw/*728.86*/(""""  placeholder="Jūsų elektroninis paštas" id=""""),_display_(/*728.133*/id),format.raw/*728.135*/("""" """),_display_(/*728.138*/toHtmlArgs(args)),_display_(/*728.155*/if(contactForm.hasErrors)/*728.180*/ {_display_(Seq[Any](format.raw/*728.182*/("""
                            """),format.raw/*729.29*/("""<option value='"""),_display_(/*729.45*/contactForm/*729.56*/.field("email").value),format.raw/*729.77*/("""'></option>""")))}),format.raw/*729.89*/("""
                            """)))}),format.raw/*730.30*/("""



                            """),format.raw/*734.29*/("""<div id="xxx">
                            """),_display_(/*735.30*/for(error <- contactForm("email").errors) yield /*735.71*/ {_display_(Seq[Any](format.raw/*735.73*/("""
                            """),format.raw/*736.29*/("""<p id="xxxx">"""),_display_(/*736.43*/error/*736.48*/.format(messages())),format.raw/*736.67*/("""</p>
                                """)))}),format.raw/*737.34*/("""</div>







                            """),_display_(/*745.30*/helper/*745.36*/.input(field = contactForm("Klausimas"))/*745.76*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*745.105*/("""
                            """),format.raw/*746.29*/("""<div>
                                <textarea class="form-control" name=""""),_display_(/*747.71*/contactForm("textbox")/*747.93*/.name),format.raw/*747.98*/("""" id=""""),_display_(/*747.105*/id),format.raw/*747.107*/("""" placeholder="Jūsų žinutė" rows='5' cols='80'>"""),_display_(/*747.155*/if(contactForm.hasErrors)/*747.180*/{_display_(_display_(/*747.182*/contactForm/*747.193*/.field("textbox").value))}),format.raw/*747.217*/("""</textarea>
                            </div>
                            """)))}),format.raw/*749.30*/("""
                            """),format.raw/*750.29*/("""<div id="xxx">
                                """),_display_(/*751.34*/for(error <- contactForm("textbox").errors) yield /*751.77*/ {_display_(Seq[Any](format.raw/*751.79*/("""
                                """),format.raw/*752.33*/("""<p id="xxxx">"""),_display_(/*752.47*/error/*752.52*/.format(messages())),format.raw/*752.71*/("""</p>
                                """)))}),format.raw/*753.34*/("""</div>



                                <button type="submit"  class="btn btn-default" >Siųsti žinute</button>

                            <div id="flash">"""),_display_(/*759.46*/flash/*759.51*/.get("success")),format.raw/*759.66*/("""</div>

                            """),_display_(/*761.30*/if(contactForm.hasGlobalErrors)/*761.61*/ {_display_(Seq[Any](format.raw/*761.63*/("""
                            """),format.raw/*762.29*/("""<div id="xxx">
                            <p class="error" >
                                """),_display_(/*764.34*/for(error <- contactForm.globalErrors) yield /*764.72*/ {_display_(Seq[Any](format.raw/*764.74*/("""
                            """),format.raw/*765.29*/("""<p>"""),_display_(/*765.33*/error/*765.38*/.format(messages())),format.raw/*765.57*/("""</p>
                            """),_display_(/*766.30*/for(error <- contactForm("email").errors) yield /*766.71*/ {_display_(Seq[Any](format.raw/*766.73*/("""
                            """),format.raw/*767.29*/("""<p>"""),_display_(/*767.33*/error/*767.38*/.format(messages())),format.raw/*767.57*/("""</p>
                            """)))}),format.raw/*768.30*/("""
                            """)))}),format.raw/*769.30*/("""
                            """),format.raw/*770.29*/("""</p>
                            </div>
                            """)))}),format.raw/*772.30*/("""
                            """)))}),format.raw/*773.30*/("""


                            """),format.raw/*776.29*/("""<p></p>
                            <h3>Mūsų socialiniai tinklai</h3>
                            <ul class="list-inline banner-social-buttons">
                                <li><a href="www.google.com" class="btn btn-default btn-lg"><i class="fa fa-twitter"> <span class="network-name">Twitter</span></i></a></li>
                                <li><a href=""""),_display_(/*780.47*/routes/*780.53*/.HomeController.toFaceBook),format.raw/*780.79*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
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
            <div class="col-lg-12 price-section">
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
    """),_display_(/*826.6*/if(contactForm.hasErrors)/*826.31*/{_display_(Seq[Any](format.raw/*826.32*/("""<script src=""""),_display_(/*826.46*/routes/*826.52*/.Assets.at("javascripts/js/returnToFormOnFail.js")),format.raw/*826.102*/(""""></script>""")))}),format.raw/*826.114*/("""</script>
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
<script src='"""),_display_(/*858.15*/routes/*858.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*858.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*861.15*/routes/*861.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*861.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="""),_display_(/*864.14*/routes/*864.20*/.Assets.at("javascripts/js/jquery.easing.min.js")),format.raw/*864.69*/(""""></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->

<!-- Theme JavaScript -->
<script src='"""),_display_(/*869.15*/routes/*869.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*869.66*/("""'></script>

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
                  DATE: Wed Sep 27 23:25:30 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/pagrindinisContent.scala.html
                  HASH: a5c39dfd20e30ae0c804a088c90d641606b90e1d
                  MATRIX: 1047->1|1183->66|1228->64|1255->83|1302->122|1352->135|1383->140|1914->644|1929->650|1979->679|3314->1987|3329->1993|3379->2022|3419->2035|3435->2041|3494->2078|3645->2202|3660->2208|3710->2237|3750->2250|3766->2256|3825->2293|3976->2417|3991->2423|4042->2453|4083->2466|4099->2472|4158->2509|4350->2675|4363->2680|4399->2695|4427->2696|5404->3645|5420->3651|5475->3684|7649->5830|7665->5836|7727->5875|11562->9682|11578->9688|11635->9722|13598->11657|13614->11663|13671->11697|15316->13314|15332->13320|15394->13359|19056->16993|19072->16999|19129->17033|20612->18488|20628->18494|20685->18528|21832->19647|21848->19653|21905->19687|23359->21113|23375->21119|23437->21158|25025->22718|25041->22724|25095->22756|25137->22770|25153->22776|25208->22808|25395->22967|25411->22973|25468->23008|25510->23022|25526->23028|25584->23063|25767->23218|25783->23224|25837->23256|25879->23270|25895->23276|25950->23308|26243->23573|26259->23579|26318->23616|26360->23630|26376->23636|26436->23673|26627->23836|26643->23842|26702->23879|26744->23893|26760->23899|26820->23936|27011->24099|27027->24105|27086->24142|27128->24156|27144->24162|27204->24199|27520->24487|27536->24493|27595->24530|27637->24544|27653->24550|27713->24587|27888->24734|27904->24740|27963->24777|28005->24791|28021->24797|28081->24834|28256->24981|28272->24987|28331->25024|28373->25038|28389->25044|28449->25081|34468->31072|34484->31078|34571->31154|34613->31156|34675->31190|34691->31196|34753->31248|34822->31277|34880->31306|34934->31332|34955->31343|35001->31367|35064->31401|35089->31403|35121->31406|35160->31423|35196->31448|35238->31450|35296->31479|35340->31495|35361->31506|35408->31531|35452->31543|35514->31573|35575->31605|35647->31649|35709->31694|35750->31696|35808->31725|35850->31739|35865->31744|35906->31763|35976->31801|36043->31840|36059->31846|36135->31911|36204->31940|36262->31969|36316->31995|36337->32006|36379->32026|36455->32073|36480->32075|36512->32078|36551->32095|36587->32120|36629->32122|36687->32151|36731->32167|36752->32178|36795->32199|36839->32211|36901->32241|36962->32273|37034->32317|37092->32358|37133->32360|37191->32389|37233->32403|37248->32408|37289->32427|37359->32465|37430->32508|37446->32514|37496->32554|37565->32583|37623->32612|37727->32688|37759->32710|37786->32715|37822->32722|37847->32724|37924->32772|37960->32797|37992->32799|38014->32810|38063->32834|38171->32910|38229->32939|38305->32987|38365->33030|38406->33032|38468->33065|38510->33079|38525->33084|38566->33103|38636->33141|38823->33300|38838->33305|38875->33320|38940->33357|38981->33388|39022->33390|39080->33419|39203->33514|39258->33552|39299->33554|39357->33583|39389->33587|39404->33592|39445->33611|39507->33645|39565->33686|39606->33688|39664->33717|39696->33721|39711->33726|39752->33745|39818->33779|39880->33809|39938->33838|40039->33907|40101->33937|40161->33968|40553->34332|40569->34338|40617->34364|42077->35798|42112->35823|42152->35824|42194->35838|42210->35844|42283->35894|42328->35906|42741->36291|42757->36297|42828->36346|42918->36408|42934->36414|43018->36476|43099->36529|43115->36535|43186->36584|43439->36809|43455->36815|43522->36860
                  LINES: 30->1|33->2|36->1|37->3|37->3|37->3|42->8|52->18|52->18|52->18|87->53|87->53|87->53|87->53|87->53|87->53|91->57|91->57|91->57|91->57|91->57|91->57|95->61|95->61|95->61|95->61|95->61|95->61|109->75|109->75|109->75|110->76|136->102|136->102|136->102|194->160|194->160|194->160|253->219|253->219|253->219|285->251|285->251|285->251|313->279|313->279|313->279|363->329|363->329|363->329|385->351|385->351|385->351|406->372|406->372|406->372|429->395|429->395|429->395|477->443|477->443|477->443|477->443|477->443|477->443|482->448|482->448|482->448|482->448|482->448|482->448|487->453|487->453|487->453|487->453|487->453|487->453|499->465|499->465|499->465|499->465|499->465|499->465|504->470|504->470|504->470|504->470|504->470|504->470|509->475|509->475|509->475|509->475|509->475|509->475|529->495|529->495|529->495|529->495|529->495|529->495|534->500|534->500|534->500|534->500|534->500|534->500|539->505|539->505|539->505|539->505|539->505|539->505|742->708|742->708|742->708|742->708|747->713|747->713|747->713|747->713|748->714|748->714|748->714|748->714|748->714|748->714|748->714|748->714|748->714|748->714|749->715|749->715|749->715|749->715|749->715|750->716|754->720|755->721|755->721|755->721|756->722|756->722|756->722|756->722|757->723|761->727|761->727|761->727|761->727|762->728|762->728|762->728|762->728|762->728|762->728|762->728|762->728|762->728|762->728|763->729|763->729|763->729|763->729|763->729|764->730|768->734|769->735|769->735|769->735|770->736|770->736|770->736|770->736|771->737|779->745|779->745|779->745|779->745|780->746|781->747|781->747|781->747|781->747|781->747|781->747|781->747|781->747|781->747|781->747|783->749|784->750|785->751|785->751|785->751|786->752|786->752|786->752|786->752|787->753|793->759|793->759|793->759|795->761|795->761|795->761|796->762|798->764|798->764|798->764|799->765|799->765|799->765|799->765|800->766|800->766|800->766|801->767|801->767|801->767|801->767|802->768|803->769|804->770|806->772|807->773|810->776|814->780|814->780|814->780|860->826|860->826|860->826|860->826|860->826|860->826|860->826|892->858|892->858|892->858|895->861|895->861|895->861|898->864|898->864|898->864|903->869|903->869|903->869
                  -- GENERATED --
              */
          