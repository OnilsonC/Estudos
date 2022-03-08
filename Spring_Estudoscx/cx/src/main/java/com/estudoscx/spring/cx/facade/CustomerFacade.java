
package com.estudoscx.spring.cx.facade;

import com.estudoscx.spring.cx.data.CustomerData;
import java.util.List;


public interface CustomerFacade {
    
    List<CustomerData> getAllCustomer();
    
    void saveCustomer (CustomerData customerData);
    
    CustomerData getCustomerByCode (Integer CustomerCode);
    
    void deleteCustomer (Integer CustomerCode);
    
}
