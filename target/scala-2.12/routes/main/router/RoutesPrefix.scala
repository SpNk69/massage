
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/alex/git/web/conf/routes
// @DATE:Sun Sep 24 16:37:09 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
