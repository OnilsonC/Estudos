
package com.estudos.certificacao.modelo;


public class TestaOperadorDeReferencia {
    public static void main(String[] args) {
       String nome = "Onilson"; 
       int tamanho = nome.length(); // o ponto (.) é operador de referência.
       
       String nomeCompleto = "Onilson" + " " + "Cardoso"; // o (+) para string é operador de concatenação.
       
        System.out.println(tamanho);
        System.out.println(nomeCompleto);
    }
}
