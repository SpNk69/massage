package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.mockito.Mockito;
import play.libs.ws.WSClient;
import static org.mockito.Mockito.*;

public class FullFormTests {

    FullFormMagic fullFormMagic = new FullFormMagic(null);




    @Test
    public void whatever() throws JsonProcessingException {
        fullFormMagic.addBookingToDatabase();
    }


    WSClient mock = mock(WSClient.class);


}


