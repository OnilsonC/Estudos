/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estudos.certificacao.modelo;

/**
 *
 * @author onils
 */
public class TestaAtribuicaoMultipla {
    public static void main(String ... args){
        int a = 10, b = 20, c = 30;
        
         a = (b = c);
         a = b = c;
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         
        
    }
}
