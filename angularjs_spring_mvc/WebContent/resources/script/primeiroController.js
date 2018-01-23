var app = angular.module('loja', ['ngRoute']);

//config -> Use este método para registrar o trabalho que precisa ser executado no carregamento do módulo
//when -> Adiciona uma nova definição de rota ao serviço $route.
//otherwise -> Definição de rota que será usada em uma mudança de rota quando nenhuma outra for definida.
app.config(function($routeProvider) {
	$routeProvider
	.when("/", {controller: "listController", templateUrl: "list.html"}) //listar
	.when("/edit/:name", {controller: "editController", templateUrl: "form.html"}) //editar
	.when("/new", {controller: "newController", templateUrl: "form.html"}) //novo
	.when("/expressoes", {controller: "expressoesController", templateUrl: "expressoes.html"})
	.otherwise({redirectTo: "/"});
});

//Registro de trabalho que deve ser realizado quando o injetor é feito carregando todos os módulos
app.run(function($rootScope) {
	$rootScope.frutas = ['banana', 'melancia', 'pera'];
});

app.controller('listController', ['$scope', '$routeParams', function($scope, $routeParams) {
	
}]);

app.controller('expressoesController', ["$scope",
	function($scope) {
		$scope.title = "Expressões no Angular JS";
	}
]);

//$scope é o escopo da aplicação html
//$location redirecionamento entre rotas
//$routeParams são os parâmetros repassados pela url
app.controller('editController', ['$scope', '$location', '$routeParams', 
	function editController($scope, $location, $routeParams) {
		$scope.title = 'Editar Frutas'; //adicionando título a página
		$scope.fruta = $routeParams.name; //pegando o nome da fruta para editar
		$scope.frutaIndex = $scope.frutas.indexOf($scope.fruta); //pegando a fruta dentro da lista
		
		$scope.salvar = function() {
			$scope.frutas[$scope.frutaIndex] = $scope.fruta; //pega o novo nome da fruta editada
			$location.path('/'); //volta para o index
		}
	}
]);

app.controller('newController', ['$scope', '$routeParams', '$rootScope', '$route', '$location', 
	function newController($scope, $routeParams, $rootScope, $route, $location) {
		$scope.title = 'Nova Fruta';
		$scope.fruta = '';
		
		$scope.salvar = function() {
			$scope.frutas.push($scope.fruta); //add nova fruta
			$location.path('/'); //volta para o index
		}
	}
]);
