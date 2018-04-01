package jsonthings;

/**
 * Created by alex on 2017-12-19.
 */
public class JRootKeysToGetArrays {

    JTopRootList massageInfo;
    JTopRootList fullFormSubmit;
    JTopRootList contactFormErrors;
    JTopRootList pricesInfo;

    public JTopRootList getPricesInfo() {
        return pricesInfo;
    }

    public void setPricesInfo(JTopRootList pricesInfo) {
        this.pricesInfo = pricesInfo;
    }


    public JRootKeysToGetArrays() {

    }


    public JTopRootList getContactFormErrors() {
        return contactFormErrors;
    }

    public void setContactFormErrors(JTopRootList contactFormErrors) {
        this.contactFormErrors = contactFormErrors;
    }



    public JTopRootList getFullFormSubmit() {
        return fullFormSubmit;
    }

    public void setFullFormSubmit(JTopRootList fullFormSubmit) {
        this.fullFormSubmit = fullFormSubmit;
    }



    public JTopRootList getMassageInfo() {
        return massageInfo;
    }

    public void setMassageInfo(JTopRootList massageInfo) {
        this.massageInfo = massageInfo;
    }

}
