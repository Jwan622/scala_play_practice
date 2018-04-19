
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jwan/Desktop/programming/scala_play/blogy/conf/routes
// @DATE:Thu Apr 19 18:04:07 EDT 2018


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
