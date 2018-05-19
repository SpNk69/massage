package dataholders;

import org.junit.Test;

public class testSlots {
    @Test
    public void test() {
        TimeSlot timeSlot = new TimeSlot(1, "2018-08-08", false, "11:50");
        System.out.println(timeSlot.getId());

        timeSlot.toString();


    }
}
