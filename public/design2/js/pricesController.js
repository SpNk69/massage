app.controller('controllerPrices', ['$scope', 'myDataFactory', 'myFunctionsFactory', '$http', function ($scope, myDF, myFF, $http) {

    //first load
    loadSection($scope.languageParameter);

    $scope.$on('changeLanguageEvent', function (event, language) {
        loadSection(language);
    });

    function loadSection(currentLanguage) {
        $scope.data = {
            prices: myFF.setLanguage(currentLanguage, myDF.getPrices(), $scope)
        };
        getTableByLangFromDB(currentLanguage);
    }

    function getTableByLangFromDB(currentLang) {
        $http({
            method: "POST",
            url: "/getMassagesData",
            data: JSON.stringify(currentLang)
        }).then(function mySuccess(response) {
            spaMassages(response.data);
            otherMassages(response.data);
        }, function myError(response) {
        });
    }

    //fix to NOT be hardcoded! allow from 0 to 20 for spa massages and 20-40 for other massages (future-proof)
    function spaMassages(massageInfo) {
//        console.log(massageInfo)
        $scope.spaMassages = [];
        for (var i = 0; i < 10; i++) {
            $scope.spaMassages.push(massageInfo[i])
        }
        myFF.refactorArrayForDisplay($scope.spaMassages, 10);
    }

    //separate other massages for Prices section
    function otherMassages(massageInfo) {
        $scope.otherMassages = [];
        for (var i = 10; i < 16; i++) {
            $scope.otherMassages.push(massageInfo[i])
        }
        myFF.refactorArrayForDisplay($scope.otherMassages, 6);
    }
}]);






