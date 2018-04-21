app.controller('controllerIntroAndNavigation', ['$scope', 'myDataFactory', 'myFunctionsFactory', function ($scope, myDF, myFF) {

    loadSection($scope.languageParameter);
    $scope.$on('changeLanguageEvent', function (event, language) {
        $scope.lang = language;
        loadSection(language);
    });

    function loadSection(currentLanguage) {
        $scope.data = {
            navBar: myFF.setLanguage(currentLanguage, myDF.getNavBarData(), $scope),
            introText: myFF.setLanguage(currentLanguage, myDF.getIntroData(), $scope),
            titlePage: myFF.setLanguage(currentLanguage, myDF.getPageTitle(), $scope),
            inAHurry: myFF.setLanguage(currentLanguage, myDF.getInaHurryData(), $scope),
        };
    }
}]);






