var app = angular.module('loja', []);

app.config(function($routeProvider) {
	$routeProvider
	.when("/", {controller: "listController", templateUrl: "list.html"}) //listar
	.when("/edit/:name", {controller: "editController", templateUrl: "form.html"}) //editar
	.when("/new", {controller: "newController", templateUrl: "form.html"}) //novo
	.otherwise({redirectTo: "/"});
});

app.run(function($rootScope) {
	$rootScope.frutas = ['banana', 'melancia', 'pera'];
});

app.controller('listController', ['$scope', function($scope) {
	
}]);