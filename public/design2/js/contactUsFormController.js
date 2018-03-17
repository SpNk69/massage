app.contactFormController = function ($scope, $http, myFuncFact) {

    console.log("Inside contactFormController:");

    $scope.cfCaptcha = $scope.response;

    $scope.contactFormErrors.name = myFuncFact.ifEmptyNullOrUndefined($scope.cfName, $scope.data.contactFormErrors.name);
    $scope.contactFormErrors.email = myFuncFact.emailCheck($scope.cfEmail, $scope.data.contactFormErrors.email, $scope.data.contactFormErrors.emailBadFormat);
    $scope.contactFormErrors.message = myFuncFact.ifEmptyNullOrUndefined($scope.cfMessage, $scope.data.contactFormErrors.message);
    $scope.contactFormErrors.captcha = myFuncFact.ifEmptyNullOrUndefined($scope.cfCaptcha, $scope.data.contactFormErrors.captcha);

    if (myFuncFact.isValidInput($scope.contactFormErrors)) {
        var sendStuff2 = {
            "getCustomerQuestion":
                [
                    {
                        "name": $scope.cfName
                    },
                    {
                        "email": $scope.cfEmail
                    },
                    {
                        "message": $scope.cfMessage
                    },
                    {
                        "captcha": $scope.cfCaptcha
                    }
                ]
        };

        $http({
            method: "POST",
            url: "/sendEmail",
            data: JSON.stringify(sendStuff2)
        }).then(function mySuccess(response) {
            $scope.submittedSuccessContact = $scope.data.sucRespContactForm.response;

            $scope.setWidgetId(1, $scope.languageParameter);

            console.log("ContactForm Success Resp: ");
            console.log(response.data.contactFormErrors);

            resetContactFormFields();

        }, function myError(response) {

            $scope.toShow = response.data.contactFormErrors[0];
            processFailedResp($scope.toShow.name, $scope.toShow.email, $scope.toShow.message, $scope.toShow.captcha);
            $scope.submittedFailContact = "Something went wrong"
        });
    }

    function processFailedResp(name, email, message, captcha) {
        $scope.contactFormErrors.name = myFuncFact.processBackendResponse(name, "nameFormat", "nameLength", $scope.data.contactFormBackendErrorMessages.nameFormat, $scope.data.contactFormBackendErrorMessages.nameLength);
        $scope.contactFormErrors.email = myFuncFact.processBackendResponse(email, "emailFormat", "emailLength", $scope.data.contactFormBackendErrorMessages.emailFormat, $scope.data.contactFormBackendErrorMessages.emailLength);
        $scope.contactFormErrors.message = myFuncFact.processBackendResponse(message, "messageFormat", "messageLength", $scope.data.contactFormBackendErrorMessages.messageFormat, $scope.data.contactFormBackendErrorMessages.messageLength);
        $scope.contactFormErrors.captcha = myFuncFact.processBackendResponse(captcha, "captchaFormat", "xxxx", $scope.data.contactFormBackendErrorMessages.captchaFormat, "xxx");
    }

    function resetContactFormFields() {
        $scope.cfEmail = "";
        $scope.cfName = "";
        $scope.cfMessage = "";
        $scope.cfCaptcha = "";

    }


};





















