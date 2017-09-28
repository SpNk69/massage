
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/alex/git/web/conf/routes
// @DATE:Sun Sep 24 16:37:09 CEST 2017

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
  // @LINE:9
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    Assets_1: controllers.Assets,
    // @LINE:9
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lt""", """controllers.HomeController.pagrindinisLT"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """toFaceBook""", """controllers.HomeController.toFaceBook"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """de""", """controllers.HomeController.germanVersion()"""),
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

  // @LINE:7
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
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

  // @LINE:9
  private[this] lazy val controllers_HomeController_pagrindinisLT2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lt")))
  )
  private[this] lazy val controllers_HomeController_pagrindinisLT2_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_HomeController_toFaceBook3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("toFaceBook")))
  )
  private[this] lazy val controllers_HomeController_toFaceBook3_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_HomeController_germanVersion4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("de")))
  )
  private[this] lazy val controllers_HomeController_germanVersion4_invoker = createInvoker(
    HomeController_0.germanVersion(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "germanVersion",
      Nil,
      "GET",
      this.prefix + """de""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_russianVersion5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ru")))
  )
  private[this] lazy val controllers_HomeController_russianVersion5_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_HomeController_submitLT6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitLT")))
  )
  private[this] lazy val controllers_HomeController_submitLT6_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_HomeController_submitRU7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitRU")))
  )
  private[this] lazy val controllers_HomeController_submitRU7_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_HomeController_submitDE8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitDE")))
  )
  private[this] lazy val controllers_HomeController_submitDE8_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_Assets_at9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
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
  
    // @LINE:7
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:9
    case controllers_HomeController_pagrindinisLT2_route(params) =>
      call { 
        controllers_HomeController_pagrindinisLT2_invoker.call(HomeController_0.pagrindinisLT)
      }
  
    // @LINE:11
    case controllers_HomeController_toFaceBook3_route(params) =>
      call { 
        controllers_HomeController_toFaceBook3_invoker.call(HomeController_0.toFaceBook)
      }
  
    // @LINE:13
    case controllers_HomeController_germanVersion4_route(params) =>
      call { 
        controllers_HomeController_germanVersion4_invoker.call(HomeController_0.germanVersion())
      }
  
    // @LINE:15
    case controllers_HomeController_russianVersion5_route(params) =>
      call { 
        controllers_HomeController_russianVersion5_invoker.call(HomeController_0.russianVersion())
      }
  
    // @LINE:17
    case controllers_HomeController_submitLT6_route(params) =>
      call { 
        controllers_HomeController_submitLT6_invoker.call(HomeController_0.submitLT())
      }
  
    // @LINE:19
    case controllers_HomeController_submitRU7_route(params) =>
      call { 
        controllers_HomeController_submitRU7_invoker.call(HomeController_0.submitRU())
      }
  
    // @LINE:21
    case controllers_HomeController_submitDE8_route(params) =>
      call { 
        controllers_HomeController_submitDE8_invoker.call(HomeController_0.submitDE())
      }
  
    // @LINE:23
    case controllers_Assets_at9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(Assets_1.at(path, file))
      }
  }
}
