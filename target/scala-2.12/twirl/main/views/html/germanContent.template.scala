
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
                    <a class="page-scroll" href='"""),_display_(/*47.51*/routes/*47.57*/.HomeController.germanVersion),format.raw/*47.86*/("""'><img src='"""),_display_(/*47.99*/routes/*47.105*/.Assets.at("images/img/flag-de2.png")),format.raw/*47.142*/("""' class="flag flag-lt" alt="German" /></a>
                </li>

                <li>
                    <a class="page-scroll" href='"""),_display_(/*51.51*/routes/*51.57*/.HomeController.pagrindinisLT),format.raw/*51.86*/("""'><img src='"""),_display_(/*51.99*/routes/*51.105*/.Assets.at("images/img/flag-lt2.png")),format.raw/*51.142*/("""' class="flag flag-lt" alt="Lithuanian" /></a>
                </li>

                <li>
                    <a class="page-scroll" href=""""),_display_(/*55.51*/routes/*55.57*/.HomeController.russianVersion),format.raw/*55.87*/(""""><img src='"""),_display_(/*55.100*/routes/*55.106*/.Assets.at("images/img/flag-rus.png")),format.raw/*55.143*/("""' class="flag flag-lt" alt="Russian" /></a>
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
    <a href="#uber" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
</header>



<!-- About Section -->
<section id="uber" class="container content-section text-center">
    <div class="row">

        <div class="col-lg-6 ">
            <img src='"""),_display_(/*96.24*/routes/*96.30*/.Assets.at("images/img/as2.jpg")),format.raw/*96.62*/("""' class="img-circle" alt="Medicine massage" height="600">

        </div>
        <div class="col-lg-6 ">

            <h2 align="center"><u>Bildung</u></h2>
            <ul>
                <li>Vilnius Höhere Medizinische Fakultät Litauen.</li>
                <li> Klaipeda Universität. Bachelor Öffentliches Gesundheitswesen verliehen. Litauen.</li>
                <li> 2010 - "Baltic SPA Profi" Kurse (Lettland), Wellness-Massagen.</li>
                <li>2012 - Zentrum für Entwicklung und Spezialisierung des Pflegepersonals.</li>
                <li>   Zertifikat Nr 120146 KV - das Recht hat therapeutische Massage zu machen.</li>
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
                <li>Hot-Cold Stone Massage</li>
                <li>Lymphdrainage Massage</li>
                <li>Thai Fußmassage</li>
                <li>Traditionelle Ayurveda-Massage</li>
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
        <h2 id="vienas">Sveikatą gerinantys masažai</h2>
        <div class="container">

            <div class="row">

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#limfodrenazinis">
                        Lymphdrainage massage
                    </button>
                    <p></p>
                    <div id="limfodrenazinis" class="collapse">
                        <!--<div class="text-center"><img src='"""),_display_(/*152.65*/routes/*152.71*/.Assets.at("images/img/massage164.jpg")),format.raw/*152.110*/("""'
                                                      class="img-circle" alt="Medicine massage" width="250"
                                                      height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">



                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo" >
                                Lymphdrainage Körpermassage
                            </button>
                            <div id="limfo" class="collapse customWidth">      <p class="massageText customWidth">Die wichtigsten Eigenschaften der ätherischen Öle
                                ÄtherischeÖle sind besondere Kostbarkeiten, die uns die Natur schenkt. Sie
                                enthalten die Lebenskraft der Pflanzen in konzentrierter Form. Faktoren wie Stress,
                                Hektik und negative Emotionen vermindern unsere Lebensqualität. Die anregenden
                                und wohlriechenden Düfte von naturreinen ätherischen Ölen können diese Faktoren
                                lindern und wirken sich harmonisierend auf Körper und Geist.
                            </p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo2" >
                                Lymphdrainage Gesichtsmassage
                            </button>
                            <div id="limfo2" class="collapse customWidth"><p class="massageText">Tekstas</p> </div>

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
                        <!--  <div class="text-center"><img src='"""),_display_(/*189.67*/routes/*189.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*189.107*/("""' class="img-circle"
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


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#segmentinis">Klassisch
                        Segmentale Rückenmassage
                    </button>
                    <p></p>
                    <div id="segmentinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*223.67*/routes/*223.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*223.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth">Entspannt verspannte Rückenmuskeln, verbessert die Gewebestruktur, unterstützt eine bessere Körperhaltung, lindert Entzündungen der Nervenwurzeln (Radikulitis), z.B. nach einem chirurgischen Eingriff an der Wirbelsäule.</p>


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
                        <!--  <div class="text-center"><img src='"""),_display_(/*248.67*/routes/*248.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*248.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#galva" >
                                Kopfmassage
                            </button>
                            <div id="galva" class="collapse customWidth"><p class="massageText">Entspannt bei Stress, lindert Krämpfe, verbessert den Blutkreislauf.</p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#peciai" >
                                Schulterhalsmassage
                            </button>
                            <div id="peciai" class="collapse customWidth"><p class="massageText">Die effektivste Behandlung, sowie ein Heilmittel für die Beseitigung von unangenehmen Symptomen. Nach der ersten Massage des Halses, fühlen Sie eine allgemeine Verbesserung in Ihrem Gesundheitszustand. Nach einem vollen Massagen verschwinden schmerzhafte Empfindungen, die Arbeitskapazität steigt, Schlaflosigkeit und Reizbarkeit verschwinden. Nackenmassage ist ein ausgezeichnetes Werkzeug, um Kopfschmerzen loszuwerden.</p> </div>




                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#krutines" >
                                Brustmassage
                            </button>
                            <div id="krutines" class="collapse customWidth"><p class="massageText">Reduziert die Spannung der Brust, sowie reduziert Infektionen der Atemwege (Bronchitis, Grippe, Asthma und so weiter.).</p> </div>


                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pilvo" >
                                Bauchmassage
                            </button>
                            <div id="pilvo" class="collapse customWidth"><p class="massageText">regt die Verdauung an, wirkt sich positiv auf die intra-abdominalen Organe aus, verbessert Magen- und Darmfunktionen sowie die Gallensekretion, hilft bei Verstopfung oder Gasansammlung im Darm</p></div>


                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#juosmens" >
                                Lendenwirbelmassage
                            </button>
                            <div id="juosmens" class="collapse customWidth"><p class="massageText">Reduziert Schmerzen nach einem operativen Eingriff, verbessert den Blutkreislauf, lindert Entzündungen der Nervenwurzeln.</p></div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pedu" >
                                Beinmassage
                            </button>
                            <div id="pedu" class="collapse customWidth"><p class="massageText">Tekstas</p></div>



                        </div>
                    </div>
                    <p></p>
                </div>


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#vyresnio">Masažas vyresnio amžiaus žmonėms
                    </button>
                    <p></p>
                    <div id="vyresnio" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*302.67*/routes/*302.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*302.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Masažas yra būtina ir labai naudinga procedūra pagyvenusiems žmonėms, pensininkams. Tyrimai parodė, kad masažas lėtina senėjimo procesą. Taip pat masažas veikia raminančiai visą organizmą ir gali sumažinti skausmus. Masažas gali padėti žmonėms, kenčiantiems raumenų skausmus ar sergantiems atritu. Kada žmogus kenčia, jis tampa vis mažiau aktyvus, nukenčia gyvenimo kokybė ir sveikata. Masažas gerina kraujotaką,  pašalina raumenų nuovargį ir raumenys įgauna tonusą. Dėl to pagerėja pagyvenusio žmogaus gyvenimo kokybė.
                                </br>Prieš masažą Jums gerai būtų pasikonsultuoti su savo gydytoju. Kai tik gausite gydytojo leidimą masažui, jus drąsiai galite kreiptis pas mane.  </p>


                        </div>
                    </div>
                    <p></p>
                </div>



                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#atpalaiduojantis">Ganzkörpermassage
                    </button>
                    <p></p>
                    <div id="atpalaiduojantis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*324.67*/routes/*324.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*324.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Entspannt Körper und Geist, lindert Stress und Nervosität, stärkt das Immunsystem, reduziert Muskelkrämpfe und chronische Verspannungen, lindert Schmerzen, verbessert den Lymphfluss, wirkt sich positiv auf die allgemeine Gesundheit aus</p>

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
                        <!--  <div class="text-center"><img src='"""),_display_(/*345.67*/routes/*345.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*345.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*367.67*/routes/*367.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*367.112*/("""'
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




                            """),_display_(/*469.30*/helper/*469.36*/.form(action = routes.HomeController.submitDE(),'class -> "form-horizontal")/*469.112*/ {_display_(Seq[Any](format.raw/*469.114*/("""




                            """),_display_(/*474.30*/helper/*474.36*/.input(contactForm("Name"),'class->"form-control")/*474.86*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*474.115*/("""
                            """),format.raw/*475.29*/("""<input type="text" name=""""),_display_(/*475.55*/contactForm/*475.66*/.field("firstName").name),format.raw/*475.90*/(""""  placeholder="Ihr Name" id=""""),_display_(/*475.121*/id),format.raw/*475.123*/("""" """),_display_(/*475.126*/toHtmlArgs(args)),_display_(/*475.143*/if(contactForm.hasErrors)/*475.168*/ {_display_(Seq[Any](format.raw/*475.170*/("""
                            """),format.raw/*476.29*/("""<option value='"""),_display_(/*476.45*/contactForm/*476.56*/.field("firstName").value),format.raw/*476.81*/("""'></option>""")))}),format.raw/*476.93*/("""
                            """)))}),format.raw/*477.30*/("""



                            """),format.raw/*481.29*/("""<div id="xxx">
                                """),_display_(/*482.34*/for(error <- contactForm("firstName").errors) yield /*482.79*/ {_display_(Seq[Any](format.raw/*482.81*/("""
                                """),format.raw/*483.33*/("""<p id="xxxx">"""),_display_(/*483.47*/error/*483.52*/.format(messages())),format.raw/*483.71*/("""</p>
                                """)))}),format.raw/*484.34*/("""</div>



                            """),_display_(/*488.30*/helper/*488.36*/.input(contactForm("E-Mail"),'class->"form-control")/*488.88*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*488.117*/("""
                            """),format.raw/*489.29*/("""<input type="text" name=""""),_display_(/*489.55*/contactForm/*489.66*/.field("email").name),format.raw/*489.86*/(""""  placeholder="Ihre E-Mail" id=""""),_display_(/*489.120*/id),format.raw/*489.122*/("""" """),_display_(/*489.125*/toHtmlArgs(args)),_display_(/*489.142*/if(contactForm.hasErrors)/*489.167*/ {_display_(Seq[Any](format.raw/*489.169*/("""
                            """),format.raw/*490.29*/("""<option value='"""),_display_(/*490.45*/contactForm/*490.56*/.field("email").value),format.raw/*490.77*/("""'></option>""")))}),format.raw/*490.89*/("""
                            """)))}),format.raw/*491.30*/("""



                            """),format.raw/*495.29*/("""<div id="xxx">
                                """),_display_(/*496.34*/for(error <- contactForm("email").errors) yield /*496.75*/ {_display_(Seq[Any](format.raw/*496.77*/("""
                                """),format.raw/*497.33*/("""<p id="xxxx">"""),_display_(/*497.47*/error/*497.52*/.format(messages())),format.raw/*497.71*/("""</p>
                                """)))}),format.raw/*498.34*/("""</div>







                            """),_display_(/*506.30*/helper/*506.36*/.input(field = contactForm("Frage"))/*506.72*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*506.101*/("""
                            """),format.raw/*507.29*/("""<div>
                                <textarea class="form-control" name=""""),_display_(/*508.71*/contactForm("textbox")/*508.93*/.name),format.raw/*508.98*/("""" id=""""),_display_(/*508.105*/id),format.raw/*508.107*/("""" placeholder="Ihre Nachricht" rows='5' cols='80'>"""),_display_(/*508.158*/if(contactForm.hasErrors)/*508.183*/{_display_(_display_(/*508.185*/contactForm/*508.196*/.field("textbox").value))}),format.raw/*508.220*/("""</textarea>
                            </div>
                            """)))}),format.raw/*510.30*/("""
                            """),format.raw/*511.29*/("""<div id="xxx">
                                """),_display_(/*512.34*/for(error <- contactForm("textbox").errors) yield /*512.77*/ {_display_(Seq[Any](format.raw/*512.79*/("""
                                """),format.raw/*513.33*/("""<p id="xxxx">"""),_display_(/*513.47*/error/*513.52*/.format(messages())),format.raw/*513.71*/("""</p>
                                """)))}),format.raw/*514.34*/("""</div>



                            <button type="submit"  class="btn btn-default" >Nachricht senden</button>

                            <div id="flash">"""),_display_(/*520.46*/flash/*520.51*/.get("success")),format.raw/*520.66*/("""</div>

                            """),_display_(/*522.30*/if(contactForm.hasGlobalErrors)/*522.61*/ {_display_(Seq[Any](format.raw/*522.63*/("""
                            """),format.raw/*523.29*/("""<div id="xxx">
                                <p class="error" >
                                    """),_display_(/*525.38*/for(error <- contactForm.globalErrors) yield /*525.76*/ {_display_(Seq[Any](format.raw/*525.78*/("""
                                """),format.raw/*526.33*/("""<p>"""),_display_(/*526.37*/error/*526.42*/.format(messages())),format.raw/*526.61*/("""</p>
                                """),_display_(/*527.34*/for(error <- contactForm("email").errors) yield /*527.75*/ {_display_(Seq[Any](format.raw/*527.77*/("""
                                """),format.raw/*528.33*/("""<p>"""),_display_(/*528.37*/error/*528.42*/.format(messages())),format.raw/*528.61*/("""</p>
                                """)))}),format.raw/*529.34*/("""
                                """)))}),format.raw/*530.34*/("""
                                """),format.raw/*531.33*/("""</p>
                            </div>
                            """)))}),format.raw/*533.30*/("""
                            """)))}),format.raw/*534.30*/("""


                            """),format.raw/*537.29*/("""<p></p>
                            <h3>Unsere sozialen Netzwerke</h3>
                            <ul class="list-inline banner-social-buttons">
                                <li><a href="www.google.com" class="btn btn-default btn-lg"><i class="fa fa-twitter"> <span class="network-name">Twitter</span></i></a></li>
                                <li><a href=""""),_display_(/*541.47*/routes/*541.53*/.HomeController.toFaceBook),format.raw/*541.79*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
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
                    Villenstrasse 35, Šafhauzenas, 8200, Schweiz
                </p>
                <p style="color:#fff;"><strong><i class="fa fa-phone"></i> Telefonnummer </strong><br>
                    +41 797897010</p>
                <p style="color:#fff;">
                    <strong><i class="fa fa-envelope"></i>  E-Mail</strong><br>
                    polescuk@gmail.com</p>
                <p></p>
            </div>
        </div>
    </div>
    """),_display_(/*587.6*/if(contactForm.hasErrors)/*587.31*/{_display_(Seq[Any](format.raw/*587.32*/("""<script src=""""),_display_(/*587.46*/routes/*587.52*/.Assets.at("javascripts/js/returnToFormOnFailDE.js")),format.raw/*587.104*/(""""></script>""")))}),format.raw/*587.116*/("""</script>

    <hr>
</section>





<section>
<!-- Map Section -->
<div id="map" class="text-center">
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
<script src='"""),_display_(/*617.15*/routes/*617.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*617.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*620.15*/routes/*620.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*620.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
<script type="text/javascript"
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBtkVXlKJlSvm85a7oRDMLw4ZOZaxYwKxM&sensor=false"></script>

<!-- Theme JavaScript -->
<script src='"""),_display_(/*630.15*/routes/*630.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*630.66*/("""'></script>

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
                  DATE: Sat Sep 23 20:14:56 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/germanContent.scala.html
                  HASH: 80ae7a309ac3bd5afb7f2ab020126430a4a88a76
                  MATRIX: 1042->1|1178->66|1223->64|1250->82|1277->84|1324->123|1374->136|1402->138|1896->605|1911->611|1961->640|3291->1943|3306->1949|3356->1978|3396->1991|3412->1997|3471->2034|3635->2171|3650->2177|3700->2206|3740->2219|3756->2225|3815->2262|3983->2403|3998->2409|4049->2439|4090->2452|4106->2458|4165->2495|5457->3760|5472->3766|5525->3798|7679->5924|7695->5930|7757->5969|9973->8157|9989->8163|10046->8197|12231->10354|12247->10360|12304->10394|13382->11444|13398->11450|13460->11489|17372->15373|17388->15379|17445->15413|18967->16907|18983->16913|19040->16947|20150->18029|20166->18035|20223->18069|21086->18904|21102->18910|21164->18949|24715->22472|24731->22478|24818->22554|24860->22556|24922->22590|24938->22596|24998->22646|25067->22675|25125->22704|25179->22730|25200->22741|25246->22765|25306->22796|25331->22798|25363->22801|25402->22818|25438->22843|25480->22845|25538->22874|25582->22890|25603->22901|25650->22926|25694->22938|25756->22968|25817->23000|25893->23048|25955->23093|25996->23095|26058->23128|26100->23142|26115->23147|26156->23166|26226->23204|26293->23243|26309->23249|26371->23301|26440->23330|26498->23359|26552->23385|26573->23396|26615->23416|26678->23450|26703->23452|26735->23455|26774->23472|26810->23497|26852->23499|26910->23528|26954->23544|26975->23555|27018->23576|27062->23588|27124->23618|27185->23650|27261->23698|27319->23739|27360->23741|27422->23774|27464->23788|27479->23793|27520->23812|27590->23850|27661->23893|27677->23899|27723->23935|27792->23964|27850->23993|27954->24069|27986->24091|28013->24096|28049->24103|28074->24105|28154->24156|28190->24181|28222->24183|28244->24194|28293->24218|28401->24294|28459->24323|28535->24371|28595->24414|28636->24416|28698->24449|28740->24463|28755->24468|28796->24487|28866->24525|29052->24683|29067->24688|29104->24703|29169->24740|29210->24771|29251->24773|29309->24802|29440->24905|29495->24943|29536->24945|29598->24978|29630->24982|29645->24987|29686->25006|29752->25044|29810->25085|29851->25087|29913->25120|29945->25124|29960->25129|30001->25148|30071->25186|30137->25220|30199->25253|30300->25322|30362->25352|30422->25383|30815->25748|30831->25754|30879->25780|32300->27175|32335->27200|32375->27201|32417->27215|32433->27221|32508->27273|32553->27285|32962->27666|32978->27672|33049->27721|33139->27783|33155->27789|33239->27851|33774->28358|33790->28364|33857->28409
                  LINES: 30->1|33->2|36->1|37->3|38->4|38->4|38->4|40->6|49->15|49->15|49->15|81->47|81->47|81->47|81->47|81->47|81->47|85->51|85->51|85->51|85->51|85->51|85->51|89->55|89->55|89->55|89->55|89->55|89->55|130->96|130->96|130->96|186->152|186->152|186->152|223->189|223->189|223->189|257->223|257->223|257->223|282->248|282->248|282->248|336->302|336->302|336->302|358->324|358->324|358->324|379->345|379->345|379->345|401->367|401->367|401->367|503->469|503->469|503->469|503->469|508->474|508->474|508->474|508->474|509->475|509->475|509->475|509->475|509->475|509->475|509->475|509->475|509->475|509->475|510->476|510->476|510->476|510->476|510->476|511->477|515->481|516->482|516->482|516->482|517->483|517->483|517->483|517->483|518->484|522->488|522->488|522->488|522->488|523->489|523->489|523->489|523->489|523->489|523->489|523->489|523->489|523->489|523->489|524->490|524->490|524->490|524->490|524->490|525->491|529->495|530->496|530->496|530->496|531->497|531->497|531->497|531->497|532->498|540->506|540->506|540->506|540->506|541->507|542->508|542->508|542->508|542->508|542->508|542->508|542->508|542->508|542->508|542->508|544->510|545->511|546->512|546->512|546->512|547->513|547->513|547->513|547->513|548->514|554->520|554->520|554->520|556->522|556->522|556->522|557->523|559->525|559->525|559->525|560->526|560->526|560->526|560->526|561->527|561->527|561->527|562->528|562->528|562->528|562->528|563->529|564->530|565->531|567->533|568->534|571->537|575->541|575->541|575->541|621->587|621->587|621->587|621->587|621->587|621->587|621->587|651->617|651->617|651->617|654->620|654->620|654->620|664->630|664->630|664->630
                  -- GENERATED --
              */
          