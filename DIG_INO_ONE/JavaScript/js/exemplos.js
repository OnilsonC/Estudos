console.log('\n##########################################')
function getName(){
    return 'Introdução ao JavaScript';
}

function logName(name){
    console.log(name());
}

const logNameReturn = logName;

logNameReturn(getName);

function soma(a){
    return function(b){
        return a + b;
    }
}
const soma3 = soma(3);
console.log(soma3(18));

const userName = {
    name1: 'Onill - ',
    lastName1: 'Fullstack',
}

function getAllName(userName){
    return {
        ...userName,
        allName: `${userName.name1} ${userName.lastName1}`
    }
}

const nameGeting = getAllName(userName);
console.log(nameGeting);