let primo = () => {
  const primo = document.getElementById('numero').value;
  const resultado = document.getElementById('resultado1'); 
  
  
  for(let j = 2; j < primo; j++){
      if(primo % j == 0){
          resultado.textContent = 'Esse número não é primo.';
          return;
      }
  
  }
  resultado.textContent = 'Esse número é primo.';
  }
  calcular.addEventListener('click', primo);