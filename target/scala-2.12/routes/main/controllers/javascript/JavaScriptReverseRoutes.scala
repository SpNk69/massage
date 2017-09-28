
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/alex/git/web/conf/routes
// @DATE:Sun Sep 24 16:37:09 CEST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:4
package controllers.javascript {

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def germanVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.germanVersion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "de"})
        }
      """
    )
  
    // @LINE:11
    def toFaceBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.toFaceBook",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "toFaceBook"})
        }
      """
    )
  
    // @LINE:19
    def submitRU: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submitRU",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitRU"})
        }
      """
    )
  
    // @LINE:9
    def pagrindinisLT: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.pagrindinisLT",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lt"})
        }
      """
    )
  
    // @LINE:17
    def submitLT: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submitLT",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitLT"})
        }
      """
    )
  
    // @LINE:15
    def russianVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.russianVersion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ru"})
        }
      """
    )
  
    // @LINE:21
    def submitDE: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submitDE",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitDE"})
        }
      """
    )
  
  }

  // @LINE:4
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("robots.txt") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "robots.txt"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
        }
      """
    )
  
    // @LINE:7
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
