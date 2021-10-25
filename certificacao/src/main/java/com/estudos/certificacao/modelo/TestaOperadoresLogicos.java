
package com.estudos.certificacao.modelo;


public class TestaOperadoresLogicos {
    public static void main(String[] args) {
        System.out.println(1 == 1 /*E */ & 1 > 2);
        System.out.println(1 == 1 /*OU */ | 1 > 2);
        System.out.println(1 == 1 /*OU EXCLUSIVO*/ ^ 1 > 2);
        System.out.println(!(1 == 1) /*NEGAÇÂO*/);
        
        //short circuit
        
        System.out.println(1 == 1 /*E */ && 1 > 2);
        System.out.println(1 == 1 /*OU */ || 1 > 2);
        
    }
 
}
