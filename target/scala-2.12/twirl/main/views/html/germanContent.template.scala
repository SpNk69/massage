
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
 </header>



<!-- About Section -->
<section id="uber" class="container content-section text-center">
    <div class="row">

        <div class="col-lg-6 ">
            <img src='"""),_display_(/*93.24*/routes/*93.30*/.Assets.at("images/img/as2.jpg")),format.raw/*93.62*/("""' class="img-circle" alt="Medicine massage" height="600">

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
                        <!--<div class="text-center"><img src='"""),_display_(/*149.65*/routes/*149.71*/.Assets.at("images/img/massage164.jpg")),format.raw/*149.110*/("""'
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*186.67*/routes/*186.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*186.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*220.67*/routes/*220.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*220.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*245.67*/routes/*245.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*245.112*/("""'
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*299.67*/routes/*299.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*299.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*321.67*/routes/*321.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*321.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*342.67*/routes/*342.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*342.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*364.67*/routes/*364.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*364.112*/("""'
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




                            """),_display_(/*466.30*/helper/*466.36*/.form(action = routes.HomeController.submitDE(),'class -> "form-horizontal")/*466.112*/ {_display_(Seq[Any](format.raw/*466.114*/("""




                            """),_display_(/*471.30*/helper/*471.36*/.input(contactForm("Name"),'class->"form-control")/*471.86*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*471.115*/("""
                            """),format.raw/*472.29*/("""<input type="text" name=""""),_display_(/*472.55*/contactForm/*472.66*/.field("firstName").name),format.raw/*472.90*/(""""  placeholder="Ihr Name" id=""""),_display_(/*472.121*/id),format.raw/*472.123*/("""" """),_display_(/*472.126*/toHtmlArgs(args)),_display_(/*472.143*/if(contactForm.hasErrors)/*472.168*/ {_display_(Seq[Any](format.raw/*472.170*/("""
                            """),format.raw/*473.29*/("""<option value='"""),_display_(/*473.45*/contactForm/*473.56*/.field("firstName").value),format.raw/*473.81*/("""'></option>""")))}),format.raw/*473.93*/("""
                            """)))}),format.raw/*474.30*/("""



                            """),format.raw/*478.29*/("""<div id="xxx">
                                """),_display_(/*479.34*/for(error <- contactForm("firstName").errors) yield /*479.79*/ {_display_(Seq[Any](format.raw/*479.81*/("""
                                """),format.raw/*480.33*/("""<p id="xxxx">"""),_display_(/*480.47*/error/*480.52*/.format(messages())),format.raw/*480.71*/("""</p>
                                """)))}),format.raw/*481.34*/("""</div>



                            """),_display_(/*485.30*/helper/*485.36*/.input(contactForm("E-Mail"),'class->"form-control")/*485.88*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*485.117*/("""
                            """),format.raw/*486.29*/("""<input type="text" name=""""),_display_(/*486.55*/contactForm/*486.66*/.field("email").name),format.raw/*486.86*/(""""  placeholder="Ihre E-Mail" id=""""),_display_(/*486.120*/id),format.raw/*486.122*/("""" """),_display_(/*486.125*/toHtmlArgs(args)),_display_(/*486.142*/if(contactForm.hasErrors)/*486.167*/ {_display_(Seq[Any](format.raw/*486.169*/("""
                            """),format.raw/*487.29*/("""<option value='"""),_display_(/*487.45*/contactForm/*487.56*/.field("email").value),format.raw/*487.77*/("""'></option>""")))}),format.raw/*487.89*/("""
                            """)))}),format.raw/*488.30*/("""



                            """),format.raw/*492.29*/("""<div id="xxx">
                                """),_display_(/*493.34*/for(error <- contactForm("email").errors) yield /*493.75*/ {_display_(Seq[Any](format.raw/*493.77*/("""
                                """),format.raw/*494.33*/("""<p id="xxxx">"""),_display_(/*494.47*/error/*494.52*/.format(messages())),format.raw/*494.71*/("""</p>
                                """)))}),format.raw/*495.34*/("""</div>







                            """),_display_(/*503.30*/helper/*503.36*/.input(field = contactForm("Frage"))/*503.72*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*503.101*/("""
                            """),format.raw/*504.29*/("""<div>
                                <textarea class="form-control" name=""""),_display_(/*505.71*/contactForm("textbox")/*505.93*/.name),format.raw/*505.98*/("""" id=""""),_display_(/*505.105*/id),format.raw/*505.107*/("""" placeholder="Ihre Nachricht" rows='5' cols='80'>"""),_display_(/*505.158*/if(contactForm.hasErrors)/*505.183*/{_display_(_display_(/*505.185*/contactForm/*505.196*/.field("textbox").value))}),format.raw/*505.220*/("""</textarea>
                            </div>
                            """)))}),format.raw/*507.30*/("""
                            """),format.raw/*508.29*/("""<div id="xxx">
                                """),_display_(/*509.34*/for(error <- contactForm("textbox").errors) yield /*509.77*/ {_display_(Seq[Any](format.raw/*509.79*/("""
                                """),format.raw/*510.33*/("""<p id="xxxx">"""),_display_(/*510.47*/error/*510.52*/.format(messages())),format.raw/*510.71*/("""</p>
                                """)))}),format.raw/*511.34*/("""</div>



                            <button type="submit"  class="btn btn-default" >Nachricht senden</button>

                            <div id="flash">"""),_display_(/*517.46*/flash/*517.51*/.get("success")),format.raw/*517.66*/("""</div>

                            """),_display_(/*519.30*/if(contactForm.hasGlobalErrors)/*519.61*/ {_display_(Seq[Any](format.raw/*519.63*/("""
                            """),format.raw/*520.29*/("""<div id="xxx">
                                <p class="error" >
                                    """),_display_(/*522.38*/for(error <- contactForm.globalErrors) yield /*522.76*/ {_display_(Seq[Any](format.raw/*522.78*/("""
                                """),format.raw/*523.33*/("""<p>"""),_display_(/*523.37*/error/*523.42*/.format(messages())),format.raw/*523.61*/("""</p>
                                """),_display_(/*524.34*/for(error <- contactForm("email").errors) yield /*524.75*/ {_display_(Seq[Any](format.raw/*524.77*/("""
                                """),format.raw/*525.33*/("""<p>"""),_display_(/*525.37*/error/*525.42*/.format(messages())),format.raw/*525.61*/("""</p>
                                """)))}),format.raw/*526.34*/("""
                                """)))}),format.raw/*527.34*/("""
                                """),format.raw/*528.33*/("""</p>
                            </div>
                            """)))}),format.raw/*530.30*/("""
                            """)))}),format.raw/*531.30*/("""


                            """),format.raw/*534.29*/("""<p></p>
                            <h3>Unsere sozialen Netzwerke</h3>
                            <ul class="list-inline banner-social-buttons">
                                <li><a href="www.google.com" class="btn btn-default btn-lg"><i class="fa fa-twitter"> <span class="network-name">Twitter</span></i></a></li>
                                <li><a href=""""),_display_(/*538.47*/routes/*538.53*/.HomeController.toFaceBook),format.raw/*538.79*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
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
    """),_display_(/*584.6*/if(contactForm.hasErrors)/*584.31*/{_display_(Seq[Any](format.raw/*584.32*/("""<script src=""""),_display_(/*584.46*/routes/*584.52*/.Assets.at("javascripts/js/returnToFormOnFailDE.js")),format.raw/*584.104*/(""""></script>""")))}),format.raw/*584.116*/("""</script>

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
<script src='"""),_display_(/*614.15*/routes/*614.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*614.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*617.15*/routes/*617.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*617.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
<script type="text/javascript"
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBtkVXlKJlSvm85a7oRDMLw4ZOZaxYwKxM&sensor=false"></script>

<!-- Theme JavaScript -->
<script src='"""),_display_(/*627.15*/routes/*627.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*627.66*/("""'></script>

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
                  DATE: Sat Sep 23 21:27:49 CEST 2017
                  SOURCE: /home/alex/git/web/app/views/germanContent.scala.html
                  HASH: 7025173ded928c9c45d7d715696919dfc3513d59
                  MATRIX: 1042->1|1178->66|1223->64|1250->82|1277->84|1324->123|1374->136|1402->138|1896->605|1911->611|1961->640|3291->1943|3306->1949|3356->1978|3396->1991|3412->1997|3471->2034|3635->2171|3650->2177|3700->2206|3740->2219|3756->2225|3815->2262|3983->2403|3998->2409|4049->2439|4090->2452|4106->2458|4165->2495|5336->3639|5351->3645|5404->3677|7558->5803|7574->5809|7636->5848|9852->8036|9868->8042|9925->8076|12110->10233|12126->10239|12183->10273|13261->11323|13277->11329|13339->11368|17251->15252|17267->15258|17324->15292|18846->16786|18862->16792|18919->16826|20029->17908|20045->17914|20102->17948|20965->18783|20981->18789|21043->18828|24594->22351|24610->22357|24697->22433|24739->22435|24801->22469|24817->22475|24877->22525|24946->22554|25004->22583|25058->22609|25079->22620|25125->22644|25185->22675|25210->22677|25242->22680|25281->22697|25317->22722|25359->22724|25417->22753|25461->22769|25482->22780|25529->22805|25573->22817|25635->22847|25696->22879|25772->22927|25834->22972|25875->22974|25937->23007|25979->23021|25994->23026|26035->23045|26105->23083|26172->23122|26188->23128|26250->23180|26319->23209|26377->23238|26431->23264|26452->23275|26494->23295|26557->23329|26582->23331|26614->23334|26653->23351|26689->23376|26731->23378|26789->23407|26833->23423|26854->23434|26897->23455|26941->23467|27003->23497|27064->23529|27140->23577|27198->23618|27239->23620|27301->23653|27343->23667|27358->23672|27399->23691|27469->23729|27540->23772|27556->23778|27602->23814|27671->23843|27729->23872|27833->23948|27865->23970|27892->23975|27928->23982|27953->23984|28033->24035|28069->24060|28101->24062|28123->24073|28172->24097|28280->24173|28338->24202|28414->24250|28474->24293|28515->24295|28577->24328|28619->24342|28634->24347|28675->24366|28745->24404|28931->24562|28946->24567|28983->24582|29048->24619|29089->24650|29130->24652|29188->24681|29319->24784|29374->24822|29415->24824|29477->24857|29509->24861|29524->24866|29565->24885|29631->24923|29689->24964|29730->24966|29792->24999|29824->25003|29839->25008|29880->25027|29950->25065|30016->25099|30078->25132|30179->25201|30241->25231|30301->25262|30694->25627|30710->25633|30758->25659|32181->27056|32216->27081|32256->27082|32298->27096|32314->27102|32389->27154|32434->27166|32845->27549|32861->27555|32932->27604|33022->27666|33038->27672|33122->27734|33657->28241|33673->28247|33740->28292
                  LINES: 30->1|33->2|36->1|37->3|38->4|38->4|38->4|40->6|49->15|49->15|49->15|81->47|81->47|81->47|81->47|81->47|81->47|85->51|85->51|85->51|85->51|85->51|85->51|89->55|89->55|89->55|89->55|89->55|89->55|127->93|127->93|127->93|183->149|183->149|183->149|220->186|220->186|220->186|254->220|254->220|254->220|279->245|279->245|279->245|333->299|333->299|333->299|355->321|355->321|355->321|376->342|376->342|376->342|398->364|398->364|398->364|500->466|500->466|500->466|500->466|505->471|505->471|505->471|505->471|506->472|506->472|506->472|506->472|506->472|506->472|506->472|506->472|506->472|506->472|507->473|507->473|507->473|507->473|507->473|508->474|512->478|513->479|513->479|513->479|514->480|514->480|514->480|514->480|515->481|519->485|519->485|519->485|519->485|520->486|520->486|520->486|520->486|520->486|520->486|520->486|520->486|520->486|520->486|521->487|521->487|521->487|521->487|521->487|522->488|526->492|527->493|527->493|527->493|528->494|528->494|528->494|528->494|529->495|537->503|537->503|537->503|537->503|538->504|539->505|539->505|539->505|539->505|539->505|539->505|539->505|539->505|539->505|539->505|541->507|542->508|543->509|543->509|543->509|544->510|544->510|544->510|544->510|545->511|551->517|551->517|551->517|553->519|553->519|553->519|554->520|556->522|556->522|556->522|557->523|557->523|557->523|557->523|558->524|558->524|558->524|559->525|559->525|559->525|559->525|560->526|561->527|562->528|564->530|565->531|568->534|572->538|572->538|572->538|618->584|618->584|618->584|618->584|618->584|618->584|618->584|648->614|648->614|648->614|651->617|651->617|651->617|661->627|661->627|661->627
                  -- GENERATED --
              */
          