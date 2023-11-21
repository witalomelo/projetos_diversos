document.getElementById('gerar').onclick = function() {
	var i, fibArr = [0,1];
	var num = parseFloat(document.getElementById('valor').value);
	if (num < 3) {
		document.getElementById('resultado_mensage').innerHTML = "A sequencia Fibonacci começa com: 0,1,1,...";
		return false
	} else {
		for(i = 0; i < num - 2; i++) {	
  		fibArr[fibArr.length] = fibArr[fibArr.length-1] + fibArr[fibArr.length-2];
		} 
	} 

	document.getElementById('resultado_mensage').innerHTML = '';
	document.getElementById('resultado_numero').innerHTML = num + ' numero do Fibonacci é: ' + fibArr[fibArr.length-1];
	document.getElementById('resultado_array').innerHTML = '[' + fibArr + ']'; 

}