app.mapsController = function ($scope, NgMap) {

    $scope.googleMapsUrl = "https://maps.googleapis.com/maps/api/js?key=AIzaSyCEYVMDc9EIG4zsSYD6SXJ7gzk05BOinH0";

    NgMap.getMap().then(function (map) {
        // console.log(map.getCenter());
        // console.log('markers', map.markers);
        // console.log('shapes', map.shapes);
    });


};





















