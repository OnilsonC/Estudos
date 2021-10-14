
package com.estudos.certificacao.modelo;


public class TestaIncrementos {
    
    public static void main(String[] args) {
       int i = 5;
       //i--;
        //System.out.println(i);
        //System.out.println(i--);
        System.out.println(++i);
        
        i += 2; // soma 2
        i -= 2; // subtrai 2
        i *= 2; // multiplica por 2
        i /= 2; // divide por 2
          System.out.println(i);
          
        
        byte b = 10;
       // b = b + 10;  não compila, pois o resultado seria em int.
        b += 200; // Só aceita com este atalho, mas o resultado faz um loop. (-46).
         System.out.println(b);

    }
}
