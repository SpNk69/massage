var gg = angular.module('functionsFactory', []); //ngMessages

gg.factory('myFunctionsFactory', function () {

    return {
        processBackendResponse: function (x, error1, error2, message1, message2) {
            if (x === error1) {
                return message1;
            } else if (x === error2) {
                return message2;
            } else {
                return "";
            }
        },
        isValid: function (x) {
            if (x === "") {
                return true;
            }

        },
        refactorArrayForDisplay: function (toRefactor, theSize) {
            for (var i = 0; i < theSize; i++) {


                if (toRefactor[i].col1 === "" || toRefactor[i].col1 == null) {
                    toRefactor[i].col1 = "–"
                } else {
                    toRefactor[i].col1 = toRefactor[i].col1 + " CHF"
                }

                if (toRefactor[i].col2 === "" || toRefactor[i].col2 == null) {
                    toRefactor[i].col2 = "–"
                } else {
                    toRefactor[i].col2 = toRefactor[i].col2 + " CHF"
                }

                if (toRefactor[i].col3 === "" || toRefactor[i].col3 == null) {
                    toRefactor[i].col3 = "–"
                } else {
                    toRefactor[i].col3 = toRefactor[i].col3 + " CHF"
                }
            }
        },
        hideFlagOfCurrentLang: function (scope, currentLang) {
            scope.isLangDE = true;
            scope.isLangLT = true;
            scope.isLangRU = true;

            if (currentLang === "lt") {
                scope.isLangLT = false;
            } else if (currentLang === "de") {
                scope.isLangDE = false;
            } else if (currentLang === "ru") {
                scope.isLangRU = false;
            }
        },
        setLanguage: function (langCheck, data, $scope) {

            $scope.lt = "lt";
            $scope.de = "de";
            $scope.ru = "ru";

            if (langCheck === $scope.lt) {
                $scope.languageParameter = $scope.lt;
                return data.lt;

            } else if (langCheck === $scope.de) {
                $scope.languageParameter = $scope.de;
                return data.de;

            } else if (langCheck === $scope.ru) {
                $scope.languageParameter = $scope.ru;
                return data.ru;
            }

        },
        applyColor: function (x) {
            if (x === "red") {
                return {
                    "border": "2px solid red",
                    "background-color": "#ffd2c7"
                };
            } else if (x === "green") {
                return {
                    "border": "2px solid green",
                    "background-color": "#eeffd3"
                };
            } else if (x === "none") {
                return {
                    "border": "",
                    "background-color": ""
                };
            }
        }

    }


})
;
















