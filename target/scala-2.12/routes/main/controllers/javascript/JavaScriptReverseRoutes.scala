
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/alex/git/web/conf/routes
// @DATE:Wed Oct 04 20:18:06 CEST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:4
package controllers.javascript {

  // @LINE:10
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def germanVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.germanVersion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:12
    def toFaceBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.toFaceBook",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "toFaceBook"})
        }
      """
    )
  
    // @LINE:20
    def submitRU: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submitRU",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitRU"})
        }
      """
    )
  
    // @LINE:10
    def pagrindinisLT: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.pagrindinisLT",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lt"})
        }
      """
    )
  
    // @LINE:18
    def submitLT: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submitLT",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitLT"})
        }
      """
    )
  
    // @LINE:16
    def russianVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.russianVersion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ru"})
        }
      """
    )
  
    // @LINE:22
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
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("sitemap.xml") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sitemap.xml"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
        }
      """
    )
  
    // @LINE:8
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
