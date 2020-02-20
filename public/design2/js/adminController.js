var app = angular.module('myAdminApp', ['moment-picker']); //ngMessages
app.config(['momentPickerProvider', function (momentPickerProvider) {
    momentPickerProvider.options({
        minutesFormat: 'HH:mm'
    });
}]);

app.controller('AdminController', ['$scope', '$http', function ($scope, $http) {

    loadData();

    function loadData() {
        $scope.currentDate = new Date();
        $scope.startDate = moment().format('YYYY-MM-DD');


        $scope.chooseADate = "Pasirinkite datą";
        $scope.clientsData = {};
        $scope.adminData = {};
        $scope.statusAdmin = {};

        $scope.availabilityDivName = "Duomenys";
        $scope.availabilityData = {};
        $scope.statusAdmin.clientsTableVisibilityOnClick = true;
        $scope.myButton = "Rodyti klientu sąrašą";

        $scope.timePickerDisabled = true;
        $scope.freeItDisabled = true;
        $scope.reserveItDisabled = true;
        getClientsList();
    }


    function getClientsList() {
        $http({
            method: "GET",
            url: "/getAdminClientData"
        }).then(function mySuccess(response) {
//            console.log(response);
            $scope.clientsData.info = response.data;
            $scope.randomStuff = angular.fromJson($scope.clientsData.info)
        }, function myError(response) {
            $scope.clientsData.error = response.statusText
        });
    }


    $scope.showHideTableButton = function (x1) {
        $scope.searchText = "";
        $scope.statusAdmin.isTableVisible = false;

        if (x1 === true) {
            $scope.myButton = "Paslėpti klientu sąrašą";
            $scope.statusAdmin.isTableVisible = true;
            $scope.statusAdmin.clientsTableVisibilityOnClick = false;

        } else if (x1 === false) {
            $scope.myButton = "Rodyti klientu sąrašą";
            $scope.statusAdmin.clientsTableVisibilityOnClick = true;
            $scope.statusAdmin.isTableVisible = false;
        }

    };

    $scope.refresh = function () {
        getClientsList();
    };

    $scope.cleanTable = function () {
//        console.log("cleaning..");
        $scope.availabilityData = {};
        $scope.availabilityDivName = "Duomenys";
        $scope.noSlotsAvailable = "";
        $scope.timePickerDisabled = true;
        $scope.freeItDisabled = true;
        $scope.reserveItDisabled = true;
    };


    function isValid(value) {
        return value !== null && value !== undefined && value !== "";
    }

    $scope.getAdminDates = function (choice) {

        if (isValid($scope.adminData.datePicker)) {

            //hide error message
            $scope.statusAdmin.noDatePicked = false;

            //hide info/error message
            $scope.statusAdmin.whenNoFreeSlotsAvailable = false;

            //reload table
            $scope.availabilityData = {};

            if (choice === false) {
                $scope.availabilityDivName = "Laisvi laikai";
                $scope.freeItDisabled = true;
                $scope.reserveItDisabled = false;
                $scope.timePickerDisabled = false;

            } else if (choice === true) {
                $scope.availabilityDivName = "Užimti laikai";
                $scope.freeItDisabled = false;
                $scope.reserveItDisabled = true;
                $scope.timePickerDisabled = false;
            }

            var getAvailabilityDataForSpecificDate = {
                "data": [{"date": $scope.adminData.datePicker},
                    {"status": choice}]
            };

            $http({
                method: "POST",
                url: "/getAdminDates",
                data: JSON.stringify(getAvailabilityDataForSpecificDate)
            }).then(function mySuccess(response) {
                $scope.availabilityData.data = response.data;

                if (response.data.length === 0) {
                    $scope.statusAdmin.whenNoFreeSlotsAvailable = true;
                    $scope.noSlotsAvailable = "Nėra laisvų vietų pasirinktai datai"
                }
            }, function myError(response) {
//                console.log("Failure");
//                console.log(response)
            });
        } else {
            $scope.statusAdmin.noDatePicked = true;
        }
    };

    $scope.doUpdate = function (status) {

        if (isValid($scope.adminData.timePicker)) {
            //json prepared
            var whateverForNow1 = {
                "data": [{"date": $scope.adminData.timePicker.id}, {"status": status}]
            };
            $http({
                method: "POST",
                url: "/updateAdminTimes",
                data: JSON.stringify(whateverForNow1)
            }).then(function mySuccess(response) {
                $scope.availabilityData.data = response.data;
                $scope.getAdminDates(!status);
            }, function myError(response) {
//                console.log(response)
            });
        }
        else {
//            console.log("No time picked!")
            $scope.noTimePicked = true;
        }
    }


    $scope.testButton = function () {



        // function getWhatever() {
        $http({
            method: "POST",
            url: "/getMassagesData",
            data: JSON.stringify("lt")
        }).then(function mySuccess(response) {
            $scope.myTestHere = response.data;
//            console.log(response)
        }, function myError(response) {
        });
    }


}]);









