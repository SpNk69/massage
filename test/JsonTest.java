import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsonthings.JEntryLeTesto;
import jsonthings.JEntryMassagePriceLength;
import jsonthings.JRootKeysToGetArrays;
import jsonthings.JTopRootList;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by alex on 2017-12-20.
 */
public class JsonTest {

    @Test
    public void leMega() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);


        JTopRootList rootList = new JTopRootList();
        JTopRootList rootList2 = new JTopRootList();
        JRootKeysToGetArrays superRoot = new JRootKeysToGetArrays();


        rootList.add(new JEntryMassagePriceLength("LOX",12.0,50));
        rootList2.add(new JEntryLeTesto("GAY","dux"));



        superRoot.setMassageInfo(rootList);
        superRoot.setLeTesto(rootList2);



        String out = objectMapper.writeValueAsString(superRoot);

        System.out.println(out);


        JRootKeysToGetArrays in = objectMapper.readValue(out, JRootKeysToGetArrays.class);


        System.out.println("STUFF -> " + in);
        System.out.println("STUFF2 -> " + out);


    }
}
