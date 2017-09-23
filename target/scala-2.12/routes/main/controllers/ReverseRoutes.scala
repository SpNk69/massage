
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/alex/git/web/conf/routes
// @DATE:Sat Sep 23 20:14:55 CEST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:4
package controllers {

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def germanVersion(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "de")
    }
  
    // @LINE:11
    def toFaceBook(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "toFaceBook")
    }
  
    // @LINE:19
    def submitRU(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submitRU")
    }
  
    // @LINE:9
    def pagrindinisLT(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lt")
    }
  
    // @LINE:17
    def submitLT(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submitLT")
    }
  
    // @LINE:15
    def russianVersion(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ru")
    }
  
    // @LINE:21
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
      
        // @LINE:23
        case (file)  =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
          Call("GET", _prefix + { _defaultPrefix } + "public/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
    // @LINE:7
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
