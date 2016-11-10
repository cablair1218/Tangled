'use strict';

angular.module('tangledApp')

.controller('UserCtrl',['$scope','$ionicModal', function($scope, $ionicModal){
  $scope.user = {
    "firstName": '',
    "lastName": '',
    "emailAddress":'',
    "password":''
  };

  $ionicModal.fromTemplateUrl('templates/newUser.html', {
    scope: $scope
  }).then(function(modal) {
    $scope.modal = modal;
  });

  // Triggered in the login modal to close it
  $scope.closeUser = function() {
    $scope.modal.hide();
  };

  // Open the login modal
  $scope.newUser = function() {
    $scope.modal.show();
  };

}]);
