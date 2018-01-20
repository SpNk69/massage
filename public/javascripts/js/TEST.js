var app = angular.module('TEST', []); //ngMessages

app.controller('TESTCONTROLLER', ['$scope', function ($scope) {
    // $scope.language = document.getElementsByTagName("html").item(0).getAttribute("lang");

    $scope.justATest="fuckita\\sdoasdoasddasd";
    $scope.languageParameter="lt";

    var formNames = {
        "name": {
            "lt": "Vardas",
            "de": "Name",
            "ru": "Имя"
        }
    };

    $scope.justMe = "THIS IS ME";
    $scope.doTranslate = function (){
        $scope.justMe="NOP";


    };



    var navBarNames={
        "about": {
            "lt": "Apie Mane",
            "de": "Über mich",
            "ru": "Oбо мне"
        },
        "massage": {
            "lt": "Masažai",
            "de": "Massagen",
            "ru": "Mассажы"
        },
        "gallery": {
            "lt": "Galerija",
            "de": "Galerie",
            "ru": "галерея"
        },
        "ask": {
            "lt": "Klausk",
            "de": "Fragen",
            "ru": "Bопрос"
        },
        "contact": {
            "lt": "Kontaktai",
            "de": "Kontakte",
            "ru": "Kонтакты"
        }
    };


    var introText = {
        "about": {
            "lt": "Masažas yra vienas iš ypatingų veiksnių žmogaus gyvenime, padedančių palaikyti puikią kūno ir dvasios būseną. Ir nieko nėra geresnio, kaip po sunkios ir išvargintos darbo dienos atsipalaiduoti ir atgaivinti savo kūną masažo procedūromis.",
            "de": "Massage ist eine der besonderen Faktoren in das Leben einer Person, zu helfen einen guten Körper und Seele zu halten. Und es gibt nichts Besseres als nach einem harten und müden Arbeitstag, entspannen und beleben Sie Ihren Körper mit Massage-Verfahren.",
            "ru": "Массаж является одним из особых факторов в жизни человека, помогая поддерживать хорошее тело и душу. И нет ничего лучше, чем после тяжелого и усталого рабочего дня, расслабиться и оживить cвое тело массажными процедурами."
        }
    };





}]);









