
package com.estudos.certificacao.financeiro;

import com.estudos.certificacao.modelo.*;
import java.util.Date;



public class Pedido {
   Pessoa cliente;
   Endereco endereco;
    Date dataDeCriacao = new Date();
    java.sql.Date dataDeFinalizacao;
   public Pessoa getCliente(){
       return cliente ;
      
       
   }
}
