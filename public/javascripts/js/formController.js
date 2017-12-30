var app = angular.module('myFormApp', ['moment-picker']); //ngMessages

app.config(['momentPickerProvider', function (momentPickerProvider) {
    momentPickerProvider.options({
        minutesFormat: 'HH:mm'
    });
}]);

app.controller('FormController', ['$scope', '$http', function ($scope, $http) {

    $scope.user = {
        firstName: "",
        lastName: "",
        email: "",
        phone: "",
        massage: "",
        message: ""
    };
    // $scope.chosenDate="";
    // $scope.chosenTime="";

    // range of available (not disabled) hours
    $scope.startHour = "09:00"
    $scope.endHour = "23:00"

    //format
    // commented out so nothing is preset
    $scope.chosenDate = moment().format('YYYY-MM-DD');
    $scope.chosenTime = moment.locale('lt');
    $scope.chosenTime = moment().format('L LTS');
    $scope.startDate = moment().format('YYYY-MM-DD')

    // function to disable dates in calendar if needed
    $scope.disabledDates = function (date, type) {
        $scope.suka = date.format('DDDo');
        $scope.suka2 = type;
        //formatas parinktas kad 2'a metu diena 'laisva'
        $scope.takenOrOffDate = "2";
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
    function validate(){
        var check1=false;
        var check2=false;
        var check3=false;
        var check4=false;
        var check5=false;
        var check6=false;
        var check7=false;
        var check8=false;

        if($scope.user.firstName.length <1){
            $scope.invalidName="Neivestas Vardas";
             check1=false;
        }else{
            $scope.invalidName="";
            $scope.submittedFirstName = $scope.user.firstName;
            check1=true;
        }

        if($scope.user.lastName.length <1){
            $scope.invalidLastName="Neivesta Pavarde";
            check2=false;
        }else{
            $scope.invalidLastName="";
            $scope.submittedLastName = $scope.user.lastName;
            check2=true;

        }

        if($scope.user.email.length <2 || !$scope.user.email.match("@")){
            $scope.invalidEmail="Neivestas Email arba blogas formatas";
            check3=false;
        }else{
            $scope.invalidEmail="";

            $scope.submittedEmail = $scope.user.email;
            check3=true;

        }

        if($scope.user.phone.length <1){
            $scope.invalidPhone="Neivestas Tel.nr";
            check4=false;
        }else{
            $scope.invalidPhone="";
            $scope.submittedPhone = $scope.user.phone;
            check4=true;
        }


        if($scope.user.massage.length <1){
            $scope.invalidMassage="Nepasirinktas masazas";
            check5=false;
        }else{
            $scope.invalidMassage="";
            $scope.submittedMassage = $scope.user.massage.massageName +' : '+$scope.user.massage.price +' chf '+ $scope.user.massage.length+ ' min';
            check5=true;

        }
        if($scope.chosenDate.length <1){
            $scope.invalidDate="Nepasirinkta data";
            check7=false;
        }else{
            $scope.invalidDate="";
            $scope.submittedDate = $scope.chosenDate;
            check7=true;

        }
        if($scope.chosenTime.length <1){
            $scope.invalidTime="Nepasirinktas laikas";
            check8=false;
        }else{
            $scope.invalidTime="";
            $scope.submittedTime = $scope.chosenTime;
            check8=true;

        }


      if($scope.user.message.length <1){
            $scope.invalidMessage="Ner zinuts";
          check6=false;
        }else{
          $scope.invalidMessage="";
          $scope.submittedMessage = $scope.user.message;
          check6=true;

      }

return check1 && check2 && check3 && check4 && check5 && check6 && check7 && check8;

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
        $scope.ggg="";
        $scope.user = {
            firstName: "",
            lastName: "",
            email: "",
            phone: "",
            massage: "",
            message: ""
        };


        $scope.chosenDate = moment().format('YYYY-MM-DD');
        $scope.chosenTime = moment.locale('lt');
        $scope.chosenTime = moment().format('L LTS');
        $scope.startDate = moment().format('YYYY-MM-DD')
    }


    // function for full form submission
    $scope.submitFullForm = function () {
        $scope.submittedFail="";
        $scope.submittedSuccess="";
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

        $http({
            method: "POST",
            url: "/submitFullForm",
            data: JSON.stringify(sendStuff)
        }).then(function mySuccess(response) {
            $scope.submitStatus = response.status;
        }, function myError(response) {
            $scope.submitError = response.statusText;
        });

        // TO DO: make a proper check on response? request delivered, cleanup
            $scope.submittedSuccess="Thank you. Your Booking Received."
            resetForm();

        }else{
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









