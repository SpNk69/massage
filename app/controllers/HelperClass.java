package controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsonthings.JRootKeysToGetArrays;
import jsonthings.JTopRootList;

public class HelperClass {

    public HelperClass() {
    }

    ObjectMapper initializeObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }


    String prepareResponse(Object form) throws JsonProcessingException {
        JTopRootList jTopRootList = new JTopRootList();
        JRootKeysToGetArrays topKey = new JRootKeysToGetArrays();
        jTopRootList.add(form);
        topKey.setContactFormErrors(jTopRootList);
        return initializeObjectMapper().writeValueAsString(topKey);
    }



}
