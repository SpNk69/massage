package jsonthings;

/**
 * Created by alex on 2017-12-19.
 */
public class JEntryLeTesto {


    String leTestoName;
    String leTestoPrice;
//    Boolean canExecute;

    public JEntryLeTesto() {
        // TODO Auto-generated constructor stub
    }

    public JEntryLeTesto(String key, String value) {
        this.leTestoName =key;
        this.leTestoPrice =value;
//        this.canExecute=canExecute;
    }

    public String getLeTestoName() {
        return leTestoName;
    }

    public void setLeTestoName(String leTestoName) {
        this.leTestoName = leTestoName;
    }

    public String getLeTestoPrice() {
        return leTestoPrice;
    }

    public void setLeTestoPrice(String leTestoPrice) {
        this.leTestoPrice = leTestoPrice;
    }
//    public Boolean getCanExecute() {
//        return canExecute;
//    }
//    public void setCanExecute(Boolean canExecute) {
//        this.canExecute = canExecute;
//    }

//    @Override
//    public String toString() {
//        return "JEntryMassagePriceLength [" + (name != null ? "name=" + name + ", " : "") + (price != null ? "price=" + price + ", " : "")
//                + (canExecute != null ? "canExecute=" + canExecute : "") + "]";
//    }




}
