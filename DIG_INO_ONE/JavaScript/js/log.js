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
        name: 'Mama Jow',
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

