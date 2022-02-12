
package com.estudoscx.spring.cx.service.impl;

import com.estudoscx.spring.cx.dao.CustomerDao;
import com.estudoscx.spring.cx.models.CustomerModel;
import com.estudoscx.spring.cx.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DefaultCustomerService implements CustomerService {
    
    @Autowired
    private CustomerDao customerDao;
    
    @Override
    public List<CustomerModel> getAllCustomer() {
        return customerDao.findAll();
        
     }

    @Override
    public void saveCustomer(CustomerModel customerModel) {
    }

    @Override
    public CustomerModel getCustomerByCode(Integer CustomerCode) {
        return null;
    }

    @Override
    public void deleteCustomer(Integer CustomerCode) {
    }
    
}
