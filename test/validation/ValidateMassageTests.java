package validation;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import play.libs.Json;

import static org.junit.Assert.assertEquals;

public class ValidateMassageTests {
    ValidationUtility validationUtility= new ValidationUtility();


    private String validateMassage(String value) {
        JsonNode valueToJson = Json.toJson(value);
        return validationUtility.validateMassage(valueToJson);
    }
    @Test
    public void validMassage(){
        assertEquals("",validateMassage("Karštų-šaltų akmenų masažas."));
        assertEquals("",validateMassage("Heiß-kalt Steinmassage."));
        assertEquals("",validateMassage("Горячих - холодных камней массаж."));
        assertEquals("",validateMassage("Klasikinis - segmentinis nugaros masažas"));
        assertEquals("",validateMassage("Klasikinis – segmentinis nugaros masažas"));

    }

    @Test
    public void invalidMassageLength(){
        String tooLong="Massage123Massage123Massage123Massage123Massage123Massage123" +
                "Massage123Massage123Massage123Massage1231";
        assertEquals("massageLength",validateMassage(""));
        assertEquals("massageLength",validateMassage(tooLong));
    }

    @Test
    public void invalidMassageFormat(){
        assertEquals("massageFormat",validateMassage("@#@%*&@*#$&"));
        assertEquals("massageFormat",validateMassage("Massage1"));
        assertEquals("massageFormat",validateMassage("Massage!"));
    }


}
