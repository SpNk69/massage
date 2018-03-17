var gg = angular.module('myTestApp22', []); //ngMessages

gg.factory('myFunctionsFactory', function () {

    return {
        ifEmpty: function(field, error) {
            if (field.length < 1) {
                return error;
            } else {
                return "";
            }
        },

        emailCheck: function(field, error1, error2){
            if (field.length < 1) {
                return error1;
            } else if (!field.includes("@") && field.length > 0) {
                return error2;
            } else {
                return "";
            }

        },
        ifEmptyNullOrUndefined: function(field, error){
            if (field == null || angular.isUndefined(field) || field.length < 1) {
                return error;
            } else {
                return "";
            }
        },
        processBackendResponse: function(x, error1, error2, message1, message2){
            if (x === error1) {
                return message1;
            } else if (x === error2) {
                return message2;
            } else {
                return "";
            }
        },
        getTimesAndPricesFromBackend: function(value){

            var limphoBody=["90","120"];
            var limphoFace=["60"];
            var stoneHotCold=["90","120"];
            var backSpin=["60","120"];
            var relaxBody=["120"];
            var ajurved=["60"];
            var relaxFoot=["60"];

            if(value==0){
                return{
                    "x":limphoBody

                }
            }else if(value == 1){
                return{
                    "x":limphoFace

                }
            }else if(value == 2){
                return{
                    "x":stoneHotCold

                }
            }else if(value == 3){
                return{
                    "x":backSpin

                }
            }else if(value == 4){
                return{
                    "x":relaxBody

                }
            }else if(value == 5){
                return{
                    "x":ajurved

                }
            }else if(value == 6){
                return{
                    "x":relaxFoot

                }
            }



        },
        isValid:function(x){
            if (x === "") {
                return true;
            }

        },
        isValidInput: function(object){
            var valid = true;
            angular.forEach(object, function (value, key) {
                if (value !== "") {
                    valid = false;
                }
            });
            return valid;
        }



    }
});
















