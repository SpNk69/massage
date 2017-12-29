var app = angular.module('myApp2', ['moment-picker']); //ngMessages

    app.config(['momentPickerProvider', function (momentPickerProvider) {
                momentPickerProvider.options({
                    minutesFormat: 'HH:mm'
                });
            }]);

//app.controller('myCtrl3', function($scope, $http) {
//  $http({
//          method : "GET",
//          url : "mypage/load"
//      }).then(function mySuccess(response) {
//          $scope.myWelcome = response.data;
//      }, function myError(response) {
//          $scope.myWelcome = response.statusText;
//      });
//
//  });
//  app.controller('myCtrl22', function($scope) {
//      $scope.changeName = function() {
//          $scope.firstName2 = "John Pizdon";
//      }
//  });
//    app.controller('myCtrl', function($scope) {
//
//            $scope.firstName = "Lox";
//            $scope.addName = function() {
//            $scope.lastName="pider";
//            }
//    });
//
//
//
//    app.controller('sendSimpleStuff',['$scope','$http','$filter', function($scope,$http,$filter){
//    $scope.myDate =$filter('date')(Date.now(), "yyyy-MM-dd");
//    $scope.send = function() {
//    var url='addToDatabase';
//    var dataToSend='/'+$scope.firstName2+'/'+$scope.lastName2+'/'+$scope.age2;
//    var par={param:'John',param2:"Lox",param3:"3"};
//    var go = {'LastName': $scope.firstName2, 'FirstName': $scope.lastName2, 'Age': $scope.age2};
//
//       $http.post(url+dataToSend).then(function mySuccess(response) {
//              $scope.firstName2 = response.data;
//          }, function myError(response) {
//              $scope.firstName2 = response.status;
//              $scope.lastName2 = response.config;
//          });
//    }
//    }]);

    app.controller('MainCtrl',['$scope','$http', function($scope, $http) {



//    $scope.stu= function(){
//    return "John Pizd";};
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
//    var letters = /^[A-Za-z]+$/;
//    if($scope.user.firstName.match(letters)){
////    $scope.names.firstName="John Pizdohn";
//    $scope.user.lastName="Jane Pizdane";
//    $scope.pizdiec="Correct";}
//    $scope.dateChosen= $scope.memberSince;
//    $scope.timeChosen= $scope.memberSince1;
//    $scope.spiderman=861705650;

       $scope.submittedFirstName = $scope.user.firstName
       $scope.submittedLastName = $scope.user.lastName
       $scope.submittedEmail = $scope.user.email
       $scope.submittedPhone = $scope.user.phone
//       $scope.submittedItem= $scope.user.selectedItem
//$scope.lal2=$scope.loxx;
//NICE
       $scope.submittedItem= $scope.duxx
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


//$scope.loxx;

          $scope.getData=function(){




            $http({
                        method : "GET",
                        url : "/massageList",
//                        data: JSON.stringify(lol)
                    }).then(function mySuccess(response) {
                        $scope.myWelcome2 = response.data;
                        //NICE
                        $scope.loxx=response.data;
                    }, function myError(response) {
                        $scope.myWelcome2 = response.statusText;
                    });


//                    var dx[];
//                    dx=angular.fromJson(myWelcome2);
//console.log(dx)
$scope.selectedTestAccount=null;

$scope.lalala="";

$scope.justData={
                  "records": [
                    {
                      "Name": "Alfreds Futterkiste",
                      "City": "Berlin",
                      "Country": "Germany"
                    },
                    {
                      "Name": "Ana Trujillo Emparedados y helados",
                      "City": "México D.F.",
                      "Country": "Mexico"
                    },
                    {
                      "Name": "Antonio Moreno Taquería",
                      "City": "México D.F.",
                      "Country": "Mexico"
                    },
                    {
                      "Name": "Around the Horn",
                      "City": "London",
                      "Country": "UK"
                    },
                    {
                      "Name": "B's Beverages",
                      "City": "London",
                      "Country": "UK"
                    },
                    {
                      "Name": "Berglunds snabbköp",
                      "City": "Luleå",
                      "Country": "Sweden"
                    },
                    {
                      "Name": "Blauer See Delikatessen",
                      "City": "Mannheim",
                      "Country": "Germany"
                    },
                    {
                      "Name": "Blondel père et fils",
                      "City": "Strasbourg",
                      "Country": "France"
                    },
                    {
                      "Name": "Bólido Comidas preparadas",
                      "City": "MadriJohnd",
                      "Country": "Spain"
                    },
                    {
                      "Name": "Bon app'",
                      "City": "Marseille",
                      "Country": "France"
                    },
                    {
                      "Name": "Bottom-Dollar Marketse",
                      "City": "Tsawassen",
                      "Country": "Canada"
                    },
                    {
                      "Name": "Cactus Comidas para llevar",
                      "City": "Buenos Aires",
                      "Country": "Argentina"
                    },
                    {
                      "Name": "Centro comercial Moctezuma",
                      "City": "México D.F.",
                      "Country": "Mexico"
                    },
                    {
                      "Name": "Chop-suey Chinese",
                      "City": "Bern",
                      "Country": "Switzerland"
                    },
                    {
                      "Name": "Comércio Mineiro",
                      "City": "São Paulo",
                      "Country": "Brazil"
                    }
                  ]
                };
          }



                      $http({
                                  method : "GET",
                                  url : "/getAdminData",
          //                        data: JSON.stringify(lol)
                              }).then(function mySuccess(response) {
                                  $scope.suckThat = response.data;
                                  //NICE
//                                  $scope.loxx=response.data;
                              }, function myError(response) {
                                  $scope.myWelcome2 = response.statusText;
                              });




                    $http({
                                          method : "GET",
                                          url : "/massageList",
                  //                        data: JSON.stringify(lol)
                                      }).then(function mySuccess(response) {
                                          $scope.adminMassageList = response.data;
                                          //NICE
//                                          $scope.loxx=response.data;
                                      }, function myError(response) {
                                          $scope.myWelcome2 = response.statusText;
                                      });


    }]);









