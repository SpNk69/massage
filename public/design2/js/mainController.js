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




    app.captchaController($scope, vcRecaptchaService);

    app.mapsController($scope,NgMap);



    hideFlagOfCurrentLang($scope.languageParameter)


    $scope.googleMapsUrl = "https://maps.googleapis.com/maps/api/js?key=AIzaSyCEYVMDc9EIG4zsSYD6SXJ7gzk05BOinH0";
    app.initController($scope, myDataFactory);







    $scope.doTranslate = function (langToSetTo) {
        $scope.myForm.$setPristine();


        hideFlagOfCurrentLang(langToSetTo);


        $scope.setWidgetId(0, langToSetTo);
        $scope.setWidgetId(1, langToSetTo);


        $scope.languageParameter = langToSetTo;

        $scope.data = {
            titlePage: setLanguage(langToSetTo, myDataFactory.getPageTitle()),
            introText: setLanguage(langToSetTo, myDataFactory.getIntroData()),
            navBar: setLanguage(langToSetTo, myDataFactory.getNavBarData()),
            massageTitle: setLanguage(langToSetTo, myDataFactory.getMassagesTitles()),
            massageBody: setLanguage(langToSetTo, myDataFactory.getMassageBodyData()),
            aboutMeTitle: setLanguage(langToSetTo, myDataFactory.getAboutMeTitle()),
            aboutMeBody: setLanguage(langToSetTo, myDataFactory.getAboutMeBody()),
            inAHurry: setLanguage(langToSetTo, myDataFactory.getInaHurryData()),
            prices: setLanguage(langToSetTo, myDataFactory.getPrices()),
            formNames: setLanguage(langToSetTo, myDataFactory.getFormNames()),
            formPH: setLanguage(langToSetTo, myDataFactory.getPlaceHolders()),
            formErrors: setLanguage(langToSetTo, myDataFactory.getFormErrors()),
            contactForm: setLanguage(langToSetTo, myDataFactory.getContactUsData()),
            contactFormErrors: setLanguage(langToSetTo, myDataFactory.getContactFormErrors()),
            backendPricesTest: setLanguage(langToSetTo, myDataFactory.getMassagesFromBackend()),
            fullFormBackendErrorMessages: setLanguage(langToSetTo, myDataFactory.getFullFormBackendErrorMessages()),
            contactFormBackendErrorMessages: setLanguage(langToSetTo, myDataFactory.getContactFormBackendErrorMessages()),
            sucRespBookForm: setLanguage(langToSetTo, myDataFactory.getSucRespFullBookForm()),
            sucRespContactForm: setLanguage(langToSetTo, myDataFactory.getSucRespContactUsForm())
        };

        resetOrInitFormsVars();
// $scope.cbExpiration();
//
//         $scope.cfName="";
//         $scope.cfEmail="";
//         $scope.cfMessage="";


        $scope.submittedFail = "";
    };
    $scope.lala = "asd";

    $scope.doSomeShit = function () {
        alert("la");
    };


    $scope.pickMassage = function (item, number) {


        $scope.testError = "";
        console.log("number" + number);

        $scope.massagePickedFromDescriptions = myFunctionsFactory.getTimesAndPricesFromBackend(number);
        $scope.data.formPH.massage = item;
        $scope.user.massage = item;
        console.log("PICKED MASSAGE " + item);

    };


    function setLanguage(langCheck, data) {

        $scope.lt = "lt";
        $scope.de = "de";
        $scope.ru = "ru";

        if (langCheck === $scope.lt) {
            $scope.languageParameter = $scope.lt;
            return data.lt;

        } else if (langCheck === $scope.de) {
            $scope.languageParameter = $scope.de;
            return data.de;

        } else if (langCheck === $scope.ru) {
            $scope.languageParameter = $scope.ru;
            return data.ru;
        }
    }


    $scope.submitFunctionForm = function () {
        console.log("Happened call to contactFormController");
        app.contactFormController($scope, $http, myFunctionsFactory);

    };


    $scope.$watch('myForm.xxx.$dirty', function () {
        console.log("IN WATCHER 11111");
        console.log("massage: " + $scope.user.massage);
        if ($scope.user.massage == null) {
            $scope.user.massage = "";
        }

        if ($scope.user.massage !== "") {

            $scope.testError = "";
        }


        $scope.massagePickedFromDescriptions = myFunctionsFactory.getTimesAndPricesFromBackend($scope.user.massage[1]);
        console.log("IN WATCHER BEFORE PRISTILINE: " + $scope.user.massage);


        $scope.myForm.$setPristine();


        console.log("IN WATCHER AFTER PRISTILINE: " + $scope.user.massage);


    });


    $scope.chosenDate = "";
    $scope.chosenTime = "";
    // $scope.stuff="Pasirinkite laiką";


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
        $scope.errors.invalidMassage = myFunctionsFactory.ifEmptyNullOrUndefined($scope.user.massage[0], $scope.data.formErrors.massage);
        $scope.errors.invalidMassageOption = myFunctionsFactory.ifEmptyNullOrUndefined($scope.user.massageOption, $scope.data.formErrors.massageOption);
        $scope.errors.invalidDate = myFunctionsFactory.ifEmptyNullOrUndefined($scope.chosenDate, $scope.data.formErrors.date);
        $scope.errors.invalidTime = myFunctionsFactory.ifEmptyNullOrUndefined($scope.chosenTime, $scope.data.formErrors.time);
        $scope.errors.invalidCaptcha = myFunctionsFactory.ifEmptyNullOrUndefined($scope.user.captcha, $scope.data.formErrors.captcha);

        return myFunctionsFactory.isValidInput($scope.errors)
    }

    $scope.checkSubmittedData = function () {
        console.log("user data: " + $scope.user.massage);
        console.log("In the checkSubmittedData");

        if (isBookingFormValid()) {
            console.log("In the isBookingFormValid");

            $scope.submittedFirstName = $scope.user.firstName;
            $scope.submittedLastName = $scope.user.lastName;
            $scope.submittedEmail = $scope.user.email;
            $scope.submittedPhone = $scope.user.phone;
            $scope.submittedMassage = $scope.user.massage[0];
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


    // $scope.chosenDate = moment().format('YYYY-MM-DD');
    // $scope.chosenTime = moment.locale('lt');
    // $scope.chosenTime = moment().format('L LTS');
    // $scope.startDate = moment().format('YYYY-MM-DD')

    // function for full form submission
    $scope.submitFullForm = function () {
        $scope.myForm.$setPristine();

        console.log("DID VALUE CHANGE " + $scope.data.formPH.massage);

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
                console.log("SucRespons: ");
                console.log(response);
                $scope.submittedSuccess = $scope.data.sucRespBookForm.response;

                $scope.setWidgetId(0, $scope.languageParameter);

                resetOrInitFormsVars();
            }, function myError(response) {
                console.log("FailRespons: ");
                console.log(response);

                $scope.er = $scope.submitError.contactFormErrors[0];

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
        console.log(name);
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


    function hideFlagOfCurrentLang(currentLang) {
        $scope.isLangDE = true;
        $scope.isLangLT = true;
        $scope.isLangRU = true;

        if (currentLang === "lt") {
            $scope.isLangLT = false;
        } else if (currentLang === "de") {
            $scope.isLangDE = false;
        } else if (currentLang === "ru") {
            $scope.isLangRU = false;
        }

    }


}]);













