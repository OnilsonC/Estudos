package com.nttdata.spring.cxacademy.facade.impl;

import com.nttdata.spring.cxacademy.data.CustomerData;
import com.nttdata.spring.cxacademy.facade.CustomerFacade;
import com.nttdata.spring.cxacademy.model.CustomerModel;
import com.nttdata.spring.cxacademy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DefaultCustomerFacade implements CustomerFacade {

    @Autowired
    private CustomerService customerService;

    @Override
    public List<CustomerData> getAllCustomers() {
        List<CustomerModel> customerModels = customerService.getAllCustomers();
        List<CustomerData> customerDatas = new ArrayList<>();

        for (CustomerModel customer : customerModels) {
            CustomerData cdata = convert(customer, new CustomerData());
            customerDatas.add(cdata);
        }

        return customerDatas;
    }

    @Override
    public void saveCustomer(CustomerData customer) {

    }

    @Override
    public CustomerData getCustomerByCode(Integer customerCode) {
        return null;
    }

    @Override
    public void deleteCustomer(Integer customerCode) {

    }

    private CustomerData convert(CustomerModel source, CustomerData target) {
        target.setCode(source.getCode());
        target.setNome(source.getNome());
        target.setSobrenome(source.getSobrenome());
        target.setEmail(source.getEmail());
        target.setEndereco(source.getEndereco());
        target.setAvailableOnline(source.isAvailableOnline());
        return target;
    }


    }