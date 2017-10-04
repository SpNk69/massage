
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

object germanContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "java", contactForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.65*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""
"""),format.raw/*4.1*/("""<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                Menu <i class="fa fa-bars"></i>
            </button>
            <a class="navbar-brand page-scroll" href='"""),_display_(/*11.56*/routes/*11.62*/.HomeController.germanVersion),format.raw/*11.91*/("""'>
                <i class="fa fa-play-circle"></i> <span class="light">Vida</span> Massagen
            </a>
        </div>
        <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
            <ul class="nav navbar-nav">
                <li class="hidden">
                    <a href="#page-top"></a>
                </li>
                <li>
                    <a class="page-scroll" href="#uber">Über mich</a>
                </li>
                <li>
                    <a class="page-scroll" href="#massagen">Massagen</a>
                </li>
                <li>
                    <a class="page-scroll" href="#galerie">Galerie</a>
                </li>
                <li>
                    <a class="page-scroll" href="#preise">Preise</a>
                </li>
                <li>
                    <a class="page-scroll" href="#fragen">Fragen</a>
                </li>
                <li>
                    <a class="page-scroll" href="#kontakte">Kontakte</a>
                </li>
                <li>
                    <a class="page-scroll" href='"""),_display_(/*39.51*/routes/*39.57*/.HomeController.germanVersion),format.raw/*39.86*/("""'><img src='"""),_display_(/*39.99*/routes/*39.105*/.Assets.at("images/img/flag-de2.png")),format.raw/*39.142*/("""' alt="Deutsche sprache" /></a>
                </li>
                <li>
                    <a class="page-scroll" href='"""),_display_(/*42.51*/routes/*42.57*/.HomeController.pagrindinisLT),format.raw/*42.86*/("""'><img src='"""),_display_(/*42.99*/routes/*42.105*/.Assets.at("images/img/flag-lt2.png")),format.raw/*42.142*/("""' alt="Litauische sprache" /></a>
                </li>
                <li>
                    <a class="page-scroll" href=""""),_display_(/*45.51*/routes/*45.57*/.HomeController.russianVersion),format.raw/*45.87*/(""""><img src='"""),_display_(/*45.100*/routes/*45.106*/.Assets.at("images/img/flag-rus.png")),format.raw/*45.143*/("""' alt="Russische sprache" /></a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<header class="intro">
    <div class="intro-body">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <h1 class="brand-heading"></h1>
                    <p class="intro-text">Massage ist eine der besonderen Faktoren in das Leben einer Person, zu helfen einen guten Körper und Seele zu halten. Und es gibt nichts Besseres als nach einem harten und müden Arbeitstag, entspannen und beleben Sie Ihren Körper mit Massage-Verfahren.</p>
                    <a href="#uber" class="btn btn-circle page-scroll">
                        <i class="fa fa-angle-double-down animated"></i>
                    </a>
                </div>
            </div>
        </div>
    </div>
</header>
<section id="uber" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-6">
            <img src='"""),_display_(/*69.24*/routes/*69.30*/.Assets.at("images/img/Vida-Polescuk.jpg")),format.raw/*69.72*/("""' class="img-circle" alt="Vida Polescuk" id="what">
        </div>
        <p></p>
        <div class="col-lg-6">
            <h2 align="center"><em>Bildung</em></h2>
            <ul>
                <li>Vilnius Höhere Medizinische Fakultät Litauen.</li>
                <li> Klaipeda Universität. Bachelor Öffentliches Gesundheitswesen verliehen. Litauen.</li>
                <li> 2010 - "Baltic SPA Profi" Kurse (Lettland), Wellness-Massagen.</li>
                <li>2012 - Zentrum für Entwicklung und Spezialisierung des Pflegepersonals: Zertifikat Nr 120146 KV - das Recht hat therapeutische Massage zu machen.</li>
            </ul>
            <p></p>
            <h2 align="center"><em>BERUFSERFAHRUNG</em></h2>
            <ul>
                <li>27 Jahre: Krankenschwester.</li>
                <li>7 Jahre: Gesundheitswesen Specialist.</li>
                <li>7 Jahre: Masseurin.</li>
            </ul>
            <p></p>
            <h2 align="center"><em>SPA Zertifizierungen</em></h2>
            <ul>
                <li>Klassische Segmentmassage </li>
                <li>Hot Stone Massage</li>
                <li>Manuelle Lymphdrainage </li>
                <li>Thai-Fußmassage</li>
                <li>Traditional Kerala Ayurveda-Massage</li>
            </ul>
        </div>
    </div>
    <a href="#massagen" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
</section>
<section id="massagen" class="content-section text-center">
    <div class="download-section">
        <h1 id="vienas">Gesundheitsverbessernde Massagen</h1>
        <div class="container">
            <div class="row">
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#limfodrenazinis">
                        Manuelle Lymphdrainagemassage
                    </button>
                    <p></p>
                    <div id="limfodrenazinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo">
                                Manuelle Lymphdrainage
                            </button>
                            <div id="limfo" class="collapse customWidth"> <p class="massageText">Es ist eine sichere effektive Möglichkeit, die Gesundheit zu fördern und zu pflegen Wohlbefinden . Bei gesunden Menschen - es ist eine vorbeugende Maßnahme normalen Stoffwechsel aufrecht zu erhalten. Während der Massage aktiviert die Regeneration geschädigter Weichgewebe, entzündliche Prozesse zu verlangsamen, stärkt das Immunsystem, verbessert die Sauerstoffversorgung der Gewebe. Dies hilft, überschüssige Flüssigkeit aus dem Gewebe und Organe zu beseitigen.</br>
                                Lymphdrainage ist geeignet für diejenigen, die die Schwellung der Beine fühlen, Schwellungen oder einfach Müdigkeit. Nach einem langen Tag, er entspannt müde Beine und gibt ein Gefühl von Leichtigkeit. Es eignet sich auch für Menschen, deren Füße sind immer kalt.</br>
                                Diese Massage ist für Frauen und Männer.</br>
                                Für die Behandlung - empfiehlt jeden Tag, für die Prävention - 2-3 mal pro Woche.</br>
                                Der gewünschte Effekt wird nach 15 Prozeduren erreicht.
                            </p> </div>
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo2">
                                Manuelle Lymphdrainage Gesicht
                            </button>
                            <div id="limfo2" class="collapse customWidth"><p class="massageText">Gesichts Lymphdrainage ist eine Technik der manuellen Therapie, es handelt sich um eine sanfte, und langsame Massage in Richtung der Lymphknoten zur Beseitigung der Giftstoffe auf natürliche Weise, durch die Bewegung der Haut. Giftstoffe werden dann mobilisiert.</br>
                                Die Lymphdrainage Gesichtsmassage verbessert das natürliche Aussehen im Gesicht und verjüngt, sie hilft zur Ausscheidung von Flüssigkeiten und Toxinen die in den Geweben angesammelt sind, fördert die Durchblutung und stärkt die Muskulatur.</br>
                                Verhindert das Auftreten von Müdigkeit in unserem Gesicht, verblasst die Zeiches des Alters und macht die Haut frisch und schön. Die Haut sieht jünger und glatter aus.</br>
                                Es gibt viele Vorteile für diese Art von Lymphdrainage:</br>
                                Detoxifying</br>
                                Sie eignet sich hervorragend, um Säcke unter den Augen und Schwellungen zu reduzieren.</br>
                                Fördert die Zellreparatur und verbessern die Haut.</br>
                                Verbessert die Mikrozirkulation der Nährstoffe.</br>
                                Erhöht das Sauerstoff.</br>
                                Verbessert bei Menschen mit Akne das Haut aussehen.</br>
                                Die Technik hat eine beruhigende Wirkung, hilft bei Problemen von Stress und Schlaflosigkeit.</br>
                                Fungiert auch als Nervensystem Beruhigung, so ist es sehr für diejenigen empfohlen, die an Stress und Angst leiden.</p> </div>
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#karstusaltu">Heiß-kalt
                        Steinmassage
                    </button>
                    <p></p>
                    <div id="karstusaltu" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth"> Die Steine, die bei dieser Massage eingesetzt werden, wurden an der Küste der Ostsee gesammelt. Über
                                Tausende von Jahren waren sie den Kräften des Meeres ausgesetzt, wurden von Sonne, Luft und
                                Winden geformt und erhielten so ihre einzigarten Formen und Eigenschaften, die den menschlichen
                                Körper positiv beeinflussen.</br>
                                Die Steine haben die Fähigkeit, Giftstoffe und angestauten Stress abzubauen sowie Anspannungen zu
                                lösen. Sie verbessern den Schlaf, unterstützen den Blutdruck und ihre Energie wirkt sich positiv aufs Herz
                                aus und reguliert so die körpereigenen, natürlichen Kräfte.</br>
                                Diese Massage eignet sich deshalb besonders gegen Müdigkeit und Stress, da die Wärme der Steine
                                muskelentspannend wirken. Die Abwechslung mit den kühlen Steinen wirkt sich dabei vitalisierend auf
                                das vegetative Nervensystem aus und entspannt zudem verkrampfte Rücken-, Kopf- und
                                Nackenmuskulatur.</br>
                                Bei Schwangerschaft, Infektions- und Krebskrankheiten wird diese Massage nicht empfohlen.
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#segmentinis">Rücken Massage
                    </button>
                    <p></p>
                    <div id="segmentinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth">Die Rücken Massage ist eine gelungene Synthese der unterschiedlichsten Techniken aus Ost und West mit dem einen Ziel: den Rücken und insbesondere den Schulter- und Nackenbereich optimal zu entspannen. Anschaulich, leicht verständlich und Schritt für Schritt erklärt erarbeiten wir Techniken und Griffe um die Rückenmuskulatur besonders tiefgehend zu entspannen und somit das Wohlbefinden erheblich zu steigern.
                                Die Rücken Massage ist eine feinfühlige, stark energetische Rückenmassage, die imstande ist, Blockaden zu lösen.
                                </br> Wirksam für folgende Indikationen:
                                </br> Bei Verspannungen im Nacken und Schulterbereich
                                </br> Wirkungsvolle Hilfe zur Stressbewältigung
                                </br> Zur Linderung von spannungsbedingten Kopfschmerzen
                                Regulation von Durchblutungsstörungen im Bereich des oberen Rücken.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#demo33">
                        Teilkörpermassagen
                    </button>
                    <p></p>
                    <div id="demo33" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#galva">
                                Kopfmassage
                            </button>
                            <div id="galva" class="collapse customWidth"><p class="massageText">Entspannt bei Stress, lindert Krämpfe, verbessert den Blutkreislauf.</p> </div>
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#peciai">
                                Massage Schulter - Hals - Hände
                            </button>
                            <div id="peciai" class="collapse customWidth"><p class="massageText">Die effektivste Behandlung, sowie ein Heilmittel für die Beseitigung von unangenehmen Symptomen. Nach der ersten Massage des Halses, fühlen Sie eine allgemeine Verbesserung in Ihrem Gesundheitszustand. Nach einem vollen Massagen verschwinden schmerzhafte Empfindungen, die Arbeitskapazität steigt, Schlaflosigkeit und Reizbarkeit verschwinden. Nackenmassage ist ein ausgezeichnetes Werkzeug, um Kopfschmerzen loszuwerden.
                                </br>Dies ist eine hervorragende Maßnahme zur Reduzierung von Kopf, Hals, Schulter Schmerzen, Taubheit Hände.</p> </div>
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pilvo">
                                Bauchmassage
                            </button>
                            <div id="pilvo" class="collapse customWidth"><p class="massageText">regt die Verdauung an, wirkt sich positiv auf die intra-abdominalen Organe aus, verbessert Magen- und Darmfunktionen sowie die Gallensekretion, hilft bei Verstopfung oder Gasansammlung im Darm</p></div>
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#juosmens">
                                Lendenwirbel - Gesäß - Beinmassage
                            </button>
                            <div id="juosmens" class="collapse customWidth"><p class="massageText">Verbessert die Blut- und Lymphzirkulation im unteren Rücken und in den Beinen, entspannt enge Muskeln, Gesäß, Beinschmerzen, stärkt die geschwächten Muskeln.
                                Verringert den Schmerz nach der Operation, reduziert die Entzündung der Nervenwurzeln.</p></div>
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#vyresnio">Massage für ältere Menscher
                    </button>
                    <p></p>
                    <div id="vyresnio" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth"> Massage ist ein notwendiges und sehr nützliches Verfahren für ältere Menschen, Rentner. Studien haben gezeigt, dass die Massage den Alterungsprozess verlangsamt. Auch Massage hat eine beruhigende Wirkung im ganzen Körper und kann Schmerzen reduzieren.
                                </br>Мassage kann Menschen helfen, die unter Muskelschmerzen leiden: Zum Beispiel, diejenigen, die an Arthritis leiden, Massage hilft, Schmerzen zu reduzieren, erhöht die Amplitude der Bewegung in den Gelenken. Wenn eine Person leidet, wird sie immer weniger aktiv und beeinflusst die Lebensqualität und Gesundheit. Massage verbessert die Durchblutung, beseitigt Muskelermüdung und Muskeln erhalten Ton. Dies verbessert die Lebensqualität einer älteren Person.
                                </br>Vor einer Massage ist es ratsam, einen Arzt zu konsultieren. Sobald Sie die Erlaubnis vom Arzt für eine Massage bekommen, können Sie sich mit mir in Verbindung setzen. </p>
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#atpalaiduojantis">Entspannende Ganzkörpermassagе
                    </button>
                    <p></p>
                    <div id="atpalaiduojantis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth"> Entspannende Massage für diejenigen, die nach einem anstrengenden Tag entspannen wollen, vergessen und weg von der täglichen Routine. Beseitigt Spannung und Stress, Anfälle, und Kopfschmerzen, entspannt die Muskeln, wirkt sich positiv auf den inneren Zustand des Körpers, verbessert die Stimmung und liefert die Energie wieder hergestellt.
                                </br> Absolute Entspannung von Kopf bis Fuss. Die umfassende Massage löst Verspannungen, lockert Muskeln und verleiht neue Energie und Vitalität.</p>
                        </div>
                    </div>
                    <p></p>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#ajurvedinis">Ayurvedische Brüstmassage für Frauen
                    </button>
                    <p></p>
                    <div id="ajurvedinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth"> Ayurveda empfiehlt der Brüstemassage, denn hierdurch entsteht ein optimaler Stimulus zur Harmonisierung des weiblichen Hormonzyklus. Die Massage sorgt für straffe Haut und straffes Bindegewebe, verhindert Brustschmerzen, Verspannungen und Entzündungen im Brustbereich, beugt Zystenbildung und Brustkrebs vor, aktiviert das Herz und das Herzchakra.
                                </br>Die Massage wird mit der Verwendung von Pflanzenölen durchgeführt und dauert bis zu einer Stunde. Inklusive Arbeit mit dem Hals (Rücken- und Vorderflächen) und Schultern, Arbeiten mit dem Unterarmbereich, Hände, Bauch und natürlich mit der Brust.</p>
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#anticeliulitinis">
                        Anti-Cellulite massage
                    </button>
                    <p></p>
                    <div id="anticeliulitinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth">Dies ist eine besonders effektive Möglichkeit zur Bekämpfung von Cellulite, die verwendet wird, uneben subkutanes (Cellulite) Probleme in spezifischen Problembereichen zu reduzieren - Oberschenkel, Gesäß und Bauch.
                                </br> Massage stimuliert die Zirkulation der Lymphe, erhöht Muskeltonus und Kontraktion durch die Reduzierung von Cellulite und Schwellungen. Löscht den Körper von Toxinen und hat eine ausgeprägte kosmetische Wirkung.
                                </br> Dies ist die kleinste Methode - verlässt keine Prellungen.</br> Der tibetische Vakuum Cup wird verwendet. </p></div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#thaipedu">
                        Entspannende Fussmassage
                    </button>
                    <p></p>
                    <div id="thaipedu" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth">Gebrauchte müde Füsse zu entspannen, erhöhen Vitalität, Verbesserung der Immunität. Dieses Verfahren eignet sich für viele Menschen, die stehen oder eine Menge Leute auch, die einen kalten Fusse haben. Massage der Füsse hilft, den ganzen Körper wiederherzustellen und zu atmen. </p></div>
                    </div>
                </div>
                <p></p>
            </div>
        </div>
    </div>
    </div>
    </div>
    <a href="#galerie" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
</section>
<section id="galerie" class="content-section text-center">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <hr>
            <h1>Galerie</h1>
            <hr>
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*291.27*/routes/*291.33*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*291.73*/(""""> <img src=""""),_display_(/*291.87*/routes/*291.93*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*291.133*/("""" class="w3-image w3-round" alt="Vida Massagebett im Zimmer"></a>
            </div>
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*295.27*/routes/*295.33*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*295.77*/(""""> <img src=""""),_display_(/*295.91*/routes/*295.97*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*295.141*/("""" class="w3-image w3-round" alt="Hot and Cold Stone Massage"></a>
            </div>
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*299.27*/routes/*299.33*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*299.72*/(""""> <img src=""""),_display_(/*299.86*/routes/*299.92*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*299.131*/("""" class="w3-image w3-round" alt="Steine und Öle für die Massage in Vido verwendet"></a>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*307.27*/routes/*307.33*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*307.74*/(""""> <img src=""""),_display_(/*307.88*/routes/*307.94*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*307.135*/("""" class="w3-image w3-round" alt="Vida Massagebett"></a>
            </div>
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*311.27*/routes/*311.33*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*311.84*/(""""> <img src=""""),_display_(/*311.98*/routes/*311.104*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*311.155*/("""" class="w3-image w3-round" alt="verwendet tibetischen Vakuumbecher und Öl"></a>
            </div>
            <p></p>
            <div class="col-lg-4">
                <a href=""""),_display_(/*315.27*/routes/*315.33*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*315.71*/(""""> <img src=""""),_display_(/*315.85*/routes/*315.91*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*315.129*/("""" class="w3-image w3-round" alt="Buddha"></a>
            </div>
            <p></p>
        </div>
    </div>
    <a href="#preise" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
    </div>
</section>
<section class="content-section text-center">
    <div class="contact-section" id="preise">
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <div class="">
                    <hr>
                    <h1>Preise</h1>
                    <hr>
                    <div class="w3-container customBackGroundOfDiv">
                        <p></p>
                        <h5 align="center"><em>Spa Massagen</em></h5>
                        <table class="table table-inverse">
                            <th scope="row" id="ulo"><em></em></th>
                            <td><b><em>Dauer</em></b></td>
                            <td><b><em>Preis</em></b></td>
                            <tbody>
                            <tr>
                                <th scope="row" id="ulo2">Hot and Cold Stone Massage</th>
                                <td>90 min.</td>
                                <td>170 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Hot and Cold Stone Massage</th>
                                <td>120 min.</td>
                                <td>220 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Manuelle Lymphdrainagemassage Körper</th>
                                <td>90 min.</td>
                                <td>140 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Manuelle Lymphdrainagemassage Gesicht</th>
                                <td>50 min.</td>
                                <td>90 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Ayurvedische Brustmassage für Frauen</th>
                                <td>60 min.</td>
                                <td>100 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Rückenmassage</th>
                                <td>60 min.</td>
                                <td>100 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Rückenmassage</th>
                                <td>90 min.</td>
                                <td>150 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Entspannende Ganzkörpermassagе </th>
                                <td>120 min.</td>
                                <td>200 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Entspannende Fussmassage</th>
                                <td>60 min.</td>
                                <td>100 CHF</td>
                            </tr>
                            </tbody>
                        </table>
                        <h5 align="center"><b><em>Andere Massagen</em></b></h5>
                        <table class="table table-inverse">
                            <th scope="row" id="ulo"><em>TEILKÖRPERMASSAGE</em> </th>
                            <td><b><em>30min</em></b></td>
                            <td><b><em>60min</em></b></td>
                            <td><b><em>90min</em></b></td>
                            <tbody>
                            <tr>
                                <th scope="row" id="ulo2">Massage Schulter-Hals-Hände</th>
                                <td>50 CHF</td>
                                <td>100 CHF</td>
                                <td>-</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Lendenwirbel - Gesäß – Beinmassage</th>
                                <td>50 CHF</td>
                                <td>100 CHF</td>
                                <td>--</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Kopfmassage</th>
                                <td>50 CHF</td>
                                <td>--</td>
                                <td>--</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Bauchmassage</th>
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
                            <th scope="row"><b><u id="ulo">Anti-Cellulite Handmassage mit Tibetische Lehm Cup:</em> </b></th>
                            <td><b><em>30min</em></b></td>
                            <td><b><em>60min</em></b></td>
                            <td><b><em>90min</em></b></td>
                            <tr>
                            <tbody>
                            <th scope="row" id="ulo2">Gesäß</th>
                            <td>70 CHF</td>
                            <td>130 CHF</td>
                            <td>180 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Die Oberschenkel</th>
                                <td>70 CHF</td>
                                <td>130 CHF</td>
                                <td>180 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Bauch</th>
                                <td>70 CHF</td>
                                <td>130 CHF</td>
                                <td>180 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Oberarmmassage</th>
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
                            <th scope="row" id="ulo"><b><em>Massage für Menschen (ab 65 Jahre alt)<em></b></th>
                            <td><b><em></em></b></td>
                            <td><b><em>Preis</em></b></td>
                            <td><b><em></em></b></td>
                            <tbody>
                            <tr>
                                <th scope="row" id="ulo2">SPA Massage und Teilkörpermassage </th>
                                <td></td>
                                <td> -10% Rabatt</td>
                                <td></td>
                            </tr>
                            </tbody>
                        </table>
                        <p></p>
                        <h5 align="center"><b><em>Geschenkgutscheine</em></b></h5>
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
        <a href="#fragen" class="btn btn-circle page-scroll">
            <i class="fa fa-angle-double-down animated"></i>
        </a>
    </div>
</section>
<section id="fragen" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-12">
            <div class="">
                <div class="container">
                    <h2>Stellen Sie Ihre Frage!</h2>
                    <p></p>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">
                            """),_display_(/*513.30*/helper/*513.36*/.form(action = routes.HomeController.submitDE(),'class -> "form-horizontal")/*513.112*/ {_display_(Seq[Any](format.raw/*513.114*/("""
                            """),_display_(/*514.30*/helper/*514.36*/.input(contactForm("Name"),'class->"form-control")/*514.86*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*514.115*/("""
                            """),format.raw/*515.29*/("""<input type="text" name=""""),_display_(/*515.55*/contactForm/*515.66*/.field("firstName").name),format.raw/*515.90*/("""" placeholder="Ihr Name" id=""""),_display_(/*515.120*/id),format.raw/*515.122*/("""" """),_display_(/*515.125*/toHtmlArgs(args)),_display_(/*515.142*/if(contactForm.hasErrors)/*515.167*/ {_display_(Seq[Any](format.raw/*515.169*/(""" """),format.raw/*515.170*/("""<option value='"""),_display_(/*515.186*/contactForm/*515.197*/.field("firstName").value),format.raw/*515.222*/("""'></option>""")))}),format.raw/*515.234*/("""
                            """)))}),format.raw/*516.30*/("""
                            """),format.raw/*517.29*/("""<div id="xxx">
                                """),_display_(/*518.34*/for(error <- contactForm("firstName").errors) yield /*518.79*/ {_display_(Seq[Any](format.raw/*518.81*/(""" """),format.raw/*518.82*/("""<p id="xxxx">"""),_display_(/*518.96*/error/*518.101*/.format(messages())),format.raw/*518.120*/("""</p>
                                """)))}),format.raw/*519.34*/("""</div>
                            """),_display_(/*520.30*/helper/*520.36*/.input(contactForm("E-Mail"),'class->"form-control")/*520.88*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*520.117*/("""
                            """),format.raw/*521.29*/("""<input type="text" name=""""),_display_(/*521.55*/contactForm/*521.66*/.field("email").name),format.raw/*521.86*/("""" placeholder="Ihre E-Mail" id=""""),_display_(/*521.119*/id),format.raw/*521.121*/("""" """),_display_(/*521.124*/toHtmlArgs(args)),_display_(/*521.141*/if(contactForm.hasErrors)/*521.166*/ {_display_(Seq[Any](format.raw/*521.168*/(""" """),format.raw/*521.169*/("""<option value='"""),_display_(/*521.185*/contactForm/*521.196*/.field("email").value),format.raw/*521.217*/("""'></option>""")))}),format.raw/*521.229*/("""
                            """)))}),format.raw/*522.30*/("""
                            """),format.raw/*523.29*/("""<div id="xxx">
                                """),_display_(/*524.34*/for(error <- contactForm("email").errors) yield /*524.75*/ {_display_(Seq[Any](format.raw/*524.77*/(""" """),format.raw/*524.78*/("""<p id="xxxx">"""),_display_(/*524.92*/error/*524.97*/.format(messages())),format.raw/*524.116*/("""</p>
                                """)))}),format.raw/*525.34*/("""</div>
                            """),_display_(/*526.30*/helper/*526.36*/.input(field = contactForm("Frage"))/*526.72*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*526.101*/("""
                            """),format.raw/*527.29*/("""<div>
                                <textarea class="form-control" name=""""),_display_(/*528.71*/contactForm("textbox")/*528.93*/.name),format.raw/*528.98*/("""" id=""""),_display_(/*528.105*/id),format.raw/*528.107*/("""" placeholder="Ihre Nachricht" rows='5' cols='80'>"""),_display_(/*528.158*/if(contactForm.hasErrors)/*528.183*/{_display_(_display_(/*528.185*/contactForm/*528.196*/.field("textbox").value))}),format.raw/*528.220*/("""</textarea>
                            </div>
                            """)))}),format.raw/*530.30*/("""
                            """),format.raw/*531.29*/("""<div id="xxx">
                                """),_display_(/*532.34*/for(error <- contactForm("textbox").errors) yield /*532.77*/ {_display_(Seq[Any](format.raw/*532.79*/(""" """),format.raw/*532.80*/("""<p id="xxxx">"""),_display_(/*532.94*/error/*532.99*/.format(messages())),format.raw/*532.118*/("""</p>
                                """)))}),format.raw/*533.34*/("""</div>
                            <button type="submit" class="btn btn-default">Nachricht senden</button>
                            <div id="flash">"""),_display_(/*535.46*/flash/*535.51*/.get("success")),format.raw/*535.66*/("""</div>
                            """),_display_(/*536.30*/if(contactForm.hasGlobalErrors)/*536.61*/ {_display_(Seq[Any](format.raw/*536.63*/("""
                            """),format.raw/*537.29*/("""<div id="xxx">
                                <p class="error">
                                    """),_display_(/*539.38*/for(error <- contactForm.globalErrors) yield /*539.76*/ {_display_(Seq[Any](format.raw/*539.78*/(""" """),format.raw/*539.79*/("""<p>"""),_display_(/*539.83*/error/*539.88*/.format(messages())),format.raw/*539.107*/("""</p>
                                """),_display_(/*540.34*/for(error <- contactForm("email").errors) yield /*540.75*/ {_display_(Seq[Any](format.raw/*540.77*/(""" """),format.raw/*540.78*/("""<p>"""),_display_(/*540.82*/error/*540.87*/.format(messages())),format.raw/*540.106*/("""</p>
                                """)))}),format.raw/*541.34*/("""
                                """)))}),format.raw/*542.34*/("""
                                """),format.raw/*543.33*/("""</p>
                            </div>
                            """)))}),format.raw/*545.30*/("""
                            """)))}),format.raw/*546.30*/("""
                            """),format.raw/*547.29*/("""<p></p>
                            <h3>Unsere sozialen Netzwerke</h3>
                            <ul class="list-inline banner-social-buttons">
                                <li><a href=""""),_display_(/*550.47*/routes/*550.53*/.HomeController.toFaceBook),format.raw/*550.79*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <a href="#kontakte" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
</section>
<section>
    <hr>
    <div id="kontakte" class="text-center">
        <div class="row">
            <div class="col-lg-12 price-section2">
                <p></p>
                <h1>Kontaktinformation</h1>
                <p>
                    <strong><i class="fa fa-map-marker"></i> Adresse</strong><br>
                    ---
                </p>
                <p><strong><i class="fa fa-phone"></i> Telefonnummer </strong><br>
                    +41 797897010</p>
                <p>
                    <strong><i class="fa fa-envelope"></i> E-Mail</strong><br>
                    info@vidamassage.ch</p>
                <p></p>
            </div>
        </div>
    </div>
    """),_display_(/*582.6*/if(contactForm.hasErrors)/*582.31*/{_display_(Seq[Any](format.raw/*582.32*/("""<script src=""""),_display_(/*582.46*/routes/*582.52*/.Assets.at("javascripts/js/returnToFormOnFailDE.js")),format.raw/*582.104*/(""""></script>""")))}),format.raw/*582.116*/("""</script>
    <hr>
</section>
<section>
    <div id="mappp" class="text-center">
        <div class="row">
            <div class="col-lg-12">
                <h1>Karte</h1>
            </div>
        </div>
    </div>
</section>
<footer>
    <div class="container text-center">
        <p>Copyright &copy; Vida Massage 2017</p>
    </div>
</footer>
<script src='"""),_display_(/*599.15*/routes/*599.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*599.70*/("""'></script>
<script src='"""),_display_(/*600.15*/routes/*600.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*600.83*/("""'></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBtkVXlKJlSvm85a7oRDMLw4ZOZaxYwKxM&sensor=false"></script>
<script src='"""),_display_(/*603.15*/routes/*603.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*603.66*/("""'></script>
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
                  DATE: Wed Oct 04 20:33:55 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/germanContent.scala.html
                  HASH: d9c03e9d40b71fa6d3738fc1e1794816291f522c
                  MATRIX: 1042->1|1178->66|1223->64|1250->83|1297->122|1347->135|1374->136|1847->582|1862->588|1912->617|3043->1721|3058->1727|3108->1756|3148->1769|3164->1775|3223->1812|3375->1937|3390->1943|3440->1972|3480->1985|3496->1991|3555->2028|3709->2155|3724->2161|3775->2191|3816->2204|3832->2210|3891->2247|4934->3263|4949->3269|5012->3311|23646->21917|23662->21923|23724->21963|23766->21977|23782->21983|23845->22023|24039->22189|24055->22195|24121->22239|24163->22253|24179->22259|24246->22303|24440->22469|24456->22475|24517->22514|24559->22528|24575->22534|24637->22573|24948->22856|24964->22862|25027->22903|25069->22917|25085->22923|25149->22964|25333->23120|25349->23126|25422->23177|25464->23191|25481->23197|25555->23248|25764->23429|25780->23435|25840->23473|25882->23487|25898->23493|25959->23531|35272->32816|35288->32822|35375->32898|35417->32900|35475->32930|35491->32936|35551->32986|35620->33015|35678->33044|35732->33070|35753->33081|35799->33105|35858->33135|35883->33137|35915->33140|35954->33157|35990->33182|36032->33184|36063->33185|36108->33201|36130->33212|36178->33237|36223->33249|36285->33279|36343->33308|36419->33356|36481->33401|36522->33403|36552->33404|36594->33418|36610->33423|36652->33442|36722->33480|36786->33516|36802->33522|36864->33574|36933->33603|36991->33632|37045->33658|37066->33669|37108->33689|37170->33722|37195->33724|37227->33727|37266->33744|37302->33769|37344->33771|37375->33772|37420->33788|37442->33799|37486->33820|37531->33832|37593->33862|37651->33891|37727->33939|37785->33980|37826->33982|37856->33983|37898->33997|37913->34002|37955->34021|38025->34059|38089->34095|38105->34101|38151->34137|38220->34166|38278->34195|38382->34271|38414->34293|38441->34298|38477->34305|38502->34307|38582->34358|38618->34383|38650->34385|38672->34396|38721->34420|38829->34496|38887->34525|38963->34573|39023->34616|39064->34618|39094->34619|39136->34633|39151->34638|39193->34657|39263->34695|39443->34847|39458->34852|39495->34867|39559->34903|39600->34934|39641->34936|39699->34965|39829->35067|39884->35105|39925->35107|39955->35108|39987->35112|40002->35117|40044->35136|40110->35174|40168->35215|40209->35217|40239->35218|40271->35222|40286->35227|40328->35246|40398->35284|40464->35318|40526->35351|40627->35420|40689->35450|40747->35479|40967->35671|40983->35677|41031->35703|42164->36810|42199->36835|42239->36836|42281->36850|42297->36856|42372->36908|42417->36920|42809->37284|42825->37290|42896->37339|42950->37365|42966->37371|43050->37433|43350->37705|43366->37711|43433->37756
                  LINES: 30->1|33->2|36->1|37->3|37->3|37->3|38->4|45->11|45->11|45->11|73->39|73->39|73->39|73->39|73->39|73->39|76->42|76->42|76->42|76->42|76->42|76->42|79->45|79->45|79->45|79->45|79->45|79->45|103->69|103->69|103->69|325->291|325->291|325->291|325->291|325->291|325->291|329->295|329->295|329->295|329->295|329->295|329->295|333->299|333->299|333->299|333->299|333->299|333->299|341->307|341->307|341->307|341->307|341->307|341->307|345->311|345->311|345->311|345->311|345->311|345->311|349->315|349->315|349->315|349->315|349->315|349->315|547->513|547->513|547->513|547->513|548->514|548->514|548->514|548->514|549->515|549->515|549->515|549->515|549->515|549->515|549->515|549->515|549->515|549->515|549->515|549->515|549->515|549->515|549->515|550->516|551->517|552->518|552->518|552->518|552->518|552->518|552->518|552->518|553->519|554->520|554->520|554->520|554->520|555->521|555->521|555->521|555->521|555->521|555->521|555->521|555->521|555->521|555->521|555->521|555->521|555->521|555->521|555->521|556->522|557->523|558->524|558->524|558->524|558->524|558->524|558->524|558->524|559->525|560->526|560->526|560->526|560->526|561->527|562->528|562->528|562->528|562->528|562->528|562->528|562->528|562->528|562->528|562->528|564->530|565->531|566->532|566->532|566->532|566->532|566->532|566->532|566->532|567->533|569->535|569->535|569->535|570->536|570->536|570->536|571->537|573->539|573->539|573->539|573->539|573->539|573->539|573->539|574->540|574->540|574->540|574->540|574->540|574->540|574->540|575->541|576->542|577->543|579->545|580->546|581->547|584->550|584->550|584->550|616->582|616->582|616->582|616->582|616->582|616->582|616->582|633->599|633->599|633->599|634->600|634->600|634->600|637->603|637->603|637->603
                  -- GENERATED --
              */
          