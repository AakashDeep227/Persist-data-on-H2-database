package com.onlinestore.dto;

public class CustomerDto 
{
	
	String customerName;
	String customerEmail;
	AddressDto customerBillingAddress;
	AddressDto customerShippingAddress;
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public AddressDto getCustomerBillingAddress() {
		return customerBillingAddress;
	}
	public void setCustomerBillingAddress(AddressDto customerBillingAddress) {
		this.customerBillingAddress = customerBillingAddress;
	}
	public AddressDto getCustomerShippingAddress() {
		return customerShippingAddress;
	}
	public void setCustomerShippingAddress(AddressDto customerShippingAddress) {
		this.customerShippingAddress = customerShippingAddress;
	}
	
	

}
