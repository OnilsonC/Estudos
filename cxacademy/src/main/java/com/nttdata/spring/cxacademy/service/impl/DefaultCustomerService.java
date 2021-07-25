package com.nttdata.spring.cxacademy.service.impl;

import com.nttdata.spring.cxacademy.dao.CustomerDao;
import com.nttdata.spring.cxacademy.model.CustomerModel;
import com.nttdata.spring.cxacademy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultCustomerService implements CustomerService {


    private CustomerDao customerDao;

    @Autowired
    public DefaultCustomerService(CustomerDao customerDao){
        this.customerDao = customerDao;

    }

    @Override
    public List<CustomerModel> getAllCustomers() {
        return customerDao.findAll();
    }

    @Override
    public void saveCustomer(CustomerModel customer) {

    }

    @Override
    public CustomerModel getCustomerByCode(Integer customerCode) {
        return null;
    }

    @Override
    public void deleteCustomer(Integer customerCode) {

    }
}
