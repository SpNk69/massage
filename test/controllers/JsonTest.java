package controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataholders.MassageInfo;
import dataholders.JsonDataArrayFromBeToFe;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by alex on 2017-12-20.
 */
public class JsonTest {

    @Test
    public void createAndSerializeJson() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);


        JsonDataArrayFromBeToFe rootList = new JsonDataArrayFromBeToFe();
//        JRootKeysToGetArrays superRoot = new JRootKeysToGetArrays();


        rootList.add(new MassageInfo(1,"a","50", "","","",""));
        rootList.add(new MassageInfo(1,"a","50", "","","",""));



//        superRoot.setMassageInfo(rootList);



        String out = objectMapper.writeValueAsString(rootList);

        System.out.println(out);


        JsonDataArrayFromBeToFe in = objectMapper.readValue(out, JsonDataArrayFromBeToFe.class);


        System.out.println("STUFF -> " + in);
        System.out.println("STUFF2 -> " + out);


    }
}
