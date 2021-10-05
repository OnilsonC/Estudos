/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudoscx.service;

import br.com.estudoscx.models.PessoaFisica;

import java.util.List;

/**
 *
 * @author onils
 */
public interface PessoaService {
    
   public void criarPessoa(PessoaFisica pessoa); 
   
   public List<PessoaFisica> listarpessoas();
    
     
}
