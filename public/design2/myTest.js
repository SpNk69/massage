var app = angular.module('myTestApp', ['ngTextTruncate', 'myTestApp2', 'moment-picker','ngMap','vcRecaptcha']); //ngMessages
app.config(['momentPickerProvider', function (momentPickerProvider) {
    momentPickerProvider.options({
        minutesFormat: 'HH:mm'
    });
}]);

app.controller('myTestController', ['$scope', 'myFactory', '$http','NgMap','vcRecaptchaService', function ($scope, myFactory, $http,NgMap,vcRecaptchaService) {
    // $scope.language = document.getElementsByTagName("html").item(0).getAttribute("lang");





    $scope.captchaLang="lt";

    $scope.changeCaptchaLang = function(languageParameter){
        console.log("sup   " + languageParameter);

    };
    console.log("this is your app's controller");
    $scope.response = null;
    $scope.widgetId = null;
    $scope.model = {
        key: '6Lfg2z8UAAAAAPQjJGsDU4A6Wfn6LZHxdqraiHv8'
    };
    $scope.setResponse = function (response) {
        console.info('Response available');

        $scope.response = response;

    };
    $scope.setWidgetId = function (widgetId,langMy) {

        vcRecaptchaService.reload(widgetId);

        vcRecaptchaService.useLang(widgetId,langMy);

        console.info('Created widget ID: %s', widgetId);

        $scope.widgetId = widgetId;
    };

    $scope.cbExpiration = function() {
        console.info('Captcha expired. Resetting response object');
        vcRecaptchaService.reload($scope.widgetId);
        vcRecaptchaService.useLang($scope.widgetId,$scope.languageParameter);
        $scope.response = null;
    };


        // var valid;
        // /**
        //  * SERVER SIDE VALIDATION
        //  *
        //  * You need to implement your server side validation here.
        //  * Send the reCaptcha response to the server and use some of the server side APIs to validate it
        //  * See https://developers.google.com/recaptcha/docs/verify
        //  */
        // console.log('sending the captcha response to the server', $scope.response);
        // if (valid) {
        //     console.log('Success');
        // } else {
        //     console.log('Failed validation');
        //     // In case of a failed validation you need to reload the captcha
        //     // because each response can be checked just once
        //     vcRecaptchaService.reload($scope.widgetId);
        // }








    $scope.cfName="";
    $scope.cfEmail="";
    $scope.cfMessage="";
    console.log("STUF"+ $scope.cfName)

    NgMap.getMap().then(function(map) {
        console.log(map.getCenter());
        console.log('markers', map.markers);
        console.log('shapes', map.shapes);
    });








    $scope.languageParameter = "lt";
    $scope.googleMapsUrl="https://maps.googleapis.com/maps/api/js?key=AIzaSyCEYVMDc9EIG4zsSYD6SXJ7gzk05BOinH0";

    //init
    $scope.data = {
        titlePage: setLanguage($scope.languageParameter, getPageTitleFromFactory()),
        introText: setLanguage($scope.languageParameter, getIntroDataFromFactory()),
        navBar: setLanguage($scope.languageParameter, getNavDataFromFactory()),
        massageTitle: setLanguage($scope.languageParameter, getMassageTitlesFromFactory()),
        massageBody: setLanguage($scope.languageParameter, getMassageBodyFromFactory()),
        aboutMeTitle: setLanguage($scope.languageParameter, getAboutMeTitleFromFactory()),
        aboutMeBody: setLanguage($scope.languageParameter, getAboutMeBodyFromFactory()),
        inAHurry: setLanguage($scope.languageParameter, getInAHurryDataFromFactory()),
        prices: setLanguage($scope.languageParameter, getSpaPricesFromFactory()),
        formNames: setLanguage($scope.languageParameter, getFormNamesFromFactory()),
        formPH: setLanguage($scope.languageParameter, getFormPlaceHoldersFromFactory()),
        formErrors: setLanguage($scope.languageParameter, getFormErrorCodes()),
        contactForm: setLanguage($scope.languageParameter,getContactFormDataFromFactory()),
        contactFormErrors: setLanguage($scope.languageParameter,getContactFormErrorsFromFactory())


    };






    $scope.errors = {
        invalidName: "",
        invalidLastName: "",
        invalidEmail: "",
        invalidPhone: "",
        invalidMassage: "",
        invalidDate: "",
        invalidTime: ""

    };

    $scope.contactFormErrors = {
        name:"",
        email:"",
        message:"",
        captcha:""

    };

    //reference on click to another section
    $scope.inAHurry = "hurry";
    $scope.aboutMe = "about";
    $scope.gallery = "gallery";
    $scope.massagesId = "massages";
    $scope.pricesId = "prices";
    $scope.bookit = "bookit";
    $scope.contactMe = "contacts";


    $scope.doTranslate = function xxx(langToSetTo) {
        $scope.setWidgetId($scope.widgetId,langToSetTo);


        $scope.languageParameter=langToSetTo;

        $scope.data = {
            titlePage: setLanguage(langToSetTo, getPageTitleFromFactory()),
            introText: setLanguage(langToSetTo, getIntroDataFromFactory()),
            navBar: setLanguage(langToSetTo, getNavDataFromFactory()),
            massageTitle: setLanguage(langToSetTo, getMassageTitlesFromFactory()),
            massageBody: setLanguage(langToSetTo, getMassageBodyFromFactory()),
            aboutMeTitle: setLanguage(langToSetTo, getAboutMeTitleFromFactory()),
            aboutMeBody: setLanguage(langToSetTo, getAboutMeBodyFromFactory()),
            inAHurry: setLanguage(langToSetTo, getInAHurryDataFromFactory()),
            prices: setLanguage(langToSetTo, getSpaPricesFromFactory()),
            formNames: setLanguage(langToSetTo, getFormNamesFromFactory()),
            formPH: setLanguage(langToSetTo, getFormPlaceHoldersFromFactory()),
            formErrors: setLanguage(langToSetTo, getFormErrorCodes()),
            contactForm: setLanguage(langToSetTo,getContactFormDataFromFactory()),
            contactFormErrors: setLanguage(langToSetTo,getContactFormErrorsFromFactory())




        };

// $scope.cbExpiration();

        $scope.cfName="";
        $scope.cfEmail="";
        $scope.cfMessage="";

        $scope.errors = {
            invalidName: "",
            invalidLastName: "",
            invalidEmail: "",
            invalidPhone: "",
            invalidMassage: "",
            invalidDate: "",
            invalidTime: ""
        };
        $scope.contactFormErrors = {
            name:"",
            email:"",
            message:""

        };
        resetForm();
        $scope.submittedFail = "";
    };
    $scope.lala="asd";

    $scope.doSomeShit = function () {
        alert("la");
    };

    $scope.pickMassage= function(item){
        $scope.user.massage=item;
        console.log($scope.user.massage);

    };

    $scope.truncateSize = 50;



    // function xxxxx(xer){
    //     return myFactory(xer);
    // }
    // xxxxx("asd");


    function getMassageTitlesFromFactory() {
        return myFactory.getMassagesTitles();
    }

    function getNavDataFromFactory() {
        return myFactory.getNavBarData();
    }

    function getMassageBodyFromFactory() {
        return myFactory.getMassageBodyData();
    }

    function getAboutMeTitleFromFactory() {
        return myFactory.getAboutMeTitle()
    }

    function getAboutMeBodyFromFactory() {
        return myFactory.getAboutMeBody()
    }

    function getIntroDataFromFactory() {
        return myFactory.getIntroData()
    }

    function getPageTitleFromFactory() {
        return myFactory.getPageTitle()
    }

    function getInAHurryDataFromFactory() {
        return myFactory.getInaHurryData()
    }

    function getSpaPricesFromFactory() {
        return myFactory.getPrices()
    }

    function getFormNamesFromFactory() {
        return myFactory.getFormNames()
    }

    function getFormPlaceHoldersFromFactory() {
        return myFactory.getPlaceHolders()
    }

    function getFormErrorCodes() {
        return myFactory.getFormErrors()
    }

    function getContactFormDataFromFactory(){
        return myFactory.getContactUsData()
    }

    function getContactFormErrorsFromFactory(){
        return myFactory.getContactFormErrors()
    }


    function setLanguage(langCheck, data) {

        $scope.lt = "lt";
        $scope.de = "de";
        $scope.ru = "ru";


        if (langCheck === "lt") {
            $scope.languageParameter = "lt";
            return data.lt;
        } else if (langCheck === "de") {
            $scope.languageParameter = "de";

            return data.de;
        } else if (langCheck === "ru") {
            $scope.languageParameter = "ru";

            return data.ru;

        }


    }


    function checkForNull(x,y){
        if(x==null){
            return y;


        }else{
            return "";
        }

    }



function setCrapIfBadResponse(par1, par2, par3, par4){
        if(par1 !== ""){
            $scope.contactFormErrors.name="Please make sure that name is set properly";
        }
    if(par2 !== "") {
        $scope.contactFormErrors.email="Please make sure that email is set properly";

    }
    if(par3 !== "") {

        $scope.contactFormErrors.message="Please make sure that message entered";


    }
    if(par4 !== "") {
        $scope.contactFormErrors.captcha="Please validate captcha 4 real"

    }
}



    $scope.submitFunctionForm= function (){
        console.log("STUFF1: " + $scope.cfName);
        console.log("STUFF2: " + $scope.cfEmail);
        console.log("STUFF3: " + $scope.cfMessage);
        $scope.contactFormErrors.name=ifNotFilled($scope.cfName, $scope.data.contactFormErrors.name);
        $scope.contactFormErrors.email=checkEmail($scope.cfEmail, $scope.data.contactFormErrors.email,$scope.data.contactFormErrors.emailBadFormat);
        $scope.contactFormErrors.message=ifNotFilled($scope.cfMessage, $scope.data.contactFormErrors.message);
        $scope.contactFormErrors.captcha=checkForNull($scope.response,$scope.data.contactFormErrors.captcha);


        $scope.captchaResponse=$scope.response;








        var sendStuff2 = {
            "getCustomerQuestion":
                [
                    {
                        "name": $scope.cfName
                    },
                    {
                        "email": $scope.cfEmail
                    },
                    {
                        "message": $scope.cfMessage
                    },
                    {
                        "captcha": $scope.captchaResponse
                    }
                ]
        };



        if($scope.contactFormErrors.name.length === 0 && $scope.contactFormErrors.email.length === 0 && $scope.contactFormErrors.message.length === 0){


            $http({
                method: "POST",
                url: "/sendEmail",
                data: JSON.stringify(sendStuff2)
            }).then(function mySuccess(response) {
                $scope.submitContact = response.status;
                $scope.submittedSuccessContact = "Thank you. Your Question sent.";

                $scope.setWidgetId($scope.widgetId,$scope.languageParameter);


                console.log("STATUS: ");
                console.log(response.data.contactFormErrors);
                console.log(response.data.contactFormErrors[0].name);
                console.log(response.data.contactFormErrors[0].email);
                console.log(response.data.contactFormErrors[0].message);
                console.log(response.data.contactFormErrors[0].captcha);
                $scope.lalala=response.data;

                $scope.cfEmail="";
                $scope.cfName="";
                $scope.cfMessage="";


            }, function myError(response) {
                $scope.submitErrorContact = response.data;
                console.log($scope.submitErrorContact);



                setCrapIfBadResponse($scope.submitErrorContact.contactFormErrors[0].name,$scope.submitErrorContact.contactFormErrors[0].email,$scope.submitErrorContact.contactFormErrors[0].message,$scope.submitErrorContact.contactFormErrors[0].captcha);


                // if($scope.submitErrorContact.contactFormErrors[0].name === "x"){
                //     $scope.contactFormErrors.name="FUCK THAT SHIT  " + $scope.submitErrorContact.contactFormErrors[0].name;
                // }
                $scope.submittedFailContact = "THE FUCK HAPPENED???? CALL THE POLICE"
            });
        }






    };




    $scope.user = {
        firstName: "",
        lastName: "",
        email: "",
        phone: "",
        massage: "",
        message: ""
        // defaultDate:"Pasirinkite datą",
        // defaultTime:"Pasirinkite laiką"
    };
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
        // $scope.suka = date.format('DDDo');
        // $scope.suka2 = type;
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

    function emptyOrUndefined(field, error) {
        if (angular.isUndefined(field) || field.length < 1) {
            return error;
        } else {
            return "";
        }
    }

    function returnTrueIfValid(x) {
        if (x === "") {
            return true;
        }
    }

    function ifNotFilled(field, error) {
        if (field.length < 1) {
            return error;
        } else {
            return "";
        }
    }

    function checkEmail(field, error1, error2) {
        if (field.length < 1) {
            return error1;
        } else if (!field.includes("@") && field.length > 0) {
            return error2;
        } else {
            return "";
        }
    }

    // validate that input was entered
    function validate() {


        $scope.errors.invalidName = ifNotFilled($scope.user.firstName, $scope.data.formErrors.name);
        $scope.errors.invalidLastName = ifNotFilled($scope.user.lastName, $scope.data.formErrors.surname);
        $scope.errors.invalidEmail = checkEmail($scope.user.email, $scope.data.formErrors.email, $scope.data.formErrors.emailBadFormat);
        $scope.errors.invalidPhone = ifNotFilled($scope.user.phone, $scope.data.formErrors.phone);
        $scope.errors.invalidMassage = ifNotFilled($scope.user.massage, $scope.data.formErrors.massage);
        $scope.errors.invalidDate = emptyOrUndefined($scope.chosenDate, $scope.data.formErrors.date);
        $scope.errors.invalidTime = emptyOrUndefined($scope.chosenTime, $scope.data.formErrors.time);


        return returnTrueIfValid($scope.errors.invalidName) &&
            returnTrueIfValid($scope.errors.invalidLastName) &&
            returnTrueIfValid($scope.errors.invalidEmail) &&
            returnTrueIfValid($scope.errors.invalidPhone) &&
            returnTrueIfValid($scope.errors.invalidMassage) &&
            returnTrueIfValid($scope.errors.invalidDate) &&
            returnTrueIfValid($scope.errors.invalidTime);
    }

    $scope.checkSubmittedData = function () {
        console.log("SD2");

        if (validate()) {
            console.log("SD");

            $scope.submittedFirstName = $scope.user.firstName;
            $scope.submittedLastName = $scope.user.lastName;
            $scope.submittedEmail = $scope.user.email;
            $scope.submittedPhone = $scope.user.phone;
            $scope.submittedMassage = $scope.user.massage.massageName;
            $scope.submittedDate = $scope.chosenDate;
            $scope.submittedTime = $scope.chosenTime;
            $scope.submittedMessage = $scope.user.message;
            $scope.megaFail = "";
            return true;

        } else {
            $scope.megaFail = "NOT HAPPENING";
            return false;
        }

    };

    function resetForm() {
        $scope.user = {
            firstName: "",
            lastName: "",
            email: "",
            phone: "",
            massage: "",
            message: "",
            // defaultDate:"Pasirinkite datą",
            // defaultTime:"Pasirinkite laiką"
        };
        $scope.chosenDate = "";
        $scope.chosenTime = "";


        // $scope.chosenDate = moment().format('YYYY-MM-DD');
        // $scope.chosenTime = moment.locale('lt');
        // $scope.chosenTime = moment().format('L LTS');
        // $scope.startDate = moment().format('YYYY-MM-DD')
    }


    // function for full form submission
    $scope.submitFullForm = function () {


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
                            "date": $scope.submittedDate
                        },
                        {
                            "time": $scope.submittedTime
                        },
                        {
                            "message": $scope.submittedMessage
                        }
                    ]
            };
// TO FIX THIS SHIT !!!!
            $http({
                method: "POST",
                url: "/submitFullForm",
                data: JSON.stringify(sendStuff)
            }).then(function mySuccess(response) {
                $scope.submitStatus = response.status;
                $scope.submittedSuccess = "Thank you. Your Booking Received."
                resetForm();
            }, function myError(response) {
                $scope.submitError = response.data;
                $scope.submittedFail = "THE FUCK HAPPENED???? CALL THE POLICE"
            });


        }
        else {
            $scope.submittedFail = "Something Horrible Happened! Call 911."
        }
    };


    // get massage list to pick from
    $http({
        method: "GET",
        url: "/getMassagesData",
    }).then(function mySuccess(response) {
        // console.log("DATA: " + response.data.state)

        $scope.myWelcome2 = response.data;
        //NICE
        $scope.loxx = response.data;
    }, function myError(response) {
        $scope.myWelcome2 = response.statusText;
    });


}]);













