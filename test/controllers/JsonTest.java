package controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsonthings.MassageInfo;
import jsonthings.JRootKeysToGetArrays;
import jsonthings.JTopRootList;
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


        JTopRootList rootList = new JTopRootList();
        JRootKeysToGetArrays superRoot = new JRootKeysToGetArrays();


        rootList.add(new MassageInfo("Massage1",12.0,50));



        superRoot.setMassageInfo(rootList);



        String out = objectMapper.writeValueAsString(superRoot);

        System.out.println(out);


        JRootKeysToGetArrays in = objectMapper.readValue(out, JRootKeysToGetArrays.class);


        System.out.println("STUFF -> " + in);
        System.out.println("STUFF2 -> " + out);


    }
}
