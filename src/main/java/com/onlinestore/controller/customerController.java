package com.onlinestore.controller;

import com.onlinestore.dto.CustomerDto;
import com.onlinestore.enitity.customerAddress;
import com.onlinestore.enitity.customerEntity;
import com.onlinestore.service.customerAddressService;
import com.onlinestore.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class customerController
{
    @Autowired
    private customerService service;
    

    @Autowired
    private customerAddressService Adservice;

    @PostMapping("/addCustomer")
    public customerEntity addCustomer(@RequestBody customerEntity cust)
    {
        return service.addCustomer(cust);

    }
    
    @PostMapping("/addCustomer1")
    public customerEntity addCustomer1(@RequestBody CustomerDto cust)
    {
    	customerEntity en = new customerEntity();
    	en.setCustomerName(cust.getCustomerName());
    	en.setCustomerEmail(cust.getCustomerEmail());
    	//en.setCustomerBillingAddress(cust.getCustomerBillingAddress().toString());
    	//en.setCustomerShippingAddress(cust.getCustomerShippingAddress().toString());
    	
    	customerAddress billing = new customerAddress();
    	billing.setCity(cust.getCustomerBillingAddress().getCity());
    	billing.setDoorno(cust.getCustomerBillingAddress().getDoorno());
    	billing.setLayout(cust.getCustomerBillingAddress().getLayout());
    	billing.setPincode(cust.getCustomerBillingAddress().getPincode());
    	billing.setStreetName(cust.getCustomerBillingAddress().getStreetName());
    	customerAddress updatedbilling = Adservice.addCustomerAddress(billing);
    	
    	customerAddress Shipping = new customerAddress();
    	Shipping.setCity(cust.getCustomerShippingAddress().getCity());
    	Shipping.setDoorno(cust.getCustomerShippingAddress().getDoorno());
    	Shipping.setLayout(cust.getCustomerShippingAddress().getLayout());
    	Shipping.setPincode(cust.getCustomerShippingAddress().getPincode());
    	Shipping.setStreetName(cust.getCustomerShippingAddress().getStreetName());
    	customerAddress updatedShipping = Adservice.addCustomerAddress(Shipping);
    	
    	en.setCustomerBillingAddress(updatedbilling.getAddressId());
    	en.setCustomerShippingAddress(updatedShipping.getAddressId());
    	//Billingaddress req --> CustomerAddress --> Database save(1)
    	//Shippingaddress req --> CustomerAddress --> Database save(2)
    	//CustomerData req --> CustomerEntity --> Datbase save
        return service.addCustomer(en);

    }

    @GetMapping("/searchcustomer/{id}")
    public customerEntity searchCustomer(@PathVariable int id)
    {
        return service.searchCustomer(id);
    }

    @DeleteMapping("/deletecustomer/{id}")
    public String deleteCustomer(@PathVariable int id)
    {
        return service.deleteCustomer(id);
    }

    @PutMapping("/updatecustomer")
    public customerEntity updatecustomer(@RequestBody customerEntity cust)
    {
        return service.updateCustomer(cust);
    }

}
