
package com.estudoscx.spring.cx.facade;

import com.estudoscx.spring.cx.data.ProductData;
import java.util.List;


public interface ProductFacade {
    
    List<ProductData> getAllProducts();
    
   
    void saveProduct(ProductData productModel);
    
    
    ProductData getProductByCode (Integer productCode);
    
    
    void deleteProduct(Integer productCode);
    
}
