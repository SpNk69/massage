package jsonthings;

/**
 * Created by alex on 2017-12-19.
 */
public class JRootKeysToGetArrays {


//    String name;

    JTopRootList massageInfo;

    public JRootKeysToGetArrays() {

    }

    public JTopRootList getContactFormErrors() {
        return contactFormErrors;
    }

    public void setContactFormErrors(JTopRootList contactFormErrors) {
        this.contactFormErrors = contactFormErrors;
    }

    JTopRootList fullFormSubmit;
    JTopRootList contactFormErrors;


    public JRootKeysToGetArrays(JTopRootList contactFormErrors) {
        this.contactFormErrors = contactFormErrors;
    }

    public JTopRootList getFullFormSubmit() {
        return fullFormSubmit;
    }

    public void setFullFormSubmit(JTopRootList fullFormSubmit) {
        this.fullFormSubmit = fullFormSubmit;
    }


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }



    public JTopRootList getMassageInfo() {
        return massageInfo;
    }

    public void setMassageInfo(JTopRootList massageInfo) {
        this.massageInfo = massageInfo;
    }



//    @Override
//    public String toString() {
//        return "JRootKeysToGetArrays [name=" + name + ", massageInfo=" + massageInfo + "]";
//    }

}
