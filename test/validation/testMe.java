package validation;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class testMe {



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
