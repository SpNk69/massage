
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
            <img src='"""),_display_(/*93.24*/routes/*93.30*/.Assets.at("images/img/Vida-Polescuk.jpg")),format.raw/*93.72*/("""' class="img-circle" alt="Vida Polescuk" id="what">


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
                        Manuelle Lymphdrainagemassage
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
                            <div id="limfo" class="collapse customWidth">      <p class="massageText ">Es ist eine sichere effektive Möglichkeit, die Gesundheit zu fördern und zu pflegen Wohlbefinden . Bei gesunden Menschen - es ist eine vorbeugende Maßnahme normalen Stoffwechsel aufrecht zu erhalten. Während der Massage aktiviert die Regeneration geschädigter Weichgewebe, entzündliche Prozesse zu verlangsamen, stärkt das Immunsystem, verbessert die Sauerstoffversorgung der Gewebe. Dies hilft, überschüssige Flüssigkeit aus dem Gewebe und Organe zu beseitigen.</br>
                                Lymphdrainage ist geeignet für diejenigen, die die Schwellung der Beine fühlen, Schwellungen oder einfach Müdigkeit. Nach einem langen Tag, er entspannt müde Beine und gibt ein Gefühl von Leichtigkeit. Es eignet sich auch für Menschen, deren Füße sind immer kalt.</br>
                                Diese Massage ist für Frauen und Männer.</br>
                                Für die Behandlung - empfiehlt jeden Tag, für die Prävention - 2-3 mal pro Woche.</br>
                                Der gewünschte Effekt wird nach 15 Prozeduren erreicht.
                            </p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo2" >
                                Manuelle Lymphdrainage Gesicht
                            </button>
                            <div id="limfo2" class="collapse customWidth"><p class="massageText ">Gesichts Lymphdrainage  ist eine Technik der manuellen Therapie, es handelt sich um eine sanfte, und langsame Massage in Richtung der Lymphknoten zur Beseitigung der Giftstoffe auf natürliche Weise, durch die Bewegung der  Haut. Giftstoffe werden dann mobilisiert.</br>

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
                        Teilkörpermassagen
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




                        </div>
                    </div>
                    <p></p>
                </div>


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#vyresnio">Massage für ältere Menscher
                    </button>
                    <p></p>
                    <div id="vyresnio" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*312.67*/routes/*312.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*312.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*335.67*/routes/*335.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*335.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*357.67*/routes/*357.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*357.107*/("""' class="img-circle"
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
                        Anti-Cellulite massage
                    </button>
                    <p></p>
                    <div id="anticeliulitinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*380.67*/routes/*380.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*380.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">


                           <p class="massageText customWidth">Dies ist eine besonders effektive Möglichkeit zur Bekämpfung von Cellulite, die verwendet wird, uneben subkutanes (Cellulite) Probleme in spezifischen Problembereichen zu reduzieren - Oberschenkel, Gesäß und Bauch.
                                     </br> Massage stimuliert die Zirkulation der Lymphe, erhöht Muskeltonus und Kontraktion durch die Reduzierung von Cellulite und Schwellungen. Löscht den Körper von Toxinen und hat eine ausgeprägte kosmetische Wirkung.
                               </br> Dies ist die kleinste Methode - verlässt keine Prellungen.</br> Der tibetische Vakuum Cup wird verwendet. </p></div>





                        </div>
                    </div>





                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#thaipedu" >
                        Entspannende Fussmassage
                    </button>
                    <p></p>
                    <div id="thaipedu" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*409.67*/routes/*409.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*409.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
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

</section >


<section id="galerie" class="content-section text-center">
    <div class="row">

        <div class="col-md-8 col-md-offset-2">
            <hr>
            <h2>Galerie</h2>
            <hr>

            <p></p>


            <div class="col-lg-4 ">
                <a href=""""),_display_(/*456.27*/routes/*456.33*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*456.73*/(""""> <img src=""""),_display_(/*456.87*/routes/*456.93*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*456.133*/("""" class="w3-image w3-round" alt="Vida Massagebett im Zimmer" ></a>
            </div>

            <p></p>
            <div class="col-lg-4 ">
                <a href=""""),_display_(/*461.27*/routes/*461.33*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*461.77*/(""""> <img src=""""),_display_(/*461.91*/routes/*461.97*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*461.141*/("""" class="w3-image w3-round" alt="Hot and Cold Stone Massage" ></a>
            </div>
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*466.27*/routes/*466.33*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*466.72*/(""""> <img src=""""),_display_(/*466.86*/routes/*466.92*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*466.131*/("""" class="w3-image w3-round" alt="Steine und Öle für die Massage in Vido verwendet" ></a>
            </div>


        </div>
    </div>
    <div class="row">

        <div class="col-md-8 col-md-offset-2">
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*478.27*/routes/*478.33*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*478.74*/(""""> <img src=""""),_display_(/*478.88*/routes/*478.94*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*478.135*/("""" class="w3-image w3-round" alt="Vida Massagebett" ></a>
            </div>
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*483.27*/routes/*483.33*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*483.84*/(""""> <img src=""""),_display_(/*483.98*/routes/*483.104*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*483.155*/("""" class="w3-image w3-round" alt="verwendet tibetischen Vakuumbecher und Öl" ></a>
            </div>
            <p></p>

            <div class="col-lg-4 ">
                <a href=""""),_display_(/*488.27*/routes/*488.33*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*488.71*/(""""> <img src=""""),_display_(/*488.85*/routes/*488.91*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*488.129*/("""" class="w3-image w3-round" alt="Buddha" ></a>
            </div>
            <p></p>




        </div>




    </div>
    <a href="#preise" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
</div>
</section>



<section  class="content-section text-center">
    <div class="contact-section " id="preise">
        <div class="row" >
        <div class="col-md-8 col-md-offset-2 ">
            <div class="">
                    <hr>
                    <h2>Preise</h2>
                    <hr>


                    <div class="w3-container customBackGroundOfDiv">

                        <p></p>
                        <h5 align="center" ><u>Spa Massagen</u></h5>

                        <table class="table table-inverse">
                            <th scope="row" id="ulo"><u></u></th>
                            <td><b><u>Dauer</u></b></td>
                            <td><b><u>Preis</u></b></td>
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
                                <th scope="row" id="ulo2">Manuelle  Lymphdrainagemassage Körper</th>
                                <td>90 min.</td>

                                <td>140 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Manuelle  Lymphdrainagemassage Gesicht</th>
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
                                <th scope="row" id="ulo2">Entspannende Ganzkörpermassagе </th>
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



                        <h5 align="center"><b><u>Andere Massagen</u></b></h5>

                        <table class="table table-inverse">
                            <th scope="row" id="ulo"><u>TEILKÖRPERMASSAGE</u> </th>
                            <td><b><u>30min</u></b></td>
                            <td><b><u>60min</u></b></td>
                            <td><b><u>90min</u></b></td>
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



                            <th scope="row"><b><u id="ulo">Anti-Cellulite Handmassage mit Tibetische Lehm Cup:</u> </b></th>
                            <td><b><u>30min</u></b></td>
                            <td><b><u>60min</u></b></td>
                            <td><b><u>90min</u></b></td>
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


                            <th scope="row" id="ulo"><b><u>Massage für Menschen (ab 65 Jahre alt)<u></b></th>
                            <td><b><u></u></b></td>
                            <td><b><u>Preis</u></b></td>

                            <td><b><u></u></b></td>
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



                        <h5 align="center"><b><u>Geschenkgutscheine</u></b></h5>

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
    <a href="#fragen" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
        </div>
</section>



<section id="fragen" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-12 ">
            <div class="">
                <div class="container">

                    <h2>Stellen Sie Ihre Frage!</h2>
                    <p></p>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">




                            """),_display_(/*770.30*/helper/*770.36*/.form(action = routes.HomeController.submitDE(),'class -> "form-horizontal")/*770.112*/ {_display_(Seq[Any](format.raw/*770.114*/("""




                            """),_display_(/*775.30*/helper/*775.36*/.input(contactForm("Name"),'class->"form-control")/*775.86*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*775.115*/("""
                            """),format.raw/*776.29*/("""<input type="text" name=""""),_display_(/*776.55*/contactForm/*776.66*/.field("firstName").name),format.raw/*776.90*/(""""  placeholder="Ihr Name" id=""""),_display_(/*776.121*/id),format.raw/*776.123*/("""" """),_display_(/*776.126*/toHtmlArgs(args)),_display_(/*776.143*/if(contactForm.hasErrors)/*776.168*/ {_display_(Seq[Any](format.raw/*776.170*/("""
                            """),format.raw/*777.29*/("""<option value='"""),_display_(/*777.45*/contactForm/*777.56*/.field("firstName").value),format.raw/*777.81*/("""'></option>""")))}),format.raw/*777.93*/("""
                            """)))}),format.raw/*778.30*/("""



                            """),format.raw/*782.29*/("""<div id="xxx">
                                """),_display_(/*783.34*/for(error <- contactForm("firstName").errors) yield /*783.79*/ {_display_(Seq[Any](format.raw/*783.81*/("""
                                """),format.raw/*784.33*/("""<p id="xxxx">"""),_display_(/*784.47*/error/*784.52*/.format(messages())),format.raw/*784.71*/("""</p>
                                """)))}),format.raw/*785.34*/("""</div>



                            """),_display_(/*789.30*/helper/*789.36*/.input(contactForm("E-Mail"),'class->"form-control")/*789.88*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*789.117*/("""
                            """),format.raw/*790.29*/("""<input type="text" name=""""),_display_(/*790.55*/contactForm/*790.66*/.field("email").name),format.raw/*790.86*/(""""  placeholder="Ihre E-Mail" id=""""),_display_(/*790.120*/id),format.raw/*790.122*/("""" """),_display_(/*790.125*/toHtmlArgs(args)),_display_(/*790.142*/if(contactForm.hasErrors)/*790.167*/ {_display_(Seq[Any](format.raw/*790.169*/("""
                            """),format.raw/*791.29*/("""<option value='"""),_display_(/*791.45*/contactForm/*791.56*/.field("email").value),format.raw/*791.77*/("""'></option>""")))}),format.raw/*791.89*/("""
                            """)))}),format.raw/*792.30*/("""



                            """),format.raw/*796.29*/("""<div id="xxx">
                                """),_display_(/*797.34*/for(error <- contactForm("email").errors) yield /*797.75*/ {_display_(Seq[Any](format.raw/*797.77*/("""
                                """),format.raw/*798.33*/("""<p id="xxxx">"""),_display_(/*798.47*/error/*798.52*/.format(messages())),format.raw/*798.71*/("""</p>
                                """)))}),format.raw/*799.34*/("""</div>







                            """),_display_(/*807.30*/helper/*807.36*/.input(field = contactForm("Frage"))/*807.72*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*807.101*/("""
                            """),format.raw/*808.29*/("""<div>
                                <textarea class="form-control" name=""""),_display_(/*809.71*/contactForm("textbox")/*809.93*/.name),format.raw/*809.98*/("""" id=""""),_display_(/*809.105*/id),format.raw/*809.107*/("""" placeholder="Ihre Nachricht" rows='5' cols='80'>"""),_display_(/*809.158*/if(contactForm.hasErrors)/*809.183*/{_display_(_display_(/*809.185*/contactForm/*809.196*/.field("textbox").value))}),format.raw/*809.220*/("""</textarea>
                            </div>
                            """)))}),format.raw/*811.30*/("""
                            """),format.raw/*812.29*/("""<div id="xxx">
                                """),_display_(/*813.34*/for(error <- contactForm("textbox").errors) yield /*813.77*/ {_display_(Seq[Any](format.raw/*813.79*/("""
                                """),format.raw/*814.33*/("""<p id="xxxx">"""),_display_(/*814.47*/error/*814.52*/.format(messages())),format.raw/*814.71*/("""</p>
                                """)))}),format.raw/*815.34*/("""</div>



                            <button type="submit"  class="btn btn-default" >Nachricht senden</button>

                            <div id="flash">"""),_display_(/*821.46*/flash/*821.51*/.get("success")),format.raw/*821.66*/("""</div>

                            """),_display_(/*823.30*/if(contactForm.hasGlobalErrors)/*823.61*/ {_display_(Seq[Any](format.raw/*823.63*/("""
                            """),format.raw/*824.29*/("""<div id="xxx">
                                <p class="error" >
                                    """),_display_(/*826.38*/for(error <- contactForm.globalErrors) yield /*826.76*/ {_display_(Seq[Any](format.raw/*826.78*/("""
                                """),format.raw/*827.33*/("""<p>"""),_display_(/*827.37*/error/*827.42*/.format(messages())),format.raw/*827.61*/("""</p>
                                """),_display_(/*828.34*/for(error <- contactForm("email").errors) yield /*828.75*/ {_display_(Seq[Any](format.raw/*828.77*/("""
                                """),format.raw/*829.33*/("""<p>"""),_display_(/*829.37*/error/*829.42*/.format(messages())),format.raw/*829.61*/("""</p>
                                """)))}),format.raw/*830.34*/("""
                                """)))}),format.raw/*831.34*/("""
                                """),format.raw/*832.33*/("""</p>
                            </div>
                            """)))}),format.raw/*834.30*/("""
                            """)))}),format.raw/*835.30*/("""


                            """),format.raw/*838.29*/("""<p></p>
                            <h3>Unsere sozialen Netzwerke</h3>
                            <ul class="list-inline banner-social-buttons">
                                <li><a href=""""),_display_(/*841.47*/routes/*841.53*/.HomeController.toFaceBook),format.raw/*841.79*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
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
            <div class="col-lg-12 price-section2">
                <p></p>
                <h2>Kontaktinformation</h2>
                <p style="color:#fff;">
                    <strong><i class="fa fa-map-marker"></i> Adresse</strong><br>
                    ---
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
    """),_display_(/*886.6*/if(contactForm.hasErrors)/*886.31*/{_display_(Seq[Any](format.raw/*886.32*/("""<script src=""""),_display_(/*886.46*/routes/*886.52*/.Assets.at("javascripts/js/returnToFormOnFailDE.js")),format.raw/*886.104*/(""""></script>""")))}),format.raw/*886.116*/("""</script>

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
<script src='"""),_display_(/*916.15*/routes/*916.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*916.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*919.15*/routes/*919.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*919.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
<script type="text/javascript"
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBtkVXlKJlSvm85a7oRDMLw4ZOZaxYwKxM&sensor=false"></script>

<!-- Theme JavaScript -->
<script src='"""),_display_(/*929.15*/routes/*929.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*929.66*/("""'></script>

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
                  SOURCE: /home/alex/git/web/app/views/germanContent.scala.html
                  HASH: f8c62334e16b4af4cc269b571a51821057ac4afc
                  MATRIX: 1042->1|1178->66|1223->64|1250->82|1277->84|1324->123|1374->136|1402->138|1896->605|1911->611|1961->640|3291->1943|3306->1949|3356->1978|3396->1991|3412->1997|3471->2034|3624->2160|3639->2166|3689->2195|3729->2208|3745->2214|3804->2251|3959->2379|3974->2385|4025->2415|4066->2428|4082->2434|4141->2471|5301->3604|5316->3610|5379->3652|7532->5777|7548->5783|7610->5822|11892->10076|11908->10082|11965->10116|14106->12229|14122->12235|14179->12269|16012->14074|16028->14080|16090->14119|19477->17478|19493->17484|19550->17518|21335->19275|21351->19281|21408->19315|22798->20677|22814->20683|22871->20717|24354->22172|24370->22178|24432->22217|25897->23654|25913->23660|25975->23699|27210->24906|27226->24912|27288->24952|27330->24966|27346->24972|27409->25012|27606->25181|27622->25187|27688->25231|27730->25245|27746->25251|27813->25295|28010->25464|28026->25470|28087->25509|28129->25523|28145->25529|28207->25568|28524->25857|28540->25863|28603->25904|28645->25918|28661->25924|28725->25965|28912->26124|28928->26130|29001->26181|29043->26195|29060->26201|29134->26252|29346->26436|29362->26442|29422->26480|29464->26494|29480->26500|29541->26538|38882->35851|38898->35857|38985->35933|39027->35935|39089->35969|39105->35975|39165->36025|39234->36054|39292->36083|39346->36109|39367->36120|39413->36144|39473->36175|39498->36177|39530->36180|39569->36197|39605->36222|39647->36224|39705->36253|39749->36269|39770->36280|39817->36305|39861->36317|39923->36347|39984->36379|40060->36427|40122->36472|40163->36474|40225->36507|40267->36521|40282->36526|40323->36545|40393->36583|40460->36622|40476->36628|40538->36680|40607->36709|40665->36738|40719->36764|40740->36775|40782->36795|40845->36829|40870->36831|40902->36834|40941->36851|40977->36876|41019->36878|41077->36907|41121->36923|41142->36934|41185->36955|41229->36967|41291->36997|41352->37029|41428->37077|41486->37118|41527->37120|41589->37153|41631->37167|41646->37172|41687->37191|41757->37229|41828->37272|41844->37278|41890->37314|41959->37343|42017->37372|42121->37448|42153->37470|42180->37475|42216->37482|42241->37484|42321->37535|42357->37560|42389->37562|42411->37573|42460->37597|42568->37673|42626->37702|42702->37750|42762->37793|42803->37795|42865->37828|42907->37842|42922->37847|42963->37866|43033->37904|43219->38062|43234->38067|43271->38082|43336->38119|43377->38150|43418->38152|43476->38181|43607->38284|43662->38322|43703->38324|43765->38357|43797->38361|43812->38366|43853->38385|43919->38423|43977->38464|44018->38466|44080->38499|44112->38503|44127->38508|44168->38527|44238->38565|44304->38599|44366->38632|44467->38701|44529->38731|44589->38762|44809->38954|44825->38960|44873->38986|46104->40191|46139->40216|46179->40217|46221->40231|46237->40237|46312->40289|46357->40301|46768->40684|46784->40690|46855->40739|46945->40801|46961->40807|47045->40869|47580->41376|47596->41382|47663->41427
                  LINES: 30->1|33->2|36->1|37->3|38->4|38->4|38->4|40->6|49->15|49->15|49->15|81->47|81->47|81->47|81->47|81->47|81->47|85->51|85->51|85->51|85->51|85->51|85->51|89->55|89->55|89->55|89->55|89->55|89->55|127->93|127->93|127->93|185->151|185->151|185->151|235->201|235->201|235->201|268->234|268->234|268->234|299->265|299->265|299->265|346->312|346->312|346->312|369->335|369->335|369->335|391->357|391->357|391->357|414->380|414->380|414->380|443->409|443->409|443->409|490->456|490->456|490->456|490->456|490->456|490->456|495->461|495->461|495->461|495->461|495->461|495->461|500->466|500->466|500->466|500->466|500->466|500->466|512->478|512->478|512->478|512->478|512->478|512->478|517->483|517->483|517->483|517->483|517->483|517->483|522->488|522->488|522->488|522->488|522->488|522->488|804->770|804->770|804->770|804->770|809->775|809->775|809->775|809->775|810->776|810->776|810->776|810->776|810->776|810->776|810->776|810->776|810->776|810->776|811->777|811->777|811->777|811->777|811->777|812->778|816->782|817->783|817->783|817->783|818->784|818->784|818->784|818->784|819->785|823->789|823->789|823->789|823->789|824->790|824->790|824->790|824->790|824->790|824->790|824->790|824->790|824->790|824->790|825->791|825->791|825->791|825->791|825->791|826->792|830->796|831->797|831->797|831->797|832->798|832->798|832->798|832->798|833->799|841->807|841->807|841->807|841->807|842->808|843->809|843->809|843->809|843->809|843->809|843->809|843->809|843->809|843->809|843->809|845->811|846->812|847->813|847->813|847->813|848->814|848->814|848->814|848->814|849->815|855->821|855->821|855->821|857->823|857->823|857->823|858->824|860->826|860->826|860->826|861->827|861->827|861->827|861->827|862->828|862->828|862->828|863->829|863->829|863->829|863->829|864->830|865->831|866->832|868->834|869->835|872->838|875->841|875->841|875->841|920->886|920->886|920->886|920->886|920->886|920->886|920->886|950->916|950->916|950->916|953->919|953->919|953->919|963->929|963->929|963->929
                  -- GENERATED --
              */
          