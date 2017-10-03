
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
            <img src='"""),_display_(/*102.24*/routes/*102.30*/.Assets.at("images/img/Vida-Polescuk.jpg")),format.raw/*102.72*/("""' class="img-circle" alt="Masažuotoja Vida Polescuk" id="what">

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
                            <div id="limfo" class="collapse customWidth">      <p class="massageText ">Tai saugus efektyvus būdas sustiprinti sveikatą bei palaikyti gerą savijautą.
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



                    </div>
                </div>
                <p></p>
            </div>


            <div class="col-lg-4 ">


                <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#vyresnio">Masažas vyresnio amžiaus žmonėms
                </button>
                <p></p>
                <div id="vyresnio" class="collapse">
                    <!--  <div class="text-center"><img src='"""),_display_(/*324.63*/routes/*324.69*/.Assets.at("images/img/mas3.jpeg")),format.raw/*324.103*/("""' class="img-circle"
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
                    <!--  <div class="text-center"><img src='"""),_display_(/*346.63*/routes/*346.69*/.Assets.at("images/img/mas3.jpeg")),format.raw/*346.103*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*367.67*/routes/*367.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*367.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*390.67*/routes/*390.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*390.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">



                           <p class="massageText customWidth"> Tai ypač efektyvus kovos su celiulitu būdas, taikomas tam tikrų probleminių sričių – šlaunų, sėdmenų ir pilvo – netolygiam poodiniam sluksniui (celiulitui) mažinti.
                                </br>    Masažas aktyvina limfotaką, padidina raumenų susitraukimą ir tonusą dėl to, mažėja celiulitas ir patinimai. Išvalo organizmą nuo šlakų bei suteikia ryškiai išreikštą kosmetinį efektą.
                               </br>   Masažas su Tibeto moline taure yra pats švelniausias – nepalieka mėlynių, nežaloja kapiliarų.</br>
                           Naudojant Tibeto molinę vakuuminę taurę.</p> </div>





                        </div>
                    </div>


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#thaipedu" >
                        Atpalaiduojantis pėdų masažas
                    </button>
                    <p></p>
                    <div id="thaipedu" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*418.67*/routes/*418.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*418.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">



                            <p class="massageText customWidth"> Taikomas pavargusioms, skausmingoms pėdoms atpalaiduoti, kūno gyvybiniam tonusui padidinti, imunitetui stiprinti. Ši procedūra tinka daug vaikštantiems, dirbantiems stovimą arba žmonėms šąlančiomis kojomis. Pėdų masažas padeda atsigauti ir pailsėti visam organizmui.</p> </div>


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
                        <a href=""""),_display_(/*469.35*/routes/*469.41*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*469.81*/(""""> <img src=""""),_display_(/*469.95*/routes/*469.101*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*469.141*/("""" class="w3-image w3-round" alt="Vidos masažinė lova kambaryje" ></a>
                    </div>

<p></p>
                    <div class="col-lg-4 ">
                        <a href=""""),_display_(/*474.35*/routes/*474.41*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*474.85*/(""""> <img src=""""),_display_(/*474.99*/routes/*474.105*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*474.149*/("""" class="w3-image w3-round" alt="Karštų-šaltų akmenų masažas" ></a>
                    </div>
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*479.27*/routes/*479.33*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*479.72*/(""""> <img src=""""),_display_(/*479.86*/routes/*479.92*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*479.131*/("""" class="w3-image w3-round" alt="Vidos masažui naudojami akmenys ir aliejukai" ></a>
            </div>


        </div>
    </div>
        <div class="row">

            <div class="col-md-8 col-md-offset-2">
                <p></p>

                <div class="col-lg-4 ">
                    <a href=""""),_display_(/*491.31*/routes/*491.37*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*491.78*/(""""> <img src=""""),_display_(/*491.92*/routes/*491.98*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*491.139*/("""" class="w3-image w3-round" alt="Vidos masažų lova" ></a>
                </div>
                <p></p>

                <div class="col-lg-4 ">
                    <a href=""""),_display_(/*496.31*/routes/*496.37*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*496.88*/(""""> <img src=""""),_display_(/*496.102*/routes/*496.108*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*496.159*/("""" class="w3-image w3-round" alt="Naudojama Tibeto vakuuminė taurė ir aliejukai" ></a>
                </div>
                <p></p>

                <div class="col-lg-4 ">
                    <a href=""""),_display_(/*501.31*/routes/*501.37*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*501.75*/(""""> <img src=""""),_display_(/*501.89*/routes/*501.95*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*501.133*/("""" class="w3-image w3-round" alt="Buda ir kriauklės" ></a>
                </div>
                <p></p>




            </div>




        </div>

    <!--<div class="row">

        <div class="col-md-8 col-md-offset-2">
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*521.27*/routes/*521.33*/.Assets.at("images/img/5.jpg")),format.raw/*521.63*/(""""> <img src=""""),_display_(/*521.77*/routes/*521.83*/.Assets.at("images/img/5.jpg")),format.raw/*521.113*/("""" class="w3-image w3-round" alt="Buda" ></a>
            </div>
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*526.27*/routes/*526.33*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*526.70*/(""""> <img src=""""),_display_(/*526.84*/routes/*526.90*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*526.127*/("""" class="w3-image w3-round" alt="Buda" ></a>
            </div>
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*531.27*/routes/*531.33*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*531.70*/(""""> <img src=""""),_display_(/*531.84*/routes/*531.90*/.Assets.at("images/img/intro-bg.jpg")),format.raw/*531.127*/("""" class="w3-image w3-round" alt="Buda" ></a>
            </div>
            <p></p>

        </div>





    </div>-->




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
                    <h5 align="center" ><u>Spa masažai</u></h5>

                    <table class="table table-inverse">
                        <th scope="row" id="ulo"><u></u></th>
                        <td><b><u>Trukmė</u></b></td>
                        <td><b><u>Kaina</u></b></td>
                        <tbody>
                        <tr>
                            <th scope="row" id="ulo2">Karštų-šaltų akmenų masažas</th>
                            <td>90 min.</td>
                            <td>170 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row" id="ulo2">Karštų-šaltų akmenų masažas</th>
                            <td>120 min.</td>
                            <td>220 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row" id="ulo2">Limfodrenažinis kūno masažas</th>
                            <td>90 min.</td>

                            <td>140 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row" id="ulo2">Limfodrenažinis veido masažas</th>
                            <td>50 min.</td>

                            <td>90 CHF</td>
                        </tr>

                        <tr>
                            <th scope="row" id="ulo2">Ajurvedinis krūtų masažas moterims</th>
                            <td>60 min.</td>

                            <td>100 CHF</td>
                        </tr>

                        <tr>
                            <th scope="row" id="ulo2">Klasikinis segmentinis nugaros masažas</th>
                            <td>60 min.</td>

                            <td>100 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row" id="ulo2">Klasikinis segmentinis nugaros masažas</th>
                            <td>120 min.</td>

                            <td>150 CHF</td>
                        </tr>



                        <tr>
                            <th scope="row" id="ulo2">Atpalaiduojantis viso kūno masažas</th>
                            <td>120 min.</td>

                            <td>200 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row" id="ulo2">Atpalaiduojantis pėdų masažas</th>
                            <td>60 min.</td>

                            <td>100 CHF</td>
                        </tr>


                        </tbody>
                    </table>



                    <h5 align="center"><b><u>Kiti masažai</u></b></h5>

                    <table class="table table-inverse">
                        <th scope="row" id="ulo"><u>Atskirų kūno dalių masažai</u> </th>
                        <td><b><u>30min</u></b></td>
                        <td><b><u>60min</u></b></td>
                        <td><b><u>90min</u></b></td>
                        <tbody>

                        <tr>
                            <th scope="row" id="ulo2">Juosmens, sėdmenų, kojų masažas</th>
                            <td>50 CHF</td>
                            <td>100 CHF</td>
                            <td>-</td>
                        </tr>
                        <tr>
                            <th scope="row" id="ulo2">Pečių, kaklo, rankų masažas</th>
                            <td>50 CHF</td>
                            <td>100 CHF</td>
                            <td>--</td>
                        </tr>
                        <tr>
                            <th scope="row" id="ulo2">Galvos masažas</th>
                            <td>50 CHF</td>
                            <td>--</td>
                            <td>--</td>
                        </tr>
                        <tr>
                            <th scope="row" id="ulo2">Pilvo masažas</th>
                            <td>50 CHF</td>
                            <td>--</td>
                            <td>--</td>


                        </tr>


                        <tr>

                            <th scope="row"><u></u> </th>
                            <td></td>
                            <td></td>
                            <td></td>

                        </tr>
                        <tr>

                            <th scope="row"><u></u> </th>
                            <td></td>
                            <td></td>
                            <td></td>

                        </tr>



                        <th scope="row"><b><u id="ulo">Anticeliulitiniai masažai</u> </b></th>
                        <td><b><u>30min</u></b></td>
                        <td><b><u>60min</u></b></td>
                        <td><b><u>90min</u></b></td>
                        <tr>
                        <tbody>
                            <th scope="row" id="ulo2">Sėdmenų</th>
                            <td>70 CHF</td>
                            <td>130 CHF</td>
                            <td>180 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row" id="ulo2">Šlaunų</th>
                            <td>70 CHF</td>
                            <td>130 CHF</td>
                            <td>180 CHF</td>
                        </tr>
                        <tr>
                            <th scope="row" id="ulo2">Pilvo</th>
                            <td>70 CHF</td>
                            <td>130 CHF</td>
                            <td>180 CHF</td>
                        </tr>
                            <tr>
                                <th scope="row" id="ulo2">Žąsto masažas</th>
                                <td>70 CHF</td>
                                <td>130 CHF</td>
                                <td>180 CHF</td>


                            </tr>
                        <tr>

                        <th scope="row"><u></u> </th>
                        <td></td>
                        <td></td>
                        <td></td>

                        </tr>
                        <tr>

                            <th scope="row"><u></u> </th>
                            <td></td>
                            <td></td>
                            <td></td>

                        </tr>


                        <th scope="row" id="ulo"><b><u>Masažas vyresnio amžiaus žmonėms (nuo 65 metų)<u></b></th>
                        <td><b><u></u></b></td>
                        <td><b><u>Kaina</u></b></td>
                        <td><b><u></u></b></td>
                        <tbody>

                        <tr>
                            <th scope="row" id="ulo2">Tinka visi spa ir atskirų kūno dalių masažai</th>
                            <td></td>
                            <td>-10% nuolaida</td>
                            <td></td>
                        </tr>


                        </tbody>
                    </table>
                        <p></p>



                    <h5 align="center"><b><u>DOVANŲ KUPONAI</u></b></h5>

                    <table class="table table-inverse">


                        <tr>
                            <th scope="row"><u></u> </th>
                            <td>100 CHF</td>
                            <td>200 CHF</td>
                            <td>300 CHF</td>
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




                            """),_display_(/*808.30*/helper/*808.36*/.form(action = routes.HomeController.submitLT(),'class -> "form-horizontal")/*808.112*/ {_display_(Seq[Any](format.raw/*808.114*/("""




                            """),_display_(/*813.30*/helper/*813.36*/.input(contactForm("Vardas"),'class->"form-control")/*813.88*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*813.117*/("""
                            """),format.raw/*814.29*/("""<input type="text" name=""""),_display_(/*814.55*/contactForm/*814.66*/.field("firstName").name),format.raw/*814.90*/(""""  placeholder="Jūsų vardas" id=""""),_display_(/*814.124*/id),format.raw/*814.126*/("""" """),_display_(/*814.129*/toHtmlArgs(args)),_display_(/*814.146*/if(contactForm.hasErrors)/*814.171*/ {_display_(Seq[Any](format.raw/*814.173*/("""
                            """),format.raw/*815.29*/("""<option value='"""),_display_(/*815.45*/contactForm/*815.56*/.field("firstName").value),format.raw/*815.81*/("""'></option>""")))}),format.raw/*815.93*/("""
                            """)))}),format.raw/*816.30*/("""



                            """),format.raw/*820.29*/("""<div id="xxx">
                            """),_display_(/*821.30*/for(error <- contactForm("firstName").errors) yield /*821.75*/ {_display_(Seq[Any](format.raw/*821.77*/("""
                            """),format.raw/*822.29*/("""<p id="xxxx">"""),_display_(/*822.43*/error/*822.48*/.format(messages())),format.raw/*822.67*/("""</p>
                                """)))}),format.raw/*823.34*/("""</div>



                            """),_display_(/*827.30*/helper/*827.36*/.input(contactForm("Elektroninis paštas"),'class->"form-control")/*827.101*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*827.130*/("""
                            """),format.raw/*828.29*/("""<input type="text" name=""""),_display_(/*828.55*/contactForm/*828.66*/.field("email").name),format.raw/*828.86*/(""""  placeholder="Jūsų elektroninis paštas" id=""""),_display_(/*828.133*/id),format.raw/*828.135*/("""" """),_display_(/*828.138*/toHtmlArgs(args)),_display_(/*828.155*/if(contactForm.hasErrors)/*828.180*/ {_display_(Seq[Any](format.raw/*828.182*/("""
                            """),format.raw/*829.29*/("""<option value='"""),_display_(/*829.45*/contactForm/*829.56*/.field("email").value),format.raw/*829.77*/("""'></option>""")))}),format.raw/*829.89*/("""
                            """)))}),format.raw/*830.30*/("""



                            """),format.raw/*834.29*/("""<div id="xxx">
                            """),_display_(/*835.30*/for(error <- contactForm("email").errors) yield /*835.71*/ {_display_(Seq[Any](format.raw/*835.73*/("""
                            """),format.raw/*836.29*/("""<p id="xxxx">"""),_display_(/*836.43*/error/*836.48*/.format(messages())),format.raw/*836.67*/("""</p>
                                """)))}),format.raw/*837.34*/("""</div>







                            """),_display_(/*845.30*/helper/*845.36*/.input(field = contactForm("Klausimas"))/*845.76*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*845.105*/("""
                            """),format.raw/*846.29*/("""<div>
                                <textarea class="form-control" name=""""),_display_(/*847.71*/contactForm("textbox")/*847.93*/.name),format.raw/*847.98*/("""" id=""""),_display_(/*847.105*/id),format.raw/*847.107*/("""" placeholder="Jūsų žinutė" rows='5' cols='80'>"""),_display_(/*847.155*/if(contactForm.hasErrors)/*847.180*/{_display_(_display_(/*847.182*/contactForm/*847.193*/.field("textbox").value))}),format.raw/*847.217*/("""</textarea>
                            </div>
                            """)))}),format.raw/*849.30*/("""
                            """),format.raw/*850.29*/("""<div id="xxx">
                                """),_display_(/*851.34*/for(error <- contactForm("textbox").errors) yield /*851.77*/ {_display_(Seq[Any](format.raw/*851.79*/("""
                                """),format.raw/*852.33*/("""<p id="xxxx">"""),_display_(/*852.47*/error/*852.52*/.format(messages())),format.raw/*852.71*/("""</p>
                                """)))}),format.raw/*853.34*/("""</div>



                                <button type="submit"  class="btn btn-default" >Siųsti žinute</button>

                            <div id="flash">"""),_display_(/*859.46*/flash/*859.51*/.get("success")),format.raw/*859.66*/("""</div>

                            """),_display_(/*861.30*/if(contactForm.hasGlobalErrors)/*861.61*/ {_display_(Seq[Any](format.raw/*861.63*/("""
                            """),format.raw/*862.29*/("""<div id="xxx">
                            <p class="error" >
                                """),_display_(/*864.34*/for(error <- contactForm.globalErrors) yield /*864.72*/ {_display_(Seq[Any](format.raw/*864.74*/("""
                            """),format.raw/*865.29*/("""<p>"""),_display_(/*865.33*/error/*865.38*/.format(messages())),format.raw/*865.57*/("""</p>
                            """),_display_(/*866.30*/for(error <- contactForm("email").errors) yield /*866.71*/ {_display_(Seq[Any](format.raw/*866.73*/("""
                            """),format.raw/*867.29*/("""<p>"""),_display_(/*867.33*/error/*867.38*/.format(messages())),format.raw/*867.57*/("""</p>
                            """)))}),format.raw/*868.30*/("""
                            """)))}),format.raw/*869.30*/("""
                            """),format.raw/*870.29*/("""</p>
                            </div>
                            """)))}),format.raw/*872.30*/("""
                            """)))}),format.raw/*873.30*/("""


                            """),format.raw/*876.29*/("""<p></p>
                            <h3>Mūsų socialiniai tinklai</h3>
                            <ul class="list-inline banner-social-buttons">
                                <li><a href=""""),_display_(/*879.47*/routes/*879.53*/.HomeController.toFaceBook),format.raw/*879.79*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
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
            <div class="col-lg-12 price-section2">
                <p></p>
                <h2>Kontaktinė informacija</h2>
                <p style="color:#fff;">
                    <strong><i class="fa fa-map-marker"></i> Adresas</strong><br>
                    ---
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
    """),_display_(/*924.6*/if(contactForm.hasErrors)/*924.31*/{_display_(Seq[Any](format.raw/*924.32*/("""<script src=""""),_display_(/*924.46*/routes/*924.52*/.Assets.at("javascripts/js/returnToFormOnFail.js")),format.raw/*924.102*/(""""></script>""")))}),format.raw/*924.114*/("""</script>
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
<script src='"""),_display_(/*956.15*/routes/*956.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*956.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*959.15*/routes/*959.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*959.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="""),_display_(/*962.14*/routes/*962.20*/.Assets.at("javascripts/js/jquery.easing.min.js")),format.raw/*962.69*/(""""></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->

<!-- Theme JavaScript -->
<script src='"""),_display_(/*967.15*/routes/*967.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*967.66*/("""'></script>

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
                  DATE: Tue Oct 03 22:46:16 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/pagrindinisContent.scala.html
                  HASH: e5f698490b85469f52d4b1f7d4d66fc21f9bfa92
                  MATRIX: 1047->1|1183->66|1228->64|1255->83|1302->122|1352->135|1383->140|1914->644|1929->650|1979->679|3314->1987|3329->1993|3379->2022|3419->2035|3435->2041|3494->2078|3645->2202|3660->2208|3710->2237|3750->2250|3766->2256|3825->2293|3976->2417|3991->2423|4042->2453|4083->2466|4099->2472|4158->2509|4350->2675|4363->2680|4399->2695|4427->2696|5404->3645|5420->3651|5484->3693|7667->5848|7683->5854|7745->5893|11569->9689|11585->9695|11642->9729|13605->11664|13621->11670|13678->11704|15323->13321|15339->13327|15401->13366|18428->16365|18444->16371|18501->16405|19984->17860|20000->17866|20057->17900|21204->19019|21220->19025|21277->19059|22731->20485|22747->20491|22809->20530|24261->21954|24277->21960|24339->21999|25593->23225|25609->23231|25671->23271|25713->23285|25730->23291|25793->23331|26005->23515|26021->23521|26087->23565|26129->23579|26146->23585|26213->23629|26419->23807|26435->23813|26496->23852|26538->23866|26554->23872|26616->23911|26949->24216|26965->24222|27028->24263|27070->24277|27086->24283|27150->24324|27354->24500|27370->24506|27443->24557|27486->24571|27503->24577|27577->24628|27809->24832|27825->24838|27885->24876|27927->24890|27943->24896|28004->24934|28337->25239|28353->25245|28405->25275|28447->25289|28463->25295|28516->25325|28691->25472|28707->25478|28766->25515|28808->25529|28824->25535|28884->25572|29059->25719|29075->25725|29134->25762|29176->25776|29192->25782|29252->25819|37983->34522|37999->34528|38086->34604|38128->34606|38190->34640|38206->34646|38268->34698|38337->34727|38395->34756|38449->34782|38470->34793|38516->34817|38579->34851|38604->34853|38636->34856|38675->34873|38711->34898|38753->34900|38811->34929|38855->34945|38876->34956|38923->34981|38967->34993|39029->35023|39090->35055|39162->35099|39224->35144|39265->35146|39323->35175|39365->35189|39380->35194|39421->35213|39491->35251|39558->35290|39574->35296|39650->35361|39719->35390|39777->35419|39831->35445|39852->35456|39894->35476|39970->35523|39995->35525|40027->35528|40066->35545|40102->35570|40144->35572|40202->35601|40246->35617|40267->35628|40310->35649|40354->35661|40416->35691|40477->35723|40549->35767|40607->35808|40648->35810|40706->35839|40748->35853|40763->35858|40804->35877|40874->35915|40945->35958|40961->35964|41011->36004|41080->36033|41138->36062|41242->36138|41274->36160|41301->36165|41337->36172|41362->36174|41439->36222|41475->36247|41507->36249|41529->36260|41578->36284|41686->36360|41744->36389|41820->36437|41880->36480|41921->36482|41983->36515|42025->36529|42040->36534|42081->36553|42151->36591|42338->36750|42353->36755|42390->36770|42455->36807|42496->36838|42537->36840|42595->36869|42718->36964|42773->37002|42814->37004|42872->37033|42904->37037|42919->37042|42960->37061|43022->37095|43080->37136|43121->37138|43179->37167|43211->37171|43226->37176|43267->37195|43333->37229|43395->37259|43453->37288|43554->37357|43616->37387|43676->37418|43895->37609|43911->37615|43959->37641|45211->38867|45246->38892|45286->38893|45328->38907|45344->38913|45417->38963|45462->38975|45875->39360|45891->39366|45962->39415|46052->39477|46068->39483|46152->39545|46233->39598|46249->39604|46320->39653|46573->39878|46589->39884|46656->39929
                  LINES: 30->1|33->2|36->1|37->3|37->3|37->3|42->8|52->18|52->18|52->18|87->53|87->53|87->53|87->53|87->53|87->53|91->57|91->57|91->57|91->57|91->57|91->57|95->61|95->61|95->61|95->61|95->61|95->61|109->75|109->75|109->75|110->76|136->102|136->102|136->102|194->160|194->160|194->160|253->219|253->219|253->219|285->251|285->251|285->251|313->279|313->279|313->279|358->324|358->324|358->324|380->346|380->346|380->346|401->367|401->367|401->367|424->390|424->390|424->390|452->418|452->418|452->418|503->469|503->469|503->469|503->469|503->469|503->469|508->474|508->474|508->474|508->474|508->474|508->474|513->479|513->479|513->479|513->479|513->479|513->479|525->491|525->491|525->491|525->491|525->491|525->491|530->496|530->496|530->496|530->496|530->496|530->496|535->501|535->501|535->501|535->501|535->501|535->501|555->521|555->521|555->521|555->521|555->521|555->521|560->526|560->526|560->526|560->526|560->526|560->526|565->531|565->531|565->531|565->531|565->531|565->531|842->808|842->808|842->808|842->808|847->813|847->813|847->813|847->813|848->814|848->814|848->814|848->814|848->814|848->814|848->814|848->814|848->814|848->814|849->815|849->815|849->815|849->815|849->815|850->816|854->820|855->821|855->821|855->821|856->822|856->822|856->822|856->822|857->823|861->827|861->827|861->827|861->827|862->828|862->828|862->828|862->828|862->828|862->828|862->828|862->828|862->828|862->828|863->829|863->829|863->829|863->829|863->829|864->830|868->834|869->835|869->835|869->835|870->836|870->836|870->836|870->836|871->837|879->845|879->845|879->845|879->845|880->846|881->847|881->847|881->847|881->847|881->847|881->847|881->847|881->847|881->847|881->847|883->849|884->850|885->851|885->851|885->851|886->852|886->852|886->852|886->852|887->853|893->859|893->859|893->859|895->861|895->861|895->861|896->862|898->864|898->864|898->864|899->865|899->865|899->865|899->865|900->866|900->866|900->866|901->867|901->867|901->867|901->867|902->868|903->869|904->870|906->872|907->873|910->876|913->879|913->879|913->879|958->924|958->924|958->924|958->924|958->924|958->924|958->924|990->956|990->956|990->956|993->959|993->959|993->959|996->962|996->962|996->962|1001->967|1001->967|1001->967
                  -- GENERATED --
              */
          