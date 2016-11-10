'use strict';

angular.module('tangledApp')
.controller('MenuComponentCtrl',
  ['$scope', '$rootScope', '$location', '$ionicModal',
  function($scope,$rootScope, $location, $ionicModal) {


  // Form data for the login modal
    $scope.loginData = {};

    // Create the login modal that we will use later
    $ionicModal.fromTemplateUrl('templates/login.html', {
      scope: $scope
    }).then(function(modal) {
      $scope.modal = modal;
    });

    // Triggered in the login modal to close it
    $scope.closeLogin = function() {
      $scope.modal.hide();
    };

    // Open the login modal
    $scope.login = function() {
      $scope.modal.show();
    };

    // Perform the login action when the user submits the login form
    //AuthenticationService.ClearCredentials();

    $scope.doLogin = function() {
      /*console.log('Doing login', $scope.loginData);
      $scope.dataLoading = true;
      /*.Login($scope.username, $scope.password, function(response) {
        if(response.success) {
            AuthenticationService.SetCredentials($scope.username, $scope.password);
            $location.path('/');
        } else {
            $scope.error = response.message;
            $scope.dataLoading = false;
        }
      });
      */
    };
}]);
