app.controller('controllerAboutMe', ['$scope', 'myDataFactory', 'myFunctionsFactory', function ($scope, myDF, myFF) {

    loadSection($scope.languageParameter);
    $scope.$on('changeLanguageEvent', function (event, language) {
        $scope.lang = language;
        loadSection(language);
    });

    function loadSection(currentLanguage) {
        $scope.data = {
            aboutMeTitle: myFF.setLanguage(currentLanguage, myDF.getAboutMeTitle(), $scope),
            aboutMeBody: myFF.setLanguage(currentLanguage, myDF.getAboutMeBody(), $scope)
        };
    }
}]);






