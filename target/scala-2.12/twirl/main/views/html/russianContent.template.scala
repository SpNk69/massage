
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
"""),format.raw/*4.1*/("""<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                Menu <i class="fa fa-bars"></i>
            </button>
            <a class="navbar-brand page-scroll" href='"""),_display_(/*11.56*/routes/*11.62*/.HomeController.russianVersion),format.raw/*11.92*/("""'>
                <i class="fa fa-play-circle"></i> <span class="light">Vida</span> Mассажы
            </a>
        </div>
        <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
            <ul class="nav navbar-nav">
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
                    <a class="page-scroll" href='"""),_display_(/*39.51*/routes/*39.57*/.HomeController.germanVersion),format.raw/*39.86*/("""'><img src='"""),_display_(/*39.99*/routes/*39.105*/.Assets.at("images/img/flag-de2.png")),format.raw/*39.142*/("""' alt="Немецкий язык" /></a>
                </li>
                <li>
                    <a class="page-scroll" href='"""),_display_(/*42.51*/routes/*42.57*/.HomeController.pagrindinisLT),format.raw/*42.86*/("""'><img src='"""),_display_(/*42.99*/routes/*42.105*/.Assets.at("images/img/flag-lt2.png")),format.raw/*42.142*/("""' alt="Литовский язык" /></a>
                </li>
                <li>
                    <a class="page-scroll" href=""""),_display_(/*45.51*/routes/*45.57*/.HomeController.russianVersion),format.raw/*45.87*/(""""><img src='"""),_display_(/*45.100*/routes/*45.106*/.Assets.at("images/img/flag-rus.png")),format.raw/*45.143*/("""' alt="Русский язык" /></a>
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
                    <p class="intro-text">Массаж является одним из особых факторов в жизни человека, помогая поддерживать хорошее тело и душу. И нет ничего лучше, чем после тяжелого и усталого рабочего дня, расслабиться и оживить cвое тело массажными процедурами.</p>
                    <a href="#obo" class="btn btn-circle page-scroll">
                        <i class="fa fa-angle-double-down animated"></i>
                    </a>
                </div>
            </div>
        </div>
    </div>
</header>
<section id="obo" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-6">
            <img src='"""),_display_(/*69.24*/routes/*69.30*/.Assets.at("images/img/Vida-Polescuk.jpg")),format.raw/*69.72*/("""' class="img-circle" alt="Вида Полешчук" id="what">
        </div>
        <p></p>
        <div class="col-lg-6">
            <h3 align="center"><em>Образование</em></h3>
            <ul><li>"Вильнюсская высшая медицинская школа. Литва.</li>
                <li>Клайпедский университет. Степень бакалавра в области общественного здравоохранения. Литва.</li>
                <li>2010 г. - "Baltic SPA Professional" курсы (Латвия), спа-массажы.</li>
                <li> 2012 г. - Центр развития и специализации медсестринского персонала: Сертификат Нет KV 120146 - предоставляется право делать терапевтические (лечебные) массажы.</li>
            </ul>
            <p></p>
            <h3 align="center"><em>Опыт работы</em></h3>
            <ul align="center">
                <li>27 лет: медицинская сестра.</li>
                <li> 7 лет: специалист общественного здравоохранения.</li>
                <li>7 лет: массажист.</li>
            </ul>
            <p></p>
            <h3 align="center"><em>Сертификаты SPA</em></h3>
            <ul>
                <li>Классический сегментный массаж</li>
                <li>Массаж горячими - холодными камнями</li>
                <li>Лимфодренажный массаж</li>
                <li>Тайский массаж стоп</li>
                <li>Традиционный аюрведический Керал массаж</li>
            </ul>
        </div>
    </div>
    <a href="#mассажы" class="btn btn-circle page-scroll">
        <i class="fa fa-angle-double-down animated"></i>
    </a>
</section>
<section id="mассажы" class="content-section text-center">
    <div class="download-section">
        <h1 id="vienas">Оздоровительный массаж</h1>
        <div class="container">
            <div class="row">
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#limfodrenazinis">
                        Лимфодренажный массаж
                    </button>
                    <p></p>
                    <div id="limfodrenazinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo">
                                Лимфодренажный массаж тела
                            </button>
                            <div id="limfo" class="collapse customWidth"> <p class="massageText">Это безопасный эффективный способ укрепления здоровья и поддержания благосостояния. У здоровых людей это профилактическая мера для поддержания нормального метаболизма. Во время массажа регенерация поврежденных мягких тканей активирует воспалительные процессы, укрепляет иммунную систему, улучшает подачу кислорода в ткани. Это помогает устранить избыток жидкости из ткани и органов.</br>
                                Лимфодренаж подходит для тех, кто чувствует отек ног, или просто усталость. После долгого дня, он расслабляет уставшие ноги и дает ощущение легкости. Он также подходит для людей, чьи ноги всегда холодные.</br>
                                Эта цель красоты массажа используется для лечения и профилактики целлюлита, подтягивания кожи, улучшения общего состояния здоровья и уменьшить отек после пластической хирургии.</br>
                                Этот массаж проводится для женщин и мужчин.</br>
                                Для лечения - рекомендует делает каждый день, для профилактики - делать 2-3 раза в неделю. Желаемый эффект достигается после 15 процедур.
                            </p> </div>
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#limfo2">
                                Лимфодренажный массаж лица
                            </button>
                            <div id="limfo2" class="collapse customWidth"><p class="massageText">При постоянном напряжении и усталости, мышцы лица замерзает бывает маска ,,печаль". Лимфа cтекает сложнее, удаляя токсичные и метаболические продукты.</br>
                                Лицевой лимфатический дренаж дает отличные результаты:</br>
                                при опухлости лица</br>
                                при обезвоживание кожи</br>
                                ранние старение</br>
                                темные круги и мешки под глазами</br>
                                снижение эластичности тканей и мышц,</br>
                                Купероз на лицею</br>
                                Уменьшаетса лица вялось, мы получаем выраженую упругость лица, разглаживаетса морщины.</br>
                                Для профилактики - делать 2-3 раза в неделю. Желаемый эффект достигается после 15 процедур.</p> </div>
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#karstusaltu">Горячих - холодных камней массаж
                    </button>
                    <p></p>
                    <div id="karstusaltu" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
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
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#segmentinis">Классический - Сегментный массаж спины
                    </button>
                    <p></p>
                    <div id="segmentinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth"> Этот массаж идеально подходит для людей, которые проводят весь день стоя или сидя, например, за компьютером или за рулем автомобиля, а также тяжело физически работая , когда все напряжение сосредоточено в позвоночнике, шее и плечах, поясе и ягодицах, вызывая болезненные ощущения в мышцах. Этот массаж особенно подходит после тренировки при длительной и кратковременной боли. Кроме того, неправильное положение позвоночника часто вызывает головную боль.
                                </br> Периодический массаж поможет вам избавиться от:
                                </br> частых болей в спине,
                                </br> головных болей,
                                </br>расслабить напряженные группы мышц.
                                После массажа вы почувствуете себя расслабленным и энергичным.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#demo33">
                        Массаж отдельнных частей тело
                    </button>
                    <p></p>
                    <div id="demo33" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#galva">
                                Массаж головы
                            </button>
                            <div id="galva" class="collapse customWidth"><p class="massageText">Уменьшает стресс, головные боли, улучшает кровообращение.</p> </div>
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#peciai">
                                Плечо - шеи - рук массаж
                            </button>
                            <div id="peciai" class="collapse customWidth"><p class="massageText">Наиболее эффективное средство для устранения неприятных симптомов. Уже после первого раза вы почувствуете улучшение общего состояния. После полного курса массажа исчезают болезненные ощущения, поевляетса бодрость, возрастает работоспособность, исчезает бессонница и раздражительность. Это отличный способ избавиться от боли в голове, шее, плечах и онемение рук.</p> </div>
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#pilvo">
                                Абдоминальный массаж
                            </button>
                            <div id="pilvo" class="collapse customWidth"><p class="massageText">стимулирует пищеварение, оказывает положительное влияние на внутрибрюшные органы, улучшает функции желудка и кишечника, а также секрецию желчи, помогает при запоре или накоплении газа в кишечнике.</p></div>
                            <button type="button" class="btn btn-primary btn-round-lg btn-xs btn-block btn-width-custom" data-toggle="collapse" data-target="#juosmens">
                                Поясницы- Ягодицы - Ног Массаж
                            </button>
                            <div id="juosmens" class="collapse customWidth"><p class="massageText">Улучшает циркуляцию крови и лимфы в пояснице и ногах, расслабляет напряженные мышцы, уменьшает поясничные, ягодицы, ногах боль, укрепляет ослабленные мышцы.
                                Уменьшает боль после операции, уменьшает воспаление нервных корешков.</p></div>
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#vyresnio">Массаж для пожилых людей
                    </button>
                    <p></p>
                    <div id="vyresnio" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth">Массаж - необходимая и очень полезная процедура для пожилых людей, пенсионеров. Исследования показали, что массаж замедляет процесс старения. Также массаж оказывает успокаивающее действие по всему телу и может уменьшить боль. Массаж может помочь людям, страдающим от мышечных болей : Например, те кто страдает от артрита, массаж помогает уменьшить боль, увеличивает амплитуду движения в суставах. Когда человек страдает, он становится все менее и менее активным, влияющий на качество жизни и здоровье. Массаж улучшает кровообращение, устраняет мышечную усталость, а мышцы получают тонус. Это улучшает качество жизни пожилого человека.
                                </br>Перед массажем необходимо проконсультироваться с врачом. Как только вы получите разрешение врача на массаж, вы можете спокойно связаться со мной.</p>
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#atpalaiduojantis">Расслабляющий массаж всего тела
                    </button>
                    <p></p>
                    <div id="atpalaiduojantis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth"> Aсслабляющий массаж для тех, кто хочет расслабиться после напряженного рабочего дня, забыть и уйти от ежедневной рутины. Устраняет напряжение и стресс, спазмы cпины и головные боли, расслабляет мышцы, позитивно влияет на внутреннее состояние организма, улучшает настроение и восстанавливает энергию. </p>
                        </div>
                    </div>
                    <p></p>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#ajurvedinis">Аюрведический массаж грудей
                    </button>
                    <p></p>
                    <div id="ajurvedinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth"> Он оказывает положительное влияние на всю систему репродуктивных органов у женщин и помогает сбалансировать гормональную систему, уменьшает неприятное ощущение груди, связанное с менструальным циклом, у грудей появляетса упругость, улучшается их форма, делает их более здоровыми и практически исчезает риск рака молочной железы.
                                </br> Массаж выполняется с применением растительных масел и длится до одного часа. Включает в себя работу с шеей (задняя и передняя поверхности) и плечами, работу с областью подмышек, руками, животом, и, конечно же, с грудью.</p>
                        </div>
                    </div>
                    <p></p>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#anticeliulitinis">
                        Антицеллюлитный массаж
                    </button>
                    <p></p>
                    <div id="anticeliulitinis" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth">Это особенно эффективный способ борьбы с целлюлитом, который используется для уменьшения неравномерной подкожной (целлюлитной) проблемы в определенных проблемных областях - бедрах, ягодицах и брюшной полости.
                                </br>Массаж стимулирует циркуляцию лимфы, повышает мышечный тонус и сокращение за счет уменьшения целлюлита и припухлости. Очищает организм от шлаков и оказывает выраженный косметический эффект.
                                </br> Это является самым небольным методом - не оставляет синяков. Используется тибетская глиняная чаша</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-primary btn-round-lg btn-block" data-toggle="collapse" data-target="#thaipedu">
                        Расслабляющий массаж стоп
                    </button>
                    <p></p>
                    <div id="thaipedu" class="collapse">
                        <div class="customBackGroundOfDiv" align="center">
                            <p class="massageText customWidth">Используется для расслабления усталых стоп, увеличения жизненого тонуса, повышения иммунитета. Эта процедура подходит для многих людей, которые работают стоя или много ходитб также людей у которых мёрзнит стопы. Массаж стоп помогает восстановить и одохнуть всему телу.</p>
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
</section>
<section id="галерея" class="content-section text-center">
    <div class="row">
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <hr>
                <h1>галерея</h1>
                <hr>
                <p></p>
                <div class="col-lg-4">
                    <a href=""""),_display_(/*284.31*/routes/*284.37*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*284.77*/(""""> <img src=""""),_display_(/*284.91*/routes/*284.97*/.Assets.at("images/img/massage-bed.jpg")),format.raw/*284.137*/("""" class="w3-image w3-round" alt="массажная кровать в комната Вида"></a>
                </div>
                <p></p>
                <div class="col-lg-4">
                    <a href=""""),_display_(/*288.31*/routes/*288.37*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*288.81*/(""""> <img src=""""),_display_(/*288.95*/routes/*288.101*/.Assets.at("images/img/hot-cold-stones.jpg")),format.raw/*288.145*/("""" class="w3-image w3-round" alt="Массаж горячими и холодными камнями"></a>
                </div>
                <p></p>
                <div class="col-lg-4">
                    <a href=""""),_display_(/*292.31*/routes/*292.37*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*292.76*/(""""> <img src=""""),_display_(/*292.90*/routes/*292.96*/.Assets.at("images/img/stones-oil.jpg")),format.raw/*292.135*/("""" class="w3-image w3-round" alt="Камни и масла, используемые в массаже"></a>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <p></p>
                <div class="col-lg-4">
                    <a href=""""),_display_(/*300.31*/routes/*300.37*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*300.78*/(""""> <img src=""""),_display_(/*300.92*/routes/*300.98*/.Assets.at("images/img/massage-bed2.jpg")),format.raw/*300.139*/("""" class="w3-image w3-round" alt="Массажная кровать Виды"></a>
                </div>
                <p></p>
                <div class="col-lg-4">
                    <a href=""""),_display_(/*304.31*/routes/*304.37*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*304.88*/(""""> <img src=""""),_display_(/*304.102*/routes/*304.108*/.Assets.at("images/img/tibetan-vacuum-cup-oil.jpg")),format.raw/*304.159*/("""" class="w3-image w3-round" alt="Тибетская вакуумная чашка и масло используются"></a>
                </div>
                <p></p>
                <div class="col-lg-4">
                    <a href=""""),_display_(/*308.31*/routes/*308.37*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*308.75*/(""""> <img src=""""),_display_(/*308.89*/routes/*308.95*/.Assets.at("images/img/Vida-buda.jpg")),format.raw/*308.133*/("""" class="w3-image w3-round" alt="Будда"></a>
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
<section class="content-section text-center">
    <div class="contact-section" id="цены">
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <div class="">
                    <hr>
                    <h1>цены</h1>
                    <hr>
                    <div class="w3-container customBackGroundOfDiv">
                        <p></p>
                        <h5 align="center"><em>Спа-массажы</em></h5>
                        <table class="table table-inverse">
                            <th scope="row" id="ulo"><em></em></th>
                            <td><b><em>Время</em></b></td>
                            <td><b><em>Цена</em></b></td>
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
                        <h5 align="center"><b><em>Другие массажы</em></b></h5>
                        <table class="table table-inverse">
                            <th scope="row" id="ulo"><em>Массаж отдельнных частей тело</em> </th>
                            <td><b><em>30min</em></b></td>
                            <td><b><em>60min</em></b></td>
                            <td><b><em>90min</em></b></td>
                            <tbody>
                            <tr>
                                <th scope="row" id="ulo2">Поясницы- Ягодицы - Ног массаж </th>
                                <td>50 CHF</td>
                                <td>100 CHF</td>
                                <td>-</td>
                            </tr>
                            <tr>
                                <th scope="row" id="ulo2">Плечо - шеи - рук массаж</th>
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
                                <th scope="row" id="ulo2">Массаж живота</th>
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
                            <th scope="row"><b><u id="ulo">Антицеллюлитный ручной массаж </em> </b></th>
                            <td><b><em>30min</em></b></td>
                            <td><b><em>60min</em></b></td>
                            <td><b><em>90min</em></b></td>
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
                            <th scope="row" id="ulo"><b><em>Массаж для пожилых людей, пенсионеров (от 65 лет)<em></b></th>
                            <td><b><em></em></b></td>
                            <td><b><em>Цена</em></b></td>
                            <td><b><em></em></b></td>
                            <tbody>
                            <tr>
                                <th scope="row" id="ulo2">Потходят все спа и отдельных частей массажы</th>
                                <td></td>
                                <td> -10% скидка</td>
                                <td></td>
                            </tr>
                            </tbody>
                        </table>
                        <p></p>
                        <h5 align="center"><b><em>Подарочные купоны</em></b></h5>
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
                                """),_display_(/*510.34*/helper/*510.40*/.form(action = routes.HomeController.submitRU(),'class -> "form-horizontal")/*510.116*/ {_display_(Seq[Any](format.raw/*510.118*/("""
                                """),_display_(/*511.34*/helper/*511.40*/.input(contactForm("Имя"),'class->"form-control")/*511.89*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*511.118*/("""
                                """),format.raw/*512.33*/("""<input type="text" name=""""),_display_(/*512.59*/contactForm/*512.70*/.field("firstName").name),format.raw/*512.94*/("""" placeholder="Ваше имя" id=""""),_display_(/*512.124*/id),format.raw/*512.126*/("""" """),_display_(/*512.129*/toHtmlArgs(args)),_display_(/*512.146*/if(contactForm.hasErrors)/*512.171*/ {_display_(Seq[Any](format.raw/*512.173*/(""" """),format.raw/*512.174*/("""<option value='"""),_display_(/*512.190*/contactForm/*512.201*/.field("firstName").value),format.raw/*512.226*/("""'></option>""")))}),format.raw/*512.238*/("""
                                """)))}),format.raw/*513.34*/("""
                                """),format.raw/*514.33*/("""<div id="xxx">
                                    """),_display_(/*515.38*/for(error <- contactForm("firstName").errors) yield /*515.83*/ {_display_(Seq[Any](format.raw/*515.85*/(""" """),format.raw/*515.86*/("""<p id="xxxx">"""),_display_(/*515.100*/error/*515.105*/.format(messages())),format.raw/*515.124*/("""</p>
                                    """)))}),format.raw/*516.38*/("""</div>
                                """),_display_(/*517.34*/helper/*517.40*/.input(contactForm("Злектронная почта"),'class->"form-control")/*517.103*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*517.132*/("""
                                """),format.raw/*518.33*/("""<input type="text" name=""""),_display_(/*518.59*/contactForm/*518.70*/.field("email").name),format.raw/*518.90*/("""" placeholder="Ваш адрес электронной почты" id=""""),_display_(/*518.139*/id),format.raw/*518.141*/("""" """),_display_(/*518.144*/toHtmlArgs(args)),_display_(/*518.161*/if(contactForm.hasErrors)/*518.186*/ {_display_(Seq[Any](format.raw/*518.188*/(""" """),format.raw/*518.189*/("""<option value='"""),_display_(/*518.205*/contactForm/*518.216*/.field("email").value),format.raw/*518.237*/("""'></option>""")))}),format.raw/*518.249*/("""
                                """)))}),format.raw/*519.34*/("""
                                """),format.raw/*520.33*/("""<div id="xxx">
                                    """),_display_(/*521.38*/for(error <- contactForm("email").errors) yield /*521.79*/ {_display_(Seq[Any](format.raw/*521.81*/(""" """),format.raw/*521.82*/("""<p id="xxxx">"""),_display_(/*521.96*/error/*521.101*/.format(messages())),format.raw/*521.120*/("""</p>
                                    """)))}),format.raw/*522.38*/("""</div>
                                """),_display_(/*523.34*/helper/*523.40*/.input(field = contactForm("Вопрос"))/*523.77*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*523.106*/("""
                                """),format.raw/*524.33*/("""<div>
                                    <textarea class="form-control" name=""""),_display_(/*525.75*/contactForm("textbox")/*525.97*/.name),format.raw/*525.102*/("""" id=""""),_display_(/*525.109*/id),format.raw/*525.111*/("""" placeholder="Ваше сообщение" rows='5' cols='80'>"""),_display_(/*525.162*/if(contactForm.hasErrors)/*525.187*/{_display_(_display_(/*525.189*/contactForm/*525.200*/.field("textbox").value))}),format.raw/*525.224*/("""</textarea>
                                </div>
                                """)))}),format.raw/*527.34*/("""
                                """),format.raw/*528.33*/("""<div id="xxx">
                                    """),_display_(/*529.38*/for(error <- contactForm("textbox").errors) yield /*529.81*/ {_display_(Seq[Any](format.raw/*529.83*/(""" """),format.raw/*529.84*/("""<p id="xxxx">"""),_display_(/*529.98*/error/*529.103*/.format(messages())),format.raw/*529.122*/("""</p>
                                    """)))}),format.raw/*530.38*/("""</div>
                                <button type="submit" class="btn btn-default">Отправить сообщение</button>
                                <div id="flash">"""),_display_(/*532.50*/flash/*532.55*/.get("success")),format.raw/*532.70*/("""</div>
                                """),_display_(/*533.34*/if(contactForm.hasGlobalErrors)/*533.65*/ {_display_(Seq[Any](format.raw/*533.67*/("""
                                """),format.raw/*534.33*/("""<div id="xxx">
                                    <p class="error">
                                        """),_display_(/*536.42*/for(error <- contactForm.globalErrors) yield /*536.80*/ {_display_(Seq[Any](format.raw/*536.82*/(""" """),format.raw/*536.83*/("""<p>"""),_display_(/*536.87*/error/*536.92*/.format(messages())),format.raw/*536.111*/("""</p>
                                    """),_display_(/*537.38*/for(error <- contactForm("email").errors) yield /*537.79*/ {_display_(Seq[Any](format.raw/*537.81*/(""" """),format.raw/*537.82*/("""<p>"""),_display_(/*537.86*/error/*537.91*/.format(messages())),format.raw/*537.110*/("""</p>
                                    """)))}),format.raw/*538.38*/("""
                                    """)))}),format.raw/*539.38*/("""
                                    """),format.raw/*540.37*/("""</p>
                                </div>
                                """)))}),format.raw/*542.34*/("""
                                """)))}),format.raw/*543.34*/("""
                                """),format.raw/*544.33*/("""<p></p>
                                <h3>Наши социальные сети</h3>
                                <ul class="list-inline banner-social-buttons">
                                    <li><a href=""""),_display_(/*547.51*/routes/*547.57*/.HomeController.toFaceBook),format.raw/*547.83*/("""" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            """),_display_(/*554.14*/if(contactForm.hasErrors)/*554.39*/{_display_(Seq[Any](format.raw/*554.40*/("""<script src=""""),_display_(/*554.54*/routes/*554.60*/.Assets.at("javascripts/js/returnToFormOnFailRU.js")),format.raw/*554.112*/(""""></script>""")))}),format.raw/*554.124*/("""</script>
        </div>
        <a href="#контакты" class="btn btn-circle page-scroll">
            <i class="fa fa-angle-double-down animated"></i>
        </a>
    </section>
    <section>
        <hr>
        <div id="контакты" class="text-center">
            <div class="row">
                <div class="col-lg-12 price-section2">
                    <p></p>
                    <h1>Контактная информация</h1>
                    <p>
                        <strong><i class="fa fa-map-marker"></i> Aдрес</strong><br>
                        ---
                    </p>
                    <p><strong><i class="fa fa-phone"></i> Hомер телефона</strong><br>
                        +41 797897010</p>
                    <p>
                        <strong><i class="fa fa-envelope"></i> Злектронная почта</strong><br>
                        info@vidamassage.ch</p>
                    <p></p>
                </div>
            </div>
        </div>
        <hr>
    </section>
    <section>
        <div id="mappp" class="text-center">
            <div class="row">
                <div class="col-lg-12">
                    <h1>карта</h1>
                </div>
            </div>
        </div>
    </section>
    <footer>
        <div class="container text-center">
            <p>Copyright &copy; Vida Massage 2017</p>
        </div>
    </footer>
    <script src='"""),_display_(/*596.19*/routes/*596.25*/.Assets.at("stylesheets/vendor/jquery/jquery.js")),format.raw/*596.74*/("""'></script>
    <script src='"""),_display_(/*597.19*/routes/*597.25*/.Assets.at("stylesheets/vendor/bootstrap/js/bootstrap.min.js")),format.raw/*597.87*/("""'></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBtkVXlKJlSvm85a7oRDMLw4ZOZaxYwKxM&sensor=false"></script>
    <script src='"""),_display_(/*600.19*/routes/*600.25*/.Assets.at("javascripts/js/grayscale.min.js")),format.raw/*600.70*/("""'></script>
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
                  SOURCE: /home/alex/git/web/app/views/russianContent.scala.html
                  HASH: 251b9705aaeabb9f1bf0bb1de3de7ff7fc78250b
                  MATRIX: 1043->1|1179->66|1224->64|1251->83|1298->122|1348->135|1375->136|1848->582|1863->588|1914->618|3035->1712|3050->1718|3100->1747|3140->1760|3156->1766|3215->1803|3364->1925|3379->1931|3429->1960|3469->1973|3485->1979|3544->2016|3694->2139|3709->2145|3760->2175|3801->2188|3817->2194|3876->2231|4881->3209|4896->3215|4959->3257|21977->20247|21993->20253|22055->20293|22097->20307|22113->20313|22176->20353|22392->20541|22408->20547|22474->20591|22516->20605|22533->20611|22600->20655|22819->20846|22835->20852|22896->20891|22938->20905|22954->20911|23016->20950|23348->21254|23364->21260|23427->21301|23469->21315|23485->21321|23549->21362|23755->21540|23771->21546|23844->21597|23887->21611|23904->21617|23978->21668|24208->21870|24224->21876|24284->21914|24326->21928|24342->21934|24403->21972|33847->31388|33863->31394|33950->31470|33992->31472|34054->31506|34070->31512|34129->31561|34198->31590|34260->31623|34314->31649|34335->31660|34381->31684|34440->31714|34465->31716|34497->31719|34536->31736|34572->31761|34614->31763|34645->31764|34690->31780|34712->31791|34760->31816|34805->31828|34871->31862|34933->31895|35013->31947|35075->31992|35116->31994|35146->31995|35189->32009|35205->32014|35247->32033|35321->32075|35389->32115|35405->32121|35479->32184|35548->32213|35610->32246|35664->32272|35685->32283|35727->32303|35805->32352|35830->32354|35862->32357|35901->32374|35937->32399|35979->32401|36010->32402|36055->32418|36077->32429|36121->32450|36166->32462|36232->32496|36294->32529|36374->32581|36432->32622|36473->32624|36503->32625|36545->32639|36561->32644|36603->32663|36677->32705|36745->32745|36761->32751|36808->32788|36877->32817|36939->32850|37047->32930|37079->32952|37107->32957|37143->32964|37168->32966|37248->33017|37284->33042|37316->33044|37338->33055|37387->33079|37503->33163|37565->33196|37645->33248|37705->33291|37746->33293|37776->33294|37818->33308|37834->33313|37876->33332|37950->33374|38141->33537|38156->33542|38193->33557|38261->33597|38302->33628|38343->33630|38405->33663|38543->33773|38598->33811|38639->33813|38669->33814|38701->33818|38716->33823|38758->33842|38828->33884|38886->33925|38927->33927|38957->33928|38989->33932|39004->33937|39046->33956|39120->33998|39190->34036|39256->34073|39365->34150|39431->34184|39493->34217|39720->34416|39736->34422|39784->34448|40114->34750|40149->34775|40189->34776|40231->34790|40247->34796|40322->34848|40367->34860|41775->36241|41791->36247|41862->36296|41920->36326|41936->36332|42020->36394|42332->36678|42348->36684|42415->36729
                  LINES: 30->1|33->2|36->1|37->3|37->3|37->3|38->4|45->11|45->11|45->11|73->39|73->39|73->39|73->39|73->39|73->39|76->42|76->42|76->42|76->42|76->42|76->42|79->45|79->45|79->45|79->45|79->45|79->45|103->69|103->69|103->69|318->284|318->284|318->284|318->284|318->284|318->284|322->288|322->288|322->288|322->288|322->288|322->288|326->292|326->292|326->292|326->292|326->292|326->292|334->300|334->300|334->300|334->300|334->300|334->300|338->304|338->304|338->304|338->304|338->304|338->304|342->308|342->308|342->308|342->308|342->308|342->308|544->510|544->510|544->510|544->510|545->511|545->511|545->511|545->511|546->512|546->512|546->512|546->512|546->512|546->512|546->512|546->512|546->512|546->512|546->512|546->512|546->512|546->512|546->512|547->513|548->514|549->515|549->515|549->515|549->515|549->515|549->515|549->515|550->516|551->517|551->517|551->517|551->517|552->518|552->518|552->518|552->518|552->518|552->518|552->518|552->518|552->518|552->518|552->518|552->518|552->518|552->518|552->518|553->519|554->520|555->521|555->521|555->521|555->521|555->521|555->521|555->521|556->522|557->523|557->523|557->523|557->523|558->524|559->525|559->525|559->525|559->525|559->525|559->525|559->525|559->525|559->525|559->525|561->527|562->528|563->529|563->529|563->529|563->529|563->529|563->529|563->529|564->530|566->532|566->532|566->532|567->533|567->533|567->533|568->534|570->536|570->536|570->536|570->536|570->536|570->536|570->536|571->537|571->537|571->537|571->537|571->537|571->537|571->537|572->538|573->539|574->540|576->542|577->543|578->544|581->547|581->547|581->547|588->554|588->554|588->554|588->554|588->554|588->554|588->554|630->596|630->596|630->596|631->597|631->597|631->597|634->600|634->600|634->600
                  -- GENERATED --
              */
          