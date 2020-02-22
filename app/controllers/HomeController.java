package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.mysql.jdbc.Connection;
import dataholders.*;
import dataholders.Time;
import org.apache.commons.lang3.time.DateUtils;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import views.html.*;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

@With(ForceHttps.class)
public class HomeController extends Controller {

    HelperUtilityClass helperUC = new HelperUtilityClass();

    public Result singlePageApplication() {
        return ok(SPAcalledFromController.render(""));
    }

    public static int BUFFER_TIME=4;
    public Result toFaceBook() {
        return redirect("https://www.facebook.com/behandlungspraxisVida/");
    }

    public Result adminPage() {
        return ok(calledFromRoutesAdmin.render(""));
    }

    /**
     * Method for fetching data from DB related to Massage data, such as name, code, price and etc.
     *
     * @return response with data
     * @throws JsonProcessingException
     */
    public Result getMassagesData() throws JsonProcessingException {
        JsonNode json = request().body().asJson();
        try {
            try (Connection connection = helperUC.getConnection()) {
                try (PreparedStatement preparedStatement1 = connection.prepareStatement(helperUC.getSpecificQuery(json))) {
                    JsonDataArrayFromBeToFe massageList = new JsonDataArrayFromBeToFe();
                    try (ResultSet data = preparedStatement1.executeQuery()) {

                        while (data.next()) {
                            massageList.add(new MassageInfo(data.getInt(1), data.getString(3), data.getString(2), data.getString(4),
                                    data.getString(5), data.getString(6), data.getString(7), data.getString(8)));
                        }
                        String response = helperUC.initializeObjectMapper().writeValueAsString(massageList);
                        Logger.debug("Getting massageData...");

                        return ok(response);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("GetMassageData went wrong... {}", e);
            return badRequest("Failed while getting MassagesData");
        }
    }

    /**
     * Method for fetching massages prices and code
     *
     * @return response with data
     * @throws JsonProcessingException
     */
    public Result getPrices() throws JsonProcessingException {
        String query = HelperUtilityClass.getEnvVar("TABLE_PRICES");

        try {
            try (Connection connection = helperUC.getConnection()) {
                try (PreparedStatement preparedStatement1 = connection.prepareStatement(query)) {
                    JsonDataArrayFromBeToFe pricesList = new JsonDataArrayFromBeToFe();
                    try (ResultSet data = preparedStatement1.executeQuery()) {

                        while (data.next()) {
                            pricesList.add(new PricesInfo(data.getString(2), data.getString(3), data.getString(4)));
                        }
                        String response = helperUC.initializeObjectMapper().writeValueAsString(pricesList);
                        Logger.debug("Getting prices for massages...");

                        return ok(response);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("Getting prices went wrong... ", e);
            return badRequest("Failed while getting prices");
        }
    }

    /**
     * Method for getting clients data for adminPage
     *
     * @return - response with data
     * @throws JsonProcessingException
     */
    public Result getAdminClientData() throws JsonProcessingException {
        String query = HelperUtilityClass.getEnvVar("ADMIN_DATA");
        try {
            try (Connection connection = helperUC.getConnection()) {
                JsonDataArrayFromBeToFe fullFormDataForFE = new JsonDataArrayFromBeToFe();
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {

                        while (resultSet.next()) {
                            fullFormDataForFE.add(dataFromDB(resultSet, HelperUtilityClass.fullFormNames));
                        }
                        String response = helperUC.initializeObjectMapper().writeValueAsString(fullFormDataForFE);
                        Logger.debug("Getting bookingForm data for adminPage...");

                        return ok(response);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("SQL exception while getting adminData data... {}", e);
            return badRequest("Getting adminData client data went wrong");
        }
    }




    public Result getMeData() throws JsonProcessingException {
        String query = HelperUtilityClass.getEnvVar("ADMIN_DATA");
        String qw = "'\"2020-02-22\"'";
        String qq= "SELECT date, time, massageOption from heroku_e3d8ce5aa92835f.fullreservationform WHERE date="+qw+";";

        System.out.println("my query:  " + qq);
        ArrayList<Time> ar111 = new ArrayList();
        Map<String,String> hashMap = new HashMap<>();
        try {
            try (Connection connection = helperUC.getConnection()) {
                JsonDataArrayFromBeToFe fullFormDataForFE = new JsonDataArrayFromBeToFe();
                try (PreparedStatement preparedStatement = connection.prepareStatement(qq)) {
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {


                        while (resultSet.next()) {
                            Time time= new Time();
                            time.setDate(resultSet.getNString("date"));
                            time.setTime(resultSet.getNString("time"));
                            time.setLength(resultSet.getNString("massageOption"));

                            ar111.add(time);
//                            fullFormDataForFE.add(dataFromDB(resultSet, HelperUtilityClass.fullFormNames));
                        }

                        System.out.println("sizeeee::::   "+ ar111.size());

//                        System.out.println(" size of ar : " +ar111.size());

                        for (int i=0; i<ar111.size(); i++) {
                            System.out.println("here ti comes");
                            System.out.println(ar111.get(i).getDate() + "  " + ar111.get(i).getTime() + " " + ar111.get(i).getLength());
                        }



                        String response = helperUC.initializeObjectMapper().writeValueAsString(fullFormDataForFE);

                        System.out.println("##########################################");
                        System.out.println(response);
                        for (int i=0; i<fullFormDataForFE.size(); i++) {
                            System.out.println(fullFormDataForFE.get(i));
                            System.out.println("contains");

                            fullFormDataForFE.contains("2020-02-24");
                        }



                        Logger.debug("Getting bookingForm data for adminPage...");

                        return ok(response);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("SQL exception while getting adminData data... {}", e);
            return badRequest("Getting adminData client data went wrong");
        }
    }





    public Result getNewTimeSlots() throws JsonProcessingException, ParseException, SQLException {

        JsonNode json = request().body().asJson();

        String timeX = json.findPath("date").asText();
        String optionX = json.findPath("length").asText().split(" ")[0];
        System.out.println("REACHINGF HERE?");

        int LENGTH_OF_MASSAGE_AS_INDEXES=0;
//        int BUFFER_TIME= 6;

        //fix this, never allow undefined to come in from angularjs, for now it's temporary, meaning most probably permanent.
        if(optionX.isEmpty()){
            System.out.println("EMPTY AS FUCK");
            LENGTH_OF_MASSAGE_AS_INDEXES=6;
        }else{
            LENGTH_OF_MASSAGE_AS_INDEXES = (Integer.parseInt(optionX)/15)+BUFFER_TIME;

        }
        System.out.println("#########@@@@@@@@@@############### "+ optionX);
        System.out.println("#########@@@@@@@@@@############### LENGTH TOTAL MASSAGE "+ LENGTH_OF_MASSAGE_AS_INDEXES);
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(timeX);
        Logger.debug("DATTTT");
        Logger.debug(String.valueOf(date1));

        String timeValue2;
        String timeValue;

        if (DateUtils.isSameDay(date1,new Date())) {
            //set to 14400000
            timeValue = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()+ 13200000 )) ;//+ 4400000
            System.out.println("in here 1 1 1 ");
            System.out.println("--------------------------------------------------------");
            System.out.println(timeValue);
        }else{
            System.out.println("in here 2 2 2 ");
            timeValue = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(date1);
        }

        int MASSAGE_LENGTH = 3600000;

//        String timeValue = "2015-10-28T18:07:04.899+09:30";
        //fix  14400000
//        String timeValue2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(new Date(System.currentTimeMillis() + 4400000));

        Logger.debug("IS IT TRUE?");
        Logger.debug(String.valueOf(DateUtils.isSameDay(date1,new Date())));

        System.out.println("timeValue2:   " + timeValue);
//        System.out.println("timeValue2:   " + timeValue2);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
//        sdf+=3600000
        System.out.println("print:   " + sdf);
        ArrayList<String> existing = new ArrayList<>(Arrays.asList("16:00"));
        try {

            Calendar startCalendar = Calendar.getInstance();
            Calendar startCalendar2 = Calendar.getInstance();
            startCalendar.setTime(sdf.parse(timeValue));
            startCalendar2.setTime(sdf.parse(timeValue));
            System.out.println("print1:   " + startCalendar.getTime());

            if (startCalendar.get(Calendar.MINUTE) < 15) {
                startCalendar.set(Calendar.MINUTE, 15);
                startCalendar2.set(Calendar.MINUTE, 15);
            } else if (startCalendar.get(Calendar.MINUTE) < 30) {
                startCalendar.set(Calendar.MINUTE, 30);
                startCalendar2.set(Calendar.MINUTE, 30);

            } else if (startCalendar.get(Calendar.MINUTE) < 45) {
                startCalendar.set(Calendar.MINUTE, 45);
                startCalendar2.set(Calendar.MINUTE, 45);
            } else {
                startCalendar.add(Calendar.MINUTE, 0); // overstep hour and clear minutes
                startCalendar2.add(Calendar.MINUTE, 0); // overstep hour and clear minutes
                startCalendar.clear(Calendar.MINUTE);
                startCalendar2.clear(Calendar.MINUTE);
            }

            Calendar endCalendar = Calendar.getInstance();
            endCalendar.setTime(startCalendar.getTime());
            Calendar closingTIme = Calendar.getInstance();
            Calendar startTime = Calendar.getInstance();
            //change back to 21 later
            closingTIme.set(Calendar.HOUR_OF_DAY, 21);
            startTime.set(Calendar.HOUR_OF_DAY, 9);
            closingTIme.set(Calendar.MINUTE, 0);
            startTime.set(Calendar.MINUTE, 0);

            // if you want dates for whole next day, uncomment next line
            //comment out later
//            if(!DateUtils.isSameDay(date1,new Date())){
//            endCalendar.add(Calendar.DAY_OF_YEAR, 1);}

            endCalendar.add(Calendar.HOUR_OF_DAY, 24 - startCalendar.get(Calendar.HOUR_OF_DAY));

            endCalendar.clear(Calendar.MINUTE);
            endCalendar.clear(Calendar.SECOND);
            endCalendar.clear(Calendar.MILLISECOND);


            SimpleDateFormat slotTime = new SimpleDateFormat("HH:mm");
            SimpleDateFormat slotDate = new SimpleDateFormat(", yyyy-MM-dd");
            ArrayList<String> arr = new ArrayList<>();

            JsonDataArrayFromBeToFe fullFormDataForFE = new JsonDataArrayFromBeToFe();
            ArrayList<String> ar11 = new ArrayList<String>();
            while (endCalendar.after(startCalendar)) {

                Logger.debug(String.valueOf(startCalendar.getTime()));
                Logger.debug(String.valueOf(startTime.getTime()));
                System.out.println("endclendar:" + endCalendar.before(closingTIme));


//                System.out.println( "test1" +closingTIme.getTime());
//                System.out.println( "test2" +endCalendar.getTime());

//                System.out.println(endCalendar.compareTo(closingTIme));
//                System.out.println("closing:"+ closingTIme);
//                System.out.println("startClaneda: " + startCalendar);
                String slotStartTime = slotTime.format(startCalendar.getTime());
                String slotStartDate = slotDate.format(startCalendar.getTime());

                startCalendar.add(Calendar.MINUTE, 15);
                startCalendar2.setTimeInMillis(startCalendar.getTimeInMillis() + MASSAGE_LENGTH);
                String slotEndTime = slotTime.format(startCalendar2.getTime());


//                        Logger.debug("slot:" + startCalendar);


                //uncomment
//                if (!startCalendar2.after(closingTIme)) {


//                    System.out.println("xx:  "+ closingTIme.after(endCalendar));
                System.out.println("DATE of available bookings:   " + slotStartTime + " - " + slotEndTime + slotStartDate);


                System.out.println();


                ar11.add(slotStartTime.trim());


                //move outside of damn while, only 1 at a time getting added

                if (arr.contains(existing)) {
                    System.out.println("yes");
                }

                fullFormDataForFE.add(slotStartTime);

//                Logger.debug("SENDING DATA");

//                fullFormDataForFE.add(dataFromDB(resultSet, HelperUtilityClass.fullFormNames));


//                    arr.forEach(x->System.out.println("klaka" + x));
//                    existing.forEach(x->System.out.println("NANA" + x));

//                } else {
//                System.out.println("OUT OF CLOSING HOURS!");
//                    System.out.println("DATE:   "+ slotStartTime + " - " + slotEndTime + slotStartDate);
//                }


//                System.out.println("slotStartDate: " + slotStartDate);
//                System.out.println("slotStartTime: " + slotStartTime);
//                System.out.println("slotEndTime: " + slotEndTime);

            }
//            if (fullFormDataForFE.size() !=0 ){
//                fullFormDataForFE.add("xx");
//                System.out.println("SIZE TO OSMALL");
//
//            }
            try {
                filterSlotsAccordingToWorkingHours(fullFormDataForFE, existing, date1, timeX,LENGTH_OF_MASSAGE_AS_INDEXES);
            }catch (IndexOutOfBoundsException e){
                Logger.debug("HAHAHA: " + e);
            }

            String response = helperUC.initializeObjectMapper().writeValueAsString(fullFormDataForFE);
            return ok(response);

//            return ok();

        } catch (ParseException e) {
            // date in wrong format
        }


//        String query = HelperUtilityClass.getEnvVar("ADMIN_DATA");

//            try (Connection connection = helperUC.getConnection()) {
//                JsonDataArrayFromBeToFe fullFormDataForFE = new JsonDataArrayFromBeToFe();
//                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
//                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
//
//                        while (resultSet.next()) {
//                            fullFormDataForFE.add(dataFromDB(resultSet, HelperUtilityClass.fullFormNames));
//                        }
//
//
//
//
//                        String response = helperUC.initializeObjectMapper().writeValueAsString(fullFormDataForFE);
//                        Logger.debug("Getting bookingForm data for adminPage...");
//
//                        return ok(response);
//                    }
//                }
        return badRequest();
//
    }



    private void additionalFiltering(JsonDataArrayFromBeToFe arr, String date1, int LENGTH_OF_MASSAGE_AS_INDEXES) throws SQLException {
        String qw = "'\""+date1+"\"'";
        String qq= "SELECT date, time, massageOption from heroku_e3d8ce5aa92835f.fullreservationform WHERE date="+qw+" "+"ORDER BY time ASC"+";";

        System.out.println("my query:  " + qq);
        ArrayList<Time> arrFromDB = new ArrayList();
        ArrayList<Time> arrFromDB2 = new ArrayList();
        Map<String,String> hashMap = new HashMap<>();
        try {
            try (Connection connection = helperUC.getConnection()) {
//            JsonDataArrayFromBeToFe fullFormDataForFE = new JsonDataArrayFromBeToFe();
                try (PreparedStatement preparedStatement = connection.prepareStatement(qq)) {
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {


                        while (resultSet.next()) {
                            Time time = new Time();
                            time.setDate(resultSet.getNString("date").replace("\"", ""));
                            time.setTime(resultSet.getNString("time").replace("\"", ""));
                            time.setLength(resultSet.getNString("massageOption").replace("\"", ""));
                            System.out.println("TIMERSZ");
                            System.out.println(time);

                            arrFromDB.add(time);
//                            fullFormDataForFE.add(dataFromDB(resultSet, HelperUtilityClass.fullFormNames));
                        }
                        while(resultSet.next()){


                        }
                        Logger.debug("IS THIS PLACE FEILING1?");
                        System.out.println("sizeeee::::   " + arrFromDB.size());

//                        System.out.println(arrFromDB.get(0).getTime());
//                        System.out.println(arrFromDB.get(0));




                    }}}} catch (SQLException e) {
            Logger.debug("IS THIS PLACE FEILING?2");
            e.printStackTrace();
        }

        ArrayList<String> newestArrayToFE = new ArrayList<>();


        System.out.println(arrFromDB.get(0).getLength().split(" ")[0]);
        int zex=6;

//    int BUFFER_TIME=4;

        try{
            for (int i=0; i<arrFromDB.size(); i++){
                try{
                    for (int x=0;x<arr.size();x++){
            System.out.println("COUNTING");
                        System.out.println("array1: "+ arr.get(x));
                        try{
                            if (arr.get(x).equals(arrFromDB.get(i).getTime())){
                                System.out.println("INDEX !!!!: " + x);

                                System.out.println("TESTING##########: " + arrFromDB.get(i).getTime());
                                String zeba = arrFromDB.get(i).getLength().split(" ")[0];
                                System.out.println("TEST2:  " + zeba);
                                int zeba2=Integer.parseInt(zeba);
                                System.out.println("TEST3:  " + zeba2);

                                try{
                                    for (int z=0; z<(zeba2/15)+BUFFER_TIME;z++) {

                                        System.out.println("###### REMOVING ######");
                                        System.out.println(x);

                                        arr.remove(x);


//                    System.out.println("DELETETING X AMOUNT OF TIMES: " + z);
//                    System.out.println("ELEMENT");
//                    System.out.println(arr.get(x));
//                    System.out.println("REMOVING ELEMENT THAT IS AT INDEX : " + x);
//                    System.out.println("ELEMENT IS: " + arr.get(x));
//                    arr.remove(x);
//                    System.out.println("INDEX IS : ");
//                    System.out.println(x);
                                    }}
                                catch (IndexOutOfBoundsException e){
                                    Logger.debug("nothing1");
                                }

                                try{
                                    System.out.println("does it continue after nothing1?");
                                    //to be investgated
                                    for (int j=0; j<LENGTH_OF_MASSAGE_AS_INDEXES;j++){
                                        System.out.println("AM I HERE?: ");
                                        System.out.println(arr.get(x-j-1));
                                        arr.remove(x-j-1);
                                    }}
                                catch(IndexOutOfBoundsException e){
                                    Logger.debug("nothing2");
                                }
                            }}catch(IndexOutOfBoundsException e){
                            Logger.debug("nothing3");
                        }
                    }


                }catch(IndexOutOfBoundsException e){
                    Logger.debug("Nothing 4");

                }

                newestArrayToFE.add(arrFromDB.get(i).getTime());

//        arr.retainAll(Collections.singleton(arrFromDB.get(i).getTime()));


                System.out.println("HER EIT COMES");
                System.out.println(arr.contains(arrFromDB.get(i).getTime()));
                System.out.println(arrFromDB.get(i).getTime());
//
//
//
//
            }
        }catch (IndexOutOfBoundsException e) {
            Logger.debug("Yeah, trying to delete more than possible");

        }

//arr.removeAll(newestArrayToFE);
    }






    private void filterSlotsAccordingToWorkingHours(JsonDataArrayFromBeToFe arr, ArrayList<String> existing, Date date1, String timeX, int LENGTH_OF_MASSAGE_AS_INDEXES) throws SQLException {
//        List<String> ar1 = new ArrayList<>(Arrays.asList("08:00", "08:15", "08:30", "08:45", "09:00", "09:15", "09:30", "09:45"));
        ArrayList<String> ar11 = new ArrayList<>(Arrays.asList("10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));

        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("THE DAY OF THE WEEK: " + dayOfWeek);


        //load from properties file later on.
        ArrayList<String> MONDAY = new ArrayList<>(Arrays.asList("10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00","14:15","14:30","14:45","15:00","15:15","15:30","15:45","16:00","16:15","16:30","16:45","17:00","17:15","17:30","17:45","18:00","18:15","18:30","18:45","19:00","19:15","19:30","19:45","20:00","20:15","20:30","20:45","21:00"));
        ArrayList<String> TUESDAY = new ArrayList<>(Arrays.asList(""));
        ArrayList<String> WEDNESDAY = new ArrayList<>(Arrays.asList("15:00","15:15","15:30","15:45","16:00","16:15","16:30","16:45","17:00","17:15","17:30","17:45","18:00","18:15","18:30","18:45","19:00","19:15","19:30","19:45","20:00","20:15","20:30","20:45","21:00"));
        ArrayList<String> THURSDAY = new ArrayList<>(Arrays.asList("15:00","15:15","15:30","15:45","16:00","16:15","16:30","16:45","17:00","17:15","17:30","17:45","18:00","18:15","18:30","18:45","19:00","19:15","19:30","19:45","20:00","20:15","20:30","20:45","21:00"));
        ArrayList<String> FRIDAY = new ArrayList<>(Arrays.asList("10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00","14:15","14:30","14:45","15:00","15:15","15:30","15:45","16:00","16:15","16:30","16:45","17:00","17:15","17:30","17:45","18:00","18:15","18:30","18:45","19:00","19:15","19:30","19:45","20:00","20:15","20:30","20:45","21:00"));
        ArrayList<String> SATURDAY = new ArrayList<>(Arrays.asList("10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00","14:15","14:30","14:45","15:00","15:15","15:30","15:45","16:00","16:15","16:30","16:45","17:00","17:15","17:30","17:45","18:00","18:15","18:30","18:45","19:00","19:15","19:30","19:45","20:00","20:15","20:30","20:45","21:00"));
        ArrayList<String> SUNDAY = new ArrayList<>(Arrays.asList(""));


        switch(dayOfWeek){
            case 1:
                arr.retainAll(SUNDAY);
                System.out.println("SUNDAY IT IS");
                break;
            case 2:
                arr.retainAll(MONDAY);
                System.out.println("MONDAY IT IS");
                break;
            case 3:
                arr.retainAll(TUESDAY);
                System.out.println("TUESDAY IT IS");
                break;
            case 4:
                arr.retainAll(WEDNESDAY);
                System.out.println("WEDNESDAY IT IS");
                break;
            case 5:
                arr.retainAll(THURSDAY);
                System.out.println("THURSDAY IT IS");
                break;
            case 6:
                arr.retainAll(FRIDAY);
                System.out.println("FRIDAY IT IS");
                break;
            case 7:
                arr.retainAll(SATURDAY);
                System.out.println("SATURDAY IT IS");
                break;
        }

//padla

//        System.out.println("SIZE OF ARRAY11111111111:  : : " + arr.get(0));


        additionalFiltering(arr, timeX,LENGTH_OF_MASSAGE_AS_INDEXES);



    }


    // Fetch data from DB for bookingForm
    private Map dataFromDB(ResultSet rs, List<String> list) {
        Map<String, String> map = new HashMap<>();
        for (String item : list) {
            try {
                map.put(item, rs.getString(item).replace("\"", ""));
            } catch (SQLException e) {
                Logger.debug("ResultSet failed while fetching from DB...", e);
            }
        }
        return map;
    }
}
