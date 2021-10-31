
//variavel global - não é reconhecido dentro do bloco de função
var test = 'exemplo';

(() => {
    var test;
    console.log(`Valor dentro da função: ${test}`);

    if (true) {
        var test = 'exemplo';
        console.log(`Valor dentro do if: ${test}`);
    }

    console.log(`Valor após a exec. do if: ${test}`)
}
)();

//variável let - reconhecida dentro do bloco de função

(() => {
  let test2 = 'valor função';
  console.log(`Valor do let dentro da função: ${test2}`);

  if (true) {
      let test2 = 'valor if';
      console.log(`Valor do let dentro do If: ${test2}`)
  }

  console.log(`Valor após o If: ${test2}`);
}
)();