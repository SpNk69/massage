var app = angular.module('myTestApp', ['ngTextTruncate', 'myTestApp2', 'moment-picker', 'ngMap', 'vcRecaptcha', 'myTestApp22']); //ngMessages
app.config(['momentPickerProvider', function (momentPickerProvider) {
    momentPickerProvider.options({
        minutesFormat: 'HH:mm'
    });
}]);

app.controller('myTestController', ['$scope', 'myDataFactory', '$http', 'NgMap', 'vcRecaptchaService', 'myFunctionsFactory', function ($scope, myDataFactory, $http, NgMap, vcRecaptchaService, myFunctionsFactory) {

    //global ones for now (needed)
    $scope.languageParameter = "lt";
    $scope.truncateSize = 100;
    resetOrInitFormsVars();
    $scope.massagePickedFromDescriptions = "";
    $scope.showIt1 = false;


    app.captchaController($scope, vcRecaptchaService);

    app.mapsController($scope, NgMap);


    myFunctionsFactory.hideFlagOfCurrentLang($scope, $scope.languageParameter);


    $scope.googleMapsUrl = "https://maps.googleapis.com/maps/api/js?key=AIzaSyCEYVMDc9EIG4zsSYD6SXJ7gzk05BOinH0";
    app.initController($scope, myDataFactory,myFunctionsFactory);


    $scope.doTranslate = function (langToSetTo) {

        //to get specific table from db for multi lang purposes
        getCurrentLangTableFromDB(langToSetTo);

        $scope.showIt1 = false;

        $scope.myForm.$setPristine();
        $scope.submittedSuccess = "";


        myFunctionsFactory.hideFlagOfCurrentLang($scope, langToSetTo);


        $scope.setWidgetId(0, langToSetTo);
        $scope.setWidgetId(1, langToSetTo);


        $scope.languageParameter = langToSetTo;

        $scope.data = {
            titlePage: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getPageTitle(),$scope),
            introText: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getIntroData(),$scope),
            navBar: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getNavBarData(),$scope),
            massageTitle: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getMassagesTitles(),$scope),
            massageBody: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getMassageBodyData(),$scope),
            aboutMeTitle: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getAboutMeTitle(),$scope),
            aboutMeBody: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getAboutMeBody(),$scope),
            inAHurry: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getInaHurryData(),$scope),
            prices: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getPrices(),$scope),
            formNames: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getFormNames(),$scope),
            formPH: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getPlaceHolders(),$scope),
            formErrors: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getFormErrors(),$scope),
            contactForm: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getContactUsData(),$scope),
            contactFormErrors: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getContactFormErrors(),$scope),
            backendPricesTest: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getMassagesFromBackend(),$scope),
            fullFormBackendErrorMessages: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getFullFormBackendErrorMessages(),$scope),
            contactFormBackendErrorMessages: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getContactFormBackendErrorMessages(),$scope),
            sucRespBookForm: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getSucRespFullBookForm(),$scope),
            sucRespContactForm: myFunctionsFactory.setLanguage(langToSetTo, myDataFactory.getSucRespContactUsForm(),$scope)
        };


        resetOrInitFormsVars();


        $scope.submittedFail = "";
    };


    $scope.pickMassage = function (number) {



        getMassageOptionForSpecificPick(number);

        for (var i = 0; i < $scope.massageInfoFromDB.length; i++) {
            if ($scope.massageInfoFromDB[i].code == number) {
                $scope.pickedCurrentItem = $scope.massageInfoFromDB[i];
            }
        }


        $scope.testError = "";

        console.log("In a pick:");
        console.log($scope.pickedCurrentItem);
        // $scope.data.formPH.massage = $scope.pickedCurrentItem.massageName;
        $scope.user.massage = $scope.pickedCurrentItem;
        console.log("PICKED MASSAGE " + $scope.pickedCurrentItem.massageName);

    };

    $scope.submitFunctionForm = function () {
        console.log("Happened call to contactFormController");
        app.contactFormController($scope, $http, myFunctionsFactory);

    };


    $scope.$watch('myForm.xxx.$dirty', function () {
        console.log("In a watcher");

        //workaround temp
        if ($scope.user.massage === null) {
            $scope.user.massage = "";
        }
        if (!angular.isUndefined($scope.user.massage.code) && $scope.user.massage.code !== "") {
            getMassageOptionForSpecificPick($scope.user.massage.code);
        }
        //clear massageOptionHolder if massage is unpicked
        if(angular.isUndefined($scope.user.massage.massageName)){
                        $scope.currentHolderForMassageOption = [];
        }


        console.log("In a watcher before setPristine: " + $scope.user.massage.massageName);

        $scope.myForm.$setPristine();

        console.log("In a watcher after setPristine: " + $scope.user.massage.massageName);


    });


    $scope.chosenDate = "";
    $scope.chosenTime = "";

    // range of available (not disabled) hours
    $scope.startHour = "09:00";
    $scope.endHour = "23:00";

    //format
    // commented out so nothing is preset
    // $scope.chosenDate = moment().format('YYYY-MM-DD');
    // $scope.chosenTime = moment.locale('lt');
    // $scope.chosenTime = moment().format('LTS');
    $scope.startDate = moment().format('YYYY-MM-DD')

    // function to disable dates in calendar if needed

    $scope.disabledDates = function (date, type) {
        //formatas parinktas kad 2'a metu diena 'laisva'
        $scope.takenOrOffDate = "15";
        // disable all Sundays and Saturdays in the Month View
        return type != 'day' || date.format('dddd') != 'Sunday' && date.format('dddd') != 'Saturday' && date.format('DDD') != $scope.takenOrOffDate;
    };

    // function to disable hours
    $scope.disabledTimes = function (date, type) {
        $scope.formatas = date.format('HH');
        $scope.formatas2 = type;
        $scope.takenOrOffTime = "13";
        return type != 'hour' || date.format('HH') != $scope.takenOrOffTime;
    };



    // validate that input was entered
    function isBookingFormValid() {

        //needed
        $scope.user.captcha = $scope.response;

        $scope.errors.invalidName = myFunctionsFactory.ifEmpty($scope.user.firstName, $scope.data.formErrors.name);
        $scope.errors.invalidLastName = myFunctionsFactory.ifEmpty($scope.user.lastName, $scope.data.formErrors.surname);
        $scope.errors.invalidEmail = myFunctionsFactory.emailCheck($scope.user.email, $scope.data.formErrors.email, $scope.data.formErrors.emailBadFormat);
        $scope.errors.invalidPhone = myFunctionsFactory.ifEmpty($scope.user.phone, $scope.data.formErrors.phone);
        $scope.errors.invalidMassage = myFunctionsFactory.ifEmptyNullOrUndefined($scope.user.massage.massageName, $scope.data.formErrors.massage);
        $scope.errors.invalidMassageOption = myFunctionsFactory.ifEmptyNullOrUndefined($scope.user.massageOption, $scope.data.formErrors.massageOption);
        $scope.errors.invalidDate = myFunctionsFactory.ifEmptyNullOrUndefined($scope.chosenDate, $scope.data.formErrors.date);
        $scope.errors.invalidTime = myFunctionsFactory.ifEmptyNullOrUndefined($scope.chosenTime, $scope.data.formErrors.time);
        $scope.errors.invalidCaptcha = myFunctionsFactory.ifEmptyNullOrUndefined($scope.user.captcha, $scope.data.formErrors.captcha);

        return myFunctionsFactory.isValidInput($scope.errors)
    }

    $scope.checkSubmittedData = function () {
        console.log("user data: " + $scope.user.massage.massageName);
        console.log("In the checkSubmittedData");

        if (isBookingFormValid()) {
            console.log("In the isBookingFormValid");

            $scope.submittedFirstName = $scope.user.firstName;
            $scope.submittedLastName = $scope.user.lastName;
            $scope.submittedEmail = $scope.user.email;
            $scope.submittedPhone = $scope.user.phone;
            $scope.submittedMassage = $scope.user.massage.massageName;
            $scope.submittedMassageOption = $scope.user.massageOption;
            $scope.submittedDate = $scope.chosenDate;
            $scope.submittedTime = $scope.chosenTime;
            $scope.submittedMessage = $scope.user.message;
            $scope.submittedCaptcha = $scope.user.captcha;
            $scope.megaFail = "";
            return true;

        } else {
            $scope.megaFail = "NOT HAPPENING";
            return false;
        }

    };

    // function for full form submission
    $scope.submitFullForm = function () {

        $scope.myForm.$setPristine();
        $scope.showIt1 = false;

        $scope.submittedFail = "";
        $scope.submittedSuccess = "";
        $scope.submitError = "";
        if ($scope.checkSubmittedData()) {

            var sendStuff = {
                "GetAllCustomersData":
                    [
                        {
                            "name": $scope.submittedFirstName
                        },
                        {
                            "surname": $scope.submittedLastName
                        },
                        {
                            "email": $scope.submittedEmail
                        },
                        {
                            "phone": $scope.submittedPhone
                        },
                        {
                            "massage": $scope.submittedMassage
                        },
                        {
                            "massageOption": $scope.submittedMassageOption
                        },
                        {
                            "date": $scope.submittedDate
                        },
                        {
                            "time": $scope.submittedTime
                        },
                        {
                            "message": $scope.submittedMessage
                        },
                        {
                            "captcha": $scope.submittedCaptcha
                        }
                    ]
            };

            $http({
                method: "POST",
                url: "/submitFullForm",
                data: JSON.stringify(sendStuff)
            }).then(function mySuccess(response) {
                $scope.showIt1 = true;
                console.log("SucRespons: ");
                console.log(response);
                $scope.submittedSuccess = $scope.data.sucRespBookForm.response;

                $scope.setWidgetId(0, $scope.languageParameter);

                resetOrInitFormsVars();
            }, function myError(response) {
                console.log("FailRespons: ");
                console.log(response);
                $scope.submitError = response.data;

                $scope.er = $scope.submitError.contactFormErrors[0];

                if ($scope.er.captcha !== "") {
                    $scope.setWidgetId(0, $scope.languageParameter);
                }

                errorMassagesFromBackend($scope.er.name, $scope.er.surname, $scope.er.email, $scope.er.phone, $scope.er.massage, $scope.er.massageOption, $scope.er.date, $scope.er.time, $scope.er.message, $scope.er.captcha);

                $scope.submittedFail = "Something went wrong";
            });

        }
        else {
            $scope.submittedFail = "Something Horrible Happened! Call 911."
        }
    };

    function errorMassagesFromBackend(name, surname, email, phone, massage, massageOption, date, time, message, captcha) {

        $scope.ax = $scope.data.fullFormBackendErrorMessages;
        console.log("Inside validation");
        $scope.errors.invalidName = myFunctionsFactory.processBackendResponse(name, "nameFormat", "nameLength", $scope.ax.nameFormat, $scope.ax.nameLength);
        $scope.errors.invalidLastName = myFunctionsFactory.processBackendResponse(surname, "surnameFormat", "surnameLength", $scope.ax.surnameFormat, $scope.ax.surnameLength);
        $scope.errors.invalidEmail = myFunctionsFactory.processBackendResponse(email, "emailFormat", "emailLength", $scope.ax.emailFormat, $scope.ax.emailLength);
        $scope.errors.invalidPhone = myFunctionsFactory.processBackendResponse(phone, "phoneFormat", "phoneLength", $scope.ax.phoneFormat, $scope.ax.phoneLength);
        $scope.errors.invalidMassage = myFunctionsFactory.processBackendResponse(massage, "massageFormat", "massageLength", $scope.ax.massageFormat, $scope.ax.massageLength);
        $scope.errors.invalidMassageOption = myFunctionsFactory.processBackendResponse(massageOption, "massageOptionFormat", "massageOptionLength", $scope.ax.massageOptionFormat, $scope.ax.massageOptionLength);
        $scope.errors.invalidDate = myFunctionsFactory.processBackendResponse(date, "dateFormat", "dateLength", $scope.ax.dateFormat, $scope.ax.dateLength);
        $scope.errors.invalidTime = myFunctionsFactory.processBackendResponse(time, "timeFormat", "timeLength", $scope.ax.timeFormat, $scope.ax.timeLength);
        $scope.errors.invalidMessage = myFunctionsFactory.processBackendResponse(message, "messageFormat", "messageLength", $scope.ax.messageFormat, $scope.ax.messageLength);
        $scope.errors.invalidCaptcha = myFunctionsFactory.processBackendResponse(captcha, "captchaFormat", "xxxxx", $scope.ax.captchaFormat, "xxxxx");
    }


    function resetOrInitFormsVars() {
        $scope.user = {
            firstName: "",
            lastName: "",
            email: "",
            phone: "",
            massage: "",
            massageOption: "",
            message: "",
            captcha: ""
        };
        $scope.chosenDate = "";
        $scope.chosenTime = "";

        $scope.massagePickedFromDescriptions = "";

        $scope.cfEmail = "";
        $scope.cfName = "";
        $scope.cfMessage = "";
        $scope.cfCaptcha = "";

        $scope.errors = {
            invalidName: "",
            invalidLastName: "",
            invalidEmail: "",
            invalidPhone: "",
            invalidMassage: "",
            invalidMassageOption: "",
            invalidDate: "",
            invalidTime: "",
            invalidMessage: "",
            invalidCaptcha: ""
        };
        $scope.contactFormErrors = {
            name: "",
            email: "",
            message: "",
            captcha: ""
        };

    }


    //get possible massages with codes from specific db table according to current language

    function getCurrentLangTableFromDB(currentLang) {
        $http({
            method: "POST",
            url: "/getMassagesData",
            data: JSON.stringify(currentLang)
        }).then(function mySuccess(response) {
            $scope.massageInfoFromDB = angular.copy(response.data.massageInfo);

            sortSpaMassages($scope.massageInfoFromDB);
            sortOtherMassages($scope.massageInfoFromDB);

        }, function myError(response) {

        });
    }


    getCurrentLangTableFromDB($scope.languageParameter);

    //separate spa massages for Prices section
    function sortSpaMassages(massageInfo) {
        $scope.spaMassages = [];
        for (var i = 0; i < 7; i++) {
            $scope.spaMassages.push(massageInfo[i])
        }
        myFunctionsFactory.refactorArrayForDisplay($scope.spaMassages, 7);
    }


    //separate other massages for Prices section
    function sortOtherMassages(massageInfo) {
        $scope.otherMassages = [];
        for (var i = 7; i < 9; i++) {
            $scope.otherMassages.push(massageInfo[i])
        }
        myFunctionsFactory.refactorArrayForDisplay($scope.otherMassages, 2);

    }

    //Get prices from database
    $scope.massageOptionsFromDB = "";

    function getPricesFromDB() {
        $http({
            method: "GET",
            url: "/getPrices"
        }).then(function mySuccess(response) {

            $scope.massageOptionsFromDB = response.data;

        }, function myError(response) {

        });
    }

    //prices for massage option field
    getPricesFromDB();


    //handle massageOption field
    function getMassageOptionForSpecificPick(code) {
        $scope.currentHolderForMassageOption = [];

        for (var i = 0; i < $scope.massageOptionsFromDB.pricesInfo.length; i++) {
            if ($scope.massageOptionsFromDB.pricesInfo[i].code == code) {
                $scope.currentHolderForMassageOption.push($scope.massageOptionsFromDB.pricesInfo[i].time + " min – " + $scope.massageOptionsFromDB.pricesInfo[i].price + " CHF ");
            }
        }
    }


}

]);













