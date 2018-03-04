import akka.actor.ActorSystem;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import play.mvc.Result;
import scala.concurrent.ExecutionContextExecutor;
import validation.ValidationUtility;

import java.util.concurrent.CompletionStage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static play.test.Helpers.contentAsString;

/**
 * Unit testing does not require Play application start up.
 *
 * https://www.playframework.com/documentation/latest/JavaTest
 */
public class UnitTest {


    @Test
    public void x(){

        ValidationUtility validationUtility= new ValidationUtility();
//        validationUtility.validateDate()

    }

}


