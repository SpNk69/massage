package validation;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Ignore;
import org.junit.Test;
import play.libs.Json;

import static org.junit.Assert.assertEquals;

public class ValidateTimeTests {

    ValidationUtility validationUtility = new ValidationUtility();

    private String validateTime(String value) {
        JsonNode valueToJson = Json.toJson(value);
        return validationUtility.validateTime(valueToJson);
    }


    @Test
    public void validTime() {
        assertEquals("", validateTime("22:45"));
    }

    @Test
    public void invalidTimeLength() {
        assertEquals("timeLength", validateTime(""));
        assertEquals("timeLength", validateTime("22:45:"));
        assertEquals("timeLength", validateTime(":"));
        assertEquals("timeLength", validateTime("!!!!!!"));
    }

    @Test
    public void invalidTimeFormat() {
        assertEquals("timeFormat", validateTime("22:@1"));
        assertEquals("timeFormat", validateTime("22:!5"));
        assertEquals("timeFormat", validateTime("#####"));
    }

    //TO DO: Handle time formats as 25:11 .... INVALID
    @Ignore
    @Test
    public void toDoTime() {
        assertEquals("timeFormat", validateTime("25:11"));
        assertEquals("timeFormat", validateTime("55:55"));
    }

}
