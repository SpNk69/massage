var app = angular.module('myTestApp', ['ngTextTruncate', 'dataFactoryApp', 'moment-picker', 'ngMap', 'vcRecaptcha', 'functionsFactory']); //ngMessages

app.config(['momentPickerProvider', function (momentPickerProvider) {
    momentPickerProvider.options({
        minutesFormat: 'HH:mm'
    });
}]);

app.controller('myTestController', ['$scope', 'myDataFactory', '$http', 'NgMap', 'vcRecaptchaService', 'myFunctionsFactory', '$rootScope', function ($scope, myDataFactory, $http, NgMap, vcRecaptchaService, myFunctionsFactory, $rootScope) {
    $scope.inAHurry = "hurry";
    $scope.aboutMe = "about";
    $scope.gallery = "gallery";
    $scope.massagesId = "massages";
    $scope.pricesId = "prices";
    $scope.bookit = "bookit";
    $scope.giftCard = "giftCard";
    $scope.contactMe = "contacts";
    //starting page language
    $scope.languageParameter = "de";

    $scope.$watch('languageParameter', function (newValue, oldValue) {
        if (newValue !== oldValue) {
            $scope.$emit('initiateEvent', null);
        }
    });

    $scope.$on('initiateEvent', function (event, b) {
        $scope.$broadcast('changeLanguageEvent', $scope.languageParameter);
    });

    app.captchaController($scope, vcRecaptchaService);

    app.mapsController($scope, NgMap);

    myFunctionsFactory.hideFlagOfCurrentLang($scope, $scope.languageParameter);


    //called from GUI
    $scope.doTranslate2 = function (langToSetTo) {
        $scope.languageParameter = langToSetTo;
        myFunctionsFactory.hideFlagOfCurrentLang($scope, langToSetTo);
        $scope.setWidgetId(0, langToSetTo);
        $scope.setWidgetId(1, langToSetTo);
    };
  }]);











