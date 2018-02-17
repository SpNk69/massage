var app = angular.module('myTestApp', ['ngTextTruncate', 'myTestApp2', 'moment-picker','ngMap']); //ngMessages
app.config(['momentPickerProvider', function (momentPickerProvider) {
    momentPickerProvider.options({
        minutesFormat: 'HH:mm'
    });
}]);

app.controller('myTestController', ['$scope', 'myFactory', '$http','NgMap', function ($scope, myFactory, $http,NgMap) {
    // $scope.language = document.getElementsByTagName("html").item(0).getAttribute("lang");

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
        message:""

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


    $scope.submitFunctionForm= function (){
        console.log("STUFF: " + $scope.cfName);
        console.log("STUFF: " + $scope.cfEmail);
        console.log("STUFF: " + $scope.cfMessage);
        $scope.contactFormErrors.name=ifNotFilled($scope.cfName, $scope.data.contactFormErrors.name);
        $scope.contactFormErrors.email=checkEmail($scope.cfEmail, $scope.data.contactFormErrors.email,$scope.data.contactFormErrors.emailBadFormat);
        $scope.contactFormErrors.message=ifNotFilled($scope.cfMessage, $scope.data.contactFormErrors.message)






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

                $scope.cfEmail="";
                $scope.cfName="";
                $scope.cfMessage="";


            }, function myError(response) {
                $scope.submitErrorContact = response.data;
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













