package jsonthings;

import play.Logger;

public class TimeSlot {

    private int id;
    private String slot;
    private boolean status;
    private String time;


    public String getTime() {
        Logger.debug("in getTime...");
        return time;
    }

    public int getId() {
        Logger.debug("in getId...");
        return id;
    }

    public String getSlot() {
        Logger.debug("in getSlot...");
        return slot;
    }


    public boolean isStatus() {
        Logger.debug("in isStatus...");
        return status;
    }


    public TimeSlot(int id, String slot, boolean status, String time) {
        this.id = id;
        this.slot = slot;
        this.status = status;
        this.time = time;

    }
}
