package controllers;

import play.api.Play;
import play.mvc.Action;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;


public class ForceHttps extends Action<Controller> {

    // heroku header
    private static final String SSL_HEADER = "x-forwarded-proto";

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        final CompletionStage<Result> result;
        if (Play.current().isProd() && !isHttpsRequest(ctx.request())) {
            result = CompletableFuture.completedFuture(redirect("https://" + ctx.request().host()
                    + ctx.request().uri()));
        }
        else {
            // let request proceed
            result = this.delegate.call(ctx);
        }
        return result;
    }

    private static boolean isHttpsRequest(Http.Request request) {
        // heroku passes header on
        return request.getHeader(SSL_HEADER) != null
                && request.getHeader(SSL_HEADER)
                        .contains("https");
    }

}