// var app = angular.module('myFormApp', ['moment-picker']); //ngMessages
var app = angular.module('myTestApp', ['moment-picker']); //ngMessages

app.config(['momentPickerProvider', function (momentPickerProvider) {
    momentPickerProvider.options({
        minutesFormat: 'HH:mm'
    });
}]);

app.controller('FormController', ['$scope', '$http', function ($scope, $http) {
    $scope.language = document.getElementsByTagName("html").item(0).getAttribute("lang");


    var formNames = {
        "name": {
            "lt": "Vardas",
            "de": "Name",
            "ru": "Имя"
        },
        "surname": {
            "lt": "Pavardė",
            "de": "Nachname",
            "ru": "Фамилия"
        },
        "email": {
            "lt": "Elektroninis paštas",
            "de": "E-Mail",
            "ru": "Электронная почта"
        }
        ,
        "phone": {
            "lt": "Telefono numeris",
            "de": "Telefonnummer",
            "ru": "Номер телефона"
        }
        ,
        "massage": {
            "lt": "Masažas",
            "de": "Massage",
            "ru": "Массаж"
        },
        "date": {
            "lt": "Data",
            "de": "Datum",
            "ru": "Дата"
        },
        "time": {
            "lt": "Laikas",
            "de": "Zeit",
            "ru": "Время"
        },
        "message": {
            "lt": "Žinutė",
            "de": "Nachricht",
            "ru": "Сообщение"
        }
        ,
        "button": {
            "lt": "Rezervuoti",
            "de": "Buche es",
            "ru": "Забронировать"
        },
        "title": {
            "lt": "Užsisakykite masažą jums patogiu laiku!",
            "de": "Buchen Sie Ihre Massage nach Ihren Wünschen!",
            "ru": "Закажите свой массаж в удобное для вас время!\n"
        }
    };


    var placeHolderNames={
        "name": {
            "lt": "Įveskite vardą",
            "de": "Geben Sie einen Namen ein",
            "ru": "Введите имя"
        },
        "surname": {
            "lt": "Įveskite pavardę",
            "de": "Geben Sie einen Nachnamen ein",
            "ru": "Введите фамилию"
        },
        "email": {
            "lt": "Įveskite elektroninį paštą",
            "de": "E-Mail eingeben",
            "ru": "Введите адрес электронной почты"
        }
        ,
        "phone": {
            "lt": "Įveskite telefono numerį",
            "de": "Geben Sie eine Telefonnummer ein",
            "ru": "Введите номер телефона"
        }
        ,
        "massage": {
            "lt": "Pasirinkite masažą",
            "de": "Wählen Sie eine Massage",
            "ru": "Выберите массаж"
        },
        "date": {
            "lt": "Pasirinkite datą",
            "de": "Wählen Sie ein Datum aus",
            "ru": "Выберите дату"
        },
        "time": {
            "lt": "Pasirinkite laiką",
            "de": "Wähle eine Zeit aus",
            "ru": "Выберите время"
        },
        "message": {
            "lt": "Papildomi pageidavimai",
            "de": "Zusätzliche Anfragen",
            "ru": "Дополнительные запросы"
        }
    };




    var errorCodesWhenNotFilled={
        "name": {
            "lt": "Neįvestas vardas",
            "de": "Kein Name eingegeben",
            "ru": "Имя не введено"
        },
        "surname": {
            "lt": "Neįvesta pavardė",
            "de": "Nachname nicht eingegeben",
            "ru": "Фамилия не введена"
        },
        "email": {
            "lt": "Neįvestas elektroninis paštas",
            "de": "Keine E-Mail-Adresse eingegeben",
            "ru": "Не введено электронное письмо"
        }
        ,
        "phone": {
            "lt": "Neįvestas telefono numeris",
            "de": "Telefonnummer nicht eingegeben",
            "ru": "Номер телефона не введен"
        }
        ,
        "massage": {
            "lt": "Nepasirinktas masažas",
            "de": "Massage ist nicht ausgewählt",
            "ru": "Массаж не выбран"
        },
        "date": {
            "lt": "Nepasirinkta data",
            "de": "Kein Datum ausgewählt",
            "ru": "Дата не выбрана"
        },
        "time": {
            "lt": "Nepasirinktas laikas",
            "de": "Keine Zeit ausgewählt",
            "ru": "Не выбрано времени"
        },
        "emailBadFormat": {
            "lt": "Neteisingas elektroninio pašto adresas",
            "de": "Ungültige E-Mail-Adresse",
            "ru": "Недопустимый адрес электронной почты"
        }
    };






    function getValueByLang(langValue,mapMultipleLanguages,topKey){
        if(langValue === "lt"){
            return mapMultipleLanguages[topKey]["lt"];
        }else if(langValue === "de"){
            return mapMultipleLanguages[topKey]["de"];

        }else if(langValue === "ru"){
            return mapMultipleLanguages[topKey]["ru"];
        }else{
            return "SHIT HAPPENED";
        }
    }

    $scope.dynamicName=getValueByLang($scope.language,formNames,"name");
    $scope.dynamicSurname=getValueByLang($scope.language,formNames,"surname");
    $scope.dynamicEmail=getValueByLang($scope.language,formNames,"email");
    $scope.dynamicPhone=getValueByLang($scope.language,formNames,"phone");
    $scope.dynamicMassage=getValueByLang($scope.language,formNames,"massage");
    $scope.dynamicDate=getValueByLang($scope.language,formNames,"date");
    $scope.dynamicTime=getValueByLang($scope.language,formNames,"time");
    $scope.dynamicMessage=getValueByLang($scope.language,formNames,"message");
    $scope.dynamicButton=getValueByLang($scope.language,formNames,"button");
    $scope.dynamicTitle=getValueByLang($scope.language,formNames,"title");

    $scope.dynamicPHName= getValueByLang($scope.language,placeHolderNames,"name")
    $scope.dynamicPHSurname=getValueByLang($scope.language,placeHolderNames,"surname");
    $scope.dynamicPHEmail=getValueByLang($scope.language,placeHolderNames,"email");
    $scope.dynamicPHPhone=getValueByLang($scope.language,placeHolderNames,"phone");
    $scope.dynamicPHMassage=getValueByLang($scope.language,placeHolderNames,"massage");
    $scope.dynamicPHDate=getValueByLang($scope.language,placeHolderNames,"date");
    $scope.dynamicPHTime=getValueByLang($scope.language,placeHolderNames,"time");
    $scope.dynamicPHMessage=getValueByLang($scope.language,placeHolderNames,"message");
    // console.log(document.getElementsByTagName("html").item(0).getAttribute("lang"));



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
    $scope.chosenDate="";
    $scope.chosenTime="";
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

    function emptyOrUndefined(field, error){
        if (angular.isUndefined(field) || field.length <1){
            return error;
        }else{
            return "";
        }
    }

    function returnTrueIfValid(x){
        if(x === ""){
            return true;
        }
    }

    function ifNotFilled(field,error){
        if(field.length <1){
            return error;
        }else{
            return "";
        }
    }

    function checkEmail(field,error1,error2){
        if(field.length<1){
            return error1;
        }else if(!field.includes("@")  && field.length>0){
            return error2;
        }else{
            return "";
        }
    }

    // validate that input was entered
    function validate(){

        $scope.invalidName=ifNotFilled($scope.user.firstName,getValueByLang($scope.language,errorCodesWhenNotFilled,"name"));
        $scope.invalidLastName=ifNotFilled($scope.user.lastName,getValueByLang($scope.language,errorCodesWhenNotFilled,"surname"));
        $scope.invalidEmail=checkEmail($scope.user.email,getValueByLang($scope.language,errorCodesWhenNotFilled,"email"),getValueByLang($scope.language,errorCodesWhenNotFilled,"emailBadFormat"));
        $scope.invalidPhone=ifNotFilled($scope.user.phone,getValueByLang($scope.language,errorCodesWhenNotFilled,"phone"));
        $scope.invalidMassage=ifNotFilled($scope.user.massage,getValueByLang($scope.language,errorCodesWhenNotFilled,"massage"));
        $scope.invalidDate=emptyOrUndefined($scope.chosenDate,getValueByLang($scope.language,errorCodesWhenNotFilled,"date"));
        $scope.invalidTime=emptyOrUndefined($scope.chosenTime,getValueByLang($scope.language,errorCodesWhenNotFilled,"time"));

        return returnTrueIfValid($scope.invalidName) &&
               returnTrueIfValid($scope.invalidLastName) &&
               returnTrueIfValid($scope.invalidEmail) &&
               returnTrueIfValid($scope.invalidPhone) &&
               returnTrueIfValid($scope.invalidMassage) &&
               returnTrueIfValid($scope.invalidDate) &&
               returnTrueIfValid($scope.invalidTime);
    }

    $scope.checkSubmittedData = function () {

        if(validate()){

            $scope.submittedFirstName = $scope.user.firstName;
            $scope.submittedLastName = $scope.user.lastName;
            $scope.submittedEmail = $scope.user.email;
            $scope.submittedPhone = $scope.user.phone;
            $scope.submittedMassage = $scope.user.massage.massageName;
            $scope.submittedDate = $scope.chosenDate;
            $scope.submittedTime = $scope.chosenTime;
            $scope.submittedMessage = $scope.user.message;
            $scope.megaFail="";
            return true;

        }else{
            $scope.megaFail="NOT HAPPENING";
            return false;
        }

    };

    function resetForm(){
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
        $scope.chosenDate="";
        $scope.chosenTime="";



        // $scope.chosenDate = moment().format('YYYY-MM-DD');
        // $scope.chosenTime = moment.locale('lt');
        // $scope.chosenTime = moment().format('L LTS');
        // $scope.startDate = moment().format('YYYY-MM-DD')
    }


    // function for full form submission
    $scope.submitFullForm = function () {
        $scope.submittedFail="";
        $scope.submittedSuccess="";
        $scope.submitError="";
        if($scope.checkSubmittedData()){

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
            $scope.submittedSuccess="Thank you. Your Booking Received."
            resetForm();
        }, function myError(response) {
            $scope.submitError = response.data;
            $scope.submittedFail="THE FUCK HAPPENED???? CALL THE POLICE"
            });


    }
     else{
            $scope.submittedFail="Something Horrible Happened! Call 911."
        };
    };


    // get massage list to pick from
    $http({
        method: "GET",
        url: "/getMassagesData",
    }).then(function mySuccess(response) {
        $scope.myWelcome2 = response.data;
        //NICE
        $scope.loxx = response.data;
    }, function myError(response) {
        $scope.myWelcome2 = response.statusText;
    });

}]);









