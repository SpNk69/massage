var app = angular.module('myAdminApp', []); //ngMessages


app.controller('AdminController', ['$scope', '$http', function ($scope, $http) {

    $http({
        method: "GET",
        url: "/getAdminClientData",
    }).then(function mySuccess(response) {
        $scope.clientsData = {
            info: response.data
        };
    }, function myError(response) {
        $scope.clientsData = {
            error: response.statusText
        };
    });


}]);









