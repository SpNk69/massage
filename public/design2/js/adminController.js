var app = angular.module('myAdminApp', []); //ngMessages


app.controller('AdminController', ['$scope', '$http', function ($scope, $http) {

    $http({
        method: "GET",
        url: "/getAdminClientData",
    }).then(function mySuccess(response) {
        $scope.clientsData = {
            info: response.data.fullFormSubmit
        };
    }, function myError(response) {
        $scope.clientsData = {
            error: response.statusText
        };
    });

<<<<<<< HEAD

=======
>>>>>>> b0369db8f0d96d388df2cae82a467325939f899c
    $http({
        method: "GET",
        url: "/getMassagesData",
    }).then(function mySuccess(response) {
        $scope.massagesData = {
            info: response.data.massageInfo
        };
    }, function myError(response) {
        $scope.massagesData = {
            error: response.statusText
        }
    });


<<<<<<< HEAD

=======
>>>>>>> b0369db8f0d96d388df2cae82a467325939f899c
}]);









