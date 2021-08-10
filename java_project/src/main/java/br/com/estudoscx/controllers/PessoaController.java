/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudoscx.controllers;

import br.com.estudoscx.service.impl.PessoaFisicaService;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import org.glassfish.jersey.server.mvc.Viewable;

/**
 *
 * @author onils
 */
@Path("pessoas")
public class PessoaController {
    private PessoaFisicaService pessoaFisicaService;
    
    @GET
    public Viewable getPage(@Context HttpServletRequest request){
        pessoaFisicaService = new PessoaFisicaService();
        
        request.setAttribute("pessoas", pessoaFisicaService.listarpessoas());
        
        return new Viewable("/WEB-INF/jsp/pessoas.jsp");
    }
}
