var app = angular.module('myTestApp', ['ngTextTruncate', 'myTestApp2', 'moment-picker','ngMap','vcRecaptcha']); //ngMessages
app.config(['momentPickerProvider', function (momentPickerProvider) {
    momentPickerProvider.options({
        minutesFormat: 'HH:mm'
    });
}]);

app.controller('myTestController', ['$scope', 'myFactory', '$http','NgMap','vcRecaptchaService', function ($scope, myFactory, $http,NgMap,vcRecaptchaService) {
    // $scope.language = document.getElementsByTagName("html").item(0).getAttribute("lang");



    $scope.pickedMassage="masazas1";


    // $scope.niam=getTimesFromBackend();
    $scope.niam="";

console.log("PRICES FROM BACKEND");
console.log($scope.niam);

    $scope.formCaptcha="";
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
        console.log(response)
        console.log($scope.widgetId)
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

    if($scope.languageParameter ==="lt"){
        $scope.megaCheck2=false;
        $scope.megaCheck1=true;
        $scope.megaCheck3=true}
    else if($scope.languageParameter ==="de"){
        $scope.megaCheck1=false;
        $scope.megaCheck2=true;
        $scope.megaCheck3=true;
    }else if($scope.languageParameter==="ru"){
        $scope.megaCheck3=false;
        $scope.megaCheck2=true;
        $scope.megaCheck1=true;
    }




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
        contactFormErrors: setLanguage($scope.languageParameter,getContactFormErrorsFromFactory()),
        backendPricesTest: setLanguage($scope.languageParameter,getBackendPricesTest()),
        fullFormBackendErrorMessages:setLanguage($scope.languageParameter,backendFullForm()),
        contactFormBackendErrorMessages:setLanguage($scope.languageParameter,backendFullForm2())


    };






    $scope.errors = {
        invalidName: "",
        invalidLastName: "",
        invalidEmail: "",
        invalidPhone: "",
        invalidMassage: "",
        invalidMassageOption: "",
        invalidDate: "",
        invalidTime: "",
        invalidMessage:"",
        invalidCaptcha:""

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
        $scope.myForm.$setPristine();


        if(langToSetTo ==="lt"){
        $scope.megaCheck2=false;
        $scope.megaCheck1=true;
        $scope.megaCheck3=true}
        else if(langToSetTo ==="de"){
            $scope.megaCheck1=false;
            $scope.megaCheck2=true;
            $scope.megaCheck3=true;
        }else if(langToSetTo==="ru"){
            $scope.megaCheck3=false;
            $scope.megaCheck2=true;
            $scope.megaCheck1=true;
        }

        $scope.setWidgetId(0,langToSetTo);
        $scope.setWidgetId(1,langToSetTo);


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
            contactFormErrors: setLanguage(langToSetTo,getContactFormErrorsFromFactory()),
            backendPricesTest: setLanguage(langToSetTo,getBackendPricesTest()),
            fullFormBackendErrorMessages: setLanguage(langToSetTo,backendFullForm()),
            contactFormBackendErrorMessages:setLanguage(langToSetTo,backendFullForm2())







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
            invalidMassageOption:"",
            invalidDate: "",
            invalidTime: "",
            invalidMessage:"",
            invalidCaptcha:""
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




    $scope.pickMassage= function(item,number){


        $scope.testError="";
        console.log("number" + number);

        $scope.niam=getTimesFromBackend(number)
        $scope.data.formPH.massage=item;
        console.log("PICKED MASSAGE " + item);

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

    function getBackendPricesTest(){
        return myFactory.getMassagesFromBackend()
    }


    function getTimesFromBackend(x){
        return myFactory.getTimesAndPricesFromBackend(x);
    }

    function getContactErorrMessagesFromBackend(){
        return myFactory.getContactFormBackendErrorMessages;
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


    function callin(name,email,message,captcha){
        console.log("sup dude");
        console.log($scope.data.contactFormBackendErrorMessages);

        $scope.contactFormErrors.name = processResponse(name, "nameFormat","nameLength", $scope.data.contactFormBackendErrorMessages.nameFormat, $scope.data.contactFormBackendErrorMessages.nameLength);
        $scope.contactFormErrors.email = processResponse(email, "emailFormat","emailLength", $scope.data.contactFormBackendErrorMessages.emailFormat, $scope.data.contactFormBackendErrorMessages.emailLength);
        $scope.contactFormErrors.message = processResponse(message, "messageFormat","messageLength", $scope.data.contactFormBackendErrorMessages.messageFormat, $scope.data.contactFormBackendErrorMessages.messageLength);
        $scope.contactFormErrors.captcha = processResponse(captcha, "captchaFormat","xxxx", $scope.data.contactFormBackendErrorMessages.captchaFormat, "xxx");

    }


    $scope.submitFunctionForm= function (){
        console.log("STUFF1: " + $scope.cfName);
        console.log("STUFF2: " + $scope.cfEmail);
        console.log("STUFF3: " + $scope.cfMessage);

        $scope.cfCaptcha=$scope.response;

        $scope.contactFormErrors.name=ifNotFilled($scope.cfName, $scope.data.contactFormErrors.name);
        $scope.contactFormErrors.email=checkEmail($scope.cfEmail, $scope.data.contactFormErrors.email,$scope.data.contactFormErrors.emailBadFormat);
        $scope.contactFormErrors.message=ifNotFilled($scope.cfMessage, $scope.data.contactFormErrors.message);
        $scope.contactFormErrors.captcha=checkForNull($scope.cfCaptcha,$scope.data.contactFormErrors.captcha);














        if($scope.contactFormErrors.name.length === 0 && $scope.contactFormErrors.email.length === 0 && $scope.contactFormErrors.message.length === 0){
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
                            "captcha": $scope.cfCaptcha
                        }
                    ]
            };

            $http({
                method: "POST",
                url: "/sendEmail",
                data: JSON.stringify(sendStuff2)
            }).then(function mySuccess(response) {
                $scope.submitContact = response.status;
                $scope.submittedSuccessContact = "Thank you. Your Question sent.";

                $scope.setWidgetId(1,$scope.languageParameter);


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
                console.log("IN THE FAILED: ");
                $scope.submitErrorContact = response.data;
                console.log($scope.submitErrorContact);
                $scope.sendThisToShow=$scope.submitErrorContact.contactFormErrors[0];



                callin($scope.sendThisToShow.name,$scope.sendThisToShow.email,$scope.sendThisToShow.message,$scope.sendThisToShow.captcha);









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
        massageOption: "",
        message: "",
        captcha:""
        // defaultDate:"Pasirinkite datą",
        // defaultTime:"Pasirinkite laiką"
    };


   $scope.$watch('myForm.xxx.$dirty' , function() {
        console.log("IN WATCHER 11111");
        console.log("massage: " + $scope.user.massage);
       if($scope.user.massage==null){
           $scope.user.massage="";
       }

       if($scope.user.massage !== "") {

           $scope.testError = "";
       }


       $scope.niam=getTimesFromBackend($scope.user.massage[1]);
        console.log("IN WATCHER BEFORE PRISTILINE: " + $scope.user.massage);


        $scope.myForm.$setPristine();


       console.log("IN WATCHER AFTER PRISTILINE: " + $scope.user.massage);



    });





    // $scope.$watch('myForm.xxx2.$touched', function() {
    //
    //         if($scope.user.massage === ""){
    //             console.log("BLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
    //
    //             $scope.testError="Please make sure that massage chosen first";
    //         }
    //
    //
    //
    // });






    // $scope.$watch('!myForm.xxx.$pristine', function() {
    //     $scope.availableOptions=[];
    //
    //
    //     console.log("IN WATCHER 22222");
    //     if($scope.myForm.xxx.$dirty && $scope.user.massage !=="Limfodrenažinis kūno masažas"){
    //         $scope.availableOptions=[];
    //
    //         console.log("EMPTY NOW")
    //
    //
    //     }
    //
    // });

    //
    // if($scope.myForm.xxx.$dirty){
    //     $scope.availableOptions=["90","120"];
    //
    //     console.log("PERFORMING");
    // x();
    // }

    function x(){
        $scope.availableOptions=["90","120"];

    }


    function xx(){
        $scope.availableOptions=[];

    }




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

        $scope.user.captcha=$scope.response;


        $scope.errors.invalidName = ifNotFilled($scope.user.firstName, $scope.data.formErrors.name);
        $scope.errors.invalidLastName = ifNotFilled($scope.user.lastName, $scope.data.formErrors.surname);
        $scope.errors.invalidEmail = checkEmail($scope.user.email, $scope.data.formErrors.email, $scope.data.formErrors.emailBadFormat);
        $scope.errors.invalidPhone = ifNotFilled($scope.user.phone, $scope.data.formErrors.phone);
        $scope.errors.invalidMassage = emptyOrUndefined($scope.user.massage[0], $scope.data.formErrors.massage);
        $scope.errors.invalidMassageOption=emptyOrUndefined($scope.user.massageOption,$scope.data.formErrors.massageOption);
        $scope.errors.invalidDate = emptyOrUndefined($scope.chosenDate, $scope.data.formErrors.date);
        $scope.errors.invalidTime = emptyOrUndefined($scope.chosenTime, $scope.data.formErrors.time);
        $scope.errors.invalidCaptcha = emptyOrUndefined($scope.user.captcha, $scope.data.formErrors.captcha);


        return returnTrueIfValid($scope.errors.invalidName) &&
            returnTrueIfValid($scope.errors.invalidLastName) &&
            returnTrueIfValid($scope.errors.invalidEmail) &&
            returnTrueIfValid($scope.errors.invalidPhone) &&
            returnTrueIfValid($scope.errors.invalidMassage) &&
            returnTrueIfValid($scope.errors.invalidMassageOption) &&
            returnTrueIfValid($scope.errors.invalidDate) &&
            returnTrueIfValid($scope.errors.invalidTime) && returnTrueIfValid($scope.errors.invalidCaptcha);
    }

    $scope.checkSubmittedData = function () {
        console.log("SD2");
        console.log($scope.user.captcha);

        if (validate()) {
            console.log("SD");

            $scope.submittedFirstName = $scope.user.firstName;
            $scope.submittedLastName = $scope.user.lastName;
            $scope.submittedEmail = $scope.user.email;
            $scope.submittedPhone = $scope.user.phone;
            $scope.submittedMassage = $scope.user.massage[0];
            $scope.submittedMassageOption=$scope.user.massageOption;
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

    function resetForm() {
        $scope.user = {
            firstName: "",
            lastName: "",
            email: "",
            phone: "",
            massage: "",
            massageOption:"",
            message: "",
            captcha:""
            // defaultDate:"Pasirinkite datą",
            // defaultTime:"Pasirinkite laiką"
        };
        $scope.chosenDate = "";
        $scope.chosenTime = "";
        $scope.niam="";


        // $scope.chosenDate = moment().format('YYYY-MM-DD');
        // $scope.chosenTime = moment.locale('lt');
        // $scope.chosenTime = moment().format('L LTS');
        // $scope.startDate = moment().format('YYYY-MM-DD')
    }


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
// TO FIX THIS SHIT !!!!
            $http({
                method: "POST",
                url: "/submitFullForm",
                data: JSON.stringify(sendStuff)
            }).then(function mySuccess(response) {
                console.log("SucRespons: ");
                console.log(response)
                $scope.submitStatus = response.status;
                $scope.submittedSuccess = "Thank you. Your Booking Received.";
                $scope.setWidgetId(0,$scope.languageParameter);

                resetForm();
            }, function myError(response) {
                console.log("FailRespons: ");
                console.log(response);

                $scope.submitError = response.data;
                $scope.er=$scope.submitError.contactFormErrors[0];

                errorMassagesFromBackend($scope.er.name,$scope.er.surname,$scope.er.email,$scope.er.phone,$scope.er.massage,$scope.er.massageOption,$scope.er.date,$scope.er.time,$scope.er.message,$scope.er.captcha);


                $scope.submittedFail = "THE FUCK HAPPENED???? CALL THE POLICE"
            });


        }
        else {
            $scope.submittedFail = "Something Horrible Happened! Call 911."
        }
    };




    function errorMassagesFromBackend(name,surname,email,phone,massage,massageOption,date,time,message,captcha) {

        $scope.ax=$scope.data.fullFormBackendErrorMessages;
        console.log("Inside validation");
        console.log(name);
        $scope.errors.invalidName = processResponse(name, "nameFormat","nameLength", $scope.ax.nameFormat, $scope.ax.nameLength);
        $scope.errors.invalidLastName = processResponse(surname, "surnameFormat","surnameLength", $scope.ax.surnameFormat, $scope.ax.surnameLength);
        $scope.errors.invalidEmail = processResponse(email, "emailFormat","emailLength", $scope.ax.emailFormat, $scope.ax.emailLength);
        $scope.errors.invalidPhone = processResponse(phone, "phoneFormat","phoneLength", $scope.ax.phoneFormat, $scope.ax.phoneLength);
        $scope.errors.invalidMassage = processResponse(massage, "massageFormat","massageLength", $scope.ax.massageFormat, $scope.ax.massageLength);
        $scope.errors.invalidMassageOption = processResponse(massageOption, "massageOptionFormat","massageOptionLength", $scope.ax.massageOptionFormat, $scope.ax.massageOptionLength);
        $scope.errors.invalidDate = processResponse(date, "dateFormat","dateLength", $scope.ax.dateFormat, $scope.ax.dateLength);
        $scope.errors.invalidTime = processResponse(time, "timeFormat","timeLength", $scope.ax.timeFormat, $scope.ax.timeLength);
        $scope.errors.invalidMessage = processResponse(message, "messageFormat","messageLength", $scope.ax.messageFormat, $scope.ax.messageLength);
        $scope.errors.invalidCaptcha = processResponse(captcha, "captchaFormat","xxxxx", $scope.data.ax.captchaFormat,"xxxxx");


    }


    function processResponse(x, error1, error2, message1, message2) {
        if (x === error1) {
            return message1;
        } else if (x === error2) {
            return message2;
        } else {
            return "";
        }

    }


    function backendFullForm(){
        return myFactory.getFullFormBackendErrorMessages();
    }


    function backendFullForm2(){
        return myFactory.getContactFormBackendErrorMessages();
    }


    $scope.copyOfData="";
    // get massage list to pick from
    $http({
        method: "GET",
        url: "/getMassagesData",
    }).then(function mySuccess(response) {
        console.log("DATA: " + response.data.state)

        $scope.myWelcome2 = response.data;
        $scope.copyOfData=angular.copy($scope.myWelcome2);
        //NICE
        $scope.loxx = response.data;
    }, function myError(response) {
        console.log("FAIL DATA: " + response)

        $scope.myWelcome2 = response.statusText;
    });
















}]);













