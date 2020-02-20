package dataholders;

public class Time {


    private String date;

    private String time;
    private String length;


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public Time(){

    }

    public Time(String date, String time, String length) {
        this.date = date;
        this.time = time;
        this.length = length;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
