
package com.estudoscx.spring.cx.facade.impl;

import com.estudoscx.spring.cx.data.ProductData;
import com.estudoscx.spring.cx.facade.ProductFacade;
import com.estudoscx.spring.cx.models.ProductModel;
import com.estudoscx.spring.cx.service.ProductService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DefaultProductFacade implements ProductFacade {

       
    @Autowired
    private ProductService productService;
    
    @Override
    public List<ProductData> getAllProducts() {
        List<ProductModel> productModels = productService.getAllProducts();
        List<ProductData> productDatas = new ArrayList<>();
        
        for (ProductModel product: productModels ) {
            ProductData data = convert(product, new ProductData());
            productDatas.add(data);
            
        }
        
        return productDatas;
    }

    @Override
    public void saveProduct(ProductData productModel) {
        
    }

    @Override
    public ProductData getProductByCode(Integer productCode) {
        return null;
    }

    @Override
    public void deleteProduct(Integer productCode) {
        
    }
    
    private ProductData convert (ProductModel source, ProductData target){
        target.setCode(source.getCode());
        target.setName(source.getName());
        target.setPrice("R$ " + source.getPrice());
        target.setAvailableOnline(source.isAvailableOnline());
        
        return target;
        
    }
        
    
    
}
