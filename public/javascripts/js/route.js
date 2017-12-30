var app = angular.module('myApp2', ['moment-picker']); //ngMessages

    app.config(['momentPickerProvider', function (momentPickerProvider) {
                momentPickerProvider.options({
                    minutesFormat: 'HH:mm'
                });
            }]);



    app.controller('MainCtrl',['$scope','$http', function($scope, $http) {



    $scope.user={
    firstName: "",
    lastName: "",
    email: "",
    phone: "",
    selectedItem: "",
    message: ""

    };




     $scope.names = ["Karstu saltu akmenu masazas", "Limfodrenazinis", "Kitas"];


      //$scope.member.memberSince = moment().format();
      $scope.startHour="09:00"
      $scope.endHour="20:00"

      $scope.memberSince = moment().format('YYYY-MM-DD');
      $scope.memberSince1 = moment.locale('lt');
      $scope.memberSince1 = moment().format('L LTS');
      $scope.disabledDates = function (date, type) {
      $scope.suka=date.format('DDDo');
      $scope.suka2=type;
       //formatas parinktas kad 2'a metu diena 'laisva'
       $scope.takenOrOffDate="2";
        // disable all Sundays and Saturdays in the Month View
        return type != 'day' || date.format('dddd') != 'Sunday' && date.format('dddd') != 'Saturday' && date.format('DDD') != $scope.takenOrOffDate;
    };

    $scope.disabledTimes = function (date, type) {
          $scope.formatas=date.format('HH');
          $scope.formatas2=type;
          $scope.takenOrOffTime = "13";
          return type !='hour' || date.format('HH') != $scope.takenOrOffTime;
          };

    $scope.startDate=moment().format('YYYY-MM-DD')



    $scope.submitMe = function() {


       $scope.submittedFirstName = $scope.user.firstName
       $scope.submittedLastName = $scope.user.lastName
       $scope.submittedEmail = $scope.user.email
       $scope.submittedPhone = $scope.user.phone
//       $scope.submittedItem= $scope.user.selectedItem
//$scope.lal2=$scope.loxx;
//NICE
       $scope.submittedItem= $scope.user.selectedItem
       $scope.submittedDate= $scope.memberSince
       $scope.submittedTime= $scope.memberSince1
       $scope.submittedMessage= $scope.user.message
//       $scope.user.firstName=""
//       $scope.validateName();



    };
    $scope.baby="25";

    $scope.validateName= function(){

    if($scope.user.firstName= "a"){
    $scope.wtf="WHAT";
    }
    }


    $scope.obj = {
              foo: 'bar',
              bar: 'foo'
            };


   $scope.firstName5="asd";

 $scope.subMe=function(){

    var lol={
                "GetAllCustomersResult" :
                    [
                        {
                          "name": $scope.testing,
                          "CustomerID": "ALFKI"
                        },
                        {
                          "CompanyName": "Ana Trujillo Emparedados y helados",
                          "CustomerID": "ANATR"
                        },
                        {
                          "CompanyName": "Antonio Moreno Taquería",
                          "Date": $scope.memberSince
                        },
                        {
                           "number": 1,
                           "boolean": false
                                                 }
                    ]
                }
;


        $http({
              method : "POST",
              url : "/doit",
              data: JSON.stringify(lol)
          }).then(function mySuccess(response) {
              $scope.myWelcome = response.data;
          }, function myError(response) {
              $scope.myWelcome = response.statusText;
          });
          };


          $scope.submitFullForm=function(){
          var sendStuff={
              "GetAllCustomersResult" :
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
                        "massage": $scope.submittedItem.massageName
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
                        method : "POST",
                        url : "/submitFullForm",
                        data: JSON.stringify(sendStuff)
                    }).then(function mySuccess(response) {
                        $scope.myWelcome = response.data;
                    }, function myError(response) {
                        $scope.myWelcome = response.statusText;
                    });

          }





            $http({
                        method : "GET",
                        url : "/getMassagesData",
                    }).then(function mySuccess(response) {
                        $scope.myWelcome2 = response.data;
                        //NICE
                        $scope.loxx=response.data;
                    }, function myError(response) {
                        $scope.myWelcome2 = response.statusText;
                    });










    }]);









