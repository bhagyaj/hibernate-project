(function(){
var app = angular.module('myApp', []);	

var ctrl=function($scope,$log,$http){
	
	
	
	$scope.studentName="fghfg";
	$scope.studentMob="fjfg";
	$scope.studentAdd1="fjhdk";
	$scope.address={};
	$scope.zip="df";
	$scope.json;
	$scope.getid;
	
	$scope.submitStudent = function() {
		
		
		var payload={
			"studentName":$scope.studentName,
			"studentMobile":$scope.studentMob,
			"address":{
				"addressName":$scope.studentAdd1,
				"addressZip":parseInt($scope.zip)
			}			
		}
		$log.info(angular.toJson(payload));
		var result=$http.post("http://localhost:8080/addOwner",payload)

	
		
	};	
		
	}
	
	
	var getid=function($scope,$http,$log){
		$scope.getid;
		
		$scope.submitReq = function() {
			var id="http://localhost:8080/Students/"+$scope.getid;
			$log.info(id);
			var student = $http.get(id);
			student.then(function(response){
				$log.info(response.data);
				$scope.user=response.data;

			});
			

		
		};	
		
	}

app.controller("myCtrl",ctrl);
app.controller("getid",getid);

	
}())