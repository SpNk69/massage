package validation;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import play.libs.Json;

import static org.junit.Assert.assertEquals;

public class ValidateDateTests {
    ValidationUtility validationUtility= new ValidationUtility();

    private String validateDate(String value){
        JsonNode valueToJson= Json.toJson(value);
        return validationUtility.validateDate(valueToJson);
    }

    @Test
    public void validDate(){
        assertEquals("",validateDate("2018-08-11"));
        assertEquals("",validateDate("2018-12-10"));
        assertEquals("",validateDate("2018-01-01"));
        assertEquals("",validateDate("2018-11-01"));
        assertEquals("",validateDate("2018-10-01"));
        assertEquals("",validateDate("2018-10-31"));
        assertEquals("",validateDate("2018-01-31"));
    }

    @Test
    public void invalidDateLength(){
        assertEquals("dateLength",validateDate(""));
        assertEquals("dateLength",validateDate("2018-08-08-0"));
    }

    @Test
    public void invalidDateFormat(){
        assertEquals("dateFormat",validateDate("123465"));
        assertEquals("dateFormat",validateDate("2018-08-1"));
        assertEquals("dateFormat",validateDate("20180808"));
        assertEquals("dateFormat",validateDate("08-08-2018"));
        assertEquals("dateFormat",validateDate("2018/08/08"));
        assertEquals("dateFormat",validateDate("2018-08"));
        assertEquals("dateFormat",validateDate("2018-0811"));
        assertEquals("dateFormat",validateDate("2018-99-99"));
        assertEquals("dateFormat",validateDate("2018-9-99"));
        assertEquals("dateFormat",validateDate("2018-13-05"));
        assertEquals("dateFormat",validateDate("2018-00-05"));
        assertEquals("dateFormat",validateDate("2018-00-00"));
        assertEquals("dateFormat",validateDate("2018-12-32"));
    }

}
