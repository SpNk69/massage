
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/alex/git/web/conf/routes
// @DATE:Tue Oct 03 19:13:37 CEST 2017


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
