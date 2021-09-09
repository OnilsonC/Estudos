
package com.estudos.certificacao.modelo;

import java.util.ArrayList;
import java.util.List;


public class TestaOperadores {
    
    public static void main(String [] args){
        
       ArrayList<String> lista = new ArrayList<>();
       List<String> lista2 = lista;
        
        
        int i = 15;
        long idade = 15;
        
        //         char ->  ''     ''              
        //byte -> short -> int -> long
        //float -> double
        //char -> apenas positivo
        
        int a = 10;
        long b = 20;
        short c = 3;
        byte d = 4;
        char h = 65;
        
        
        double e = 30.0;
        float f = 40.3f;
        double g = 40.3f;
        
        f = a;
        f = b;
        f = c;
        f = d;
        
       // d = c; -> perca de precisão, byte < short
       // a = b; -> perca de precisão, int < long
    }
}
