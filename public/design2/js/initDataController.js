app.initController = function ($scope, myDataFactory,myFunctionsFactory) {


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
        titlePage: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getPageTitle(),$scope),
        introText: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getIntroData(),$scope),
        navBar: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getNavBarData(),$scope),
        massageTitle: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getMassagesTitles(),$scope),
        massageBody: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getMassageBodyData(),$scope),
        aboutMeTitle: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getAboutMeTitle(),$scope),
        aboutMeBody: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getAboutMeBody(),$scope),
        inAHurry: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getInaHurryData(),$scope),
        prices: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getPrices(),$scope),
        formNames: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getFormNames(),$scope),
        formPH: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getPlaceHolders(),$scope),
        formErrors: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getFormErrors(),$scope),
        contactForm: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getContactUsData(),$scope),
        contactFormErrors: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getContactFormErrors(),$scope),
        backendPricesTest: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getMassagesFromBackend(),$scope),
        fullFormBackendErrorMessages: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getFullFormBackendErrorMessages(),$scope),
        contactFormBackendErrorMessages: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getContactFormBackendErrorMessages(),$scope),
        sucRespBookForm: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getSucRespFullBookForm(),$scope),
        sucRespContactForm: myFunctionsFactory.setLanguage($scope.languageParameter, myDataFactory.getSucRespContactUsForm(),$scope)


    };

};





















