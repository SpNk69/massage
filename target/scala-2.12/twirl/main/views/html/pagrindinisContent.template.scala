
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
"""),format.raw/*4.1*/("""<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top" xmlns="http://www.w3.org/1999/html">
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                Menu <i class="fa fa-bars"></i>
            </button>
            <a class="navbar-brand page-scroll" href='"""),_display_(/*11.56*/routes/*11.62*/.HomeController.pagrindinisLT),format.raw/*11.91*/("""'>
                <i class="fa fa-play-circle"></i> <span class="light">Vidos</span> Masažai
            </a>
        </div>
        <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
            <ul class="nav navbar-nav">
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
                    <a class="page-scroll" href='"""),_display_(/*39.51*/routes/*39.57*/.HomeController.germanVersion),format.raw/*39.86*/("""'><img src='"""),_display_(/*39.99*/routes/*39.105*/.Assets.at("images/img/flag-de2.png")),format.raw/*39.142*/("""' alt="Vokiečių kalba" /></a>
                </li>
                <li>
                    <a class="page-scroll" href='"""),_display_(/*42.51*/routes/*42.57*/.HomeController.pagrindinisLT),format.raw/*42.86*/("""'><img src='"""),_display_(/*42.99*/routes/*42.105*/.Assets.at("images/img/flag-lt2.png")),format.raw/*42.142*/("""' alt="Lietuvių kalba" /></a>
                </li>
                <li>
                    <a class="page-scroll" href=""""),_display_(/*45.51*/routes/*45.57*/.HomeController.russianVersion),format.raw/*45.87*/(""""><img src='"""),_display_(/*45.100*/routes/*45.106*/.Assets.at("images/img/flag-rus.png")),format.raw/*45.143*/("""' alt="Rusų kalba" /></a>
                </li>
            </ul>
        </div>
    </div>
</nav>
"""),_display_(/*51.2*/flash/*51.7*/.get("success")),format.raw/*51.22*/("""
"""),format.raw/*52.1*/("""<header class="intro">
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
<section id="apie" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-6">
            <img src='"""),_display_(/*70.24*/routes/*70.30*/.Assets.at("images/img/Vida-Polescuk.jpg")),format.raw/*70.72*/("""' class="img-circle" alt="Masažuotoja Vida Polescuk" id="what">
        </div>
        <p></p>
        <div class="col-lg-6">
            <h3 align="center"><em>Išsilavinimas</em></h3>
            <ul><li>"Vilniaus aukštesnioji medicinos mokykla", Lietuva.</li>
                <li>Klaipėdos universitetas. Bakalauro laipsnis "Visuomenės sveikata".</li>
                <li>2010 metai - "Baltic SPA Professional" Kursai (Latvija), SPA masažai.</li>
                <li>2012 metai - Slaugos darbuotojų tobulinimosi ir specializacijos centras: Pažymėjimas Nr. KV 120146 - suteikta teisė daryti gydomuosius masažus.</li>
            </ul>
            <p></p>
            <h3 align="center"><em>Darbo Patirtis</em></h3>
            <ul align="center">
                <li>27 metai: Medicinos sesuo.</li>
                <li>7 metai: Visuomenės sveikatos priežiūros specialistė.</li>
                <li>7 metai: Masažuotoja.</li>
            </ul>
            <p></p>
            <h3 align="center"><em>SPA Sertifikatai</em></h3>
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
<section id="masazai" class="content-section text-center">
    <div class="download-section">
        <h1 id="vienas">Sveikatą gerinantys masažai</h1>
        <div class="container">
            <div class="row">
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#limfodrenazinis">
                        Limfodrenažinis masažas
                    </button>
                    <p></p>
                    <div id="limfodrenazinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo">
                                Limfodrenažinis kūno masažas
                            </button>
                            <div id="limfo" class="collapse customWidth"> <p class="massageText">Tai saugus efektyvus būdas sustiprinti sveikatą bei palaikyti gerą savijautą.
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
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo2">
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
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#karstusaltu">Karštų-šaltų
                        akmenų masažas
                    </button>
                    <p></p>
                    <div id="karstusaltu" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
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
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#segmentinis">Klasikinis – segmentinis nugaros masažas
                    </button>
                    <p></p>
                    <div id="segmentinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth"> Šis masažas idealiai tinka žmonėms, kurie visą dieną praleidžia stovėdami, sėdėdami pavyzdžiui: prie kompiuterio arba vairuodami automobilį taip pat dirbantiems sėdimą ar sunkų fizinį darbą, kai visa įtampa susikaupia stuburo dalyje, kaklo ir pečių, juosmens ir sėdmenų srityse, ir dėl to susiformuoja skausmingi raumenų mazgai. Šis masažas ypač tinka po treniruočių kai būna ilgalaikis ir trumpalaikis skausmas. Be to, dėl netaisyklingos stuburo padėties dažnai skauda galvą.
                                </br> Periodiškai atliekamas masažas padės atsikratyti dažnų nugaros ir galvos skausmų, atpalaiduoti įtemptas raumenų grupes.
                                </br> Po masažo atslūgsta nugaros, galvos, pečių, sėdmenų skausmai.
                                </br> Po masažo Jūs jausitės pailsėję ir energingi. </p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#demo33">
                        Atskirų kūno dalių masažai
                    </button>
                    <p></p>
                    <div id="demo33" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#galva">
                                Galvos masažas
                            </button>
                            <div id="galva" class="collapse customWidth"><p class="massageText">Sumažina stresą, galvos skausmus, gerina kraujo apytaką.</p> </div>
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#peciai">
                                Pečių – kaklo – rankų masažas
                            </button>
                            <div id="peciai" class="collapse customWidth"><p class="massageText">Efektyviausia nemalonių simptomų šalinimo priemonė. Jau po pirmo karto jus pajusite bendrą savijautos pagerėjimą. Po pilno masažo kurso skausmingi pojūčiai išnyksta, atsiranda žvalumas, padidėja darbingumas, išnyksta nemiga ir irzlumas. Tai yra puiki priemonė atsikratyti galvos, kaklo, pečių skausmo, rankų tirpimo jausmo. </p> </div>
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pilvo">
                                Pilvo masažas
                            </button>
                            <div id="pilvo" class="collapse customWidth"><p class="massageText">Stimuliuoja virškinimą, turi teigiamą poveikį vidinių organų veiklai, gerina virškinimo trakto funkcijas ir tulžies sekreciją, padeda su vidurių užkietėjimais arba dujų susikaupimo žarnyne</div>
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#juosmens">
                                Juosmens - sėdmenų - kojų masažas
                            </button>
                            <div id="juosmens" class="collapse customWidth"><p class="massageText">Gerina kraujo ir limfos apytaką juosmens bei kojų srityse, atpalaiduoja įsitempusius raumenis, mažina juosmens, sėdmenų, kojų skausmą, stiprina nusilpusius raumenis.
                                Sumažina skausmą po operacijos, mažina nervinių šaknų uždegimą.</p></div>
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#vyresnio">Masažas vyresnio amžiaus žmonėms
                    </button>
                    <p></p>
                    <div id="vyresnio" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth">Masažas yra būtina ir labai naudinga procedūra pagyvenusiems žmonėms, pensininkams. Tyrimai parodė, kad masažas lėtina senėjimo procesą. Taip pat masažas veikia raminančiai visą organizmą ir gali sumažinti skausmus. Masažas gali padėti žmonėms, kenčiantiems raumenų skausmus ar sergantiems atritu. Kada žmogus kenčia, jis tampa vis mažiau aktyvus, nukenčia gyvenimo kokybė ir sveikata. Masažas gerina kraujotaką, pašalina raumenų nuovargį ir raumenys įgauna tonusą. Dėl to pagerėja pagyvenusio žmogaus gyvenimo kokybė.
                                </br>Prieš masažą Jums gerai būtų pasikonsultuoti su savo gydytoju. Kai tik gausite gydytojo leidimą masažui, jus drąsiai galite kreiptis pas mane. </p>
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#atpalaiduojantis">Atpalaiduojantis viso kūno masažas
                    </button>
                    <p></p>
                    <div id="atpalaiduojantis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth"> Atpalaiduojantis masažas tinka visiems, norintiems atsipalaiduoti po sunkios dienos, užsimiršti bei pabėgti nuo kasdienės rutinos. Pašalina įtampą ir stresą, atslūgsta nugaros ir galvos skausmai, atsipalaiduoja raumenys, teigiamai veikia vidinę organizmo būseną, pagerina nuotaiką bei grąžina energiją. </p>
                        </div>
                    </div>
                    <p></p>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#ajurvedinis">Ajurvedinis krūtų masažas moterims
                    </button>
                    <p></p>
                    <div id="ajurvedinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth"> Yra skirtas krūtinės sričiai. Jis atliekamas ne tik norint pagražinti krūtinę, sustangrinti krūtis, suteikti joms gražią formą, bet ir siekiant gilesnių terapinių tikslų. Šis masažas daro teigiamą įtaką visų moters reprodukcinių organų sistemai bei padeda subalansuoti hormonų sistemos veiklą. Labai sumažina nemalonų krūtų jautrumą, susijusį su menstruacijų ciklu. Praktiškai išnyksta krūtų vėžio rizika. Švelnėja implantų surandėjimai.
                                </br> Toks masažas pagerina savijautą, padaro krūtis gražesnes, suteikia pasitikėjimo ir padeda geriau jaustis kaip moteriai.</p>
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#anticeliulitinis">
                        Anticeliulitinis masažas rankomis
                    </button>
                    <p></p>
                    <div id="anticeliulitinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth"> Tai ypač efektyvus kovos su celiulitu būdas, taikomas tam tikrų probleminių sričių – šlaunų, sėdmenų ir pilvo – netolygiam poodiniam sluksniui (celiulitui) mažinti.
                                </br> Masažas aktyvina limfotaką, padidina raumenų susitraukimą ir tonusą dėl to, mažėja celiulitas ir patinimai. Išvalo organizmą nuo šlakų bei suteikia ryškiai išreikštą kosmetinį efektą.
                                </br> Masažas su Tibeto moline taure yra pats švelniausias – nepalieka mėlynių, nežaloja kapiliarų.</br>
                                Naudojant Tibeto molinę vakuuminę taurę.</p> </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#thaipedu">
                        Atpalaiduojantis pėdų masažas
                    </button>
                    <p></p>
                    <div id="thaipedu" class="collapse">
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
</section>
<section id="galerija" class="content-section text-center">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <hr>
            <h1>Galerija</h1>
            <hr>
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*295.27*/routes/*295.33*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*295.73*/(""""> <img src=""""),_display_(/*295.87*/routes/*295.93*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*295.133*/("""" class="w3-image w3-round" alt="Vidos masažinė lova kambaryje"></a>
            </div>
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*299.27*/routes/*299.33*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*299.77*/(""""> <img src=""""),_display_(/*299.91*/routes/*299.97*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*299.141*/("""" class="w3-image w3-round" alt="Karštų-šaltų akmenų masažas"></a>
            </div>
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*303.27*/routes/*303.33*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*303.72*/(""""> <img src=""""),_display_(/*303.86*/routes/*303.92*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*303.131*/("""" class="w3-image w3-round" alt="Vidos masažui naudojami akmenys ir aliejukai"></a>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*311.27*/routes/*311.33*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*311.74*/(""""> <img src=""""),_display_(/*311.88*/routes/*311.94*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*311.135*/("""" class="w3-image w3-round" alt="Vidos masažų lova"></a>
            </div>
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*315.27*/routes/*315.33*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*315.84*/(""""> <img src=""""),_display_(/*315.98*/routes/*315.104*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*315.155*/("""" class="w3-image w3-round" alt="Naudojama Tibeto vakuuminė taurė ir aliejukai"></a>
            </div>
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*319.27*/routes/*319.33*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*319.71*/(""""> <img src=""""),_display_(/*319.85*/routes/*319.91*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*319.129*/("""" class="w3-image w3-round" alt="Buda ir kriauklės"></a>
            </div>
            <p></p>
        </div>
    </div>
    <a href="#kainos" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
    </div>
</section>
<section class="content-section text-center">
    <div class="contact-section" id="kainos">
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <div class="">
                    <hr>
                    <h1>Kainos</h1>
                    <hr>
                    <div class="w3-container customBackGroundOfDiv">
                        <p></p>
                        <h5 align="center"><em>Spa masažai</em></h5>
                        <table class="table table-inverse">
                            <th scope="row" id="ulo"><em></em></th>
                            <td><b><em>Trukmė</em></b></td>
                            <td><b><em>Kaina</em></b></td>
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
                        <h5 align="center"><b><em>Kiti masažai</em></b></h5>
                        <table class="table table-inverse">
                            <th scope="row" id="ulo"><em>Atskirų kūno dalių masažai</em> </th>
                            <td><b><em>30min</em></b></td>
                            <td><b><em>60min</em></b></td>
                            <td><b><em>90min</em></b></td>
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
                                <th scope="row"><em></em> </th>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            <tr>
                                <th scope="row"><em></em> </th>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            <th scope="row"><b><u id="ulo">Anticeliulitiniai masažai</em> </b></th>
                            <td><b><em>30min</em></b></td>
                            <td><b><em>60min</em></b></td>
                            <td><b><em>90min</em></b></td>
                            <tr>
                            <tbody>
                            <th scope="row" id="ulo2">Sėdmenų masažas</th>
                            <td>70 CHF</td>
                            <td>130 CHF</td>
                            <td>180 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Šlaunų masažas</th>
                                <td>70 CHF</td>
                                <td>130 CHF</td>
                                <td>180 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Pilvo masažas</th>
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
                                <th scope="row"><em></em> </th>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            <tr>
                                <th scope="row"><em></em> </th>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            <th scope="row" id="ulo"><b><em>Masažas vyresnio amžiaus žmonėms (nuo 65 metų)<em></b></th>
                            <td><b><em></em></b></td>
                            <td><b><em>Kaina</em></b></td>
                            <td><b><em></em></b></td>
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
                        <h5 align="center"><b><em>DOVANŲ KUPONAI</em></b></h5>
                        <table class="table table-inverse">
                            <tr>
                                <th scope="row"><em></em> </th>
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
<section id="klausk" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-12">
            <div class="">
                <div class="container">
                    <h1>Užduokite savo klausimą!</h1>
                    <p></p>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">
                            """),_display_(/*517.30*/helper/*517.36*/.form(action = routes.HomeController.submitLT(),'class -> "form-horizontal")/*517.112*/ {_display_(Seq[Any](format.raw/*517.114*/("""
                            """),_display_(/*518.30*/helper/*518.36*/.input(contactForm("Vardas"),'class->"form-control")/*518.88*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*518.117*/("""
                            """),format.raw/*519.29*/("""<input type="text" name=""""),_display_(/*519.55*/contactForm/*519.66*/.field("firstName").name),format.raw/*519.90*/("""" placeholder="Jūsų vardas" id=""""),_display_(/*519.123*/id),format.raw/*519.125*/("""" """),_display_(/*519.128*/toHtmlArgs(args)),_display_(/*519.145*/if(contactForm.hasErrors)/*519.170*/ {_display_(Seq[Any](format.raw/*519.172*/(""" """),format.raw/*519.173*/("""<option value='"""),_display_(/*519.189*/contactForm/*519.200*/.field("firstName").value),format.raw/*519.225*/("""'></option>""")))}),format.raw/*519.237*/("""
                            """)))}),format.raw/*520.30*/("""
                            """),format.raw/*521.29*/("""<div id="xxx">
                                """),_display_(/*522.34*/for(error <- contactForm("firstName").errors) yield /*522.79*/ {_display_(Seq[Any](format.raw/*522.81*/(""" """),format.raw/*522.82*/("""<p id="xxxx">"""),_display_(/*522.96*/error/*522.101*/.format(messages())),format.raw/*522.120*/("""</p>
                                """)))}),format.raw/*523.34*/("""</div>
                            """),_display_(/*524.30*/helper/*524.36*/.input(contactForm("Elektroninis paštas"),'class->"form-control")/*524.101*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*524.130*/("""
                            """),format.raw/*525.29*/("""<input type="text" name=""""),_display_(/*525.55*/contactForm/*525.66*/.field("email").name),format.raw/*525.86*/("""" placeholder="Jūsų elektroninis paštas" id=""""),_display_(/*525.132*/id),format.raw/*525.134*/("""" """),_display_(/*525.137*/toHtmlArgs(args)),_display_(/*525.154*/if(contactForm.hasErrors)/*525.179*/ {_display_(Seq[Any](format.raw/*525.181*/(""" """),format.raw/*525.182*/("""<option value='"""),_display_(/*525.198*/contactForm/*525.209*/.field("email").value),format.raw/*525.230*/("""'></option>""")))}),format.raw/*525.242*/("""
                            """)))}),format.raw/*526.30*/("""
                            """),format.raw/*527.29*/("""<div id="xxx">
                                """),_display_(/*528.34*/for(error <- contactForm("email").errors) yield /*528.75*/ {_display_(Seq[Any](format.raw/*528.77*/(""" """),format.raw/*528.78*/("""<p id="xxxx">"""),_display_(/*528.92*/error/*528.97*/.format(messages())),format.raw/*528.116*/("""</p>
                                """)))}),format.raw/*529.34*/("""</div>
                            """),_display_(/*530.30*/helper/*530.36*/.input(field = contactForm("Klausimas"))/*530.76*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*530.105*/("""
                            """),format.raw/*531.29*/("""<div>
                                <textarea class="form-control" name=""""),_display_(/*532.71*/contactForm("textbox")/*532.93*/.name),format.raw/*532.98*/("""" id=""""),_display_(/*532.105*/id),format.raw/*532.107*/("""" placeholder="Jūsų žinutė" rows='5' cols='80'>"""),_display_(/*532.155*/if(contactForm.hasErrors)/*532.180*/{_display_(_display_(/*532.182*/contactForm/*532.193*/.field("textbox").value))}),format.raw/*532.217*/("""</textarea>
                            </div>
                            """)))}),format.raw/*534.30*/("""
                            """),format.raw/*535.29*/("""<div id="xxx">
                                """),_display_(/*536.34*/for(error <- contactForm("textbox").errors) yield /*536.77*/ {_display_(Seq[Any](format.raw/*536.79*/(""" """),format.raw/*536.80*/("""<p id="xxxx">"""),_display_(/*536.94*/error/*536.99*/.format(messages())),format.raw/*536.118*/("""</p>
                                """)))}),format.raw/*537.34*/("""</div>
                            <button type="submit" class="btn btn-default">Siųsti žinute</button>
                            <div id="flash">"""),_display_(/*539.46*/flash/*539.51*/.get("success")),format.raw/*539.66*/("""</div>
                            """),_display_(/*540.30*/if(contactForm.hasGlobalErrors)/*540.61*/ {_display_(Seq[Any](format.raw/*540.63*/("""
                            """),format.raw/*541.29*/("""<div id="xxx">
                                <p class="error">
                                    """),_display_(/*543.38*/for(error <- contactForm.globalErrors) yield /*543.76*/ {_display_(Seq[Any](format.raw/*543.78*/(""" """),format.raw/*543.79*/("""<p>"""),_display_(/*543.83*/error/*543.88*/.format(messages())),format.raw/*543.107*/("""</p>
                                """),_display_(/*544.34*/for(error <- contactForm("email").errors) yield /*544.75*/ {_display_(Seq[Any](format.raw/*544.77*/(""" """),format.raw/*544.78*/("""<p>"""),_display_(/*544.82*/error/*544.87*/.format(messages())),format.raw/*544.106*/("""</p>
                                """)))}),format.raw/*545.34*/("""
                                """)))}),format.raw/*546.34*/("""
                                """),format.raw/*547.33*/("""</p>
                            </div>
                            """)))}),format.raw/*549.30*/("""
                            """)))}),format.raw/*550.30*/("""
                            """),format.raw/*551.29*/("""<p></p>
                            <h3>Mūsų socialiniai tinklai</h3>
                            <ul class="list-inline banner-social-buttons">
                                <li><a href=""""),_display_(/*554.47*/routes/*554.53*/.HomeController.toFaceBook),format.raw/*554.79*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
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
    <div id="kontaktai" class="text-center">
        <div class="row">
            <div class="col-lg-12 price-section2">
                <p></p>
                <h1>Kontaktinė informacija</h1>
                <p style="color:#fff">
                    <strong><i class="fa fa-map-marker"></i> Adresas</strong><br>
                    ---
                </p>
                <p style="color:#fff"><strong><i class="fa fa-phone"></i> Telefono numeris</strong><br>
                    +41 797897010</p>
                <p style="color:#fff">
                    <strong><i class="fa fa-envelope"></i> Elektroninis paštas</strong><br>
                    info@vidamassage.ch</p>
                <p></p>
            </div>
        </div>
    </div>
    <hr>
    """),_display_(/*587.6*/if(contactForm.hasErrors)/*587.31*/{_display_(Seq[Any](format.raw/*587.32*/("""<script src=""""),_display_(/*587.46*/routes/*587.52*/.Assets.at("javascripts/js/returnToFormOnFail.js")),format.raw/*587.102*/(""""></script>""")))}),format.raw/*587.114*/("""</script>
</section>
<section>
    <div id="mappp" class="text-center">
        <div class="row">
            <div class="col-lg-12">
                <h1>Žemėlapis</h1>
            </div>
        </div>
    </div>
</section>
<footer>
    <div class="container text-center">
        <p>Copyright &copy; Vida Massage 2017</p>
    </div>
</footer>
<script src='"""),_display_(/*603.15*/routes/*603.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*603.70*/("""'></script>
<script src='"""),_display_(/*604.15*/routes/*604.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*604.83*/("""'></script>
<script src="""),_display_(/*605.14*/routes/*605.20*/.Assets.at("javascripts/js/jquery.easing.min.js")),format.raw/*605.69*/(""""></script>
<script src='"""),_display_(/*606.15*/routes/*606.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*606.66*/("""'></script>
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
                  DATE: Wed Oct 04 19:12:20 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/pagrindinisContent.scala.html
                  HASH: 2b4625230858383d6945486cc78eca9fb31c7a6b
                  MATRIX: 1047->1|1183->66|1228->64|1255->83|1302->122|1352->135|1379->136|1888->618|1903->624|1953->653|3086->1759|3101->1765|3151->1794|3191->1807|3207->1813|3266->1850|3416->1973|3431->1979|3481->2008|3521->2021|3537->2027|3596->2064|3746->2187|3761->2193|3812->2223|3853->2236|3869->2242|3928->2279|4054->2379|4067->2384|4103->2399|4131->2400|5053->3295|5068->3301|5131->3343|22219->20403|22235->20409|22297->20449|22339->20463|22355->20469|22418->20509|22615->20678|22631->20684|22697->20728|22739->20742|22755->20748|22822->20792|23017->20959|23033->20965|23094->21004|23136->21018|23152->21024|23214->21063|23521->21342|23537->21348|23600->21389|23642->21403|23658->21409|23722->21450|23907->21607|23923->21613|23996->21664|24038->21678|24055->21684|24129->21735|24342->21920|24358->21926|24418->21964|24460->21978|24476->21984|24537->22022|33916->31373|33932->31379|34019->31455|34061->31457|34119->31487|34135->31493|34197->31545|34266->31574|34324->31603|34378->31629|34399->31640|34445->31664|34507->31697|34532->31699|34564->31702|34603->31719|34639->31744|34681->31746|34712->31747|34757->31763|34779->31774|34827->31799|34872->31811|34934->31841|34992->31870|35068->31918|35130->31963|35171->31965|35201->31966|35243->31980|35259->31985|35301->32004|35371->32042|35435->32078|35451->32084|35527->32149|35596->32178|35654->32207|35708->32233|35729->32244|35771->32264|35846->32310|35871->32312|35903->32315|35942->32332|35978->32357|36020->32359|36051->32360|36096->32376|36118->32387|36162->32408|36207->32420|36269->32450|36327->32479|36403->32527|36461->32568|36502->32570|36532->32571|36574->32585|36589->32590|36631->32609|36701->32647|36765->32683|36781->32689|36831->32729|36900->32758|36958->32787|37062->32863|37094->32885|37121->32890|37157->32897|37182->32899|37259->32947|37295->32972|37327->32974|37349->32985|37398->33009|37506->33085|37564->33114|37640->33162|37700->33205|37741->33207|37771->33208|37813->33222|37828->33227|37870->33246|37940->33284|38117->33433|38132->33438|38169->33453|38233->33489|38274->33520|38315->33522|38373->33551|38503->33653|38558->33691|38599->33693|38629->33694|38661->33698|38676->33703|38718->33722|38784->33760|38842->33801|38883->33803|38913->33804|38945->33808|38960->33813|39002->33832|39072->33870|39138->33904|39200->33937|39301->34006|39363->34036|39421->34065|39640->34256|39656->34262|39704->34288|40924->35482|40959->35507|40999->35508|41041->35522|41057->35528|41130->35578|41175->35590|41562->35949|41578->35955|41649->36004|41703->36030|41719->36036|41803->36098|41856->36123|41872->36129|41943->36178|41997->36204|42013->36210|42080->36255
                  LINES: 30->1|33->2|36->1|37->3|37->3|37->3|38->4|45->11|45->11|45->11|73->39|73->39|73->39|73->39|73->39|73->39|76->42|76->42|76->42|76->42|76->42|76->42|79->45|79->45|79->45|79->45|79->45|79->45|85->51|85->51|85->51|86->52|104->70|104->70|104->70|329->295|329->295|329->295|329->295|329->295|329->295|333->299|333->299|333->299|333->299|333->299|333->299|337->303|337->303|337->303|337->303|337->303|337->303|345->311|345->311|345->311|345->311|345->311|345->311|349->315|349->315|349->315|349->315|349->315|349->315|353->319|353->319|353->319|353->319|353->319|353->319|551->517|551->517|551->517|551->517|552->518|552->518|552->518|552->518|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|554->520|555->521|556->522|556->522|556->522|556->522|556->522|556->522|556->522|557->523|558->524|558->524|558->524|558->524|559->525|559->525|559->525|559->525|559->525|559->525|559->525|559->525|559->525|559->525|559->525|559->525|559->525|559->525|559->525|560->526|561->527|562->528|562->528|562->528|562->528|562->528|562->528|562->528|563->529|564->530|564->530|564->530|564->530|565->531|566->532|566->532|566->532|566->532|566->532|566->532|566->532|566->532|566->532|566->532|568->534|569->535|570->536|570->536|570->536|570->536|570->536|570->536|570->536|571->537|573->539|573->539|573->539|574->540|574->540|574->540|575->541|577->543|577->543|577->543|577->543|577->543|577->543|577->543|578->544|578->544|578->544|578->544|578->544|578->544|578->544|579->545|580->546|581->547|583->549|584->550|585->551|588->554|588->554|588->554|621->587|621->587|621->587|621->587|621->587|621->587|621->587|637->603|637->603|637->603|638->604|638->604|638->604|639->605|639->605|639->605|640->606|640->606|640->606
                  -- GENERATED --
              */
          