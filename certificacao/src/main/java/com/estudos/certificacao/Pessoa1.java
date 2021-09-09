package com.estudos.certificacao;

// comentário antes do import
import java.util.Date; // direita do import
import java.io.*;

/* tudo que estiver aqui */
/* classe, variável, método e construtor com msm nome compila */
class B{
    int B;
    
    void B(){
    }
    
     B() {
    }
    
}
class Pessoa1 {
    
    static int totalDePessoas = 0;
    public int getTotalDePessoas(){
        return totalDePessoas;
    }
            
    String nome;

    Pessoa1(String nome) {
        if (nome == null){
            nome = "Jonh";
            return; // retorno vazio, pois ja retorna no this
        }
        this.nome = nome;
    }
    public String getNome(){
        String sobrenome = "Cardoso";
        return nome + sobrenome;
    }
    
}
interface A {
    final int TAMANHO = 5; // por padrão é public, final e static
    void autentica (String nome, String senha); // por padrão é public e abstract
}