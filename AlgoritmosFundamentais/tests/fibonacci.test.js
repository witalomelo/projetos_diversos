const fibonnaci = required('../algoritmos-js/fibonacci.js');

test('os 10 primeiros numeors da contagem de fibonacci devem ser os correros',
() => { expect(fibonnace(10)).toMatchObject([0,1,1,2,3,5,8,13,21,34]);
});
test('os dois primeiros numeros da contagem de fibonacci devem ser de 0 e 1', 
() => {expect(fibonnace(2)).toMatchObject([0,1]);
})