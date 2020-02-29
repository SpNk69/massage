package validation;

import com.mysql.jdbc.Connection;
import dataholders.JsonDataArrayFromBeToFe;
import dataholders.Time;
import org.junit.Assert;
import org.junit.Test;
import play.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class testMe {

    private static int BUFFER_TIME=4;
//    private static int LENGTH_OF_MASSAGE_AS_INDEXES=4;

    ArrayList<Object> xx = new ArrayList<>(Arrays.asList("14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));
//    ArrayList<Object> xx = new ArrayList<>(Arrays.asList("10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));


//    ArrayList<Object> xx = new ArrayList<Object>(Arrays.asList("12:00", "13:00"));
ArrayList<Object> arrayHolderForRemoving = new ArrayList();

    @Test
    public void test1() throws SQLException {
        ArrayList<Time> arrFromDB = new ArrayList();
        Time time = new Time();
        time.setDate("2020-02-24");
        time.setTime("17:15");
        time.setLength("60 min – 100 CHF");
        arrFromDB.add(time);

        System.out.println("MEGA");
        System.out.println(xx.size());
        Assert.assertTrue("test", true);
        additionalFiltering(xx,"2020-02-24",10,true, time,arrFromDB);
        //forward check
        Assert.assertTrue("test1",!xx.contains("17:15"));
        Assert.assertTrue("test1",!xx.contains("17:30"));
        Assert.assertTrue("test1",!xx.contains("17:45"));
        Assert.assertTrue("test1",!xx.contains("18:00"));
        Assert.assertTrue("test1",!xx.contains("18:15"));
        Assert.assertTrue("test1",!xx.contains("18:30"));
        Assert.assertTrue("test1",!xx.contains("18:45"));
        Assert.assertTrue("test1",!xx.contains("19:00"));
        Assert.assertTrue("test1",xx.contains("19:15"));
        Assert.assertTrue("test1",xx.contains("19:30"));

        //back check
        Assert.assertTrue("test1",!xx.contains("17:15"));
        Assert.assertTrue("test1",!xx.contains("17:00"));
        Assert.assertTrue("test1",!xx.contains("16:45"));
        Assert.assertTrue("test1",!xx.contains("16:30"));
        Assert.assertTrue("test1",!xx.contains("16:15"));
        Assert.assertTrue("test1",!xx.contains("16:00"));
        Assert.assertTrue("test1",!xx.contains("15:45"));
        Assert.assertTrue("test1",!xx.contains("15:30"));
        Assert.assertTrue("test1",!xx.contains("15:15"));
        Assert.assertTrue("test1",!xx.contains("14:45"));
//        Assert.assertTrue("test1",xx.contains("14:30"));



    }

    private void additionalFiltering(ArrayList<Object> arr, String date1, int LENGTH_OF_MASSAGE_AS_INDEXES, boolean today, Time time, ArrayList<Time> arrFromDB) throws SQLException {

//        String qw = "'\"" + date1 + "\"'";
//        String qq = "SELECT date, time, massageOption from heroku_e3d8ce5aa92835f.fullreservationform WHERE date=" + qw + " " + "ORDER BY time ASC" + ";";
//
//        System.out.println("my query:  " + qq);

//        ArrayList<Time> arrFromDB2 = new ArrayList();
//        Map<String, String> hashMap = new HashMap<>();
//
//        try {
//            try (Connection connection = helperUC.getConnection()) {
////            JsonDataArrayFromBeToFe fullFormDataForFE = new JsonDataArrayFromBeToFe();
//                try (PreparedStatement preparedStatement = connection.prepareStatement(qq)) {
//                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
//
//
//                        while (resultSet.next()) {
//                            Time time = new Time();
//                            time.setDate(resultSet.getNString("date").replace("\"", ""));
//                            time.setTime(resultSet.getNString("time").replace("\"", ""));
//                            time.setLength(resultSet.getNString("massageOption").replace("\"", ""));
//                            arrFromDB.add(time);
//                        }
//                        System.out.println("Size of Array: " + arrFromDB.size());
//                        //start here
        //If it is today ant no bookings yet, show 3 hours in advance, deleting 12 slots, 1slot=15min
        if (arrFromDB.size() == 0 && today) {
            System.out.println("No one registered today, therefore deleting slots");
            try {

                for (int xxx = 0; xxx < 12; xxx++) {
                    arrayHolderForRemoving.add(arr.get(xxx));
                    System.out.println(arr.get(xxx));

                }
            } catch (IndexOutOfBoundsException e) {
                Logger.debug("caught exception in removing slots 1");
            }
        } else {

            if (today) {
                System.out.println("It is today, therefore, adding 12 first slots to arrayHolderForRemoving");

                for (int xxx = 0; xxx < 12; xxx++) {
                    arrayHolderForRemoving.add(arr.get(xxx));
                }
            }
            System.out.println("Inside logic where bookings exist");

            //results from DB (booked slots)
            try {

                for (int i = 0; i < arrFromDB.size(); i++) {
                    System.out.println("Checking on element from db" + i);
                    System.out.println(arrFromDB.get(i).getTime());

                    //array coming with filtered slots by workday
                    for (int x = 0; x < arr.size(); x++) {

                        if (arr.get(x).equals(arrFromDB.get(i).getTime())) {
                            System.out.println("A match found here");
                            System.out.println(arr.get(x));
                            int zeba2 = Integer.parseInt(arrFromDB.get(i).getLength().split(" ")[0]);

                            for (int z = 0; z < (zeba2 / 15) + BUFFER_TIME; z++) {

                                try {


                                    System.out.println("Marking to be removed following slot: ");
                                    System.out.println(arr.get(x + z));
                                    arrayHolderForRemoving.add(arr.get(x + z));
//                                                arr.remove(x);

                                } catch (IndexOutOfBoundsException e) {
                                    Logger.debug("caught exception in removing slots 2");
                                    continue;
                                }
                            }


                            for (int j = 0; j < LENGTH_OF_MASSAGE_AS_INDEXES; j++) {

                                try {
                                    System.out.println("Does it match actual length of massage?" + LENGTH_OF_MASSAGE_AS_INDEXES);
                                    System.out.println("picked massage length as slots");
                                    System.out.println(arr.get(x - j));
                                    arrayHolderForRemoving.add(arr.get(x - j));

                                } catch (IndexOutOfBoundsException e) {
                                    Logger.debug("caught exception in remove slots 3");
                                    continue;
                                }
                            }

                            System.out.println("size: " + arrayHolderForRemoving.size());
                            System.out.println("first element: " + arrayHolderForRemoving.get(0));
                        } else {

                            //get rid of looping too many times
                            if (x <= 0) {
                                System.out.println("not found any match, but must remove next elements from given date time");
                                int zeba3 = Integer.parseInt(arrFromDB.get(i).getLength().split(" ")[0]);
                                ArrayList<String> MONDAY1 = new ArrayList<>(Arrays.asList("10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));

                                for (int zzz = 0; zzz < MONDAY1.size(); zzz++) {


                                    try {
                                        if (MONDAY1.get(zzz).equals(arrFromDB.get(i).getTime())) {
                                            for (int zz = 0; zz < (zeba3 / 15) + BUFFER_TIME; zz++) {
                                                try {
                                                    System.out.println("Marking to be removed following slot: ");
                                                    System.out.println(MONDAY1.get(zzz + zz));
                                                    arrayHolderForRemoving.add(MONDAY1.get(zzz + zz));
                                                } catch (IndexOutOfBoundsException e) {
                                                    Logger.debug("yet another exception");
                                                }

                                            }
                                        }
                                    } catch (IndexOutOfBoundsException e) {
                                        Logger.debug("caught exception in removing slots 2");
                                        continue;
                                    }
                                }

                            }
                        }
                    }
                }
            } catch (Exception e) {
                Logger.debug("in exception X");
            }
        }
        arr.removeAll(arrayHolderForRemoving);

    }




    @Test
    public void lala() throws ParseException {
        System.out.println("test");

        int MASSAGE_LENGTH = 3600000;

//        String timeValue = "2015-10-28T18:07:04.899+09:30";
        String timeValue= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(Calendar.getInstance().getTime());
        String timeValue2= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(new Date(System.currentTimeMillis() +14400000));
        System.out.println("timeValue2:   " +timeValue);
        System.out.println("timeValue2:   " +timeValue2);

        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
//        sdf+=3600000
        System.out.println("print:   " +sdf);
        ArrayList<String> existing = new ArrayList<>(Arrays.asList("16:00"));
        ArrayList<String> arr = new ArrayList<>();
        try {
            Calendar startCalendar = Calendar.getInstance();
            Calendar startCalendar2 = Calendar.getInstance();
            startCalendar.setTime(sdf.parse(timeValue2));
            startCalendar2.setTime(sdf.parse(timeValue2));
            System.out.println("print1:   " + startCalendar.getTime());

            if (startCalendar.get(Calendar.MINUTE) < 15) {
                startCalendar.set(Calendar.MINUTE, 15);
//                startCalendar2.set(Calendar.MINUTE, 15);
            }else if (startCalendar.get(Calendar.MINUTE) < 30){
                startCalendar.set(Calendar.MINUTE, 30);
//                startCalendar2.set(Calendar.MINUTE, 30);

            }else if (startCalendar.get(Calendar.MINUTE) < 45) {
                startCalendar.set(Calendar.MINUTE, 45);
//                startCalendar2.set(Calendar.MINUTE, 45);
            }


            else {
                startCalendar.add(Calendar.MINUTE, 0); // overstep hour and clear minutes
                startCalendar2.add(Calendar.MINUTE, 0); // overstep hour and clear minutes
                startCalendar.clear(Calendar.MINUTE);
                startCalendar2.clear(Calendar.MINUTE);
            }

            Calendar endCalendar = Calendar.getInstance();
            endCalendar.setTime(startCalendar.getTime());
            Calendar closingTIme = Calendar.getInstance();
            closingTIme.set(Calendar.HOUR_OF_DAY, 21);
            closingTIme.set(Calendar.MINUTE, 0);

            // if you want dates for whole next day, uncomment next line
            //endCalendar.add(Calendar.DAY_OF_YEAR, 1);
            endCalendar.add(Calendar.HOUR_OF_DAY, 24 - startCalendar.get(Calendar.HOUR_OF_DAY));

            endCalendar.clear(Calendar.MINUTE);
            endCalendar.clear(Calendar.SECOND);
            endCalendar.clear(Calendar.MILLISECOND);


            SimpleDateFormat slotTime = new SimpleDateFormat("HH:mm ");
            SimpleDateFormat slotDate = new SimpleDateFormat(", dd/MM/yy");



            while (endCalendar.after(startCalendar)) {
//                System.out.println("endclendar:"+ endCalendar.before(closingTIme));



//                System.out.println( "test1" +closingTIme.getTime());
//                System.out.println( "test2" +endCalendar.getTime());

//                System.out.println(endCalendar.compareTo(closingTIme));
//                System.out.println("closing:"+ closingTIme);
//                System.out.println("startClaneda: " + startCalendar);
                String slotStartTime = slotTime.format(startCalendar.getTime());
                String slotStartDate = slotDate.format(startCalendar.getTime());

                startCalendar.add(Calendar.MINUTE, 15);
                startCalendar2.setTimeInMillis(startCalendar.getTimeInMillis()+MASSAGE_LENGTH);
                String slotEndTime = slotTime.format(startCalendar2.getTime());

                if (!startCalendar2.after(closingTIme)){


//                    System.out.println("xx:  "+ closingTIme.after(endCalendar));
                    System.out.println("DATE of available bookings:   "+ slotStartTime + " - " + slotEndTime + slotStartDate);




                    System.out.println();


                    arr.add(slotStartTime);








                    if(arr.contains(existing)){
                        System.out.println("yes");
                    }


//                    arr.forEach(x->System.out.println("klaka" + x));
//                    existing.forEach(x->System.out.println("NANA" + x));

                }else{
                    System.out.println("OUT OF CLOSING HOURS!");
//                    System.out.println("DATE:   "+ slotStartTime + " - " + slotEndTime + slotStartDate);
                }




//                System.out.println("slotStartDate: " + slotStartDate);
//                System.out.println("slotStartTime: " + slotStartTime);
//                System.out.println("slotEndTime: " + slotEndTime);

            }

        } catch (ParseException e) {
            // date in wrong format
        }



    }

    @Test
    public void oneMore(){

        ArrayList<String> ar1 = new ArrayList<>(Arrays.asList("15:45","16:00", "16:15","16:30","16:45", "17:15","17:30","17:45"));

        Map<String, List<String>> lala1 = new HashMap<String, List<String>>() {{
            put("slot", Arrays.asList("16:00","90"));
        }
        };

        ArrayList<String> arr = new ArrayList<>();


        for (int i =0; i<ar1.size(); i++){
//         System.out.println(ar1.get(i));
//         System.out.println(lala1.get("slot").get(0));

            if (ar1.get(i).equals(lala1.get("slot").get(0))){



                System.out.println("Index of match"+ i);
                System.out.println("value "+ ((ArrayList<String>) ar1).get(i));





            }

        }


        ArrayList<String> ar2 = new ArrayList<>();

        int xx= 90/15;

        for (int y=1; y<6; y++){
            System.out.print("trinam");

            System.out.print(ar1.get(1));

            ar1.remove(1);

        }


        ar1.forEach(arr::add);
        System.out.println();
        arr.forEach(x->System.out.println("testyy: " + x));

//   ar1.forEach(x -> x.equals(lala1.get("slot")));

//     m.forEach((x, y) ->{
//     });

        long lenOfAr= ar1.stream().count();



    }




}
