
// AULA 1 - Basic Java

package com.estudos.certificacao;


class Pessoa {
   static int id = 1;// variável estática.
    
   static int metodo(int id){ // método estático pode acessar variável estática.
      return id;
      
      
  }
}

public class Teste {
    String nome = "Filho "; // variável de instância / membro / atributo. Pode ser acessada de qualquer lugar
                           //  dentro do objeto (classe). desde que exista um objeto instaciado.   
    String nomeCompleto = nome + "Santos";
    
    public Teste(){ // construtor sem parâmetro para acessar a varável membro.
       System.out.println(nome); // acessando a variável membro.
    }
    
    public Teste(String nome){// construtor.
        System.out.println(nome);// variável do parâmetro.
    }
    
    public void m3(){
        System.out.println(nomeCompleto);// acessando a variável membro.
    }
    
    public void m2(String nome){//um parâmetro tbm é uma variável local e só existe dentro do bloco.
        System.out.println(nome);
    }
    
    public void m1(String sobrenome){
//       System.out.println(nome);// A variável nome só existe no método m2.
         System.out.println(sobrenome);   
        
//      for (int i=0, j=0;i<=10;i++)j++; {//variável só vai existir dentro do escopo do for.
//          System.out.println(i);        //se tiver fora do parênteses da erro. 
//          System.out.println(j); 
//      }
//       
//         
//        int x = 10;//variável local - só é acessível dentro do bloco do método.
//        System.out.println(x);
//        if (x >=10) {
//            int y = 50; // variável acessível apenas dentro do bloco if.
//            System.out.println(y);
//           }
//         // System.out.println(y); - está fora do bloco do if, não é acessível.
//
    }
    
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        System.out.println(p.id); // A variável estática pode ser acessada através de uma instância.
        System.out.println(Pessoa.id); // Acessando através da classe por conta da instância.
        Teste t = new Teste("Onilson"); //instância e chamando a variável do parâmetro do construtor.
        t.m1("Cardoso"); // chamando o método m1 e a variável do parâmetro.
//        t.m2("Onilson");// chamando o método m2 e a variável do parâmetro.
//        t.m3();// chamando o método m3 e variável membro que está declarada no output.
//        t.nome = "Francisco";// acessando a variável membro direto.
//        System.out.println(t.nome);
          p.metodo(Pessoa.id); // acessando o método com a variável estática no parâmetro com a instancia.
//        Pessoa.metodo(); // acessando pela classe.
          System.out.println(p.metodo(Pessoa.id));
    }
      
  
}

 
    
