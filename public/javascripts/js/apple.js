var app = angular.module('myApp22', []);
app.controller('myCtrl22', function($scope) {
    $scope.changeName = function() {
        $scope.firstName2 = "John Pizdon";
    }
});