
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
                <i class="fa fa-play-circle"></i> <span class="light">Vida</span> Mассажы
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
            <img src='"""),_display_(/*95.24*/routes/*95.30*/.Assets.at("images/img/Vida-Polescuk.jpg")),format.raw/*95.72*/("""' class="img-circle" alt="Вида Полешчук" id="what">

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
                        Массаж отдельнных частей тело
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




                        </div>
                    </div>
                    <p></p>
                </div>


                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#vyresnio">Массаж для пожилых людей
                    </button>
                    <p></p>
                    <div id="vyresnio" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*308.67*/routes/*308.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*308.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*328.67*/routes/*328.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*328.107*/("""' class="img-circle"
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
                        <!--  <div class="text-center"><img src='"""),_display_(/*349.67*/routes/*349.73*/.Assets.at("images/img/mas3.jpeg")),format.raw/*349.107*/("""' class="img-circle"
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
                        Антицеллюлитный массаж
                    </button>
                    <p></p>
                    <div id="anticeliulitinis" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*372.67*/routes/*372.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*372.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">



                           <p class="massageText customWidth" >Это особенно эффективный способ борьбы с целлюлитом, который используется для уменьшения неравномерной подкожной (целлюлитной) проблемы в определенных проблемных областях - бедрах, ягодицах и брюшной полости.
                                </br>Массаж стимулирует циркуляцию лимфы, повышает мышечный тонус и сокращение за счет уменьшения целлюлита и припухлости. Очищает организм от шлаков и оказывает выраженный косметический эффект.
                                </br>  Это  является самым небольным методом - не оставляет синяков. Используется тибетская глиняная чаша</p>
                                </div>




                        </div>
                    </div>

                <div class="col-lg-4 ">


                    <button type="button" class="btn btn-primary btn-round-lg btn-block " data-toggle="collapse" data-target="#thaipedu" >
                        Расслабляющий массаж стоп
                    </button>
                    <p></p>
                    <div id="thaipedu" class="collapse">
                        <!--  <div class="text-center"><img src='"""),_display_(/*398.67*/routes/*398.73*/.Assets.at("images/img/massage164.jpg")),format.raw/*398.112*/("""'
                                                        class="img-circle" alt="Medicine massage" width="250"
                                                        height="250"></a></div>-->
                        <div class="customBackGroundOfDiv" align="center">



                            <p class="massageText customWidth" >Используется для расслабления усталых стоп, увеличения жизненого тонуса, повышения иммунитета. Эта процедура подходит для многих людей, которые работают стоя или много ходитб также людей у которых мёрзнит стопы. Массаж стоп помогает восстановить и одохнуть всему телу.</p>
                        </div>




                    </div>
                </div>





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

                <div class="row">

                    <div class="col-md-8 col-md-offset-2">
                        <hr>
                        <h2>галерея</h2>
                        <hr>

                        <p></p>


                        <div class="col-lg-4 ">
                            <a href=""""),_display_(/*449.39*/routes/*449.45*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*449.85*/(""""> <img src=""""),_display_(/*449.99*/routes/*449.105*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*449.145*/("""" class="w3-image w3-round" alt="массажная кровать в комната Вида" ></a>
                        </div>

                        <p></p>
                        <div class="col-lg-4 ">
                            <a href=""""),_display_(/*454.39*/routes/*454.45*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*454.89*/(""""> <img src=""""),_display_(/*454.103*/routes/*454.109*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*454.153*/("""" class="w3-image w3-round" alt="Массаж горячими и холодными камнями" ></a>
                        </div>
                        <p></p>

                        <div class="col-lg-4 ">
                            <a href=""""),_display_(/*459.39*/routes/*459.45*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*459.84*/(""""> <img src=""""),_display_(/*459.98*/routes/*459.104*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*459.143*/("""" class="w3-image w3-round" alt="Камни и масла, используемые в массаже" ></a>
                        </div>


                    </div>
                </div>
        <div class="row">

            <div class="col-md-8 col-md-offset-2">
                <p></p>

                <div class="col-lg-4 ">
                    <a href=""""),_display_(/*471.31*/routes/*471.37*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*471.78*/(""""> <img src=""""),_display_(/*471.92*/routes/*471.98*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*471.139*/("""" class="w3-image w3-round" alt="Массажная кровать Виды" ></a>
                </div>
                <p></p>

                <div class="col-lg-4 ">
                    <a href=""""),_display_(/*476.31*/routes/*476.37*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*476.88*/(""""> <img src=""""),_display_(/*476.102*/routes/*476.108*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*476.159*/("""" class="w3-image w3-round" alt="Тибетская вакуумная чашка и масло используются" ></a>
                </div>
                <p></p>

                <div class="col-lg-4 ">
                    <a href=""""),_display_(/*481.31*/routes/*481.37*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*481.75*/(""""> <img src=""""),_display_(/*481.89*/routes/*481.95*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*481.133*/("""" class="w3-image w3-round" alt="Будда" ></a>
                </div>
                <p></p>




            </div>




        </div>

            </div>
        </div>
    </div>
    <a href="#цены" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>

</section>



<section class="content-section text-center ">
    <div class="contact-section " id="цены">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <div class="">
                    <hr>
                    <h2>цены</h2>
                    <hr>

                    <div class="w3-container customBackGroundOfDiv">

                        <p></p>
                        <h5 align="center" ><u>Спа-массажы</u></h5>

                        <table class="table table-inverse">
                            <th scope="row" id="ulo"><u></u></th>
                            <td><b><u>Время</u></b></td>
                            <td><b><u>Цена</u></b></td>
                            <tbody>
                            <tr>
                                <th scope="row" id="ulo2">Массаж с горячими – холодными комнями</th>
                                <td>90 min.</td>
                                <td>170 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Массаж с горячими – холодными комнями</th>
                                <td>120 min.</td>
                                <td>220 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Лимфодренаж тело</th>
                                <td>90 min.</td>

                                <td>140 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Лимфодренажный массаж лица</th>
                                <td>50 min.</td>

                                <td>90 CHF</td>
                            </tr>

                            <tr>
                                <th scope="row" id="ulo2">Аюрведический грудей массаж для женщин</th>
                                <td>60 min.</td>

                                <td>100 CHF</td>
                            </tr>

                            <tr>
                                <th scope="row" id="ulo2">Классический - Сегментный массаж спины</th>
                                <td>60 min.</td>

                                <td>100 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Классический - Сегментный массаж спины</th>
                                <td>90 min.</td>

                                <td>150 CHF</td>
                            </tr>



                            <tr>
                                <th scope="row" id="ulo2">Расслабляющий массаж всего тела</th>
                                <td>120 min.</td>

                                <td>200 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Расслабляющий массаж стоп</th>
                                <td>60 min.</td>

                                <td>100 CHF</td>
                            </tr>


                            </tbody>
                        </table>



                        <h5 align="center"><b><u>Другие массажы</u></b></h5>

                        <table class="table table-inverse">
                            <th scope="row" id="ulo"><u>Массаж отдельнных частей тело</u> </th>
                            <td><b><u>30min</u></b></td>
                            <td><b><u>60min</u></b></td>
                            <td><b><u>90min</u></b></td>
                            <tbody>

                            <tr>
                                <th scope="row" id="ulo2">Поясницы- Ягодицы - Ног массаж </th>
                                <td>50 CHF</td>
                                <td>100 CHF</td>
                                <td>-</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Плечо - шеи -  рук массаж</th>
                                <td>50 CHF</td>
                                <td>100 CHF</td>
                                <td>--</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Массаж головы</th>
                                <td>50 CHF</td>
                                <td>--</td>
                                <td>--</td>
                            </tr>



                            <tr>
                                <th scope="row" id="ulo2">Массаж  живота</th>
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



                            <th scope="row"><b><u id="ulo">Антицеллюлитный ручной массаж </u> </b></th>
                            <td><b><u>30min</u></b></td>
                            <td><b><u>60min</u></b></td>
                            <td><b><u>90min</u></b></td>
                            <tr>
                            <tbody>
                            <th scope="row" id="ulo2">Ягодицы</th>
                            <td>70 CHF</td>
                            <td>130 CHF</td>
                            <td>180 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Бедры</th>
                                <td>70 CHF</td>
                                <td>130 CHF</td>
                                <td>180 CHF</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">живота</th>
                                <td>70 CHF</td>
                                <td>130 CHF</td>
                                <td>180 CHF</td>
                            </tr>

                            <tr>
                                <th scope="row" id="ulo2">Массаж Предплечье</th>
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


                            <th scope="row" id="ulo"><b><u>Массаж для пожилых людей, пенсионеров (от 65 лет)<u></b></th>
                            <td><b><u></u></b></td>
                            <td><b><u>Цена</u></b></td>

                            <td><b><u></u></b></td>
                            <tbody>

                            <tr>
                                <th scope="row" id="ulo2">Потходят все спа и  отдельных частей массажы</th>
                                <td></td>
                                <td> -10% скидка</td>

                                <td></td>
                            </tr>


                            </tbody>
                        </table>
                        <p></p>



                        <h5 align="center"><b><u>Подарочные купоны</u></b></h5>

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
    </div>
    <a href="#bonpoc" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
</div>
</section>
<Usertact Section -->


    <section id="bonpoc" class="container content-section text-center">
        <div class="row">
            <div class="col-lg-12">
                <div class="">
                    <div class="container">

                        <h2>Задайте свой вопрос!</h2>
                        <p></p>
                        <div class="row">
                            <div class="col-md-8 col-md-offset-2">




                                """),_display_(/*773.34*/helper/*773.40*/.form(action = routes.HomeController.submitRU(),'class -> "form-horizontal")/*773.116*/ {_display_(Seq[Any](format.raw/*773.118*/("""




                                """),_display_(/*778.34*/helper/*778.40*/.input(contactForm("Имя"),'class->"form-control")/*778.89*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*778.118*/("""
                                """),format.raw/*779.33*/("""<input type="text" name=""""),_display_(/*779.59*/contactForm/*779.70*/.field("firstName").name),format.raw/*779.94*/(""""  placeholder="Ваше имя" id=""""),_display_(/*779.125*/id),format.raw/*779.127*/("""" """),_display_(/*779.130*/toHtmlArgs(args)),_display_(/*779.147*/if(contactForm.hasErrors)/*779.172*/ {_display_(Seq[Any](format.raw/*779.174*/("""
                                """),format.raw/*780.33*/("""<option value='"""),_display_(/*780.49*/contactForm/*780.60*/.field("firstName").value),format.raw/*780.85*/("""'></option>""")))}),format.raw/*780.97*/("""
                                """)))}),format.raw/*781.34*/("""



                                """),format.raw/*785.33*/("""<div id="xxx">
                                    """),_display_(/*786.38*/for(error <- contactForm("firstName").errors) yield /*786.83*/ {_display_(Seq[Any](format.raw/*786.85*/("""
                                    """),format.raw/*787.37*/("""<p id="xxxx">"""),_display_(/*787.51*/error/*787.56*/.format(messages())),format.raw/*787.75*/("""</p>
                                    """)))}),format.raw/*788.38*/("""</div>



                                """),_display_(/*792.34*/helper/*792.40*/.input(contactForm("Злектронная почта"),'class->"form-control")/*792.103*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*792.132*/("""
                                """),format.raw/*793.33*/("""<input type="text" name=""""),_display_(/*793.59*/contactForm/*793.70*/.field("email").name),format.raw/*793.90*/(""""  placeholder="Ваш адрес электронной почты" id=""""),_display_(/*793.140*/id),format.raw/*793.142*/("""" """),_display_(/*793.145*/toHtmlArgs(args)),_display_(/*793.162*/if(contactForm.hasErrors)/*793.187*/ {_display_(Seq[Any](format.raw/*793.189*/("""
                                """),format.raw/*794.33*/("""<option value='"""),_display_(/*794.49*/contactForm/*794.60*/.field("email").value),format.raw/*794.81*/("""'></option>""")))}),format.raw/*794.93*/("""
                                """)))}),format.raw/*795.34*/("""



                                """),format.raw/*799.33*/("""<div id="xxx">
                                    """),_display_(/*800.38*/for(error <- contactForm("email").errors) yield /*800.79*/ {_display_(Seq[Any](format.raw/*800.81*/("""
                                    """),format.raw/*801.37*/("""<p id="xxxx">"""),_display_(/*801.51*/error/*801.56*/.format(messages())),format.raw/*801.75*/("""</p>
                                    """)))}),format.raw/*802.38*/("""</div>







                                """),_display_(/*810.34*/helper/*810.40*/.input(field = contactForm("Вопрос"))/*810.77*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*810.106*/("""
                                """),format.raw/*811.33*/("""<div>
                                    <textarea class="form-control" name=""""),_display_(/*812.75*/contactForm("textbox")/*812.97*/.name),format.raw/*812.102*/("""" id=""""),_display_(/*812.109*/id),format.raw/*812.111*/("""" placeholder="Ваше сообщение" rows='5' cols='80'>"""),_display_(/*812.162*/if(contactForm.hasErrors)/*812.187*/{_display_(_display_(/*812.189*/contactForm/*812.200*/.field("textbox").value))}),format.raw/*812.224*/("""</textarea>
                                </div>
                                """)))}),format.raw/*814.34*/("""
                                """),format.raw/*815.33*/("""<div id="xxx">
                                    """),_display_(/*816.38*/for(error <- contactForm("textbox").errors) yield /*816.81*/ {_display_(Seq[Any](format.raw/*816.83*/("""
                                    """),format.raw/*817.37*/("""<p id="xxxx">"""),_display_(/*817.51*/error/*817.56*/.format(messages())),format.raw/*817.75*/("""</p>
                                    """)))}),format.raw/*818.38*/("""</div>



                                <button type="submit"  class="btn btn-default" >Отправить сообщение</button>

                                <div id="flash">"""),_display_(/*824.50*/flash/*824.55*/.get("success")),format.raw/*824.70*/("""</div>

                                """),_display_(/*826.34*/if(contactForm.hasGlobalErrors)/*826.65*/ {_display_(Seq[Any](format.raw/*826.67*/("""
                                """),format.raw/*827.33*/("""<div id="xxx">
                                    <p class="error" >
                                        """),_display_(/*829.42*/for(error <- contactForm.globalErrors) yield /*829.80*/ {_display_(Seq[Any](format.raw/*829.82*/("""
                                    """),format.raw/*830.37*/("""<p>"""),_display_(/*830.41*/error/*830.46*/.format(messages())),format.raw/*830.65*/("""</p>
                                    """),_display_(/*831.38*/for(error <- contactForm("email").errors) yield /*831.79*/ {_display_(Seq[Any](format.raw/*831.81*/("""
                                    """),format.raw/*832.37*/("""<p>"""),_display_(/*832.41*/error/*832.46*/.format(messages())),format.raw/*832.65*/("""</p>
                                    """)))}),format.raw/*833.38*/("""
                                    """)))}),format.raw/*834.38*/("""
                                    """),format.raw/*835.37*/("""</p>
                                </div>
                                """)))}),format.raw/*837.34*/("""
                                """)))}),format.raw/*838.34*/("""


                                """),format.raw/*841.33*/("""<p></p>
                                <h3>Наши социальные сети</h3>
                                <ul class="list-inline banner-social-buttons">
                                    <li><a href=""""),_display_(/*844.51*/routes/*844.57*/.HomeController.toFaceBook),format.raw/*844.83*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>


                </div>
            </div>
            """),_display_(/*853.14*/if(contactForm.hasErrors)/*853.39*/{_display_(Seq[Any](format.raw/*853.40*/("""<script src=""""),_display_(/*853.54*/routes/*853.60*/.Assets.at("javascripts/js/returnToFormOnFailRU.js")),format.raw/*853.112*/(""""></script>""")))}),format.raw/*853.124*/("""</script>
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
            <div class="col-lg-12 price-section2">
                <p></p>
                <h2>Контактная информация</h2>
                <p style="color:#fff;">
                    <strong><i class="fa fa-map-marker"></i> Aдрес</strong><br>
                    ---
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
<script src='"""),_display_(/*917.15*/routes/*917.21*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*917.70*/("""'></script>

<!-- Bootstrap Core JavaScript -->
<script src='"""),_display_(/*920.15*/routes/*920.21*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*920.83*/("""'></script>

<!-- Plugin JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
<script type="text/javascript"
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBtkVXlKJlSvm85a7oRDMLw4ZOZaxYwKxM&sensor=false"></script>

<!-- Theme JavaScript -->
<script src='"""),_display_(/*930.15*/routes/*930.21*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*930.66*/("""'></script>

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
                  SOURCE: /home/alex/git/web/app/views/russianContent.scala.html
                  HASH: 1ffda5275f95930ea1921475286a87f0ddbcdbc1
                  MATRIX: 1043->1|1179->66|1224->64|1251->83|1298->122|1348->135|1376->137|1870->604|1885->610|1936->640|3258->1935|3273->1941|3323->1970|3363->1983|3379->1989|3438->2026|3588->2149|3603->2155|3653->2184|3693->2197|3709->2203|3768->2240|3919->2364|3934->2370|3985->2400|4026->2413|4042->2419|4101->2456|5223->3551|5238->3557|5301->3599|7498->5768|7514->5774|7576->5813|11127->9336|11143->9342|11200->9376|13165->11313|13181->11319|13238->11353|14923->13010|14939->13016|15001->13055|18161->16187|18177->16193|18234->16227|19884->17849|19900->17855|19957->17889|21125->19029|21141->19035|21198->19069|22634->20477|22650->20483|22712->20522|24168->21950|24184->21956|24246->21995|25590->23311|25606->23317|25668->23357|25710->23371|25727->23377|25790->23417|26041->23640|26057->23646|26123->23690|26166->23704|26183->23710|26250->23754|26504->23980|26520->23986|26581->24025|26623->24039|26640->24045|26702->24084|27064->24418|27080->24424|27143->24465|27185->24479|27201->24485|27265->24526|27474->24707|27490->24713|27563->24764|27606->24778|27623->24784|27697->24835|27930->25040|27946->25046|28006->25084|28048->25098|28064->25104|28125->25142|37617->34606|37633->34612|37720->34688|37762->34690|37828->34728|37844->34734|37903->34783|37972->34812|38034->34845|38088->34871|38109->34882|38155->34906|38215->34937|38240->34939|38272->34942|38311->34959|38347->34984|38389->34986|38451->35019|38495->35035|38516->35046|38563->35071|38607->35083|38673->35117|38738->35153|38818->35205|38880->35250|38921->35252|38987->35289|39029->35303|39044->35308|39085->35327|39159->35369|39230->35412|39246->35418|39320->35481|39389->35510|39451->35543|39505->35569|39526->35580|39568->35600|39647->35650|39672->35652|39704->35655|39743->35672|39779->35697|39821->35699|39883->35732|39927->35748|39948->35759|39991->35780|40035->35792|40101->35826|40166->35862|40246->35914|40304->35955|40345->35957|40411->35994|40453->36008|40468->36013|40509->36032|40583->36074|40658->36121|40674->36127|40721->36164|40790->36193|40852->36226|40960->36306|40992->36328|41020->36333|41056->36340|41081->36342|41161->36393|41197->36418|41229->36420|41251->36431|41300->36455|41416->36539|41478->36572|41558->36624|41618->36667|41659->36669|41725->36706|41767->36720|41782->36725|41823->36744|41897->36786|42094->36955|42109->36960|42146->36975|42215->37016|42256->37047|42297->37049|42359->37082|42498->37193|42553->37231|42594->37233|42660->37270|42692->37274|42707->37279|42748->37298|42818->37340|42876->37381|42917->37383|42983->37420|43015->37424|43030->37429|43071->37448|43145->37490|43215->37528|43281->37565|43390->37642|43456->37676|43520->37711|43747->37910|43763->37916|43811->37942|44143->38246|44178->38271|44218->38272|44260->38286|44276->38292|44351->38344|44396->38356|45765->39698|45781->39704|45852->39753|45942->39815|45958->39821|46042->39883|46577->40390|46593->40396|46660->40441
                  LINES: 30->1|33->2|36->1|37->3|37->3|37->3|39->5|48->14|48->14|48->14|82->48|82->48|82->48|82->48|82->48|82->48|86->52|86->52|86->52|86->52|86->52|86->52|90->56|90->56|90->56|90->56|90->56|90->56|129->95|129->95|129->95|193->159|193->159|193->159|237->203|237->203|237->203|266->232|266->232|266->232|296->262|296->262|296->262|342->308|342->308|342->308|362->328|362->328|362->328|383->349|383->349|383->349|406->372|406->372|406->372|432->398|432->398|432->398|483->449|483->449|483->449|483->449|483->449|483->449|488->454|488->454|488->454|488->454|488->454|488->454|493->459|493->459|493->459|493->459|493->459|493->459|505->471|505->471|505->471|505->471|505->471|505->471|510->476|510->476|510->476|510->476|510->476|510->476|515->481|515->481|515->481|515->481|515->481|515->481|807->773|807->773|807->773|807->773|812->778|812->778|812->778|812->778|813->779|813->779|813->779|813->779|813->779|813->779|813->779|813->779|813->779|813->779|814->780|814->780|814->780|814->780|814->780|815->781|819->785|820->786|820->786|820->786|821->787|821->787|821->787|821->787|822->788|826->792|826->792|826->792|826->792|827->793|827->793|827->793|827->793|827->793|827->793|827->793|827->793|827->793|827->793|828->794|828->794|828->794|828->794|828->794|829->795|833->799|834->800|834->800|834->800|835->801|835->801|835->801|835->801|836->802|844->810|844->810|844->810|844->810|845->811|846->812|846->812|846->812|846->812|846->812|846->812|846->812|846->812|846->812|846->812|848->814|849->815|850->816|850->816|850->816|851->817|851->817|851->817|851->817|852->818|858->824|858->824|858->824|860->826|860->826|860->826|861->827|863->829|863->829|863->829|864->830|864->830|864->830|864->830|865->831|865->831|865->831|866->832|866->832|866->832|866->832|867->833|868->834|869->835|871->837|872->838|875->841|878->844|878->844|878->844|887->853|887->853|887->853|887->853|887->853|887->853|887->853|951->917|951->917|951->917|954->920|954->920|954->920|964->930|964->930|964->930
                  -- GENERATED --
              */
          