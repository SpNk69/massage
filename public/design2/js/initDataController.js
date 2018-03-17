app.initController = function ($scope, myDataFactory) {


    //reference on click to another section
    $scope.inAHurry = "hurry";
    $scope.aboutMe = "about";
    $scope.gallery = "gallery";
    $scope.massagesId = "massages";
    $scope.pricesId = "prices";
    $scope.bookit = "bookit";
    $scope.contactMe = "contacts";


    $scope.user = {
        firstName: "",
        lastName: "",
        email: "",
        phone: "",
        massage: "",
        massageOption: "",
        message: "",
        captcha: ""
    };

    $scope.errors = {
        invalidName: "",
        invalidLastName: "",
        invalidEmail: "",
        invalidPhone: "",
        invalidMassage: "",
        invalidMassageOption: "",
        invalidDate: "",
        invalidTime: "",
        invalidMessage: "",
        invalidCaptcha: ""

    };

    $scope.contactFormErrors = {
        name: "",
        email: "",
        message: "",
        captcha: ""

    };


    $scope.errors = {
        invalidName: "",
        invalidLastName: "",
        invalidEmail: "",
        invalidPhone: "",
        invalidMassage: "",
        invalidMassageOption: "",
        invalidDate: "",
        invalidTime: "",
        invalidMessage: "",
        invalidCaptcha: ""
    };


    $scope.cfName = "";
    $scope.cfEmail = "";
    $scope.cfMessage = "";
    $scope.cfCaptcha = "";


    $scope.data = {
        titlePage: setLanguage($scope.languageParameter, myDataFactory.getPageTitle()),
        introText: setLanguage($scope.languageParameter, myDataFactory.getIntroData()),
        navBar: setLanguage($scope.languageParameter, myDataFactory.getNavBarData()),
        massageTitle: setLanguage($scope.languageParameter, myDataFactory.getMassagesTitles()),
        massageBody: setLanguage($scope.languageParameter, myDataFactory.getMassageBodyData()),
        aboutMeTitle: setLanguage($scope.languageParameter, myDataFactory.getAboutMeTitle()),
        aboutMeBody: setLanguage($scope.languageParameter, myDataFactory.getAboutMeBody()),
        inAHurry: setLanguage($scope.languageParameter, myDataFactory.getInaHurryData()),
        prices: setLanguage($scope.languageParameter, myDataFactory.getPrices()),
        formNames: setLanguage($scope.languageParameter, myDataFactory.getFormNames()),
        formPH: setLanguage($scope.languageParameter, myDataFactory.getPlaceHolders()),
        formErrors: setLanguage($scope.languageParameter, myDataFactory.getFormErrors()),
        contactForm: setLanguage($scope.languageParameter, myDataFactory.getContactUsData()),
        contactFormErrors: setLanguage($scope.languageParameter, myDataFactory.getContactFormErrors()),
        backendPricesTest: setLanguage($scope.languageParameter, myDataFactory.getMassagesFromBackend()),
        fullFormBackendErrorMessages: setLanguage($scope.languageParameter, myDataFactory.getFullFormBackendErrorMessages()),
        contactFormBackendErrorMessages: setLanguage($scope.languageParameter, myDataFactory.getContactFormBackendErrorMessages()),
        sucRespBookForm: setLanguage($scope.languageParameter, myDataFactory.getSucRespFullBookForm()),
        sucRespContactForm: setLanguage($scope.languageParameter, myDataFactory.getSucRespContactUsForm())


    };

    function setLanguage(langCheck, data) {

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
    }




};





















