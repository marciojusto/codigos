var app = angular.module('loja', []);

app.controller('primeiroController', ['$scope',function($scope) {
	$scope.user = {meuNome : 'Marcio Justo ..'};
	
	$scope.contador = 0;
	
	$scope.addContador = function() {
		$scope.contador++;
	}
	
	$scope.pessoas = ['ana', 'mario', 'josé'];
	
}]);