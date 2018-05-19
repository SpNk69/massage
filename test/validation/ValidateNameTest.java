package validation;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import play.libs.Json;

import static org.junit.Assert.assertEquals;

public class ValidateNameTest {

    ValidationUtility validationUtility= new ValidationUtility();

    private String validateName(String value){
        JsonNode valueToJson= Json.toJson(value);
        return validationUtility.validateName(valueToJson);
    }

    @Test
    public void validName(){
        assertEquals("",validateName("John Smith"));
        assertEquals("",validateName("John"));
        assertEquals("",validateName("John's Smith"));
        assertEquals("",validateName("John O. Bean"));
        assertEquals("",validateName("Šerlokas ąčęėįšųū"));
        assertEquals("",validateName("лдфылвфщыйцшщетчч. сячс"));
        assertEquals("",validateName("ääöäüpü.asdasd"));
    }

    @Test
    public void invalidNameLength(){
        String tooLong="JohnSmithJohnSmithJohnSmithJohnSmithJohnSmithJohnSmith" +
                "JohnSmithJohnSmithJohnSmithJohnSmithJohnSmithJohnSmith";
        assertEquals("nameLength", validateName(""));
        assertEquals("nameLength", validateName(tooLong));
    }

    @Test
    public void invalidNameFormat(){
        assertEquals("nameFormat",validateName("John1"));
        assertEquals("nameFormat",validateName("John@"));
        assertEquals("nameFormat",validateName("John!"));
        assertEquals("nameFormat",validateName("John*"));
        assertEquals("nameFormat",validateName("22312JHohn232"));
        assertEquals("nameFormat",validateName("222222"));
        assertEquals("nameFormat",validateName("J0hn"));
    }
}
