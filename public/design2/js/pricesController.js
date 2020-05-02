app.controller('controllerPrices', ['$scope', 'myDataFactory', 'myFunctionsFactory', '$http', function ($scope, myDF, myFF, $http) {

    //first load
    loadSection($scope.languageParameter);

    $scope.$on('changeLanguageEvent', function (event, language) {
        loadSection(language);
        $scope.theSizeOfTable = 0;
    });

    function loadSection(currentLanguage) {
        $scope.data = {
            prices: myFF.setLanguage(currentLanguage, myDF.getPrices(), $scope)
        };
        getTableByLangFromDB(currentLanguage);
        getTableByLangFromDB2(currentLanguage)
    }

    function getTableByLangFromDB(currentLang) {
        $http({
            method: "POST",
            url: "/getMassagesData",
            data: JSON.stringify(currentLang)
        }).then(function mySuccess(response) {
//        console.log(response.data)
            spaMassages(response.data);
        }, function myError(response) {
        });
    }

        function getTableByLangFromDB2(currentLang) {
            $http({
                method: "POST",
                url: "/getMassagesDataOther",
                data: JSON.stringify(currentLang)
            }).then(function mySuccess(response) {
    //        console.log(response.data)
                otherMassages(response.data);
            }, function myError(response) {
            });
        }





    //fix to NOT be hardcoded! allow from 0 to 20 for spa massages and 20-40 for other massages (future-proof)
    function spaMassages(massageInfo) {
//        console.log(massageInfo)
        $scope.spaMassages = [];
        for (var i = 0; i < massageInfo.length; i++) {
            $scope.spaMassages.push(massageInfo[i])
        }
        $scope.theSizeOfTable = massageInfo.length +1
        myFF.refactorArrayForDisplay($scope.spaMassages, massageInfo.length);
    }

    //separate other massages for Prices section
    function otherMassages(massageInfo) {
        $scope.otherMassages = [];
        for (var i = 0; i < massageInfo.length; i++) {
            $scope.otherMassages.push(massageInfo[i])
        }
        myFF.refactorArrayForDisplay($scope.otherMassages, massageInfo.length);
    }



}]);






