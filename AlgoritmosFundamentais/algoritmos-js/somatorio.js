const numeros = [];
let qtdInteiros = 0;

function adicionarNumero() {
    const inputNumero = document.getElementById("numero");
    const novoNumero = parseInt(inputNumero.value);

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

    for (let i = 0; i < numeros.length; i++) {
        if (Number.isInteger(numeros[i])) {
            qtdInteiros = qtdInteiros +numeros[i];
        } else {
            qtdFloats++;
        }
    }

    document.getElementById("qtdInteiros").innerHTML = qtdInteiros;
}