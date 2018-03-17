package validation2;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import play.libs.Json;
import validation.ValidationUtility;

import static org.junit.Assert.assertEquals;

public class ValidateEmailTests {

    ValidationUtility validationUtility= new ValidationUtility();

    private String validateEmail(String value){
        JsonNode valueToJson= Json.toJson(value);
        return validationUtility.validateEmail(valueToJson);
    }

    @Test
    public void validEmail(){
        assertEquals("",validateEmail("info@vidamassage.ch"));
        assertEquals("",validateEmail("info@vidamassage.ch"));
    }

    @Test
    public void invalidEmailLength(){
        String tooLong = "12345678901234567890123456789012345678901234567890" +
                "123456789012345678901234567890123456789012345678901";
        assertEquals("emailLength",validateEmail(""));
        assertEquals("emailLength",validateEmail(tooLong));
    }

    @Test
    public void invalidEmailFormat(){
        assertEquals("emailFormat",validateEmail("@"));
        assertEquals("emailFormat",validateEmail("asd"));
        assertEquals("emailFormat",validateEmail("asd@"));
        assertEquals("emailFormat",validateEmail("asd@a"));
        assertEquals("emailFormat",validateEmail("@a.lt"));
        assertEquals("emailFormat",validateEmail("123123"));
        assertEquals("emailFormat",validateEmail("123123@@@@@.lt"));
        assertEquals("emailFormat",validateEmail("123123@@@@@a.lt"));
        assertEquals("emailFormat",validateEmail("info@vidamassage...ch..."));
    }



}
