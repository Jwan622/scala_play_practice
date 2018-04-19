
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jwan/Desktop/programming/scala_play/blogy/conf/routes
// @DATE:Thu Apr 19 18:04:07 EDT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseIndexController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
