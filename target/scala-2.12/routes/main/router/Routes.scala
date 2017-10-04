
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/alex/git/web/conf/routes
// @DATE:Wed Oct 04 20:18:06 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  Assets_1: controllers.Assets,
  // @LINE:10
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    Assets_1: controllers.Assets,
    // @LINE:10
    HomeController_0: controllers.HomeController
  ) = this(errorHandler, Assets_1, HomeController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_1, HomeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """robots.txt""", """controllers.Assets.at(path:String = "/public", file:String = "robots.txt")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sitemap.xml""", """controllers.Assets.at(path:String = "/public", file:String = "sitemap.xml")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lt""", """controllers.HomeController.pagrindinisLT"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """toFaceBook""", """controllers.HomeController.toFaceBook"""),
    ("""GET""", this.prefix, """controllers.HomeController.germanVersion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ru""", """controllers.HomeController.russianVersion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitLT""", """controllers.HomeController.submitLT()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitRU""", """controllers.HomeController.submitRU()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitDE""", """controllers.HomeController.submitDE()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_Assets_at0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("robots.txt")))
  )
  private[this] lazy val controllers_Assets_at0_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """robots.txt""",
      """ Routes
 This file defines all application routes (Higher priority routes first)
 ~~~~""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_Assets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sitemap.xml")))
  )
  private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """sitemap.xml""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_pagrindinisLT3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lt")))
  )
  private[this] lazy val controllers_HomeController_pagrindinisLT3_invoker = createInvoker(
    HomeController_0.pagrindinisLT,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "pagrindinisLT",
      Nil,
      "GET",
      this.prefix + """lt""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_toFaceBook4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("toFaceBook")))
  )
  private[this] lazy val controllers_HomeController_toFaceBook4_invoker = createInvoker(
    HomeController_0.toFaceBook,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "toFaceBook",
      Nil,
      "GET",
      this.prefix + """toFaceBook""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_germanVersion5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_germanVersion5_invoker = createInvoker(
    HomeController_0.germanVersion(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "germanVersion",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_russianVersion6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ru")))
  )
  private[this] lazy val controllers_HomeController_russianVersion6_invoker = createInvoker(
    HomeController_0.russianVersion(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "russianVersion",
      Nil,
      "GET",
      this.prefix + """ru""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_submitLT7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitLT")))
  )
  private[this] lazy val controllers_HomeController_submitLT7_invoker = createInvoker(
    HomeController_0.submitLT(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "submitLT",
      Nil,
      "GET",
      this.prefix + """submitLT""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_submitRU8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitRU")))
  )
  private[this] lazy val controllers_HomeController_submitRU8_invoker = createInvoker(
    HomeController_0.submitRU(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "submitRU",
      Nil,
      "GET",
      this.prefix + """submitRU""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_submitDE9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitDE")))
  )
  private[this] lazy val controllers_HomeController_submitDE9_invoker = createInvoker(
    HomeController_0.submitDE(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "submitDE",
      Nil,
      "GET",
      this.prefix + """submitDE""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Assets_at10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at10_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """public/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_Assets_at0_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("robots.txt"))) { (path, file) =>
        controllers_Assets_at0_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:5
    case controllers_Assets_at1_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("sitemap.xml"))) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:8
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_HomeController_pagrindinisLT3_route(params) =>
      call { 
        controllers_HomeController_pagrindinisLT3_invoker.call(HomeController_0.pagrindinisLT)
      }
  
    // @LINE:12
    case controllers_HomeController_toFaceBook4_route(params) =>
      call { 
        controllers_HomeController_toFaceBook4_invoker.call(HomeController_0.toFaceBook)
      }
  
    // @LINE:14
    case controllers_HomeController_germanVersion5_route(params) =>
      call { 
        controllers_HomeController_germanVersion5_invoker.call(HomeController_0.germanVersion())
      }
  
    // @LINE:16
    case controllers_HomeController_russianVersion6_route(params) =>
      call { 
        controllers_HomeController_russianVersion6_invoker.call(HomeController_0.russianVersion())
      }
  
    // @LINE:18
    case controllers_HomeController_submitLT7_route(params) =>
      call { 
        controllers_HomeController_submitLT7_invoker.call(HomeController_0.submitLT())
      }
  
    // @LINE:20
    case controllers_HomeController_submitRU8_route(params) =>
      call { 
        controllers_HomeController_submitRU8_invoker.call(HomeController_0.submitRU())
      }
  
    // @LINE:22
    case controllers_HomeController_submitDE9_route(params) =>
      call { 
        controllers_HomeController_submitDE9_invoker.call(HomeController_0.submitDE())
      }
  
    // @LINE:24
    case controllers_Assets_at10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at10_invoker.call(Assets_1.at(path, file))
      }
  }
}
