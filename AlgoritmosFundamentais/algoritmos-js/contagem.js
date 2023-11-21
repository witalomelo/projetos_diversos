const numeros = [];
let qtdInt = 0;
let qtdFloats = 0;

function adicionarNumero() {
    const inputNumero = document.getElementById("numero");
    const novoNumero = parseFloat(inputNumero.value);

    if (!isNaN(novoNumero)) {
        numeros.push(novoNumero);
        inputNumero.value = "";
        atualizarResumo();
    } else {
        alert("Insira um número válido.");
    }
}

function atualizarResumo() {
    qtdInt = 0;
    qtdFloats = 0;

    for (let i = 0; i < numeros.length; i++) {
        if (Number.isInteger(numeros[i])) {
            qtdInt++;
        } else {
            qtdFloats++;
        }
    }

    document.getElementById("qtdInt").innerHTML = qtdInt;
    document.getElementById("qtdFloats").innerHTML = qtdFloats;
}