app.controller('controllerContactUs', ['$scope', 'myDataFactory', 'myFunctionsFactory', '$http', function ($scope, myDF, myFF, $http) {

    loadSection($scope.languageParameter);
    $scope.$on('changeLanguageEvent', function (event, language) {
        $scope.languageParameter = language;
        loadSection(language);
        $scope.formListenerReset = true;
    });

    function loadSection(currentLanguage) {

        $scope.status = {};
        $scope.contactFormErrors = {};
        $scope.cfFields = {};
        $scope.displayErrors = {};
        $scope.applyStyle = {};

        $scope.data = {
            contactForm: myFF.setLanguage(currentLanguage, myDF.getContactUsData(), $scope),
            cfErrorsBE: myFF.setLanguage(currentLanguage, myDF.getContactFormBackendErrorMessages(), $scope),
            sucRespContactForm: myFF.setLanguage(currentLanguage, myDF.getSucRespContactUsForm(), $scope)

        };
        $scope.showCFSuccess = false;
        $scope.formListenerReset = false;
    }


    // regex
    var nameRegex = /[\d<>!@#$%^&*()_+=?":;\]\[\\\/|–-]/g;
    var emailRegex = /[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?/g;

    //name
    $scope.$watch('form1.nameCF.$touched', function (newValue, oldValue) {
        if (newValue !== oldValue) {
            if (angular.isUndefined($scope.cfFields.cfName)) {
                $scope.displayErrors.name = $scope.data.cfErrorsBE.nameLength;
                $scope.status.name = true;
                $scope.applyStyle.myObj1 = myFF.applyColor("red")
            }
            $scope.form1.nameCF.$setUntouched()
        }
    });

    $scope.$watch('cfFields.cfName', function (newValue, oldValue) {
        $scope.status.name = false;
        $scope.displayErrors.name = "";
        if (newValue !== oldValue && angular.isDefined(newValue)) {
            if (newValue.length < 2 || newValue.length > 100) {
                $scope.displayErrors.name = $scope.data.cfErrorsBE.nameLength;
                $scope.status.name = true;
                $scope.applyStyle.myObj1 = myFF.applyColor("red");
            }
            else if (newValue.match(nameRegex)) {
                $scope.displayErrors.name = $scope.data.cfErrorsBE.nameFormat;
                $scope.status.name = true;
                $scope.applyStyle.myObj1 = myFF.applyColor("red");
            }
            else {
                $scope.applyStyle.myObj1 = myFF.applyColor("green");
            }
        }
    });

    //email
    $scope.$watch('form1.emailCF.$touched', function (newValue, oldValue) {
        if (newValue !== oldValue) {
            if (angular.isUndefined($scope.cfFields.cfEmail)) {
                $scope.displayErrors.email = $scope.data.cfErrorsBE.emailLength;
                $scope.status.email = true;
                $scope.applyStyle.myObj2 = myFF.applyColor("red")
            }
            $scope.form1.emailCF.$setUntouched()
        }
    });


    $scope.$watch('cfFields.cfEmail', function (newValue, oldValue) {
        $scope.displayErrors.email = "";
        $scope.status.email = false;
        if (newValue !== oldValue && angular.isDefined(newValue)) {
            if (newValue.length < 2 || newValue.length > 100) {
                $scope.applyStyle.myObj2 = myFF.applyColor("red");
                $scope.displayErrors.email = $scope.data.cfErrorsBE.emailLength;
                $scope.status.email = true;
            }
            else if (!newValue.match(emailRegex)) {
                $scope.applyStyle.myObj2 = myFF.applyColor("red");
                $scope.displayErrors.email = $scope.data.cfErrorsBE.emailFormat;
                $scope.status.email = true;
            }
            else {
                $scope.applyStyle.myObj2 = myFF.applyColor("green");
            }
        }
    });


    //message
    $scope.$watch('form1.messageCF.$touched', function (newValue, oldValue) {
        if (newValue !== oldValue) {
            if (angular.isUndefined($scope.cfFields.cfMessage)) {
                $scope.displayErrors.message = $scope.data.cfErrorsBE.messageLength;
                $scope.status.message = true;
                $scope.applyStyle.myObj3 = myFF.applyColor("red")
            }
            $scope.form1.messageCF.$setUntouched()
        }
    });

    $scope.$watch('cfFields.cfMessage', function (newValue, oldValue) {
        $scope.status.message = false;
        $scope.displayErrors.message = "";
        if (newValue !== oldValue && angular.isDefined(newValue)) {
            if (newValue.length < 2 || newValue.length > 100) {
                $scope.displayErrors.message = $scope.data.cfErrorsBE.messageLength;
                $scope.status.message = true;
                $scope.applyStyle.myObj3 = myFF.applyColor("red");
            }
            else if (newValue.match(nameRegex)) {
                $scope.displayErrors.message = $scope.data.cfErrorsBE.messageFormat;
                $scope.status.message = true;
                $scope.applyStyle.myObj3 = myFF.applyColor("red");
            }
            else {
                $scope.applyStyle.myObj3 = myFF.applyColor("green");
            }
        }
    });


    //captcha
    $scope.$watch('cfFields.captcha', function (newValue, oldValue) {
        if (newValue !== oldValue) {
            if (newValue !== null && newValue !== "") {
                $scope.displayErrors.captcha = "";
                $scope.status.captcha = false;
                console.log("Captcha changed")
            }
        }
    });


    function notValidAtAll() {
        $scope.form1.nameCF.$setTouched();
        $scope.form1.emailCF.$setTouched();
        $scope.form1.messageCF.$setTouched();

        if ($scope.cfFields.captcha === undefined || $scope.cfFields.captcha === null || $scope.cfFields.captcha === "") {
            $scope.displayErrors.captcha = $scope.data.cfErrorsBE.captchaFormat;
            $scope.status.captcha = true;
        }
    }

    function isContactFormValid() {
        console.log("inside validation:");
        console.log($scope.displayErrors);

        return ($scope.displayErrors.name === "" && $scope.form1.nameCF.$dirty &&
            $scope.displayErrors.email === "" && $scope.form1.emailCF.$dirty &&
            $scope.displayErrors.message === "" && $scope.form1.messageCF.$dirty &&
            $scope.displayErrors.captcha === "" && $scope.cfFields.captcha !== null)
    }

    $scope.sendMailLikeNow = function () {

        if (isContactFormValid()) {
            console.log("Sending email finally");

            var question = {
                "data":
                    [
                        {
                            "name": $scope.cfFields.cfName
                        },
                        {
                            "email": $scope.cfFields.cfEmail
                        },
                        {
                            "message": $scope.cfFields.cfMessage
                        },
                        {
                            "captcha": $scope.cfFields.captcha
                        }
                    ]
            };

            $http({
                method: "POST",
                url: "/sendEmail",
                data: JSON.stringify(question)
            }).then(function mySuccess(response) {
                $scope.showCFSuccess = true;
                $scope.applyStyle = {};
                $scope.cfFields = {};
                $scope.contactFormErrors = {};

                console.log(response);
                $scope.setWidgetId(1, $scope.languageParameter);
            }, function myError(response) {
                console.log(response);
                $scope.er = response.data[0];
                processFailedResp($scope.er.name, $scope.er.email, $scope.er.message, $scope.er.captcha);
                //if captcha failed from BE for some magical reason
                if ($scope.er.captcha !== "") {
                    $scope.setWidgetId(1, $scope.languageParameter);
                }
            })
        } else {
            notValidAtAll();
        }
    };


    function processFailedResp(name, email, message, captcha) {

        $scope.displayErrors.name = myFF.processBackendResponse(name, "nameFormat", "nameLength", $scope.data.cfErrorsBE.nameFormat, $scope.data.cfErrorsBE.nameLength);
        if ($scope.displayErrors.name !== "") {
            $scope.status.name = true;
            $scope.applyStyle.myObj1 = myFF.applyColor("red")
        }
        //add for others as well and handle this crap in a more elegant way.
        $scope.displayErrors.email = myFF.processBackendResponse(email, "emailFormat", "emailLength", $scope.data.cfErrorsBE.emailFormat, $scope.data.cfErrorsBE.emailLength);

        if ($scope.displayErrors.email !== "") {
            $scope.status.email = true;
            $scope.applyStyle.myObj2 = myFF.applyColor("red")
        }

        $scope.displayErrors.message = myFF.processBackendResponse(message, "messageFormat", "messageLength", $scope.data.cfErrorsBE.messageFormat, $scope.data.cfErrorsBE.messageLength);

        if ($scope.displayErrors.message !== "") {
            $scope.status.message = true;
            $scope.applyStyle.myObj3 = myFF.applyColor("red")
        }

        $scope.displayErrors.captcha = myFF.processBackendResponse(captcha, "captchaFormat", "xxxx", $scope.data.cfErrorsBE.captchaFormat, "xxx");
    }
}

]);






