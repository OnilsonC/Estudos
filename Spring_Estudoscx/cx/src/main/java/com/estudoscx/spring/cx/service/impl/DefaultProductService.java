
package com.estudoscx.spring.cx.service.impl;

import com.estudoscx.spring.cx.dao.ProductDao;
import com.estudoscx.spring.cx.models.ProductModel;
import com.estudoscx.spring.cx.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Component
public class DefaultProductService implements ProductService  {

    @Autowired
    private ProductDao productDao;
    
    @Override
    public List<ProductModel> getAllProducts() {
        return productDao.findAll();
    }

    @Override
    public void saveProduct(ProductModel productModel) {
        if (productModel != null) {
            productDao.save(productModel);
            
        }
    }

    @Override
    public ProductModel getProductByCode(Integer productCode) {
        if (productCode != null) {
            Optional<ProductModel> model = productDao.findById(productCode);
            return model.orElse(null);
        }
 
        return null;
    }

    @Override
    public void deleteProduct(Integer productCode) {
        productDao.deleteById(productCode);
    }

    
           
  
}
