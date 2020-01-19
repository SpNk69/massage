app.captchaController = function ($scope, vcRecaptchaService) {

//    console.log("In the captchaController");
    $scope.response = null;
    $scope.widgetId = null;
    $scope.model = {
        key: '6Lfg2z8UAAAAAPQjJGsDU4A6Wfn6LZHxdqraiHv8'
    };
    $scope.setResponse = function (response) {
        console.info('Response available');
        $scope.response = response;
    };
    $scope.setWidgetId = function (widgetId, langMy) {

        vcRecaptchaService.reload(widgetId);
        vcRecaptchaService.useLang(widgetId, langMy);
//        console.info('Created widget ID: %s', widgetId);
        $scope.widgetId = widgetId;
    };

    $scope.cbExpiration = function (widget,langMy) {
        $scope.response = null;

        console.info('Captcha expired. Resetting response object');
        vcRecaptchaService.reload(widget);
        vcRecaptchaService.useLang(widget, langMy);
    };
};





















