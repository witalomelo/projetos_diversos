function encontrarMDC() {
  let a = parseInt(document.getElementById("numeroA").value);
  let b = parseInt(document.getElementById("numeroB").value);
  let resto;

  while (b !== 0) {
      resto = a % b;
      a = b;
      b = resto;
  }

  document.getElementById("resultado").innerHTML = a;
}