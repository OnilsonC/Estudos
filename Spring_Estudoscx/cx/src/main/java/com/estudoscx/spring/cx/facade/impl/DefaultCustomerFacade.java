
package com.estudoscx.spring.cx.facade.impl;

import com.estudoscx.spring.cx.data.CustomerData;
import com.estudoscx.spring.cx.facade.CustomerFacade;
import com.estudoscx.spring.cx.models.CustomerModel;
import com.estudoscx.spring.cx.service.CustomerService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DefaultCustomerFacade implements CustomerFacade {

    @Autowired
    private CustomerService customerService;
   
    @Override
    public List<CustomerData> getAllCustomer() {
        List<CustomerModel> customerModels = customerService.getAllCustomer();
        List<CustomerData> customerDatas = new ArrayList<>();
        
        for (CustomerModel customer: customerModels) {
          CustomerData data = convert(customer, new CustomerData());
          customerDatas.add(data);
        }
        return customerDatas;
    }

    @Override
    public void saveCustomer(CustomerData customerData) {
        
    }

    @Override
    public CustomerData getCustomerByCode(Integer CustomerCode) {
        return null;
    }

    @Override
    public void deleteCustomer(Integer CustomerCode) {
        
    }
    
     private CustomerData convert(CustomerModel source, CustomerData target){
         target.setCode(source.getCode());
         target.setName(source.getName());
         target.setLastName(source.getLastName());
         target.setEmail(source.getEmail());
         target.setAddress(source.getAddress());
         
         return target;
     }
    

       
}
