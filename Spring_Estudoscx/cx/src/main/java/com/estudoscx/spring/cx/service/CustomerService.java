
package com.estudoscx.spring.cx.service;

import com.estudoscx.spring.cx.models.CustomerModel;
import java.util.List;



public interface CustomerService {
    
    List<CustomerModel> getAllCustomer();
    
    void saveCustomer (CustomerModel customerModel);
    
    CustomerModel getCustomerByCode (Integer CustomerCode);
    
    void deleteCustomer (Integer CustomerCode);
    
}
