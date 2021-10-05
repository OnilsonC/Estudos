/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudoscx.service.impl;

import br.com.estudoscx.models.PessoaFisica;
import br.com.estudoscx.service.PessoaService;
import br.com.estudoscx.singleton.PessoaSingleton;
import java.util.List;

/**
 *
 * @author onils
 */
public class PessoaFisicaService implements PessoaService {

    @Override
    public void criarPessoa(PessoaFisica pessoa) {
        PessoaSingleton.getInstance().getData().add(pessoa);
    }

    @Override
    public List<PessoaFisica> listarpessoas() {
         return PessoaSingleton.getInstance().getData();
    }
    
}
