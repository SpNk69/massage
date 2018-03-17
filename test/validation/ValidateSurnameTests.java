package validation;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import play.libs.Json;

import static org.junit.Assert.assertEquals;

public class ValidateSurnameTests {

    ValidationUtility validationUtility= new ValidationUtility();



    private String validateSurname(String value){
        JsonNode valueToJson= Json.toJson(value);
        return validationUtility.validateSurname(valueToJson);
    }

    @Test
    public void validSurname(){
        assertEquals("",validateSurname("John Smith"));
        assertEquals("",validateSurname("John"));
        assertEquals("",validateSurname("John's Smith"));
        assertEquals("",validateSurname("John O. Bean"));
        assertEquals("",validateSurname("Šerlokas ąčęėįšųū"));
        assertEquals("",validateSurname("лдфылвфщыйцшщетчч. сячс"));
        assertEquals("",validateSurname("ääöäüpü.asdasd"));
    }

    @Test
    public void invalidSurnameLength(){
        String tooLong="JohnSmithJohnSmithJohnSmithJohnSmithJohnSmithJohnSmith" +
                "JohnSmithJohnSmithJohnSmithJohnSmithJohnSmithJohnSmith";
        assertEquals("surnameLength", validateSurname(""));
        assertEquals("surnameLength", validateSurname(tooLong));
    }

    @Test
    public void invalidSurnameFormat(){
        assertEquals("surnameFormat",validateSurname("John1"));
        assertEquals("surnameFormat",validateSurname("John@"));
        assertEquals("surnameFormat",validateSurname("John!"));
        assertEquals("surnameFormat",validateSurname("John*"));
        assertEquals("surnameFormat",validateSurname("22312JHohn232"));
        assertEquals("surnameFormat",validateSurname("222222"));
        assertEquals("surnameFormat",validateSurname("J0hn"));
    }

}
