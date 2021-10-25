
package com.estudos.certificacao.modelo;


public class TestaAritmetica {
    public static void main(String[] args) {
        int dois = 2;
    int dez = 10;
    
    int doze = dez + dois;
    int oito = dez - dois;
    int vinte = dez * dois;
    int cinco = dez / dois;
    int restoDaDivisao = cinco % dois;
    
    double divisao1 = 5 / 0.0;
        System.out.println(divisao1);
        System.out.println((-dois + 0.0) / 0);
        // divisões por 0 em int não roda, divisões por 0 em double roda (Infinity)
    }
  
    
    
}
