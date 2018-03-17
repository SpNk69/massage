package validation;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import play.libs.Json;

import static org.junit.Assert.assertEquals;

public class ValidatePhoneTests {
    ValidationUtility validationUtility= new ValidationUtility();

    private String validatePhone(String value){
        JsonNode valueToJson= Json.toJson(value);
        return validationUtility.validatePhone(valueToJson);
    }



    @Test
    public void  validPhone(){
        assertEquals("",validatePhone("+37061805651"));
        assertEquals("",validatePhone("+41126511231"));
        assertEquals("",validatePhone("861218755"));
        assertEquals("",validatePhone("+46(0)7679557"));
        assertEquals("",validatePhone("+0767-679557"));
    }

    @Test
    public void invalidPhoneLength(){
        assertEquals("phoneLength",validatePhone(""));
        assertEquals("phoneLength",validatePhone("111111111111111111111"));
    }

    @Test
    public void invalidPhoneFormat(){
        assertEquals("phoneFormat",validatePhone("+37061218665a"));
        assertEquals("phoneFormat",validatePhone("@#@#$"));
    }



}
