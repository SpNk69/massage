
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

object russianContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "java", contactForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.65*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""

"""),format.raw/*5.1*/("""<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

<!-- Navigation -->
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                Menu <i class="fa fa-bars"></i>
            </button>
            <a class="navbar-brand page-scroll" href='"""),_display_(/*14.56*/routes/*14.62*/.HomeController.russianVersion),format.raw/*14.92*/("""'>
                <i class="fa fa-play-circle"></i> <span class="light">Вида</span> Mассажы
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
                    <a class="page-scroll" href="#oбо">Oбо мне</a>
                </li>
                <li>
                    <a class="page-scroll" href="#mассажы">Mассажы</a>
                </li>

                <li>
                    <a class="page-scroll" href="#галерея">галерея</a>
                </li>

                <li>
                    <a class="page-scroll" href="#цены">цены</a>
                </li>
                <li>
                    <a class="page-scroll" href="#bonpoc">Bопрос</a>
                </li>
                <li>
                    <a class="page-scroll" href="#контакты">Kонтакты</a>
                </li>

                <li>
                    <a class="page-scroll" href='"""),_display_(/*48.51*/routes/*48.57*/.HomeController.germanVersion),format.raw/*48.86*/("""'><img src='"""),_display_(/*48.99*/routes/*48.105*/.Assets.at("images/img/flag-de2.png")),format.raw/*48.142*/("""' class="flag flag-lt" alt="German" /></a>
                </li>

                <li>
                    <a class="page-scroll" href='"""),_display_(/*52.51*/routes/*52.57*/.HomeController.pagrindinisLT),format.raw/*52.86*/("""'><img src='"""),_display_(/*52.99*/routes/*52.105*/.Assets.at("images/img/flag-lt2.png")),format.raw/*52.142*/("""' class="flag flag-lt" alt="Lithuanian" /></a>
                </li>

                <li>
                    <a class="page-scroll" href=""""),_display_(/*56.51*/routes/*56.57*/.HomeController.russianVersion),format.raw/*56.87*/(""""><img src='"""),_display_(/*56.100*/routes/*56.106*/.Assets.at("images/img/flag-rus.png")),format.raw/*56.143*/("""' class="flag flag-lt" alt="Russian" /></a>
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
                    <p class="intro-text">Массаж является одним из особых факторов в жизни человека, помогая поддерживать хорошее тело и душу. И нет ничего лучше, чем после тяжелого и усталого рабочего дня, расслабиться и оживить cвое тело массажными процедурами.</p>
                    <a href="oбо" class="btn btn-circle page-scroll">
                        <i class="fa fa-angle-double-down animated"></i>
                    </a>
                </div>
            </div>
        </div>
    </div>
</header>



<!-- About Section -->
<section id="oбо" class="container content-section text-center">
    <div class="row">



        <div class="col-lg-6 ">
            <img src='"""),_display_(/*97.24*/routes/*97.30*/.Assets.at("images/img/as2.jpg")),format.raw/*97.62*/("""' class="img-circle" alt="Medicine massage" height="600">

        </div>

        <div class="col-lg-6">

            <h3 align="center"><u>Образование</u></h3>
            <ul><li>"Вильнюсская высшая медицинская школа. Литва.</li>
                <li>Клайпедский университет. Степень бакалавра в области общественного здравоохранения. Литва.</li>
                <li>2010 г. - "Baltic SPA Professional" курсы (Латвия), спа-массажы.</li>
                <li> 2012 г. - Центр развития и специализации медсестринского персонала.</li>
                <li> Сертификат Нет KV 120146 - предоставляется право делать терапевтические (лечебные) массажы.</li>
            </ul>
            <p></p>
            <h3 align="center" ><u>Опыт работы</u></h3>
            <ul align="center">
                <li>27 лет: медицинская сестра.</li>
                <li> 7 лет: специалист общественного здравоохранения.</li>
                <li>7 лет: массажист.</li>
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
    <a href="#mассажы" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
</section>








<!-- Download Section -->
<section id="mассажы" class="content-section text-center">
    <div class="download-section">
        <h2 id="vienas">Оздоровительный массаж</h2>
        <div class="container">

            <div class="row">

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#limfodrenazinis">
                        Лимфодренажный массаж
                    </button>
                    <p></p>
                    <div id="limfodrenazinis" class="collapse">
                        <!--<div class="text-center"><img src='"""),_display_(/*161.65*/routes/*161.71*/.Assets.at("images/img/massage164.jpg")),format.raw/*161.110*/("""'
                                                      class="img-circle" alt="Medicine massage" width="250"
                                                      height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">



                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo" >
                                Лимфодренажный массаж тела
                            </button>
                            <div id="limfo" class="collapse customWidth">      <p class="massageText customWidth">Tai saugus efektyvus būdas sustiprinti sveikatą bei palaikyti gerą savijautą.
                                Это безопасный эффективный способ укрепления здоровья и поддержания благополучия. У
                                здоровых людей - это профилактическая мера, чтобы поддерживать нормальный обмен веществ.
                                Массаж активируется процессы регенерации поврежденных мягких тканей, замедляются
                                воспалительные процессы, укрепляет иммунитет, улучшает оксигенацию тканей.</br>
                                Лимфодренажный массаж подходит для тех, кто чувствует отек ног, отеки, или просто усталость.
                                После долгого дня, он расслабляет уставшие ноги и дает ощущение легкости. Он также подходит
                                для людей, чьи ноги всегда холодные.</br>
                                Этот массаж целей красоты используется для лечения целлюлита и профилактики, подтяжки кожи,
                                сокращения, улучшают общее самочувствие и уменьшить отеки после пластической хирургии.
                                Этот массаж делается для женщин и мужчин.</br>
                                Для лечения, эта процедура делается каждый день, для профилактики - 2-3 раза в неделю.
                                Нужный эффект достигается после 15 процедур.
                            </p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo2" >
                                Лимфодренажный массаж лица
                            </button>
                            <div id="limfo2" class="collapse customWidth"><p class="massageText">Tekstas</p> </div>

                        </div>
                    </div>
                    <p></p>
                </div>


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#karstusaltu">Горячих - холодных камней массаж
                    </button>
                    <p></p>
                    <div id="karstusaltu" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*204.67*/routes/*204.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*204.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Камни, используемые в массаже, собранных на побережье Балтийского моря. Они растут на
                                протяжении тысяч лет на морском дне обогащает огромную силу и солоноватой воды нити в
                                сочетании с солнечным светом колебания приобретают уникальные характеристики, которые
                                влияют на организм человека.</br>
                                Камень имеет способность из мышц удалить токсины накопленные в результате стресса и
                                нездорового образа жизни. Улучшает сон, помогает регулировать кровяное давление,
                                положительно влияет на частоту сердечных сокращений, вызванные естественной силы тела,
                                чтобы помочь преодолеть болезнь, ускоряет процесс потоков.</br>
                                Этот массаж особенно подходит от усталости, перенеся глубокий стресс, чувствуя в себе
                                неоправданные расстройства нервозности, апатия, плохой сон.
                                Легко и приятно устраняет боль в мышцах, спины, головы и шеи.</p>


                        </div>
                    </div>
                    <p></p>
                </div>

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#segmentinis">Kлассический
                        Сегментный массаж спины
                    </button>
                    <p></p>
                    <div id="segmentinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*234.67*/routes/*234.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*234.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Pасслабляет напряженные мышцы спины, улучшает структуру ткани, обеспечивает лучшее положение тела, облегчает воспаление нервных корешков (радикулит).</p>


                        </div>
                    </div>
                </div>


            </div>

            <div class="row">


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#demo33" >
                        Индивидуальный массаж тела
                    </button>
                    <p></p>
                    <div id="demo33" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*259.67*/routes/*259.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*259.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#galva" >
                                Массаж головы
                            </button>
                            <div id="galva" class="collapse customWidth"><p class="massageText">Уменьшает стресс, головные боли, улучшает кровообращение.</p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#peciai" >
                                Плеч - шеи массаж
                            </button>
                            <div id="peciai" class="collapse customWidth"><p class="massageText">Наиболее эффективное лечение, а также средство для удаления неприятных симптомов . Уже после первого массажа шеи вы почувствуете общее улучшение своего самочувствия. После полного курса массажа исчезают болезненные ощущения, возрастает работоспособность, исчезает бессонница и раздражительность. Массаж шеи является отличным инструментом, чтобы избавиться от головной боли.</p> </div>




                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#krutines" >
                                Массаж груди
                            </button>
                            <div id="krutines" class="collapse customWidth"><p class="massageText">Снимает расстройства дыхания (бронхит, грипп, астма и т. Д.)</p> </div>


                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pilvo" >
                                Абдоминальный массаж
                            </button>
                            <div id="pilvo" class="collapse customWidth"><p class="massageText">стимулирует пищеварение, оказывает положительное влияние на внутрибрюшные органы, улучшает функции желудка и кишечника, а также секрецию желчи, помогает при запоре или накоплении газа в кишечнике.</p></div>


                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#juosmens" >
                                Массаж поясничного отдела позвоночника
                            </button>
                            <div id="juosmens" class="collapse customWidth"><p class="massageText">Уменьшает боль после операции, улучшает кровообращение, снимает воспаление нервных корешков.</p></div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pedu" >
                                Массаж ног
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*313.67*/routes/*313.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*313.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Masažas yra būtina ir labai naudinga procedūra pagyvenusiems žmonėms, pensininkams. Tyrimai parodė, kad masažas lėtina senėjimo procesą. Taip pat masažas veikia raminančiai visą organizmą ir gali sumažinti skausmus. Masažas gali padėti žmonėms, kenčiantiems raumenų skausmus ar sergantiems atritu. Kada žmogus kenčia, jis tampa vis mažiau aktyvus, nukenčia gyvenimo kokybė ir sveikata. Masažas gerina kraujotaką,  pašalina raumenų nuovargį ir raumenys įgauna tonusą. Dėl to pagerėja pagyvenusio žmogaus gyvenimo kokybė.
                                </br>Prieš masažą Jums gerai būtų pasikonsultuoti su savo gydytoju. Kai tik gausite gydytojo leidimą masažui, jus drąsiai galite kreiptis pas mane.  </p>


                        </div>
                    </div>
                    <p></p>
                </div>



                <div class="col-lg-4 ">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#atpalaiduojantis">Полный массаж тела
                    </button>
                    <p></p>
                    <div id="atpalaiduojantis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*333.67*/routes/*333.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*333.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Расслабляет тело и ум, снимает стресс и нервозность, укрепляет иммунную систему, уменьшает мышечные судороги и хронические напряжения, снимает боль, улучшает поток лимфы, оказывает положительное влияние на общее состояние здоровья.</p>

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
                        <!--  <div class="text-center"><img src='"""),_display_(/*354.67*/routes/*354.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*354.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*376.67*/routes/*376.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*376.112*/("""'
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



    <a href="#галерея" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>

</section >


<section id="галерея" class="content-section text-center">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <div class="contact-section">
                <div class="container">
                    <hr>
                    <h2>галерея</h2>
                    <hr>


                </div>


            </div>
        </div>
    </div>
    <a href="#цены" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>

</section>



<section id="цены" class="content-section text-center">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <div class="contact-section">
                <div class="container">
                    <hr>
                    <h2>цены</h2>
                    <hr>
                </div>


            </div>
        </div>
    </div>
    <a href="#bonpoc" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
</section>
<Usertact Section -->


    <section id="bonpoc" class="container content-section text-center">
        <div class="row">
            <div class="col-lg-12">
                <div class="contact-section">
                    <div class="container">

                        <h2>Задайте свой вопрос!</h2>
                        <p></p>
                        <div class="row">
                            <div class="col-md-8 col-md-offset-2">




                                """),_display_(/*481.34*/helper/*481.40*/.form(action = routes.HomeController.submitRU(),'class -> "form-horizontal")/*481.116*/ {_display_(Seq[Any](format.raw/*481.118*/("""




                                """),_display_(/*486.34*/helper/*486.40*/.input(contactForm("Имя"),'class->"form-control")/*486.89*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*486.118*/("""
                                """),format.raw/*487.33*/("""<input type="text" name=""""),_display_(/*487.59*/contactForm/*487.70*/.field("firstName").name),format.raw/*487.94*/(""""  placeholder="Ваше имя" id=""""),_display_(/*487.125*/id),format.raw/*487.127*/("""" """),_display_(/*487.130*/toHtmlArgs(args)),_display_(/*487.147*/if(contactForm.hasErrors)/*487.172*/ {_display_(Seq[Any](format.raw/*487.174*/("""
                                """),format.raw/*488.33*/("""<option value='"""),_display_(/*488.49*/contactForm/*488.60*/.field("firstName").value),format.raw/*488.85*/("""'></option>""")))}),format.raw/*488.97*/("""
                                """)))}),format.raw/*489.34*/("""



                                """),format.raw/*493.33*/("""<div id="xxx">
                                    """),_display_(/*494.38*/for(error <- contactForm("firstName").errors) yield /*494.83*/ {_display_(Seq[Any](format.raw/*494.85*/("""
                                    """),format.raw/*495.37*/("""<p id="xxxx">"""),_display_(/*495.51*/error/*495.56*/.format(messages())),format.raw/*495.75*/("""</p>
                                    """)))}),format.raw/*496.38*/("""</div>



                                """),_display_(/*500.34*/helper/*500.40*/.input(contactForm("Злектронная почта"),'class->"form-control")/*500.103*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*500.132*/("""
                                """),format.raw/*501.33*/("""<input type="text" name=""""),_display_(/*501.59*/contactForm/*501.70*/.field("email").name),format.raw/*501.90*/(""""  placeholder="Ваш адрес электронной почты" id=""""),_display_(/*501.140*/id),format.raw/*501.142*/("""" """),_display_(/*501.145*/toHtmlArgs(args)),_display_(/*501.162*/if(contactForm.hasErrors)/*501.187*/ {_display_(Seq[Any](format.raw/*501.189*/("""
                                """),format.raw/*502.33*/("""<option value='"""),_display_(/*502.49*/contactForm/*502.60*/.field("email").value),format.raw/*502.81*/("""'></option>""")))}),format.raw/*502.93*/("""
                                """)))}),format.raw/*503.34*/("""



                                """),format.raw/*507.33*/("""<div id="xxx">
                                    """),_display_(/*508.38*/for(error <- contactForm("email").errors) yield /*508.79*/ {_display_(Seq[Any](format.raw/*508.81*/("""
                                    """),format.raw/*509.37*/("""<p id="xxxx">"""),_display_(/*509.51*/error/*509.56*/.format(messages())),format.raw/*509.75*/("""</p>
                                    """)))}),format.raw/*510.38*/("""</div>







                                """),_display_(/*518.34*/helper/*518.40*/.input(field = contactForm("Вопрос"))/*518.77*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*518.106*/("""
                                """),format.raw/*519.33*/("""<div>
                                    <textarea class="form-control" name=""""),_display_(/*520.75*/contactForm("textbox")/*520.97*/.name),format.raw/*520.102*/("""" id=""""),_display_(/*520.109*/id),format.raw/*520.111*/("""" placeholder="Ваше сообщение" rows='5' cols='80'>"""),_display_(/*520.162*/if(contactForm.hasErrors)/*520.187*/{_display_(_display_(/*520.189*/contactForm/*520.200*/.field("textbox").value))}),format.raw/*520.224*/("""</textarea>
                                </div>
                                """)))}),format.raw/*522.34*/("""
                                """),format.raw/*523.33*/("""<div id="xxx">
                                    """),_display_(/*524.38*/for(error <- contactForm("textbox").errors) yield /*524.81*/ {_display_(Seq[Any](format.raw/*524.83*/("""
                                    """),format.raw/*525.37*/("""<p id="xxxx">"""),_display_(/*525.51*/error/*525.56*/.format(messages())),format.raw/*525.75*/("""</p>
                                    """)))}),format.raw/*526.38*/("""</div>



                                <button type="submit"  class="btn btn-default" >Отправить сообщение</button>

                                <div id="flash">"""),_display_(/*532.50*/flash/*532.55*/.get("success")),format.raw/*532.70*/("""</div>

                                """),_display_(/*534.34*/if(contactForm.hasGlobalErrors)/*534.65*/ {_display_(Seq[Any](format.raw/*534.67*/("""
                                """),format.raw/*535.33*/("""<div id="xxx">
                                    <p class="error" >
                                        """),_display_(/*537.42*/for(error <- contactForm.globalErrors) yield /*537.80*/ {_display_(Seq[Any](format.raw/*537.82*/("""
                                    """),format.raw/*538.37*/("""<p>"""),_display_(/*538.41*/error/*538.46*/.format(messages())),format.raw/*538.65*/("""</p>
                                    """),_display_(/*539.38*/for(error <- contactForm("email").errors) yield /*539.79*/ {_display_(Seq[Any](format.raw/*539.81*/("""
                                    """),format.raw/*540.37*/("""<p>"""),_display_(/*540.41*/error/*540.46*/.format(messages())),format.raw/*540.65*/("""</p>
                                    """)))}),format.raw/*541.38*/("""
                                    """)))}),format.raw/*542.38*/("""
                                    """),format.raw/*543.37*/("""</p>
                                </div>
                                """)))}),format.raw/*545.34*/("""
                                """)))}),format.raw/*546.34*/("""


                                """),format.raw/*549.33*/("""<p></p>
                                <h3>Наши социальные сети</h3>
                                <ul class="list-inline banner-social-buttons">
                                    <li><a href="www.google.com" class="btn btn-default btn-lg"><i class="fa fa-twitter"> <span class="network-name">Twitter</span></i></a></li>
                                    <li><a href=""""),_display_(/*553.51*/routes/*553.57*/.HomeController.toFaceBook),format.raw/*553.83*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
                                    <li><a href="#" class="btn btn-default btn-lg"><i class="fa fa-youtube-play"> <span class="network-name">Youtube</span></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>


                </div>
            </div>
            """),_display_(/*563.14*/if(contactForm.hasErrors)/*563.39*/{_display_(Seq[Any](format.raw/*563.40*/("""<script src=""""),_display_(/*563.54*/routes/*563.60*/.Assets.at("javascripts/js/returnToFormOnFailRU.js")),format.raw/*563.112*/(""""></script>""")))}),format.raw/*563.124*/("""</script>
        </div>
        <a href="#контакты" class="btn btn-circle page-scroll">
            <i class="fa fa-angle-double-down animated"></i>
        </a>







    </section>


<section>
    <hr>
    <!-- Map Section -->
    <div id="контакты" class="text-center">
        <div class="row">
            <div class="col-lg-12">
                <p></p>
                <h2>Контактная информация</h2>
                <p style="color:#fff;">
                    <strong><i class="fa fa-map-marker"></i> Aдрес</strong><br>
                    Villenstrasse 35, Šafhauzenas, 8200, Швейцария
                </p>
                <p style="color:#fff;"><strong><i class="fa fa-phone"></i> Hомер телефона</strong><br>
                    +41 797897010</p>
                <p style="color:#fff;">
                    <strong><i class="fa fa-envelope"></i>  Злектронная почта</strong><br>
                    polescuk@gmail.com</p>
                <p></p>
            </div>
        </div>
    </div>
<hr>
</section>





<section>
<!-- Map Section -->
<div id="map" class="text-center">
    <div class="row">
        <div class="col-lg-12">

<h2>карта</h2>

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
<script src='"""),_display_(/*627.15*/routes/*627.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*627.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*630.15*/routes/*630.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*630.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
<script type="text/javascript"
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBtkVXlKJlSvm85a7oRDMLw4ZOZaxYwKxM&sensor=false"></script>

<!-- Theme JavaScript -->
<script src='"""),_display_(/*640.15*/routes/*640.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*640.66*/("""'></script>

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
                  SOURCE: /home/alex/git/web/app/views/russianContent.scala.html
                  HASH: 713f0f65007dfe196157402791a098957b8d7408
                  MATRIX: 1043->1|1179->66|1224->64|1251->83|1298->122|1348->135|1376->137|1870->604|1885->610|1936->640|3258->1935|3273->1941|3323->1970|3363->1983|3379->1989|3438->2026|3602->2163|3617->2169|3667->2198|3707->2211|3723->2217|3782->2254|3950->2395|3965->2401|4016->2431|4057->2444|4073->2450|4132->2487|5271->3599|5286->3605|5339->3637|7535->5805|7551->5811|7613->5850|10603->8812|10619->8818|10676->8852|12663->10811|12679->10817|12736->10851|13744->11831|13760->11837|13822->11876|17610->15636|17626->15642|17683->15676|19204->17169|19220->17175|19277->17209|20383->18287|20399->18293|20456->18327|21319->19162|21335->19168|21397->19207|24982->22764|24998->22770|25085->22846|25127->22848|25193->22886|25209->22892|25268->22941|25337->22970|25399->23003|25453->23029|25474->23040|25520->23064|25580->23095|25605->23097|25637->23100|25676->23117|25712->23142|25754->23144|25816->23177|25860->23193|25881->23204|25928->23229|25972->23241|26038->23275|26103->23311|26183->23363|26245->23408|26286->23410|26352->23447|26394->23461|26409->23466|26450->23485|26524->23527|26595->23570|26611->23576|26685->23639|26754->23668|26816->23701|26870->23727|26891->23738|26933->23758|27012->23808|27037->23810|27069->23813|27108->23830|27144->23855|27186->23857|27248->23890|27292->23906|27313->23917|27356->23938|27400->23950|27466->23984|27531->24020|27611->24072|27669->24113|27710->24115|27776->24152|27818->24166|27833->24171|27874->24190|27948->24232|28023->24279|28039->24285|28086->24322|28155->24351|28217->24384|28325->24464|28357->24486|28385->24491|28421->24498|28446->24500|28526->24551|28562->24576|28594->24578|28616->24589|28665->24613|28781->24697|28843->24730|28923->24782|28983->24825|29024->24827|29090->24864|29132->24878|29147->24883|29188->24902|29262->24944|29459->25113|29474->25118|29511->25133|29580->25174|29621->25205|29662->25207|29724->25240|29863->25351|29918->25389|29959->25391|30025->25428|30057->25432|30072->25437|30113->25456|30183->25498|30241->25539|30282->25541|30348->25578|30380->25582|30395->25587|30436->25606|30510->25648|30580->25686|30646->25723|30755->25800|30821->25834|30885->25869|31289->26245|31305->26251|31353->26277|31854->26750|31889->26775|31929->26776|31971->26790|31987->26796|32062->26848|32107->26860|33501->28227|33517->28233|33588->28282|33678->28344|33694->28350|33778->28412|34313->28919|34329->28925|34396->28970
                  LINES: 30->1|33->2|36->1|37->3|37->3|37->3|39->5|48->14|48->14|48->14|82->48|82->48|82->48|82->48|82->48|82->48|86->52|86->52|86->52|86->52|86->52|86->52|90->56|90->56|90->56|90->56|90->56|90->56|131->97|131->97|131->97|195->161|195->161|195->161|238->204|238->204|238->204|268->234|268->234|268->234|293->259|293->259|293->259|347->313|347->313|347->313|367->333|367->333|367->333|388->354|388->354|388->354|410->376|410->376|410->376|515->481|515->481|515->481|515->481|520->486|520->486|520->486|520->486|521->487|521->487|521->487|521->487|521->487|521->487|521->487|521->487|521->487|521->487|522->488|522->488|522->488|522->488|522->488|523->489|527->493|528->494|528->494|528->494|529->495|529->495|529->495|529->495|530->496|534->500|534->500|534->500|534->500|535->501|535->501|535->501|535->501|535->501|535->501|535->501|535->501|535->501|535->501|536->502|536->502|536->502|536->502|536->502|537->503|541->507|542->508|542->508|542->508|543->509|543->509|543->509|543->509|544->510|552->518|552->518|552->518|552->518|553->519|554->520|554->520|554->520|554->520|554->520|554->520|554->520|554->520|554->520|554->520|556->522|557->523|558->524|558->524|558->524|559->525|559->525|559->525|559->525|560->526|566->532|566->532|566->532|568->534|568->534|568->534|569->535|571->537|571->537|571->537|572->538|572->538|572->538|572->538|573->539|573->539|573->539|574->540|574->540|574->540|574->540|575->541|576->542|577->543|579->545|580->546|583->549|587->553|587->553|587->553|597->563|597->563|597->563|597->563|597->563|597->563|597->563|661->627|661->627|661->627|664->630|664->630|664->630|674->640|674->640|674->640
                  -- GENERATED --
              */
          