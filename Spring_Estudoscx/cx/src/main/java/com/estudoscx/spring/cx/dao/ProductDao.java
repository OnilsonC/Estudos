
package com.estudoscx.spring.cx.dao;


import com.estudoscx.spring.cx.models.ProductModel;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductDao extends CrudRepository<ProductModel, Integer> {
    
    List<ProductModel> findAll();
    
      
}
