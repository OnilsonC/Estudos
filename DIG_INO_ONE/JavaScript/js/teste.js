var nome = "Teste";
var numero = 25;

console.log(nome + " " + numero);

var frase = "O Javascript será dominado em menos de 1 ano";
/*alert(frase.replace("Javascript", "Angular"));
alert(frase.toLowerCase());
alert(frase.toUpperCase())*/

//Array
var cursos = ["HTML", "CSS", "JS", "Angular"];
cursos.push("Java");
//cursos.pop("Java")
/*console.log(cursos.toString());
console.log(cursos.join(" - "));
console.log(cursos.reverse());
console.log(cursos[0].replace("Java", "SpringBoot"));*/

//dicionario
var frutas = {nome: "Acerola", cor: "Amarelo"};
//console.log(frutas.nome + " " + frutas.cor)

//Array Dicionario
var salada = [{nome: "Tomate", qtd: 3}, {nome: "Batata", qtd: 5}];
//console.log(salada[0].nome + " " + salada[1].qtd)

/* var idade = prompt ("Qual a sua idade?");
if (idade >= 18){
    alert("Maior de idade")
}else{
    alert("Menor de idade")
} */

/*var contador = 0;
while (contador <= 5){
    console.log(contador)
    contador++
}*/

/*for (contador = 0; contador <=5; contador++){
    console.log(contador)
}*/

/*var diaHoje = new Date;
alert(diaHoje)
alert(diaHoje.getDay()+10)
alert(diaHoje.getMonth()+1)
alert(diaHoje.getMinutes())*/

//funções
/* function soma (n1, n2){
    return n1 + n2;
}
alert(soma(10, 15)) */

/* function alteraNome (frase, nome, novo_nome){
    return frase.replace(nome, novo_nome);
}
alert(alteraNome("Bom dia Onilson", "Onilson", "OniLL")) */

/* function validaIdade(idade){
    var valida;
    if(idade >= 18){
        valida = "Maior de idade" + " - " + true;
    }else{
        valida = "Menor de idade" + " - " + false;
    }
    return valida;
}

var idade = prompt("Qual a sua idade?")
console.log(validaIdade(idade)) */

function carregar(){
//    alert ("Página carregada")
}

function clicar(retorno){
    //alert("Obrigado por clicar")

    //Ao clicar no botão, o texto altera e será redirecionado para a página.
    //document.getElementById("retorno").innerHTML = "Clique para abrir deck standard";

    //Ao trazer o id para a função, na tag do HTML colocar o this retorna o ID com o Inner.
    retorno.innerHtml;
}

function redirecionar(){
    window.open("https://www.mtggoldfish.com/archetype/standard-mono-white-aggro-znr-16369#paper");
}

function mudar(mouse){
    mouse.innerHTML = "Você aprendeu";
    console.log("Texto alterado")
}

function retornar(mouse){
    mouse.innerHTML = "Passe o Mouse";
}

function validator(valor){
    console.log(valor.value)
}


function stay(change){
    change.innerHTML = "Passe o mouse - PT2";
    console.log("texto alterado");
    }

function move(change){
    change.innerHTML = "Fixou!!"
}

function validar(opcao){
    opcao.value;
    console.log(opcao.value);
}