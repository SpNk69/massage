package jsonthings;

public class PricesInfo {

    String code;
    String price;
    String time;

    public PricesInfo(String code, String price, String length) {
        this.code = code;
        this.price = price;
        this.time = length;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
