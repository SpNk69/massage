package jsonthings;

/**
 * Created by alex on 2017-12-19.
 */
public class JEntryMassagePriceLength {


    String massageName;
    double price;
    int length;


    public JEntryMassagePriceLength(String massageName, double price, int length) {
        this.massageName = massageName;
        this.price = price;
        this.length = length;
    }

    public String getMassageName() {
        return massageName;
    }

    public void setMassageName(String massageName) {
        this.massageName = massageName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "JEntryMassagePriceLength{" +
                "massageName='" + massageName + '\'' +
                ", price=" + price +
                ", length=" + length +
                '}';
    }
}
