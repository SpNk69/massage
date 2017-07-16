package controllers;

import models.User;
import play.api.data.Form;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.*;

import views.html.*;

import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */


    @Inject FormFactory formFactory;





    public Result index() {
        return ok(index.render("YEssss"));
    }

    public Result pagrindinis() {
        return ok(pagrindinis.render("Pagrindinis"));}

    public Result apie() {
        return ok(pagrindinis.render("Apie Mane"));}



    public Result germanVersion() {
        return ok(germanPagrindinis.render("German Version"));}

    public Result russianVersion() {
        return ok(russianPagrindinis.render("RUskij"));}


}
