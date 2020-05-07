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

    public static int BUFFER_TIME = 4;

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
                                    data.getString(5), data.getString(6), data.getString(7), data.getString(8), data.getString(9),data.getString(10)));
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

    public Result getMassagesDataOther() throws JsonProcessingException {
        JsonNode json = request().body().asJson();
        try {
            try (Connection connection = helperUC.getConnection()) {
                try (PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM heroku_e3d8ce5aa92835f.massagede_other")) {
                    JsonDataArrayFromBeToFe massageList = new JsonDataArrayFromBeToFe();
                    try (ResultSet data = preparedStatement1.executeQuery()) {

                        while (data.next()) {
                            Logger.debug("getting....");
                            Logger.debug(data.getString(2));
                            massageList.add(new MassageInfo(data.getInt(1), data.getString(3), data.getString(2), data.getString(4),
                                    data.getString(5), data.getString(6), data.getString(7), data.getString(8), data.getString(9),data.getString(10)));
                        }
                        String response = helperUC.initializeObjectMapper().writeValueAsString(massageList);
                        Logger.debug("Getting massageData2...");

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
        String qq = "SELECT date, time, massageOption from heroku_e3d8ce5aa92835f.fullreservationform WHERE date=" + qw + ";";

        System.out.println("my query:  " + qq);
        ArrayList<Time> ar111 = new ArrayList();
        Map<String, String> hashMap = new HashMap<>();
        try {
            try (Connection connection = helperUC.getConnection()) {
                JsonDataArrayFromBeToFe fullFormDataForFE = new JsonDataArrayFromBeToFe();
                try (PreparedStatement preparedStatement = connection.prepareStatement(qq)) {
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {


                        while (resultSet.next()) {
                            Time time = new Time();
                            time.setDate(resultSet.getNString("date"));
                            time.setTime(resultSet.getNString("time"));
                            time.setLength(resultSet.getNString("massageOption"));

                            ar111.add(time);
//                            fullFormDataForFE.add(dataFromDB(resultSet, HelperUtilityClass.fullFormNames));
                        }

                        System.out.println("sizeeee::::   " + ar111.size());

//                        System.out.println(" size of ar : " +ar111.size());

                        for (int i = 0; i < ar111.size(); i++) {
                            System.out.println("here ti comes");
                            System.out.println(ar111.get(i).getDate() + "  " + ar111.get(i).getTime() + " " + ar111.get(i).getLength());
                        }


                        String response = helperUC.initializeObjectMapper().writeValueAsString(fullFormDataForFE);

                        System.out.println("##########################################");
                        System.out.println(response);
                        for (int i = 0; i < fullFormDataForFE.size(); i++) {
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

        System.out.println("Inside of getting new time slots");
        JsonNode json = request().body().asJson();

        String timeX = json.findPath("date").asText();
        String massageLengthFromOptionMassage = json.findPath("length").asText().split(" ")[0];

        int LENGTH_OF_MASSAGE_AS_INDEXES = 0;
//        int BUFFER_TIME= 6;

        //fix this, never allow undefined to come in from angularjs, for now it's temporary, meaning most probably permanent.
        if (massageLengthFromOptionMassage.isEmpty()) {
            System.out.println("Empty massage option arrived, adding number manually - 90minutes");
            LENGTH_OF_MASSAGE_AS_INDEXES = 6;
        } else {
            LENGTH_OF_MASSAGE_AS_INDEXES = (Integer.parseInt(massageLengthFromOptionMassage) / 15) + BUFFER_TIME;

        }
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(timeX);

        String timeValue;
        boolean today = DateUtils.isSameDay(date1, new Date());

        if (DateUtils.isSameDay(date1, new Date())) {
            //set to 14400000 to move forward
            timeValue = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()));//+ 4400000
            System.out.println("Arrived time is TODAY");
            System.out.println("--------------------------------------------------------");
            System.out.println(timeValue);
        } else {
            System.out.println("Arrived time - OTHER DAY");
            timeValue = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(date1);
            System.out.println("--------------------------------------------------------");
        }

        int MASSAGE_LENGTH = 3600000;

//        String timeValue = "2015-10-28T18:07:04.899+09:30";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        ArrayList<String> existing = new ArrayList<>(Arrays.asList("16:00"));
        try {

            Calendar startCalendar = Calendar.getInstance();
//            Calendar startCalendar2 = Calendar.getInstance();
            startCalendar.setTime(sdf.parse(timeValue));
//            startCalendar2.setTime(sdf.parse(timeValue));

            if (startCalendar.get(Calendar.MINUTE) < 15) {
                startCalendar.set(Calendar.MINUTE, 15);
//                startCalendar2.set(Calendar.MINUTE, 15);
            } else if (startCalendar.get(Calendar.MINUTE) < 30) {
                startCalendar.set(Calendar.MINUTE, 30);
//                startCalendar2.set(Calendar.MINUTE, 30);

            } else if (startCalendar.get(Calendar.MINUTE) < 45) {
                startCalendar.set(Calendar.MINUTE, 45);
//                startCalendar2.set(Calendar.MINUTE, 45);
            } else {
                startCalendar.add(Calendar.MINUTE, 0);
                startCalendar.add(Calendar.HOUR, 1);// overstep hour and clear minutes
                startCalendar.clear(Calendar.MINUTE);
//                startCalendar2.add(Calendar.MINUTE, 0);
//                startCalendar2.add(Calendar.HOUR, 1);// overstep hour and clear minutes
//                startCalendar2.clear(Calendar.MINUTE);
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
//                System.out.println("START CALENDAR builder");
                String slotStartTime = slotTime.format(startCalendar.getTime());
                String slotStartDate = slotDate.format(startCalendar.getTime());

                startCalendar.add(Calendar.MINUTE, 15);
//                startCalendar2.setTimeInMillis(startCalendar.getTimeInMillis() + MASSAGE_LENGTH);
//                String slotEndTime = slotTime.format(startCalendar2.getTime());

//                System.out.println("DATE of available bookings:   " + slotStartTime + " - " + slotEndTime + slotStartDate);
                ar11.add(slotStartTime.trim());
                fullFormDataForFE.add(slotStartTime);
            }
            try {
                filterSlotsAccordingToWorkingHours(fullFormDataForFE, existing, date1, timeX, LENGTH_OF_MASSAGE_AS_INDEXES, today);
            } catch (IndexOutOfBoundsException e) {
                Logger.debug("Failed in this X: " + e);
            }

            String response = helperUC.initializeObjectMapper().writeValueAsString(fullFormDataForFE);
            return ok(response);


        } catch (ParseException e) {
            Logger.debug("something wrong here");
            // date in wrong format
        }
        return badRequest();
    }

    private void additionalFiltering(JsonDataArrayFromBeToFe arr, String date1, int LENGTH_OF_MASSAGE_AS_INDEXES, boolean today) throws SQLException {
        String qw = "'\"" + date1 + "\"'";
        String qq = "SELECT date, time, massageOption from heroku_e3d8ce5aa92835f.fullreservationform WHERE date=" + qw + " " + "ORDER BY time ASC" + ";";

        System.out.println("my query:  " + qq);
        ArrayList<Time> arrFromDB = new ArrayList();
        ArrayList<Time> arrFromDB2 = new ArrayList();
        Map<String, String> hashMap = new HashMap<>();

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
                            arrFromDB.add(time);
                        }
                        System.out.println("Size of Array: " + arrFromDB.size());
                        //start here
                        ArrayList<Object> arrayHolderForRemoving = new ArrayList();
                        //If it is today ant no bookings yet, show 3 hours in advance, deleting 12 slots, 1slot=15min
                        if (arrFromDB.size() == 0 && today) {
                            System.out.println("No one registered today, therefore deleting slots");
                            try {

                            for (int xxx = 0; xxx < 12; xxx++) {
                                arrayHolderForRemoving.add(arr.get(xxx));
                                System.out.println(arr.get(xxx));

                            }}catch(IndexOutOfBoundsException e){
                                Logger.debug("caught exception in removing slots 1");
                            }
                        }else{

                            if (today){
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
                                        }else{

                                                //get rid of looping too many times
                                            if(x<=0){
                                                System.out.println("not found any match, but must remove next elements from given date time");
                                                int zeba3 = Integer.parseInt(arrFromDB.get(i).getLength().split(" ")[0]);
                                                ArrayList<String> MONDAY1 = new ArrayList<>(Arrays.asList("10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));

                                                for (int zzz=0; zzz<MONDAY1.size(); zzz++){


                                                    try {
                                                        if (MONDAY1.get(zzz).equals(arrFromDB.get(i).getTime())) {
                                                            for (int zz = 0; zz < (zeba3 / 15) + BUFFER_TIME; zz++) {
                                                                try{
                                                                    System.out.println("Marking to be removed following slot: ");
                                                                    System.out.println(MONDAY1.get(zzz + zz));
                                                                    arrayHolderForRemoving.add(MONDAY1.get(zzz + zz));
                                                                }catch (IndexOutOfBoundsException e){
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
                            }catch(Exception e){
                                Logger.debug("in exception X");
                            }
                        }
                        arr.removeAll(arrayHolderForRemoving);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("Crashed when fetching from DB");
            e.printStackTrace();
        }
    }

    private void filterSlotsAccordingToWorkingHours(JsonDataArrayFromBeToFe
                                                            arr, ArrayList<String> existing, Date date1, String timeX, int LENGTH_OF_MASSAGE_AS_INDEXES, boolean today) throws
            SQLException {
//        List<String> ar1 = new ArrayList<>(Arrays.asList("08:00", "08:15", "08:30", "08:45", "09:00", "09:15", "09:30", "09:45"));
        ArrayList<String> ar11 = new ArrayList<>(Arrays.asList("10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));

        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("THE DAY OF THE WEEK: " + dayOfWeek);


        //load from properties file later on.
        ArrayList<String> MONDAY = new ArrayList<>(Arrays.asList("09:00", "09:15", "09:30", "09:45","10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));
        ArrayList<String> TUESDAY = new ArrayList<>(Arrays.asList("09:00", "09:15", "09:30", "09:45","10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45","13:00","18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));
        ArrayList<String> WEDNESDAY = new ArrayList<>(Arrays.asList("13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45","15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));
        ArrayList<String> THURSDAY = new ArrayList<>(Arrays.asList("09:00", "09:15", "09:30", "09:45","10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));
        ArrayList<String> FRIDAY = new ArrayList<>(Arrays.asList("09:00", "09:15", "09:30", "09:45","10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));
        ArrayList<String> SATURDAY = new ArrayList<>(Arrays.asList("09:00", "09:15", "09:30", "09:45","10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));
        ArrayList<String> SUNDAY = new ArrayList<>(Arrays.asList("09:00", "09:15", "09:30", "09:45","10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00"));

//        additionalFiltering(arr, timeX,LENGTH_OF_MASSAGE_AS_INDEXES);

        switch (dayOfWeek) {
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

        additionalFiltering(arr, timeX, LENGTH_OF_MASSAGE_AS_INDEXES, today);

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

    ;

}
