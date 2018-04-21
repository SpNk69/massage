package jsonthings;

public class PricesInfo {

    private String code;
    private String price;
    private String time;

    public PricesInfo(String code, String price, String length) {
        this.code = code;
        this.price = price;
        this.time = length;
    }

    public String getCode() {
        return code;
    }

    public String getPrice() {
        return price;
    }

    public String getTime() {
        return time;
    }

}
