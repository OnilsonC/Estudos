function getName(){
    
    return 'Onilson Cardoso dos Santos Filho';
}

function logFn(fn){
    console.log(fn());
}

const logFnResult = logFn;

logFnResult(getName);


/* Curryng*/
function soma(a){
    return function(b){
        return a + b;
    }
   }
const soma2 = soma(2);
console.log(soma2(2));
console.log(soma2(4));
console.log(soma2(8)); 

/*hoisting - variáveis*/
function fn () {
    console.log(texto);

    var texto = 'Exemplo';

    console.log(texto);
}
fn();

/*hoisting - função*/
function fn1 (){
    log('Hoisting de função');

    function log(value) {
        console.log(value);
    }
}
fn1();

/*imutabilidade*/

const user = {
    name: 'Onilson',
    lastName: 'Filho'
};

function getFullName(user){
    return {
        ...user,
        fullName: `${user.name} ${user.lastName}`
   }
  }

  const userFullName = getFullName(user);
  console.log(userFullName);


  const studants = [
      {
        name: 'Bob Chao',
        grade: 7.2
      },
      {
        name: 'Chong Low',
        grade: 6.8
      },
      {
        name: 'Mama Jay',
        grade: 8.9
      }
  ];

  function getApproved(studantList){
      return studantList.filter(studants => studants.grade >=7);
  }

  console.log('Alunos aprovados: ');
  console.log(getApproved(studants));

  console.log('\nLista de Alunos: ');
  console.log(studants);

function somas (a1) {
    return function (b1) {
        return a1 + b1;
    }
}
const soma4 = somas(4);
console.log(soma4(2));
console.log(soma4(10));
console.log(soma4(20));

function getNome() {
    return 'Onilson - JavaScript';
}

function logNome(nome) {
    console.log(nome());
}

const NomeTodo = logNome;

NomeTodo(getNome);

const condicaoPessoa = {
    nome: 'Onilson',
    idade: 33
};

function cadastroPessoa(condicaoPessoa) {
    return {
        ... condicaoPessoa,
        cadastroCompleto: `${ condicaoPessoa.nome } ${condicaoPessoa.idade}`
    }
}

const retornoCadastro = cadastroPessoa(condicaoPessoa);
    console.log(retornoCadastro);

    const estudantes = [
        {
            aluno: 'Zé Fonseca',
            nota: 5.9
        },
        {
            aluno: 'Gabi Low',
            nota: 7.2
        },
        {
            aluno: 'Joca Loot',
            nota: 9.4
        },
    ]

    function alunosAprovados (listaAluno) {
        return listaAluno.filter(estudantes => estudantes.nota >= 7);
    }

    console.log('Alunos aprovados: ')
    console.log(alunosAprovados(estudantes));

    console.log('\nLista de alunos: ')
    console.log(estudantes);

   function fn2() {
       log1('Hoisting de função')

       function log1(value1) {
           console.log(value1);
       }
   }
   fn2();  

   