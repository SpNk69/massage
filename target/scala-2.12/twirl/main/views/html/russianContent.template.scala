
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
                    <a class="page-scroll" href="#obo">Oбо мне</a>
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
                    <a class="page-scroll" href='"""),_display_(/*48.51*/routes/*48.57*/.HomeController.germanVersion),format.raw/*48.86*/("""'><img src='"""),_display_(/*48.99*/routes/*48.105*/.Assets.at("images/img/flag-de2.png")),format.raw/*48.142*/("""' alt="Немецкий язык" /></a>
                </li>

                <li>
                    <a class="page-scroll" href='"""),_display_(/*52.51*/routes/*52.57*/.HomeController.pagrindinisLT),format.raw/*52.86*/("""'><img src='"""),_display_(/*52.99*/routes/*52.105*/.Assets.at("images/img/flag-lt2.png")),format.raw/*52.142*/("""' alt="Литовский язык" /></a>
                </li>

                <li>
                    <a class="page-scroll" href=""""),_display_(/*56.51*/routes/*56.57*/.HomeController.russianVersion),format.raw/*56.87*/(""""><img src='"""),_display_(/*56.100*/routes/*56.106*/.Assets.at("images/img/flag-rus.png")),format.raw/*56.143*/("""' alt="Русский язык" /></a>
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
                    <a href="#obo" class="btn btn-circle page-scroll">
                        <i class="fa fa-angle-double-down animated"></i>
                    </a>
                </div>
            </div>
        </div>
    </div>
</header>



<!-- About Section -->
<section id="obo" class="container content-section text-center">
    <div class="row">

        <div class="col-lg-6 ">
            <img src='"""),_display_(/*95.24*/routes/*95.30*/.Assets.at("images/img/Vida.jpg")),format.raw/*95.63*/("""' class="img-circle" alt="Вида Полешчук" height="600">

        </div>
        <p></p>
        <div class="col-lg-6">

            <h3 align="center"><u>Образование</u></h3>
            <ul><li>"Вильнюсская высшая медицинская школа. Литва.</li>
                <li>Клайпедский университет. Степень бакалавра в области общественного здравоохранения. Литва.</li>
                <li>2010 г. - "Baltic SPA Professional" курсы (Латвия), спа-массажы.</li>
                <li> 2012 г. - Центр развития и специализации медсестринского персонала: Сертификат Нет KV 120146 - предоставляется право делать терапевтические (лечебные) массажы.</li>

            </ul>
            <p></p>
            <h3 align="center" ><u>Опыт работы</u></h3>
            <ul align="center">
                <li>27 лет: медицинская сестра.</li>
                <li> 7 лет: специалист общественного здравоохранения.</li>
                <li>7 лет: массажист.</li>
            </ul>
            <p></p>
            <h3 align="center"><u>Сертификаты SPA</u></h3>
            <ul>

                <li>Классический сегментный массаж</li>
                <li>Массаж горячими - холодными камнями</li>
                <li>Лимфодренажный массаж</li>
                <li>Тайский массаж стоп</li>
                <li>Традиционный  аюрведический Керал массаж</li>
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
                        <!--<div class="text-center"><img src='"""),_display_(/*159.65*/routes/*159.71*/.Assets.at("images/img/massage164.jpg")),format.raw/*159.110*/("""'
                                                      class="img-circle" alt="Medicine massage" width="250"
                                                      height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">



                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo" >
                                Лимфодренажный массаж тела
                            </button>
                            <div id="limfo" class="collapse customWidth">      <p class="massageText ">Это безопасный эффективный способ укрепления здоровья и поддержания благосостояния. У здоровых людей это профилактическая мера для поддержания нормального метаболизма. Во время массажа регенерация поврежденных мягких тканей активирует воспалительные процессы, укрепляет иммунную систему, улучшает подачу кислорода в ткани. Это помогает устранить избыток жидкости из ткани и органов.</br>
                                Лимфодренаж подходит для тех, кто чувствует отек ног, или просто усталость. После долгого дня, он расслабляет уставшие ноги и дает ощущение легкости. Он также подходит для людей, чьи ноги всегда холодные.</br>
                                Эта цель красоты массажа используется для лечения и профилактики целлюлита, подтягивания кожи, улучшения общего состояния здоровья и  уменьшить отек после пластической хирургии.</br>
                                Этот массаж проводится для женщин и мужчин.</br>
                                Для лечения - рекомендует делает каждый день, для профилактики - делать 2-3 раза в неделю. Желаемый эффект достигается после 15 процедур.
                            </p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo2" >
                                Лимфодренажный массаж лица
                            </button>
                            <div id="limfo2" class="collapse customWidth"><p class="massageText">При постоянном напряжении и усталости, мышцы лица замерзает бывает маска ,,печаль". Лимфа cтекает сложнее, удаляя токсичные и метаболические продукты.</br>
                                Лицевой лимфатический дренаж дает отличные результаты:</br>
                                при опухлости лица</br>
                                при обезвоживание кожи</br>
                                ранние  старение</br>
                                темные круги и мешки под глазами</br>
                                снижение эластичности тканей и мышц,</br>
                                Купероз на лицею</br>
                                Уменьшаетса лица вялось, мы получаем выраженую упругость лица, разглаживаетса  морщины.</br>
                                Для профилактики - делать 2-3 раза в неделю. Желаемый эффект достигается после 15 процедур.</p> </div>

                        </div>
                    </div>
                    <p></p>
                </div>


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#karstusaltu">Горячих - холодных камней массаж
                    </button>
                    <p></p>
                    <div id="karstusaltu" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*203.67*/routes/*203.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*203.107*/("""' class="img-circle"
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


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#segmentinis">Классический - Сегментный массаж спины
                    </button>
                    <p></p>
                    <div id="segmentinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*232.67*/routes/*232.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*232.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Этот массаж идеально подходит для людей, которые проводят весь день стоя или сидя, например, за компьютером или за рулем автомобиля, а также  тяжело физически работая , когда все напряжение сосредоточено в позвоночнике, шее и плечах, поясе и ягодицах, вызывая болезненные ощущения в мышцах. Этот массаж особенно подходит после тренировки при длительной и кратковременной боли. Кроме того, неправильное положение позвоночника часто вызывает головную боль.
                                </br> Периодический массаж поможет вам избавиться от:
                                </br> частых болей в спине,
                                </br> головных  болей,
                                </br>расслабить напряженные группы мышц.
                                После массажа вы почувствуете себя расслабленным и энергичным.</p>


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
                        <!--  <div class="text-center"><img src='"""),_display_(/*262.67*/routes/*262.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*262.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#galva" >
                                Массаж головы
                            </button>
                            <div id="galva" class="collapse customWidth"><p class="massageText">Уменьшает стресс, головные боли, улучшает кровообращение.</p> </div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#peciai" >
                                Плечо - шеи -  рук массаж
                            </button>
                            <div id="peciai" class="collapse customWidth"><p class="massageText">Наиболее эффективное средство для устранения неприятных симптомов. Уже после  первого раза  вы почувствуете улучшение общего состояния. После полного курса массажа исчезают болезненные ощущения, поевляетса бодрость, возрастает работоспособность, исчезает бессонница и раздражительность. Это отличный способ избавиться от боли в голове, шее, плечах и онемение рук.</p> </div>





                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pilvo" >
                                Абдоминальный массаж
                            </button>
                            <div id="pilvo" class="collapse customWidth"><p class="massageText">стимулирует пищеварение, оказывает положительное влияние на внутрибрюшные органы, улучшает функции желудка и кишечника, а также секрецию желчи, помогает при запоре или накоплении газа в кишечнике.</p></div>


                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#juosmens" >
                                Поясницы- Ягодицы - Ног Массаж
                            </button>
                            <div id="juosmens" class="collapse customWidth"><p class="massageText">Улучшает циркуляцию крови и лимфы в пояснице и ногах, расслабляет напряженные мышцы, уменьшает поясничные, ягодицы,  ногах боль, укрепляет ослабленные мышцы.
                                Уменьшает боль после операции,  уменьшает воспаление нервных корешков.</p></div>

                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pedu" >
                                Расслабляющий массаж стоп
                            </button>
                            <div id="pedu" class="collapse customWidth"><p class="massageText">Используется для расслабления усталых стоп, увеличения жизненого тонуса, повышения иммунитета. Эта процедура подходит для многих людей, которые работают стоя или много ходитб также людей у которых мёрзнит стопы. Массаж стоп помогает восстановить и одохнуть всему телу.</p></div>



                        </div>
                    </div>
                    <p></p>
                </div>


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#vyresnio">Массаж для пожилых людей
                    </button>
                    <p></p>
                    <div id="vyresnio" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*312.67*/routes/*312.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*312.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth">Массаж - необходимая и очень полезная процедура для пожилых людей, пенсионеров. Исследования показали, что массаж замедляет процесс старения. Также массаж оказывает успокаивающее действие по всему телу и может уменьшить боль. Массаж может помочь людям, страдающим от мышечных болей : Например, те кто страдает от артрита, массаж помогает уменьшить боль, увеличивает амплитуду движения в суставах. Когда человек страдает, он становится все менее и менее активным, влияющий на качество жизни и здоровье. Массаж улучшает кровообращение, устраняет мышечную усталость, а мышцы получают тонус. Это улучшает качество жизни пожилого человека.
                                </br>Перед массажем необходимо  проконсультироваться с врачом. Как только вы получите разрешение врача на массаж, вы можете спокойно связаться со мной.</p>


                        </div>
                    </div>
                    <p></p>
                </div>



                <div class="col-lg-4 ">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#atpalaiduojantis">Расслабляющий массаж всего тела
                    </button>
                    <p></p>
                    <div id="atpalaiduojantis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*332.67*/routes/*332.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*332.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Aсслабляющий массаж для тех, кто хочет расслабиться после напряженного рабочего дня, забыть и уйти от ежедневной рутины. Устраняет напряжение и стресс, спазмы cпины и головные боли, расслабляет мышцы, позитивно влияет на внутреннее состояние организма, улучшает настроение и восстанавливает энергию. </p>

                        </div>
                    </div>
                    <p></p>
                </div>
            </div>

            <div class="row">

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#ajurvedinis">Аюрведический массаж грудей
                    </button>
                    <p></p>
                    <div id="ajurvedinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*353.67*/routes/*353.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*353.107*/("""' class="img-circle"
                                                        alt="Medicine massage" width="250" height="250"></a></div>-->
                        <div class="customBackGroundOfDiv " align="center">

                            <p class="massageText customWidth"> Он оказывает положительное влияние на всю систему репродуктивных органов у женщин и помогает сбалансировать гормональную систему, уменьшает неприятное ощущение груди, связанное с менструальным циклом, у грудей появляетса упругость, улучшается их форма,  делает их более здоровыми и практически исчезает риск рака молочной железы.
                            </br>  Массаж выполняется с применением растительных масел и длится до одного часа. Включает в себя работу с шеей (задняя и передняя поверхности) и плечами, работу с областью подмышек, руками, животом, и, конечно же, с грудью.</p>

                        </div>
                    </div>
                    <p></p>
                </div>




                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#anticeliulitinis" >
                        Антицеллюлитный ручной массаж
                    </button>
                    <p></p>
                    <div id="anticeliulitinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*376.67*/routes/*376.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*376.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">



                           <p class="massageText" customWidth>Это особенно эффективный способ борьбы с целлюлитом, который используется для уменьшения неравномерной подкожной (целлюлитной) проблемы в определенных проблемных областях - бедрах, ягодицах и брюшной полости.
                                </br>Массаж стимулирует циркуляцию лимфы, повышает мышечный тонус и сокращение за счет уменьшения целлюлита и припухлости. Очищает организм от шлаков и оказывает выраженный косметический эффект.
                                </br>  Это  является самым небольным методом - не оставляет синяков.</p>
                                (naudojant)+ тибетская глиняная чаша</div>




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




                                """),_display_(/*470.34*/helper/*470.40*/.form(action = routes.HomeController.submitRU(),'class -> "form-horizontal")/*470.116*/ {_display_(Seq[Any](format.raw/*470.118*/("""




                                """),_display_(/*475.34*/helper/*475.40*/.input(contactForm("Имя"),'class->"form-control")/*475.89*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*475.118*/("""
                                """),format.raw/*476.33*/("""<input type="text" name=""""),_display_(/*476.59*/contactForm/*476.70*/.field("firstName").name),format.raw/*476.94*/(""""  placeholder="Ваше имя" id=""""),_display_(/*476.125*/id),format.raw/*476.127*/("""" """),_display_(/*476.130*/toHtmlArgs(args)),_display_(/*476.147*/if(contactForm.hasErrors)/*476.172*/ {_display_(Seq[Any](format.raw/*476.174*/("""
                                """),format.raw/*477.33*/("""<option value='"""),_display_(/*477.49*/contactForm/*477.60*/.field("firstName").value),format.raw/*477.85*/("""'></option>""")))}),format.raw/*477.97*/("""
                                """)))}),format.raw/*478.34*/("""



                                """),format.raw/*482.33*/("""<div id="xxx">
                                    """),_display_(/*483.38*/for(error <- contactForm("firstName").errors) yield /*483.83*/ {_display_(Seq[Any](format.raw/*483.85*/("""
                                    """),format.raw/*484.37*/("""<p id="xxxx">"""),_display_(/*484.51*/error/*484.56*/.format(messages())),format.raw/*484.75*/("""</p>
                                    """)))}),format.raw/*485.38*/("""</div>



                                """),_display_(/*489.34*/helper/*489.40*/.input(contactForm("Злектронная почта"),'class->"form-control")/*489.103*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*489.132*/("""
                                """),format.raw/*490.33*/("""<input type="text" name=""""),_display_(/*490.59*/contactForm/*490.70*/.field("email").name),format.raw/*490.90*/(""""  placeholder="Ваш адрес электронной почты" id=""""),_display_(/*490.140*/id),format.raw/*490.142*/("""" """),_display_(/*490.145*/toHtmlArgs(args)),_display_(/*490.162*/if(contactForm.hasErrors)/*490.187*/ {_display_(Seq[Any](format.raw/*490.189*/("""
                                """),format.raw/*491.33*/("""<option value='"""),_display_(/*491.49*/contactForm/*491.60*/.field("email").value),format.raw/*491.81*/("""'></option>""")))}),format.raw/*491.93*/("""
                                """)))}),format.raw/*492.34*/("""



                                """),format.raw/*496.33*/("""<div id="xxx">
                                    """),_display_(/*497.38*/for(error <- contactForm("email").errors) yield /*497.79*/ {_display_(Seq[Any](format.raw/*497.81*/("""
                                    """),format.raw/*498.37*/("""<p id="xxxx">"""),_display_(/*498.51*/error/*498.56*/.format(messages())),format.raw/*498.75*/("""</p>
                                    """)))}),format.raw/*499.38*/("""</div>







                                """),_display_(/*507.34*/helper/*507.40*/.input(field = contactForm("Вопрос"))/*507.77*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*507.106*/("""
                                """),format.raw/*508.33*/("""<div>
                                    <textarea class="form-control" name=""""),_display_(/*509.75*/contactForm("textbox")/*509.97*/.name),format.raw/*509.102*/("""" id=""""),_display_(/*509.109*/id),format.raw/*509.111*/("""" placeholder="Ваше сообщение" rows='5' cols='80'>"""),_display_(/*509.162*/if(contactForm.hasErrors)/*509.187*/{_display_(_display_(/*509.189*/contactForm/*509.200*/.field("textbox").value))}),format.raw/*509.224*/("""</textarea>
                                </div>
                                """)))}),format.raw/*511.34*/("""
                                """),format.raw/*512.33*/("""<div id="xxx">
                                    """),_display_(/*513.38*/for(error <- contactForm("textbox").errors) yield /*513.81*/ {_display_(Seq[Any](format.raw/*513.83*/("""
                                    """),format.raw/*514.37*/("""<p id="xxxx">"""),_display_(/*514.51*/error/*514.56*/.format(messages())),format.raw/*514.75*/("""</p>
                                    """)))}),format.raw/*515.38*/("""</div>



                                <button type="submit"  class="btn btn-default" >Отправить сообщение</button>

                                <div id="flash">"""),_display_(/*521.50*/flash/*521.55*/.get("success")),format.raw/*521.70*/("""</div>

                                """),_display_(/*523.34*/if(contactForm.hasGlobalErrors)/*523.65*/ {_display_(Seq[Any](format.raw/*523.67*/("""
                                """),format.raw/*524.33*/("""<div id="xxx">
                                    <p class="error" >
                                        """),_display_(/*526.42*/for(error <- contactForm.globalErrors) yield /*526.80*/ {_display_(Seq[Any](format.raw/*526.82*/("""
                                    """),format.raw/*527.37*/("""<p>"""),_display_(/*527.41*/error/*527.46*/.format(messages())),format.raw/*527.65*/("""</p>
                                    """),_display_(/*528.38*/for(error <- contactForm("email").errors) yield /*528.79*/ {_display_(Seq[Any](format.raw/*528.81*/("""
                                    """),format.raw/*529.37*/("""<p>"""),_display_(/*529.41*/error/*529.46*/.format(messages())),format.raw/*529.65*/("""</p>
                                    """)))}),format.raw/*530.38*/("""
                                    """)))}),format.raw/*531.38*/("""
                                    """),format.raw/*532.37*/("""</p>
                                </div>
                                """)))}),format.raw/*534.34*/("""
                                """)))}),format.raw/*535.34*/("""


                                """),format.raw/*538.33*/("""<p></p>
                                <h3>Наши социальные сети</h3>
                                <ul class="list-inline banner-social-buttons">
                                    <li><a href="www.google.com" class="btn btn-default btn-lg"><i class="fa fa-twitter"> <span class="network-name">Twitter</span></i></a></li>
                                    <li><a href=""""),_display_(/*542.51*/routes/*542.57*/.HomeController.toFaceBook),format.raw/*542.83*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
                                    <li><a href="#" class="btn btn-default btn-lg"><i class="fa fa-youtube-play"> <span class="network-name">Youtube</span></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>


                </div>
            </div>
            """),_display_(/*552.14*/if(contactForm.hasErrors)/*552.39*/{_display_(Seq[Any](format.raw/*552.40*/("""<script src=""""),_display_(/*552.54*/routes/*552.60*/.Assets.at("javascripts/js/returnToFormOnFailRU.js")),format.raw/*552.112*/(""""></script>""")))}),format.raw/*552.124*/("""</script>
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
                    Villenstrasse 35, Шaфxaузeн, 8200, Швейцария
                </p>
                <p style="color:#fff;"><strong><i class="fa fa-phone"></i> Hомер телефона</strong><br>
                    +41 797897010</p>
                <p style="color:#fff;">
                    <strong><i class="fa fa-envelope"></i>  Злектронная почта</strong><br>
                    info@vidamassage.ch</p>
                <p></p>
            </div>
        </div>
    </div>
<hr>
</section>





<section>
<!-- Map Section -->
<div id="mappp" class="text-center">
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
<script src='"""),_display_(/*616.15*/routes/*616.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*616.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*619.15*/routes/*619.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*619.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
<script type="text/javascript"
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBtkVXlKJlSvm85a7oRDMLw4ZOZaxYwKxM&sensor=false"></script>

<!-- Theme JavaScript -->
<script src='"""),_display_(/*629.15*/routes/*629.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*629.66*/("""'></script>

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
                  SOURCE: /home/alex/git/web/app/views/russianContent.scala.html
                  HASH: 9a6cbcea16b1e5cd19e54d1e34a13ff1eb740931
                  MATRIX: 1043->1|1179->66|1224->64|1251->83|1298->122|1348->135|1376->137|1870->604|1885->610|1936->640|3258->1935|3273->1941|3323->1970|3363->1983|3379->1989|3438->2026|3588->2149|3603->2155|3653->2184|3693->2197|3709->2203|3768->2240|3919->2364|3934->2370|3985->2400|4026->2413|4042->2419|4101->2456|5223->3551|5238->3557|5292->3590|7492->5762|7508->5768|7570->5807|11121->9330|11137->9336|11194->9370|13159->11307|13175->11313|13232->11347|14914->13001|14930->13007|14992->13046|18788->16814|18804->16820|18861->16854|20511->18476|20527->18482|20584->18516|21752->19656|21768->19662|21825->19696|23268->21111|23284->21117|23346->21156|26122->23904|26138->23910|26225->23986|26267->23988|26333->24026|26349->24032|26408->24081|26477->24110|26539->24143|26593->24169|26614->24180|26660->24204|26720->24235|26745->24237|26777->24240|26816->24257|26852->24282|26894->24284|26956->24317|27000->24333|27021->24344|27068->24369|27112->24381|27178->24415|27243->24451|27323->24503|27385->24548|27426->24550|27492->24587|27534->24601|27549->24606|27590->24625|27664->24667|27735->24710|27751->24716|27825->24779|27894->24808|27956->24841|28010->24867|28031->24878|28073->24898|28152->24948|28177->24950|28209->24953|28248->24970|28284->24995|28326->24997|28388->25030|28432->25046|28453->25057|28496->25078|28540->25090|28606->25124|28671->25160|28751->25212|28809->25253|28850->25255|28916->25292|28958->25306|28973->25311|29014->25330|29088->25372|29163->25419|29179->25425|29226->25462|29295->25491|29357->25524|29465->25604|29497->25626|29525->25631|29561->25638|29586->25640|29666->25691|29702->25716|29734->25718|29756->25729|29805->25753|29921->25837|29983->25870|30063->25922|30123->25965|30164->25967|30230->26004|30272->26018|30287->26023|30328->26042|30402->26084|30599->26253|30614->26258|30651->26273|30720->26314|30761->26345|30802->26347|30864->26380|31003->26491|31058->26529|31099->26531|31165->26568|31197->26572|31212->26577|31253->26596|31323->26638|31381->26679|31422->26681|31488->26718|31520->26722|31535->26727|31576->26746|31650->26788|31720->26826|31786->26863|31895->26940|31961->26974|32025->27009|32429->27385|32445->27391|32493->27417|32994->27890|33029->27915|33069->27916|33111->27930|33127->27936|33202->27988|33247->28000|34642->29368|34658->29374|34729->29423|34819->29485|34835->29491|34919->29553|35454->30060|35470->30066|35537->30111
                  LINES: 30->1|33->2|36->1|37->3|37->3|37->3|39->5|48->14|48->14|48->14|82->48|82->48|82->48|82->48|82->48|82->48|86->52|86->52|86->52|86->52|86->52|86->52|90->56|90->56|90->56|90->56|90->56|90->56|129->95|129->95|129->95|193->159|193->159|193->159|237->203|237->203|237->203|266->232|266->232|266->232|296->262|296->262|296->262|346->312|346->312|346->312|366->332|366->332|366->332|387->353|387->353|387->353|410->376|410->376|410->376|504->470|504->470|504->470|504->470|509->475|509->475|509->475|509->475|510->476|510->476|510->476|510->476|510->476|510->476|510->476|510->476|510->476|510->476|511->477|511->477|511->477|511->477|511->477|512->478|516->482|517->483|517->483|517->483|518->484|518->484|518->484|518->484|519->485|523->489|523->489|523->489|523->489|524->490|524->490|524->490|524->490|524->490|524->490|524->490|524->490|524->490|524->490|525->491|525->491|525->491|525->491|525->491|526->492|530->496|531->497|531->497|531->497|532->498|532->498|532->498|532->498|533->499|541->507|541->507|541->507|541->507|542->508|543->509|543->509|543->509|543->509|543->509|543->509|543->509|543->509|543->509|543->509|545->511|546->512|547->513|547->513|547->513|548->514|548->514|548->514|548->514|549->515|555->521|555->521|555->521|557->523|557->523|557->523|558->524|560->526|560->526|560->526|561->527|561->527|561->527|561->527|562->528|562->528|562->528|563->529|563->529|563->529|563->529|564->530|565->531|566->532|568->534|569->535|572->538|576->542|576->542|576->542|586->552|586->552|586->552|586->552|586->552|586->552|586->552|650->616|650->616|650->616|653->619|653->619|653->619|663->629|663->629|663->629
                  -- GENERATED --
              */
          