function quickSort(arr) {
  if (arr.length <= 1) {
      return arr;
  } else {
      const pivot = arr[0];
      const left = [];
      const right = [];

      for (let i = 1; i < arr.length; i++) {
          if (arr[i] < pivot) {
              left.push(arr[i]);
          } else {
              right.push(arr[i]);
          }
      }

      return quickSort(left).concat(pivot, quickSort(right));
  }
}

function ordenarLista() {
  const lista = document.getElementById("lista").value.split(",").map(x => parseInt(x));
  const ordenada = quickSort(lista);
  document.getElementById("resultado").innerHTML = "Lista ordenada: " + ordenada;
}