package com.onlinestore.service;

import com.onlinestore.enitity.customerAddress;
import com.onlinestore.enitity.customerEntity;
import com.onlinestore.repository.customerAddressRepository;
import com.onlinestore.repository.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerAddressService
{
    @Autowired
    private customerAddressRepository repos;

    public customerAddress addCustomerAddress(customerAddress cust)
    {
        return repos.save(cust);
    }
    public customerAddress searchCustomerAddress(int customerID)
    {
        return repos.findById(customerID).orElse(null);
    }
    public String deleteCustomerAddress(int customerID)
    {
        repos.deleteById(customerID);
        return "Customer ID " + customerID + " is deleted";
    }
    public customerAddress updateCustomerAddress(customerAddress cust) {
        customerAddress existingCustomerAddress = repos.findById(cust.getAddressId()).orElse(null);
        existingCustomerAddress.setDoorno(cust.getDoorno());
        existingCustomerAddress.setStreetName(cust.getStreetName());
        existingCustomerAddress.setLayout(cust.getLayout());
        existingCustomerAddress.setCity(cust.getCity());
        existingCustomerAddress.setPincode((cust.getPincode()));
        return repos.save(existingCustomerAddress);
    }
}
