
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
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/defining(play.core.PlayVersion.current)/*4.41*/ { version =>_display_(Seq[Any](format.raw/*4.54*/("""

"""),format.raw/*6.1*/("""<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

<!-- Navigation -->
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                Menu <i class="fa fa-bars"></i>
            </button>
            <a class="navbar-brand page-scroll" href='"""),_display_(/*15.56*/routes/*15.62*/.HomeController.germanVersion),format.raw/*15.91*/("""'>
                <i class="fa fa-play-circle"></i> <span class="light">Vida</span> Massagen
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
                    <a class="page-scroll" href='"""),_display_(/*47.51*/routes/*47.57*/.HomeController.germanVersion),format.raw/*47.86*/("""'><img src='"""),_display_(/*47.99*/routes/*47.105*/.Assets.at("images/img/flag-de2.png")),format.raw/*47.142*/("""' alt="Deutsche sprache" /></a>
                </li>

                <li>
                    <a class="page-scroll" href='"""),_display_(/*51.51*/routes/*51.57*/.HomeController.pagrindinisLT),format.raw/*51.86*/("""'><img src='"""),_display_(/*51.99*/routes/*51.105*/.Assets.at("images/img/flag-lt2.png")),format.raw/*51.142*/("""' alt="Litauische sprache" /></a>
                </li>

                <li>
                    <a class="page-scroll" href=""""),_display_(/*55.51*/routes/*55.57*/.HomeController.russianVersion),format.raw/*55.87*/(""""><img src='"""),_display_(/*55.100*/routes/*55.106*/.Assets.at("images/img/flag-rus.png")),format.raw/*55.143*/("""' alt="Russische sprache" /></a>
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



<!-- About Section -->
<section id="uber" class="container content-section text-center">
    <div class="row">

        <div class="col-lg-6 ">
            <img src='"""),_display_(/*93.24*/routes/*93.30*/.Assets.at("images/img/Vida.jpg")),format.raw/*93.63*/("""' class="img-circle" alt="Vida Polescuk" height="600">


        </div>
        <p></p>
        <div class="col-lg-6 ">

            <h2 align="center"><u>Bildung</u></h2>
            <ul>
                <li>Vilnius Höhere Medizinische Fakultät Litauen.</li>
                <li> Klaipeda Universität. Bachelor Öffentliches Gesundheitswesen verliehen. Litauen.</li>
                <li> 2010 - "Baltic SPA Profi" Kurse (Lettland), Wellness-Massagen.</li>
                <li>2012 - Zentrum für Entwicklung und Spezialisierung des Pflegepersonals: Zertifikat Nr 120146 KV - das Recht hat therapeutische Massage zu machen.</li>

            </ul>
            <p></p>

            <h2 align="center"><u>BERUFSERFAHRUNG</u></h2>
            <ul>
                <li>27 Jahre: Krankenschwester.</li>
                <li>7 Jahre: Gesundheitswesen Specialist.</li>
                <li>7 Jahre: Masseurin.</li>
            </ul>
            <p></p>

            <h2 align="center"><u>SPA Zertifizierungen</u></h2>
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

<!-- Download Section -->
<section id="massagen" class="content-section text-center">
    <div class="download-section">
        <h2 id="vienas">Gesundheitsverbessernde Massagen</h2>
        <div class="container">

            <div class="row">

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#limfodrenazinis">
                        Lymphdrainage massage
                    </button>
                    <p></p>
                    <div id="limfodrenazinis" class="collapse">
                        <!--<div class="text-center"><img src='"""),_display_(/*151.65*/routes/*151.71*/.Assets.at("images/img/massage164.jpg")),format.raw/*151.110*/("""'
                                                      class="img-circle" alt="Medicine massage" width="250"
                                                      height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">



                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo" >
                                Manuelle Lymphdrainage
                            </button>
                            <div id="limfo" class="collapse customWidth">      <p class="massageText customWidth">Es ist eine sichere effektive Möglichkeit, die Gesundheit zu fördern und zu pflegen Wohlbefinden . Bei gesunden Menschen - es ist eine vorbeugende Maßnahme normalen Stoffwechsel aufrecht zu erhalten. Während der Massage aktiviert die Regeneration geschädigter Weichgewebe, entzündliche Prozesse zu verlangsamen, stärkt das Immunsystem, verbessert die Sauerstoffversorgung der Gewebe. Dies hilft, überschüssige Flüssigkeit aus dem Gewebe und Organe zu beseitigen.</br>
                                Lymphdrainage ist geeignet für diejenigen, die die Schwellung der Beine fühlen, Schwellungen oder einfach Müdigkeit. Nach einem langen Tag, er entspannt müde Beine und gibt ein Gefühl von Leichtigkeit. Es eignet sich auch für Menschen, deren Füße sind immer kalt.</br>
                                Diese Massage ist für Frauen und Männer.</br>
                                Für die Behandlung - empfiehlt jeden Tag, für die Prävention - 2-3 mal pro Woche.</br>
                                Der gewünschte Effekt wird nach 15 Prozeduren erreicht.
                            </p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo2" >
                                Manuelle Lymphdrainage Gesicht
                            </button>
                            <div id="limfo2" class="collapse customWidth"><p class="massageText customWidth">Gesichts Lymphdrainage  ist eine Technik der manuellen Therapie, es handelt sich um eine sanfte, und langsame Massage in Richtung der Lymphknoten zur Beseitigung der Giftstoffe auf natürliche Weise, durch die Bewegung der  Haut. Giftstoffe werden dann mobilisiert.</br>

                                Die Lymphdrainage Gesichtsmassage verbessert das natürliche Aussehen im Gesicht und  verjüngt, sie hilft zur Ausscheidung von Flüssigkeiten und Toxinen die in den Geweben angesammelt sind, fördert die Durchblutung und stärkt die Muskulatur.</br>

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


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#karstusaltu">Heiß-kalt
                        Steinmassage
                    </button>
                    <p></p>
                    <div id="karstusaltu" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*201.67*/routes/*201.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*201.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

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

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#segmentinis">Rücken Massage
                    </button>
                    <p></p>
                    <div id="segmentinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*234.67*/routes/*234.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*234.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

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


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#demo33" >
                        Individuelle Körpermassagen
                    </button>
                    <p></p>
                    <div id="demo33" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*265.67*/routes/*265.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*265.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#galva" >
                                Kopfmassage
                            </button>
                            <div id="galva" class="collapse customWidth"><p class="massageText">Entspannt bei Stress, lindert Krämpfe, verbessert den Blutkreislauf.</p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#peciai" >
                                Massage Schulter - Hals - Hände
                            </button>
                            <div id="peciai" class="collapse customWidth"><p class="massageText">Die effektivste Behandlung, sowie ein Heilmittel für die Beseitigung von unangenehmen Symptomen. Nach der ersten Massage des Halses, fühlen Sie eine allgemeine Verbesserung in Ihrem Gesundheitszustand. Nach einem vollen Massagen verschwinden schmerzhafte Empfindungen, die Arbeitskapazität steigt, Schlaflosigkeit und Reizbarkeit verschwinden. Nackenmassage ist ein ausgezeichnetes Werkzeug, um Kopfschmerzen loszuwerden.
                                </br>Dies ist eine hervorragende Maßnahme zur Reduzierung von Kopf, Hals, Schulter Schmerzen, Taubheit Hände.</p> </div>





                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pilvo" >
                                Bauchmassage
                            </button>
                            <div id="pilvo" class="collapse customWidth"><p class="massageText">regt die Verdauung an, wirkt sich positiv auf die intra-abdominalen Organe aus, verbessert Magen- und Darmfunktionen sowie die Gallensekretion, hilft bei Verstopfung oder Gasansammlung im Darm</p></div>


                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#juosmens" >
                                Lendenwirbel - Gesäß - Beinmassage
                            </button>
                            <div id="juosmens" class="collapse customWidth"><p class="massageText">Verbessert die Blut- und Lymphzirkulation im unteren Rücken und in den Beinen, entspannt enge Muskeln,  Gesäß, Beinschmerzen, stärkt die geschwächten Muskeln.
                                Verringert den Schmerz nach der Operation, reduziert die Entzündung der Nervenwurzeln.</p></div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pedu" >
                                Entspannende Fussmassage
                            </button>
                            <div id="pedu" class="collapse customWidth"><p class="massageText">Gebrauchte müde Füsse zu entspannen, erhöhen Vitalität, Verbesserung der Immunität. Dieses Verfahren eignet sich für viele Menschen, die stehen oder eine Menge Leute auch, die einen kalten Fusse haben. Massage der Füsse hilft, den ganzen Körper wiederherzustellen und zu atmen.</p></div>



                        </div>
                    </div>
                    <p></p>
                </div>


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#vyresnio">Massage für ältere Menscher
                    </button>
                    <p></p>
                    <div id="vyresnio" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*316.67*/routes/*316.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*316.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Massage ist ein notwendiges und sehr nützliches Verfahren für ältere Menschen, Rentner. Studien haben gezeigt, dass die Massage den Alterungsprozess verlangsamt. Auch Massage hat eine beruhigende Wirkung im ganzen Körper und kann Schmerzen reduzieren.
                                </br>Мassage kann Menschen helfen, die unter Muskelschmerzen leiden: Zum Beispiel, diejenigen, die an Arthritis leiden, Massage hilft, Schmerzen zu reduzieren, erhöht die Amplitude der Bewegung in den Gelenken. Wenn eine Person leidet, wird sie immer weniger aktiv und beeinflusst die Lebensqualität und Gesundheit. Massage verbessert die Durchblutung, beseitigt Muskelermüdung und Muskeln erhalten Ton. Dies verbessert die Lebensqualität einer älteren Person.
                                </br>Vor einer Massage ist es ratsam, einen Arzt zu konsultieren. Sobald Sie die Erlaubnis vom Arzt für eine Massage bekommen, können Sie sich mit mir in Verbindung setzen.  </p>


                        </div>
                    </div>
                    <p></p>
                </div>



                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#atpalaiduojantis">Entspannende Ganzkörpermassagе
                    </button>
                    <p></p>
                    <div id="atpalaiduojantis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*339.67*/routes/*339.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*339.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Entspannende Massage für diejenigen, die nach einem anstrengenden Tag entspannen wollen, vergessen und weg von der täglichen Routine. Beseitigt Spannung und Stress, Anfälle, und Kopfschmerzen, entspannt die Muskeln, wirkt sich positiv auf den inneren Zustand des Körpers, verbessert die Stimmung und liefert die Energie wieder hergestellt.
                            </br> Absolute Entspannung von Kopf bis Fuss. Die umfassende Massage löst Verspannungen, lockert Muskeln und verleiht neue Energie und Vitalität.</p>

                        </div>
                    </div>
                    <p></p>
                </div>
            </div>

            <div class="row">

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#ajurvedinis">Ayurvedische Brüstmassage für Frauen
                    </button>
                    <p></p>
                    <div id="ajurvedinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*361.67*/routes/*361.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*361.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Ayurveda empfiehlt der Brüstemassage, denn hierdurch entsteht ein optimaler Stimulus zur Harmonisierung des weiblichen Hormonzyklus. Die Massage sorgt für straffe Haut und straffes Bindegewebe, verhindert Brustschmerzen, Verspannungen und Entzündungen im Brustbereich, beugt Zystenbildung und Brustkrebs vor, aktiviert das Herz und das Herzchakra.
                                </br>Die Massage wird mit der Verwendung von Pflanzenölen durchgeführt und dauert bis zu einer Stunde. Inklusive Arbeit mit dem Hals (Rücken- und Vorderflächen) und Schultern, Arbeiten mit dem Unterarmbereich, Hände, Bauch und natürlich mit der Brust.</p>

                        </div>
                    </div>
                    <p></p>
                </div>




                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#anticeliulitinis" >
                        Anti-Cellulite Handmassage
                    </button>
                    <p></p>
                    <div id="anticeliulitinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*384.67*/routes/*384.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*384.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">


                           <p class="massageText customWidth">Dies ist eine besonders effektive Möglichkeit zur Bekämpfung von Cellulite, die verwendet wird, uneben subkutanes (Cellulite) Probleme in spezifischen Problembereichen zu reduzieren - Oberschenkel, Gesäß und Bauch.
                                     </br> Massage stimuliert die Zirkulation der Lymphe, erhöht Muskeltonus und Kontraktion durch die Reduzierung von Cellulite und Schwellungen. Löscht den Körper von Toxinen und hat eine ausgeprägte kosmetische Wirkung.
                            </br> Dies ist die kleinste Methode - verlässt keine Prellungen.</p></div>





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

</section >


<section id="galerie" class="content-section text-center">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <div class="contact-section">
                <div class="container">
                    <hr>
                    <h2>Galerie</h2>
                    <hr>


                </div>


            </div>
        </div>
    </div>
    <a href="#preise" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>

</section>



<section id="preise" class="content-section text-center">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <div class="contact-section">
                <div class="container">
                    <hr>
                    <h2>Preise</h2>
                    <hr>
                </div>


            </div>
        </div>
    </div>
    <a href="#fragen" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
</section>
<Usertact Section -->


<section id="fragen" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-12">
            <div class="contact-section">
                <div class="container">

                    <h2>Stellen Sie Ihre Frage!</h2>
                    <p></p>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">




                            """),_display_(/*474.30*/helper/*474.36*/.form(action = routes.HomeController.submitDE(),'class -> "form-horizontal")/*474.112*/ {_display_(Seq[Any](format.raw/*474.114*/("""




                            """),_display_(/*479.30*/helper/*479.36*/.input(contactForm("Name"),'class->"form-control")/*479.86*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*479.115*/("""
                            """),format.raw/*480.29*/("""<input type="text" name=""""),_display_(/*480.55*/contactForm/*480.66*/.field("firstName").name),format.raw/*480.90*/(""""  placeholder="Ihr Name" id=""""),_display_(/*480.121*/id),format.raw/*480.123*/("""" """),_display_(/*480.126*/toHtmlArgs(args)),_display_(/*480.143*/if(contactForm.hasErrors)/*480.168*/ {_display_(Seq[Any](format.raw/*480.170*/("""
                            """),format.raw/*481.29*/("""<option value='"""),_display_(/*481.45*/contactForm/*481.56*/.field("firstName").value),format.raw/*481.81*/("""'></option>""")))}),format.raw/*481.93*/("""
                            """)))}),format.raw/*482.30*/("""



                            """),format.raw/*486.29*/("""<div id="xxx">
                                """),_display_(/*487.34*/for(error <- contactForm("firstName").errors) yield /*487.79*/ {_display_(Seq[Any](format.raw/*487.81*/("""
                                """),format.raw/*488.33*/("""<p id="xxxx">"""),_display_(/*488.47*/error/*488.52*/.format(messages())),format.raw/*488.71*/("""</p>
                                """)))}),format.raw/*489.34*/("""</div>



                            """),_display_(/*493.30*/helper/*493.36*/.input(contactForm("E-Mail"),'class->"form-control")/*493.88*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*493.117*/("""
                            """),format.raw/*494.29*/("""<input type="text" name=""""),_display_(/*494.55*/contactForm/*494.66*/.field("email").name),format.raw/*494.86*/(""""  placeholder="Ihre E-Mail" id=""""),_display_(/*494.120*/id),format.raw/*494.122*/("""" """),_display_(/*494.125*/toHtmlArgs(args)),_display_(/*494.142*/if(contactForm.hasErrors)/*494.167*/ {_display_(Seq[Any](format.raw/*494.169*/("""
                            """),format.raw/*495.29*/("""<option value='"""),_display_(/*495.45*/contactForm/*495.56*/.field("email").value),format.raw/*495.77*/("""'></option>""")))}),format.raw/*495.89*/("""
                            """)))}),format.raw/*496.30*/("""



                            """),format.raw/*500.29*/("""<div id="xxx">
                                """),_display_(/*501.34*/for(error <- contactForm("email").errors) yield /*501.75*/ {_display_(Seq[Any](format.raw/*501.77*/("""
                                """),format.raw/*502.33*/("""<p id="xxxx">"""),_display_(/*502.47*/error/*502.52*/.format(messages())),format.raw/*502.71*/("""</p>
                                """)))}),format.raw/*503.34*/("""</div>







                            """),_display_(/*511.30*/helper/*511.36*/.input(field = contactForm("Frage"))/*511.72*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*511.101*/("""
                            """),format.raw/*512.29*/("""<div>
                                <textarea class="form-control" name=""""),_display_(/*513.71*/contactForm("textbox")/*513.93*/.name),format.raw/*513.98*/("""" id=""""),_display_(/*513.105*/id),format.raw/*513.107*/("""" placeholder="Ihre Nachricht" rows='5' cols='80'>"""),_display_(/*513.158*/if(contactForm.hasErrors)/*513.183*/{_display_(_display_(/*513.185*/contactForm/*513.196*/.field("textbox").value))}),format.raw/*513.220*/("""</textarea>
                            </div>
                            """)))}),format.raw/*515.30*/("""
                            """),format.raw/*516.29*/("""<div id="xxx">
                                """),_display_(/*517.34*/for(error <- contactForm("textbox").errors) yield /*517.77*/ {_display_(Seq[Any](format.raw/*517.79*/("""
                                """),format.raw/*518.33*/("""<p id="xxxx">"""),_display_(/*518.47*/error/*518.52*/.format(messages())),format.raw/*518.71*/("""</p>
                                """)))}),format.raw/*519.34*/("""</div>



                            <button type="submit"  class="btn btn-default" >Nachricht senden</button>

                            <div id="flash">"""),_display_(/*525.46*/flash/*525.51*/.get("success")),format.raw/*525.66*/("""</div>

                            """),_display_(/*527.30*/if(contactForm.hasGlobalErrors)/*527.61*/ {_display_(Seq[Any](format.raw/*527.63*/("""
                            """),format.raw/*528.29*/("""<div id="xxx">
                                <p class="error" >
                                    """),_display_(/*530.38*/for(error <- contactForm.globalErrors) yield /*530.76*/ {_display_(Seq[Any](format.raw/*530.78*/("""
                                """),format.raw/*531.33*/("""<p>"""),_display_(/*531.37*/error/*531.42*/.format(messages())),format.raw/*531.61*/("""</p>
                                """),_display_(/*532.34*/for(error <- contactForm("email").errors) yield /*532.75*/ {_display_(Seq[Any](format.raw/*532.77*/("""
                                """),format.raw/*533.33*/("""<p>"""),_display_(/*533.37*/error/*533.42*/.format(messages())),format.raw/*533.61*/("""</p>
                                """)))}),format.raw/*534.34*/("""
                                """)))}),format.raw/*535.34*/("""
                                """),format.raw/*536.33*/("""</p>
                            </div>
                            """)))}),format.raw/*538.30*/("""
                            """)))}),format.raw/*539.30*/("""


                            """),format.raw/*542.29*/("""<p></p>
                            <h3>Unsere sozialen Netzwerke</h3>
                            <ul class="list-inline banner-social-buttons">
                                <li><a href="www.google.com" class="btn btn-default btn-lg"><i class="fa fa-twitter"> <span class="network-name">Twitter</span></i></a></li>
                                <li><a href=""""),_display_(/*546.47*/routes/*546.53*/.HomeController.toFaceBook),format.raw/*546.79*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
                                <li><a href="#" class="btn btn-default btn-lg"><i class="fa fa-youtube-play"> <span class="network-name">Youtube</span></i></a></li>
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
    <!-- Map Section -->
    <div id="kontakte" class="text-center">
        <div class="row">
            <div class="col-lg-12">
                <p></p>
                <h2>Kontaktinformation</h2>
                <p style="color:#fff;">
                    <strong><i class="fa fa-map-marker"></i> Adresse</strong><br>
                    Villenstrasse 35, Schaffhausen, 8200, Schweiz
                </p>
                <p style="color:#fff;"><strong><i class="fa fa-phone"></i> Telefonnummer </strong><br>
                    +41 797897010</p>
                <p style="color:#fff;">
                    <strong><i class="fa fa-envelope"></i>  E-Mail</strong><br>
                    info@vidamassage.ch</p>
                <p></p>
            </div>
        </div>
    </div>
    """),_display_(/*592.6*/if(contactForm.hasErrors)/*592.31*/{_display_(Seq[Any](format.raw/*592.32*/("""<script src=""""),_display_(/*592.46*/routes/*592.52*/.Assets.at("javascripts/js/returnToFormOnFailDE.js")),format.raw/*592.104*/(""""></script>""")))}),format.raw/*592.116*/("""</script>

    <hr>
</section>





<section>
<!-- Map Section -->
<div id="mappp" class="text-center">
    <div class="row">
        <div class="col-lg-12">

<h2>Karte</h2>

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
<script src='"""),_display_(/*622.15*/routes/*622.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*622.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*625.15*/routes/*625.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*625.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
<script type="text/javascript"
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBtkVXlKJlSvm85a7oRDMLw4ZOZaxYwKxM&sensor=false"></script>

<!-- Theme JavaScript -->
<script src='"""),_display_(/*635.15*/routes/*635.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*635.66*/("""'></script>

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
                  DATE: Wed Sep 27 21:03:27 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/germanContent.scala.html
                  HASH: 208998f4a9609059d1a592520cb3ca840413cdb7
                  MATRIX: 1042->1|1178->66|1223->64|1250->82|1277->84|1324->123|1374->136|1402->138|1896->605|1911->611|1961->640|3291->1943|3306->1949|3356->1978|3396->1991|3412->1997|3471->2034|3624->2160|3639->2166|3689->2195|3729->2208|3745->2214|3804->2251|3959->2379|3974->2385|4025->2415|4066->2428|4082->2434|4141->2471|5301->3604|5316->3610|5370->3643|7518->5763|7534->5769|7596->5808|11900->10084|11916->10090|11973->10124|14114->12237|14130->12243|14187->12277|16029->14091|16045->14097|16107->14136|20138->18139|20154->18145|20211->18179|21996->19936|22012->19942|22069->19976|23459->21338|23475->21344|23532->21378|25019->22837|25035->22843|25097->22882|27796->25553|27812->25559|27899->25635|27941->25637|28003->25671|28019->25677|28079->25727|28148->25756|28206->25785|28260->25811|28281->25822|28327->25846|28387->25877|28412->25879|28444->25882|28483->25899|28519->25924|28561->25926|28619->25955|28663->25971|28684->25982|28731->26007|28775->26019|28837->26049|28898->26081|28974->26129|29036->26174|29077->26176|29139->26209|29181->26223|29196->26228|29237->26247|29307->26285|29374->26324|29390->26330|29452->26382|29521->26411|29579->26440|29633->26466|29654->26477|29696->26497|29759->26531|29784->26533|29816->26536|29855->26553|29891->26578|29933->26580|29991->26609|30035->26625|30056->26636|30099->26657|30143->26669|30205->26699|30266->26731|30342->26779|30400->26820|30441->26822|30503->26855|30545->26869|30560->26874|30601->26893|30671->26931|30742->26974|30758->26980|30804->27016|30873->27045|30931->27074|31035->27150|31067->27172|31094->27177|31130->27184|31155->27186|31235->27237|31271->27262|31303->27264|31325->27275|31374->27299|31482->27375|31540->27404|31616->27452|31676->27495|31717->27497|31779->27530|31821->27544|31836->27549|31877->27568|31947->27606|32133->27764|32148->27769|32185->27784|32250->27821|32291->27852|32332->27854|32390->27883|32521->27986|32576->28024|32617->28026|32679->28059|32711->28063|32726->28068|32767->28087|32833->28125|32891->28166|32932->28168|32994->28201|33026->28205|33041->28210|33082->28229|33152->28267|33218->28301|33280->28334|33381->28403|33443->28433|33503->28464|33896->28829|33912->28835|33960->28861|35383->30258|35418->30283|35458->30284|35500->30298|35516->30304|35591->30356|35636->30368|36047->30751|36063->30757|36134->30806|36224->30868|36240->30874|36324->30936|36859->31443|36875->31449|36942->31494
                  LINES: 30->1|33->2|36->1|37->3|38->4|38->4|38->4|40->6|49->15|49->15|49->15|81->47|81->47|81->47|81->47|81->47|81->47|85->51|85->51|85->51|85->51|85->51|85->51|89->55|89->55|89->55|89->55|89->55|89->55|127->93|127->93|127->93|185->151|185->151|185->151|235->201|235->201|235->201|268->234|268->234|268->234|299->265|299->265|299->265|350->316|350->316|350->316|373->339|373->339|373->339|395->361|395->361|395->361|418->384|418->384|418->384|508->474|508->474|508->474|508->474|513->479|513->479|513->479|513->479|514->480|514->480|514->480|514->480|514->480|514->480|514->480|514->480|514->480|514->480|515->481|515->481|515->481|515->481|515->481|516->482|520->486|521->487|521->487|521->487|522->488|522->488|522->488|522->488|523->489|527->493|527->493|527->493|527->493|528->494|528->494|528->494|528->494|528->494|528->494|528->494|528->494|528->494|528->494|529->495|529->495|529->495|529->495|529->495|530->496|534->500|535->501|535->501|535->501|536->502|536->502|536->502|536->502|537->503|545->511|545->511|545->511|545->511|546->512|547->513|547->513|547->513|547->513|547->513|547->513|547->513|547->513|547->513|547->513|549->515|550->516|551->517|551->517|551->517|552->518|552->518|552->518|552->518|553->519|559->525|559->525|559->525|561->527|561->527|561->527|562->528|564->530|564->530|564->530|565->531|565->531|565->531|565->531|566->532|566->532|566->532|567->533|567->533|567->533|567->533|568->534|569->535|570->536|572->538|573->539|576->542|580->546|580->546|580->546|626->592|626->592|626->592|626->592|626->592|626->592|626->592|656->622|656->622|656->622|659->625|659->625|659->625|669->635|669->635|669->635
                  -- GENERATED --
              */
          