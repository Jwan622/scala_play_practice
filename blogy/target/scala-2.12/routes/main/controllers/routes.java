
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jwan/Desktop/programming/scala_play/blogy/conf/routes
// @DATE:Thu Apr 19 18:04:07 EDT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseIndexController IndexController = new controllers.ReverseIndexController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseIndexController IndexController = new controllers.javascript.ReverseIndexController(RoutesPrefix.byNamePrefix());
  }

}
