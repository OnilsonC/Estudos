
package com.estudoscx.spring.cx.controller;

import com.estudoscx.spring.cx.data.ProductData;
import com.estudoscx.spring.cx.facade.ProductFacade;
import com.estudoscx.spring.cx.form.ProductForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    private ProductFacade productFacade;
        
    @GetMapping
    public String getProducts(Model model){
        model.addAttribute("products", productFacade.getAllProducts());
            return "productPage";
    }
    
    @PostMapping("/create")
    public String create (ProductForm productForm, RedirectAttributes redirectAttributes) {
        if (productForm.getName().isEmpty()) {
           redirectAttributes.addFlashAttribute("error", "O nome é obrigatório");
                return "redirect:/products";
        }
                        
        productFacade.saveProduct(convert (productForm));
        redirectAttributes.addFlashAttribute("success", "Produto salvo com sucesso");
            return "redirect:/products";
    }
    
    @GetMapping(value = "/edit")
    public String editProduct(@RequestParam Integer code, Model model, RedirectAttributes redirectAttributes){
          ProductData product = productFacade.getProductByCode(code);
            if (product != null) {
            model.addAttribute("product", product);
                return "productEditPage";
        }
            redirectAttributes.addFlashAttribute("error", "Produto não encontrado");
                return "redirect:/products";
        }
    
    @PostMapping("/edit")
    public String edit (ProductForm productForm, RedirectAttributes redirectAttributes) {
        if (productForm.getName().isEmpty()) {
           redirectAttributes.addFlashAttribute("error", "O nome é obrigatório");
                return "redirect:/products";
        }
                        
        productFacade.saveProduct(convert (productForm));
        redirectAttributes.addFlashAttribute("success", "Produto salvo com sucesso");
            return "redirect:/products";
    }
           
    @PostMapping("/delete/{id}")
    public String delete (@PathVariable Integer id, Model model, RedirectAttributes redirectAttributes){
          try {
        productFacade.deleteProduct(id);
        redirectAttributes.addFlashAttribute("success", "Produto exluído com sucesso");
        } catch (Exception e) {
        redirectAttributes.addFlashAttribute("error", "Produto não excluído");
            
        }
        return "redirect:/products";
    }
    
    private ProductData convert (ProductForm form){
        ProductData data = new ProductData();
        data.setCode(form.getCode());
        data.setName(form.getName());
        data.setPrice(form.getPrice());
        data.setAvailableOnline(form.isAvailableOnline());
        
        return data;
    }
    
    
}
