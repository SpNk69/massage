package jsonthings;

/**
 * Created by alex on 2017-12-19.
 */
public class JEntryMassageAndPrices {


    String massageName;
    String price;
//    Boolean canExecute;

    public JEntryMassageAndPrices() {
        // TODO Auto-generated constructor stub
    }

    public JEntryMassageAndPrices(String key, String value) {
        this.massageName =key;
        this.price =value;
//        this.canExecute=canExecute;
    }

    public String getMassageName() {
        return massageName;
    }
    public void setMassageName(String massageName) {
        this.massageName = massageName;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
//    public Boolean getCanExecute() {
//        return canExecute;
//    }
//    public void setCanExecute(Boolean canExecute) {
//        this.canExecute = canExecute;
//    }

//    @Override
//    public String toString() {
//        return "JEntryMassageAndPrices [" + (massageName != null ? "massageName=" + massageName + ", " : "") + (price != null ? "price=" + price + ", " : "")
//                + (canExecute != null ? "canExecute=" + canExecute : "") + "]";
//    }




}
