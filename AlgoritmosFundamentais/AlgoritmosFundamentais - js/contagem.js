const numeros = [];
let qtdInteiros = 0;
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
    qtdInteiros = 0;
    qtdFloats = 0;

    for (let i = 0; i < numeros.length; i++) {
        if (Number.isInteger(numeros[i])) {
            qtdInteiros++;
        } else {
            qtdFloats++;
        }
    }

    document.getElementById("qtdInteiros").innerHTML = qtdInteiros;
    document.getElementById("qtdFloats").innerHTML = qtdFloats;
}