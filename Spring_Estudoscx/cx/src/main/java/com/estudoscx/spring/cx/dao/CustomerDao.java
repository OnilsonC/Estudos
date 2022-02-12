
package com.estudoscx.spring.cx.dao;

import com.estudoscx.spring.cx.models.CustomerModel;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CustomerDao extends CrudRepository<CustomerModel, Integer> {
    
    List<CustomerModel> findAll();
        
  }
