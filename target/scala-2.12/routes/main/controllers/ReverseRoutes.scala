
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/alex/git/web/conf/routes
// @DATE:Wed Oct 04 20:18:06 CEST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:4
package controllers {

  // @LINE:10
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def germanVersion(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:12
    def toFaceBook(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "toFaceBook")
    }
  
    // @LINE:20
    def submitRU(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submitRU")
    }
  
    // @LINE:10
    def pagrindinisLT(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lt")
    }
  
    // @LINE:18
    def submitLT(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submitLT")
    }
  
    // @LINE:16
    def russianVersion(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ru")
    }
  
    // @LINE:22
    def submitDE(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submitDE")
    }
  
  }

  // @LINE:4
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:4
        case (file) if file == "robots.txt" =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "robots.txt")))
          Call("GET", _prefix + { _defaultPrefix } + "robots.txt")
      
        // @LINE:5
        case (file) if file == "sitemap.xml" =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "sitemap.xml")))
          Call("GET", _prefix + { _defaultPrefix } + "sitemap.xml")
      
        // @LINE:24
        case (file)  =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
          Call("GET", _prefix + { _defaultPrefix } + "public/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
    // @LINE:8
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
