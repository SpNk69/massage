package validation;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import play.libs.Json;

import static org.junit.Assert.assertEquals;

public class ValidateMassageOptionTests {

    ValidationUtility validationUtility= new ValidationUtility();


    private String validateMassageOption(String value){
        JsonNode valueToJson=Json.toJson(value);
        return validationUtility.validateMassageOption(valueToJson);
    }

    @Test
    public void validMassageOption(){
        assertEquals("",validateMassageOption("120"));
        assertEquals("",validateMassageOption("60"));
    }

    @Test
    public void invalidMassageOptionLength(){
        assertEquals("massageOptionLength",validateMassageOption("1"));
        assertEquals("massageOptionLength",validateMassageOption("1000"));
    }

    @Test
    public void invalidMassageOptionFormat(){
        assertEquals("massageOptionFormat",validateMassageOption("@#@"));
        assertEquals("massageOptionFormat",validateMassageOption("Lab"));
        assertEquals("massageOptionFormat",validateMassageOption("ąčę"));
    }


}
