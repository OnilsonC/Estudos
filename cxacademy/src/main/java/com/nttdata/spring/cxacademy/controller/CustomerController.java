package com.nttdata.spring.cxacademy.controller;


import com.nttdata.spring.cxacademy.facade.CustomerFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerFacade customerFacade;

    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerFacade.getAllCustomers());
        return "customerPage";

    }


}
