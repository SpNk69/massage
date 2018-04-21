app.controller('controllerMassage', ['$scope', 'myDataFactory', 'myFunctionsFactory', '$http', '$rootScope', function ($scope, myDF, myFF, $http, $rootScope) {

    $scope.truncateSize = 110;

    loadSection($scope.languageParameter);
    $scope.$on('changeLanguageEvent', function (event, language) {
        $scope.lang = language;
        loadSection(language);
    });

    function loadSection(currentLanguage) {
        $scope.data = {
            massageTitle: myFF.setLanguage(currentLanguage, myDF.getMassagesTitles(), $scope),
            massageBody: myFF.setLanguage(currentLanguage, myDF.getMassageBodyData(), $scope),
            navBar: myFF.setLanguage(currentLanguage, myDF.getNavBarData(), $scope)
        };
    }

    $scope.pickMassage2 = function (number) {
        $scope.$emit('initiateEvent1', number);
    };

    $scope.$on('initiateEvent1', function (event, b) {
        $rootScope.$broadcast('massageChange', b);
    });
}]);






