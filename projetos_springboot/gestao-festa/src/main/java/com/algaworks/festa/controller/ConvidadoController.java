package com.algaworks.festa.controller;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repository.Convidados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/convidados")
public class ConvidadoController {

    @Autowired
    private Convidados convidados;

    @GetMapping
    public ModelAndView listar() {

        ModelAndView modelAndView = new ModelAndView("listaConvidados");
        modelAndView.addObject("convidados", convidados.findAll());
        modelAndView.addObject(new Convidado());
        return modelAndView;
    }

    @PostMapping
    public String salvar(Convidado convidado) {
        this.convidados.save(convidado);
        return "redirect:/convidados";
    }
}
