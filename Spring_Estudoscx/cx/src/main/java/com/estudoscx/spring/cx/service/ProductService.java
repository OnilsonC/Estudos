
package com.estudoscx.spring.cx.service;

import com.estudoscx.spring.cx.models.ProductModel;
import java.util.List;


public interface ProductService {
    
   
    List<ProductModel> getAllProducts();
    
   
    void saveProduct(ProductModel productModel);
    
    
    ProductModel getProductByCode (Integer productCode);
    
    
    void deleteProduct(Integer productCode);
    
}
