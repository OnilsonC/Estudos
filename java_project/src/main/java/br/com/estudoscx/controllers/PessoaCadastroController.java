package br.com.estudoscx.controllers;


import br.com.estudoscx.data.CadastroForm;
import br.com.estudoscx.models.PessoaFisica;
import br.com.estudoscx.service.impl.PessoaFisicaService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("register")
public class PessoaCadastroController {
    
  
    private PessoaFisicaService pessoaFisicaService;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Viewable getPage() {
        return new Viewable("/WEB-INF/jsp/register.jsp");
    }

    @POST
    public Response register(@BeanParam CadastroForm cadastroForm, @Context HttpServletRequest request) throws URISyntaxException  {
        
        pessoaFisicaService = new PessoaFisicaService();  
        
    ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    Validator validator = validatorFactory.getValidator();
    Set<ConstraintViolation<CadastroForm>> constraintViolations = validator.validate(cadastroForm);
        
        if (!constraintViolations.isEmpty()) {
            final Map<String, String> errors = new HashMap<>();
            
            for (ConstraintViolation<CadastroForm> item: constraintViolations) {
                errors.put(item.getPropertyPath().toString(), item.getMessage());
            }
            
            request.setAttribute("cadastroFormErrors", errors);
            
            return Response.status(Response.Status.OK)
                    .entity(new Viewable("/WEB-INF/jsp/register.jsp"))
                    .type(MediaType.TEXT_HTML)
                    .build();  
                
            }
        
        
        PessoaFisica pessoaFisica = new PessoaFisica();
                
        String id = UUID.randomUUID().toString();      
        
        pessoaFisica.setId(id);
        pessoaFisica.setNome(cadastroForm.getNome());
        pessoaFisica.setSobrenome(cadastroForm.getSobrenome());
        pessoaFisica.setIdade(cadastroForm.getIdade());
        pessoaFisica.setEmail(cadastroForm.getEmail());
        
        pessoaFisicaService.criarPessoa(pessoaFisica);
        
        System.out.println(cadastroForm.getNome());

        return Response.seeOther(new URI("pessoas")).build();
    }

}
