package dataholders;

public class TimeSlot {

    private int id;
    private String slot;
    private boolean status;
    private String time;

    public TimeSlot(int id, String slot, boolean status, String time) {
        this.id = id;
        this.slot = slot;
        this.status = status;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public int getId() {
        return id;
    }

    public String getSlot() {
        return slot;
    }

    public boolean isStatus() {
        return status;
    }
}
