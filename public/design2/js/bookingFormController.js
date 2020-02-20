app.controller('controllerBookingForm', ['$scope', 'myDataFactory', 'myFunctionsFactory', '$http', '$rootScope', function ($scope, myDF, myFF, $http, $rootScope) {

    loadSection($scope.languageParameter);
    $scope.$on('changeLanguageEvent', function (event, language) {
        $scope.lang = language;
        loadSection(language);
        $scope.formListenerReset1 = true;

    });

    function loadSection(currentLanguage) {
        $scope.errorsBF = {};
        $scope.statusBF = {};
        $scope.applyStyleBF = {};
        $scope.user = {};
        $scope.showSuccessResponse = false;

        $scope.data = {
            formNames: myFF.setLanguage(currentLanguage, myDF.getFormNames(), $scope),
            formPH: myFF.setLanguage(currentLanguage, myDF.getPlaceHolders(), $scope),
            BFErrorsBE: myFF.setLanguage(currentLanguage, myDF.getFFBEErrorMessages(), $scope),
            sucRespBookForm: myFF.setLanguage(currentLanguage, myDF.getSucRespFullBookForm(), $scope),
            introText: myFF.setLanguage(currentLanguage, myDF.getIntroData(), $scope),
            summary: myFF.setLanguage(currentLanguage, myDF.getFormNames(), $scope),


//        $scope.testMe1 = true;
//        $scope.testMe2 = true;


        };

        $scope.showMas=false;
        $scope.showLen=false;
        $scope.showPri=false;
        $scope.showDat=false;
        $scope.show3=false;

        $scope.disableCalendar=true;
        $scope.show3=false;

        getPricesFromDB();
//        getNewTimeSlots();
        getCurrentLangTableFromDB1(currentLanguage);

        $scope.startDate = moment().format('YYYY-MM-DD');
        $scope.backupCallForTimeSlotsOnFail = "";

        $scope.isDisabledMasOpt1 = true;
        $scope.isDisabledTime2 = true;
        $scope.formListenerReset1 = false;
    }
$scope.test111=true;
$scope.applyStyleBF.test111 = myFF.applyColor("red");
$scope.zigi1=false;

    /**
     * Method for fetching correct table with massages from DB
     * @param currentLang - current language of page
     */
    function getCurrentLangTableFromDB1(currentLang) {
        $http({
            method: "POST",
            url: "/getMassagesData",
            data: JSON.stringify(currentLang)
        }).then(function mySuccess(response) {
            $scope.massageInfoFromDB1 = angular.copy(response.data);
        }, function myError(response) {

        });
    }

    /**
     * Fetch prices for massages
     */
    function getPricesFromDB() {

    $scope.errorsBF.newSlots=$scope.data.BFErrorsBE.timeFormat3;
    $scope.statusBF.newTimeSlots=true;

        $http({
            method: "GET",
            url: "/getPrices"
        }).then(function mySuccess(response) {
            $scope.massageOptionsFromDB1 = response.data;
        }, function myError(response) {
        });
    }

$scope.doSomeStuff = function(item) {
    //do operations and finally set disabled to true for that button
//    console.log("HERE IS MY DAMN VALUE")
//    console.log(item)
    $scope.visible1=true;
    $scope.setMe=item
    $scope.user.chosenTime=item;
    $scope.show3=true;
}



        function getNewTimeSlots(pickedDate) {
            $http({
                method: "POST",
                url: "/getNewTimeSlots",
                data: JSON.stringify(pickedDate)
            }).then(function mySuccess(response) {
//            console.log(response)

                $scope.newSlots = response.data;
                if($scope.newSlots.length <1){
                $scope.show3=false;
//                console.log("no slots")
                $scope.errorsBF.newSlots=$scope.data.BFErrorsBE.timeFormat4;
                $scope.statusBF.newTimeSlots= true;
                $scope.zigi1=true;
                $scope.setMe="";
                $scope.lala11=false;
                $scope.user.chosenTime="";
                $scope.visible1=false;
                }else{
                $scope.lala11=true;
//                console.log("PRINT HERE");
//                console.log($scope.setMe)

                $scope.setMe="";

                $scope.user.chosenTime="";
                $scope.visible1=true;
                $scope.statusBF.newTimeSlots= false;
                $scope.errorsBF.time="";
                $scope.zigi1=false;
                }
//                console.log($scope.newSlots)
//                console.log(response)
            }, function myError(response) {
//            console.log(response)
            });
        }

    /**
     * Listen on massage pick from massage section when pressed reserve, so options can be updated accordingly
     */
    $rootScope.$on('massageChange', function (event, code) {
        getMassageOptionForSpecificMassage(code);
    });


    /**
     * Method for watching massage field and providing options when picked or unpicked
     */
    $scope.$watch('user.massage', function (newValue, oldValue, scope) {

        //temporary! when validation in place, remove this
        if (newValue === undefined) {
            $scope.user.massage = "";
        }

        if (newValue !== oldValue) {
            if (newValue === undefined || newValue === null) {
                $scope.lala11=false;
                $scope.user.massage = "";
                $scope.user.massageOptionsFromDB1 = "";
                $scope.currentHolderForMassageOption1 = [];
                $scope.statusBF.massage = true;
                $scope.isDisabledMasOpt1 = true;
            }

            //workaroundish way to handle massage field getting red after language change.
            if (scope.lang === $scope.languageParameter && newValue === undefined) {
                $scope.applyStyleBF.massage = myFF.applyColor("none")
            }

            if ($scope.user.massage.code !== undefined) {
                getMassageOptionForSpecificMassage($scope.user.massage.code);
                $scope.isDisabledMasOpt1 = false;

                $scope.statusBF.massage = false;
                $scope.applyStyleBF.massage = myFF.applyColor("green");


                $scope.errorsBF.massage = "";
                $scope.applyStyleBF.massageOption = myFF.applyColor("none")
                $scope.statusBF.massageOption = false;
                $scope.showMas=true;
                                $scope.showSuccessResponse = false;

            }
        }
    });


    // mouse for massage options
    $scope.mouseOverMassageOpt = function () {
        if ($scope.user.massage === "" || $scope.user.massage === null || $scope.user.massage === undefined) {
            $scope.errorsBF.massageOption = $scope.data.BFErrorsBE.massageOptionFormat;
            $scope.statusBF.massageOption = true;
            $scope.applyStyleBF.massageOption = myFF.applyColor("none")
        }
    };



// $scope.dateMouseOver = function () {
// $scope.statusBF.newTimeSlots=false;
// }

    //mouse for Time
    $scope.mouseOverTime = function () {
        if ($scope.user.chosenDate === "" || $scope.user.chosenDate === null || $scope.user.chosenDate === undefined) {
            $scope.errorsBF.time = $scope.data.BFErrorsBE.timeFormat;
            $scope.statusBF.time = true;
            $scope.applyStyleBF.time = myFF.applyColor("none")
        }
    };

    //chosenDate
    $scope.$watch('user.chosenDate', function (newValue, oldValue) {
        $scope.statusBF.date = false;
        $scope.errorsBF.date = "";
        $scope.errorsBF.newSlots=$scope.data.BFErrorsBE.timeFormat3;
        $scope.statusBF.newTimeSlots=true;
        $scope.applyStyleBF.date = myFF.applyColor("none");
        $scope.lala11=false;

        if (newValue !== oldValue && angular.isDefined(newValue)) {
            $scope.statusBF.time = false;
            $scope.isDisabledTime2 = false;
            $scope.test111=false;
            $scope.show3=false;
            $scope.showDat=true;
            $scope.applyStyleBF.date = myFF.applyColor("green");
        }
    });

//testy
//    $scope.$watch('setMe', function (newValue, oldValue) {
//    if(newValue === undefined){
//    console.log("###################################")
//    console.log($scope.setMe)}
//        $scope.statusBF.date = false;
//        $scope.errorsBF.date = "";
//        $scope.errorsBF.newSlots=$scope.data.BFErrorsBE.timeFormat3;
//        $scope.statusBF.newTimeSlots=true;
//
//        if (newValue !== oldValue && angular.isDefined(newValue)) {
//            $scope.statusBF.time = false;
//            $scope.isDisabledTime2 = false;
//            $scope.test111=false;
//        }
//    });



    //chosenTime
    $scope.$watch('user.chosenTime', function (newValue, oldValue) {
        $scope.statusBF.time = false;
        $scope.errorsBF.time = "";
        if (newValue !== oldValue && angular.isDefined(newValue)) {
            if (newValue === null) {
                newValue = "";
            }
            if (newValue.length < 3 || newValue.length > 100) {
                $scope.errorsBF.time = $scope.data.BFErrorsBE.timeLength;
                $scope.statusBF.time = true;
                $scope.applyStyleBF.time = myFF.applyColor("red");
            }
            else {
                $scope.applyStyleBF.time = myFF.applyColor("green");
            }
        }
    });

    /**
     * Fetch the current chosen massage and provide time with price as massageOption
     * @param code - massage code which is used as a reference
     */
    function getMassageOptionForSpecificMassage(code) {
        //assign value for user.massage - which one picked
        for (var i = 0; i < $scope.massageInfoFromDB1.length; i++) {
            console.log($scope.massageInfoFromDB1)
            if ($scope.massageInfoFromDB1[i].code == code) {
                $scope.user.massage = $scope.massageInfoFromDB1[i];
            }
        }
        //serves as massageOption
        $scope.currentHolderForMassageOption1 = [];
        for (var ii = 0; ii < $scope.massageOptionsFromDB1.length; ii++) {
            if ($scope.massageOptionsFromDB1[ii].code == code) {
                $scope.currentHolderForMassageOption1.push($scope.massageOptionsFromDB1[ii].time + " min – " + $scope.massageOptionsFromDB1[ii].price + " CHF ");
            }
        }
    }

    // function to disable dates in calendar if needed
    $scope.disabledDates = function (date, type) {
        //formatas parinktas kad 2'a metu diena 'laisva'
        $scope.takenOrOffDate = "15";
        // disable all Sundays and Saturdays in the Month View
        return type != 'day' || date.format('dddd') != 'Sunday' && date.format('dddd') != 'Saturday' && date.format('DDD') != $scope.takenOrOffDate;
    };

    /**
     * Get available time slots by date
     */
    $scope.$watch('user.chosenDate', function (newValue, oldValue) {
        if (newValue !== oldValue && newValue !== "") {
            var pickedDate = {"data": [{"date": newValue},{"length": $scope.user.massageOption}]};
//            console.log("IS IT LOGGGGGING?")
//            console.log($scope.user.massageOption)
            if (newValue !== undefined) {
//                console.log("Getting slot")
                //here ex getTimeSlotsFromBackend
                $scope.statusBF.newTimeSlots=false;

//                console.log(pickedDate)
//                console.log(user.massageOptionBF)
                getNewTimeSlots(pickedDate);


            }
        }
    });


    /**
     * Update time slot in database
     */
    function updateEntryInDB() {
        var timeSlot = {
            "data":
//                [{"slot": $scope.user.chosenTime.slot},
//                    {"id": $scope.user.chosenTime.id},
//                    {"time": $scope.user.chosenTime.time}]

                     [{"slot": $scope.setMe},
                                        {"id": $scope.setMe},
                                        {"time": $scope.setMe}]

        };
        $http({
            method: "POST",
            url: "/makeABooking",
            data: JSON.stringify(timeSlot)
        }).then(function mySuccess(response) {
//            console.log("Update in db successful")
//            console.log(response)
        }, function myError(response) {
//            console.log("response status: " + response.status);
//            console.log("response data: " + response.data);
            //someone booked time slot faster (race conditions)
            if (response.status === 400 && response.data === "SlotNotAvailable") {
//                console.log("Calling backend again");
                getTimeSlotsFromBE($scope.backupCallForTimeSlotsOnFail);
            }
        });
    }








    function getTimeSlotsFromBE(pickedDate) {
//    console.log("cia test")
//    console.log(pickedDate)
        $http({
            method: "POST",
            url: "/getTimeSlots",
            data: JSON.stringify(pickedDate)
        }).then(function mySuccess(response) {
//            console.log("response for getTimeSlots");
//            console.log(response.data);
            $scope.timeSlotsForPickedDate = response.data;
            $scope.isDisabledTime = false;
//            console.log("How many timeSlots?:");
//            console.log(response.data.length);
            if (response.data.length === 0) {
//                console.log("No timeSLots available for picked date:");
                $scope.errorsBF.time = $scope.data.BFErrorsBE.slots;
                $scope.isDisabledTime2 = true;
                $scope.statusBF.time = true;
                $scope.errorsBF.date = $scope.data.BFErrorsBE.dateFormat;
                $scope.statusBF.date = true;
                $scope.applyStyleBF.date = myFF.applyColor("red");
            } else {
                $scope.statusBF.date = false;
                $scope.applyStyleBF.date = myFF.applyColor("green");
            }
        }, function myError(response) {
//            console.log("GetTimeSLots FAILED hard")
//            console.log(response)
        });
    }

    var nameRegex = /[\d<>!@#$%^&*()_+=?":;\]\[\\\/|–-]/g;
    var emailRegex = /[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?/g;

    var phoneRegex = /[^\d+\\() –-]/g

    var messageRegex = /[<>`]/g;


    //name
    $scope.$watch('myForm.nameBF.$touched', function (newValue, oldValue) {
        if (newValue !== oldValue) {
            if (angular.isUndefined($scope.user.firstName)) {
                $scope.errorsBF.name = $scope.data.BFErrorsBE.nameLength;
                $scope.statusBF.name = true;
                $scope.applyStyleBF.name = myFF.applyColor("red")
            }
            $scope.myForm.nameBF.$setUntouched()
        }
    });

    //name
    $scope.$watch('user.firstName', function (newValue, oldValue) {
        $scope.statusBF.name = false;
        $scope.errorsBF.name = "";
        if (newValue !== oldValue && angular.isDefined(newValue)) {
            if (newValue.length < 2 || newValue.length > 50) {
                $scope.errorsBF.name = $scope.data.BFErrorsBE.nameLength;
                $scope.statusBF.name = true;
                $scope.applyStyleBF.name = myFF.applyColor("red");
            }
            else if (nameRegex.test(newValue)) {
                $scope.errorsBF.name = $scope.data.BFErrorsBE.nameFormat;
                $scope.statusBF.name = true;
                $scope.applyStyleBF.name = myFF.applyColor("red");
            }
            else {
                $scope.applyStyleBF.name = myFF.applyColor("green");
            }
        }
    });

    //lastname
    $scope.$watch('myForm.surnameBF.$touched', function (newValue, oldValue) {
        if (newValue !== oldValue) {
            if (angular.isUndefined($scope.user.lastName)) {
                $scope.errorsBF.surname = $scope.data.BFErrorsBE.surnameLength;
                $scope.statusBF.surname = true;
                $scope.applyStyleBF.surname = myFF.applyColor("red")
            }
            $scope.myForm.surnameBF.$setUntouched()
        }
    });

    //lastname
    $scope.$watch('user.lastName', function (newValue, oldValue) {
        $scope.statusBF.surname = false;
        $scope.errorsBF.surname = "";
        if (newValue !== oldValue && angular.isDefined(newValue)) {
            if (newValue.length < 2 || newValue.length > 50) {
                $scope.errorsBF.surname = $scope.data.BFErrorsBE.surnameLength;
                $scope.statusBF.surname = true;
                $scope.applyStyleBF.surname = myFF.applyColor("red");
            }
            else if (nameRegex.test(newValue)) {
                $scope.errorsBF.surname = $scope.data.BFErrorsBE.surnameFormat;
                $scope.statusBF.surname = true;
                $scope.applyStyleBF.surname = myFF.applyColor("red");
            }
            else {
                $scope.applyStyleBF.surname = myFF.applyColor("green");
            }
        }
    });


    //email
    $scope.$watch('myForm.emailBF.$touched', function (newValue, oldValue) {
        if (newValue !== oldValue) {
            if (angular.isUndefined($scope.user.email)) {
                $scope.errorsBF.email = $scope.data.BFErrorsBE.emailLength;
                $scope.statusBF.email = true;
                $scope.applyStyleBF.email = myFF.applyColor("red")
            }
            $scope.myForm.emailBF.$setUntouched()
        }
    });

    //email
    $scope.$watch('user.email', function (newValue, oldValue) {
        $scope.statusBF.email = false;
        $scope.errorsBF.email = "";
        if (newValue !== oldValue && angular.isDefined(newValue)) {
            if (newValue.length < 3 || newValue.length > 100) {
                $scope.errorsBF.email = $scope.data.BFErrorsBE.emailLength;
                $scope.statusBF.email = true;
                $scope.applyStyleBF.email = myFF.applyColor("red");
            }
            else if (!newValue.match(emailRegex)) {
                $scope.errorsBF.email = $scope.data.BFErrorsBE.emailFormat;
                $scope.statusBF.email = true;
                $scope.applyStyleBF.email = myFF.applyColor("red");
            }
            else {
                $scope.applyStyleBF.email = myFF.applyColor("green");
            }
        }
    });

    //phone
    $scope.$watch('myForm.phoneBF.$touched', function (newValue, oldValue) {
        if (newValue !== oldValue) {
            if (angular.isUndefined($scope.user.phone)) {
                $scope.errorsBF.phone = $scope.data.BFErrorsBE.phoneLength;
                $scope.statusBF.phone = true;
                $scope.applyStyleBF.phone = myFF.applyColor("red")
            }
            $scope.myForm.phoneBF.$setUntouched()
        }
    });

    //phone
    $scope.$watch('user.phone', function (newValue, oldValue) {
        $scope.statusBF.phone = false;
        $scope.errorsBF.phone = "";
        if (newValue !== oldValue && angular.isDefined(newValue)) {
            if (newValue.length < 9 || newValue.length > 20) {
                $scope.errorsBF.phone = $scope.data.BFErrorsBE.phoneLength;
                $scope.statusBF.phone = true;
                $scope.applyStyleBF.phone = myFF.applyColor("red");
            }
            else if (newValue.match(phoneRegex)) {
                $scope.errorsBF.phone = $scope.data.BFErrorsBE.phoneFormat;
                $scope.statusBF.phone = true;
                $scope.applyStyleBF.phone = myFF.applyColor("red");
            }
            else {
                $scope.applyStyleBF.phone = myFF.applyColor("green");
            }
        }
    });

    //massage
    $scope.$watch('myForm.massageBF.$touched', function (newValue, oldValue) {
        if (newValue !== oldValue) {
            if (angular.isUndefined($scope.user.massage) || $scope.user.massage === "") {
                $scope.errorsBF.massage = $scope.data.BFErrorsBE.massageLength;
                $scope.statusBF.massage = true;
                $scope.applyStyleBF.massage = myFF.applyColor("red")
            }
            $scope.myForm.massageBF.$setUntouched()
        }
    });


    //massageOption
    $scope.$watch('myForm.massageOptionBF.$touched', function (newValue, oldValue) {
        if (newValue !== oldValue) {
            if (angular.isUndefined($scope.user.massageOption)) {
                $scope.errorsBF.massageOption = $scope.data.BFErrorsBE.massageOptionLength;
                $scope.statusBF.massageOption = true;
                $scope.applyStyleBF.massageOption = myFF.applyColor("red")
            }
            $scope.myForm.massageOptionBF.$setUntouched()
        }
    });


    //massageOption
    $scope.$watch('user.massageOption', function (newValue, oldValue) {
        $scope.statusBF.massageOption = false;
        $scope.errorsBF.massageOption = "";
        if (newValue !== oldValue && angular.isDefined(newValue)) {
        $scope.user.chosenDate="";
            if (newValue === undefined || newValue === null) {
                $scope.errorsBF.massageOption = $scope.data.BFErrorsBE.massageOptionLength;
                $scope.statusBF.massageOption = true;
                $scope.applyStyleBF.massageOption = myFF.applyColor("red");
                                $scope.disableCalendar=true;
                                $scope.applyStyleBF.date = myFF.applyColor("red");

            } else {
                $scope.applyStyleBF.massageOption = myFF.applyColor("green");
                $scope.statusBF.massageOption = false;
//                console.log("NEW STUFF")
//                console.log($scope.user.massageOption)
                                $scope.disableCalendar=false;
                                $scope.showSuccessResponse = false;
                                $scope.showLen=true;
                                $scope.showPri=true;

            }
        }
    });



        $scope.$watch('user.message', function (newValue, oldValue) {
        $scope.statusBF.message = false;
        $scope.errorsBF.message = "";
        if (newValue !== oldValue && angular.isDefined(newValue)) {
            if (newValue.length > 1000) {
                $scope.errorsBF.message = $scope.data.BFErrorsBE.messageLength;
                $scope.statusBF.message = true;
                $scope.applyStyleBF.message = myFF.applyColor("red");
            }
            else if (newValue.match(messageRegex)) {
                $scope.errorsBF.message = $scope.data.BFErrorsBE.messageFormat;
                $scope.statusBF.message = true;
                $scope.applyStyleBF.message = myFF.applyColor("red");
            }
            else {
                $scope.applyStyleBF.message = myFF.applyColor("green");
            }
        }
    });









    //captcha
    $scope.$watch('user.captcha', function (newValue, oldValue) {
        $scope.statusBF.captcha = false;
        $scope.errorsBF.captcha = "";
        if (newValue !== oldValue && angular.isDefined(newValue)) {
            if (newValue === undefined || newValue === null) {
                $scope.errorsBF.captcha = $scope.data.BFErrorsBE.captchaFormat;
                $scope.statusBF.captcha = true;
                $scope.applyStyleBF.captcha = myFF.applyColor("red");
            } else {
                $scope.applyStyleBF.captcha = myFF.applyColor("green");
                $scope.statusBF.captcha = false;
                $scope.formListenerReset1 = true;
            }
        }
    });


    // to be removed
    $scope.$watch(function ($scope) {
            return $scope.user.chosenTime
        },
        function (x1, x2) {

            if (x1 == null && x1 !== x2) {
                $scope.user.chosenTime = "";
            }
        }
    );

    function notValid() {
        $scope.myForm.nameBF.$setTouched();
        $scope.myForm.surnameBF.$setTouched();
        $scope.myForm.emailBF.$setTouched();
        $scope.myForm.phoneBF.$setTouched();
        $scope.myForm.massageBF.$setTouched();
        //commented out 2020-02-18
//        $scope.myForm.timeBF.$setTouched();
        //separate handling
        if ($scope.user.chosenDate === undefined || $scope.user.chosenDate.length < 9) {
            $scope.errorsBF.date = $scope.data.BFErrorsBE.dateLength;
            $scope.statusBF.date = true;
            $scope.applyStyleBF.date = myFF.applyColor("red");
        }
        //separate handling
        if ($scope.user.captcha === undefined || $scope.user.captcha === null || $scope.user.captcha === "") {
            $scope.errorsBF.captcha = $scope.data.BFErrorsBE.captchaFormat;
            $scope.statusBF.captcha = true;
            $scope.applyStyleBF.captcha = myFF.applyColor("red");
        }
    }

    function isFormValid() {
//        console.log("Errors:")
//        console.log($scope.errorsBF);
//        console.log ("IS IT FALSE?");
//        console.log($scope.setMe)


        //validate message
        return ($scope.errorsBF.name === "" && $scope.myForm.nameBF.$dirty &&
            $scope.errorsBF.surname === "" && $scope.myForm.surnameBF.$dirty &&
            $scope.errorsBF.email === "" && $scope.myForm.emailBF.$dirty &&
            $scope.errorsBF.phone === "" && $scope.myForm.phoneBF.$dirty &&
            $scope.errorsBF.massage === "" && $scope.myForm.massageBF.$dirty &&
            $scope.errorsBF.massageOption === "" && $scope.myForm.massageOptionBF.$dirty &&
            $scope.errorsBF.date === "" && $scope.setMe !="" && $scope.setMe !=undefined &&//$scope.errorsBF.newSlots !="" &&
//            $scope.errorsBF.time === "" && $scope.myForm.timeBF.$dirty &&
            $scope.errorsBF.captcha === "")
    }

    $scope.submitFullForm1 = function () {


//        console.log("is form valid?: " + isFormValid());
        if (isFormValid()) {
//            console.log("on submit:");

            $scope.errorsBF = {};
            $scope.showSuccessResponse = false;
            $scope.submittedFail = "";
            var bookingForm = {
                "data":
                    [
                        {"name": $scope.user.firstName},
                        {"surname": $scope.user.lastName},
                        {"email": $scope.user.email},
                        {"phone": $scope.user.phone},
                        {"massage": $scope.user.massage.massageName},
                        {"massageOption": $scope.user.massageOption},
                        {"date": $scope.user.chosenDate},
                        {"time": $scope.setMe},
                        {"message": $scope.user.message},
                        {"captcha": $scope.user.captcha}
                    ]
            };
            $http({
                method: "POST",
                url: "/submitFullForm",
                data: JSON.stringify(bookingForm)
            }).then(function mySuccess(response) {

//                updateEntryInDB();
                $scope.showSuccessResponse = true;
                $scope.disableCalendar=true;
//                console.log("SucRespons: ");
                $scope.setMe="";
//                console.log(response);
                $scope.submittedSuccess = $scope.data.sucRespBookForm.response;
                $scope.user = {};
                $scope.applyStyleBF = {};
                $scope.setWidgetId(0, $scope.languageParameter);
                $scope.newSlots={};
                       $scope.showMas=false;
                        $scope.showLen=false;
                        $scope.showPri=false;
                        $scope.showDat=false;
                        $scope.show3=false;


            }, function myError(response) {
//                console.log("FailRespons: ");
//                console.log(response);

                $scope.er = response.data[0];

                if ($scope.er.captcha !== "") {
                    $scope.setWidgetId(0, $scope.languageParameter);
                }
                errorMassagesFromBackend($scope.er.name, $scope.er.surname, $scope.er.email, $scope.er.phone, $scope.er.massage, $scope.er.massageOption, $scope.er.date, $scope.er.time, $scope.er.message, $scope.er.captcha);
            });
        } else {
            notValid();
        }
    };

    function errorMassagesFromBackend(name, surname, email, phone, massage, massageOption, date, time, message, captcha) {

        $scope.ax = $scope.data.BFErrorsBE;
//        console.log("Inside backend validation");
        $scope.errorsBF.name = myFF.processBackendResponse(name, "nameFormat", "nameLength", $scope.ax.nameFormat, $scope.ax.nameLength);
        if ($scope.errorsBF.name !== "") {
            $scope.status.name = true;
            $scope.applyStyleBF.name = myFF.applyColor("red")
        }
        $scope.errorsBF.surname = myFF.processBackendResponse(surname, "surnameFormat", "surnameLength", $scope.ax.surnameFormat, $scope.ax.surnameLength);
        if ($scope.errorsBF.surname !== "") {
            $scope.status.surname = true;
            $scope.applyStyleBF.surname = myFF.applyColor("red")
        }
        $scope.errorsBF.email = myFF.processBackendResponse(email, "emailFormat", "emailLength", $scope.ax.emailFormat, $scope.ax.emailLength);

        if ($scope.errorsBF.email !== "") {
            $scope.status.email = true;
            $scope.applyStyleBF.email = myFF.applyColor("red")
        }
        $scope.errorsBF.phone = myFF.processBackendResponse(phone, "phoneFormat", "phoneLength", $scope.ax.phoneFormat, $scope.ax.phoneLength);

        if ($scope.errorsBF.phone !== "") {
            $scope.status.phone = true;
            $scope.applyStyleBF.phone = myFF.applyColor("red")
        }

        $scope.errorsBF.massage = myFF.processBackendResponse(massage, "massageFormat", "massageLength", $scope.ax.massageFormat, $scope.ax.massageLength);

        if ($scope.errorsBF.massage !== "") {
            $scope.status.massage = true;
            $scope.applyStyleBF.massage = myFF.applyColor("red")
        }

        $scope.errorsBF.massageOption = myFF.processBackendResponse(massageOption, "massageOptionFormat", "massageOptionLength", $scope.ax.massageOptionFormat, $scope.ax.massageOptionLength);

        if ($scope.errorsBF.massageOption !== "") {
            $scope.status.massageOption = true;
            $scope.applyStyleBF.massageOption = myFF.applyColor("red")
        }

        $scope.errorsBF.date = myFF.processBackendResponse(date, "dateFormat", "dateLength", $scope.ax.dateFormat, $scope.ax.dateLength);

        if ($scope.errorsBF.date !== "") {
            $scope.status.date = true;
            $scope.applyStyleBF.date = myFF.applyColor("red")
        }

        $scope.errorsBF.time = myFF.processBackendResponse(time, "timeFormat", "timeLength", $scope.ax.timeFormat, $scope.ax.timeLength);

        if ($scope.errorsBF.time !== "") {
            $scope.status.time = true;
            $scope.applyStyleBF.time = myFF.applyColor("red")
        }
        $scope.errorsBF.message = myFF.processBackendResponse(message, "messageFormat", "messageLength", $scope.ax.messageFormat, $scope.ax.messageLength);

        if ($scope.errorsBF.message !== "") {
            $scope.status.message = true;
            $scope.applyStyleBF.message = myFF.applyColor("red")
        }

        $scope.errorsBF.captcha = myFF.processBackendResponse(captcha, "captchaFormat", "xxxxx", $scope.ax.captchaFormat, "xxxxx");

        if ($scope.errorsBF.captcha !== "") {
            $scope.status.captcha = true;
            $scope.applyStyleBF.captcha = myFF.applyColor("red")
        }

    }


}

]);






