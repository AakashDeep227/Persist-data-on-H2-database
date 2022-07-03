package com.onlinestore.service;

import com.onlinestore.enitity.customerAddress;
import com.onlinestore.enitity.customerEntity;
import com.onlinestore.repository.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerService
{
    @Autowired
    private customerRepository repos;
    
    

    public customerEntity addCustomer(customerEntity cust)
    {
        return repos.save(cust);
    }
    
    
    
    public customerEntity searchCustomer(int customerID)
    {
        return repos.findById(customerID).orElse(null);
    }
    public String deleteCustomer(int customerID)
    {
        repos.deleteById(customerID);
        return "Customer ID " + customerID + " is deleted";
    }
    public customerEntity updateCustomer(customerEntity cust) {
        customerEntity existingCustomer = repos.findById(cust.getCustomerID()).orElse(null);
        existingCustomer.setCustomerName(cust.getCustomerName());
        existingCustomer.setCustomerEmail(cust.getCustomerEmail());
        existingCustomer.setCustomerBillingAddress(cust.getCustomerBillingAddress());
        existingCustomer.setCustomerShippingAddress(cust.getCustomerShippingAddress());
        return repos.save(existingCustomer);
    }


}
