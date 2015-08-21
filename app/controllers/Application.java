package controllers;

import modules.MyBeanA;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import javax.inject.Inject;

public class Application extends Controller {
    @Inject
    private MyBeanA myBeanA;

    public Result index() {
        String message = myBeanA.getMessage();
        return ok(index.render("MyBeanA.message=" + message));
    }

}
