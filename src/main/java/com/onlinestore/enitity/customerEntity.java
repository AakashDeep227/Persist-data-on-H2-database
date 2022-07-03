package com.onlinestore.enitity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class customerEntity
{
    @Id
    @GeneratedValue
    private int customerID;
    private String customerName;
    private String customerEmail;
    
    
    private int customerBillingAddress;//String
    private int customerShippingAddress;//String


	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

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

	public int getCustomerBillingAddress() {
		return customerBillingAddress;
	}

	public void setCustomerBillingAddress(int customerBillingAddress) {
		this.customerBillingAddress = customerBillingAddress;
	}

	public int getCustomerShippingAddress() {
		return customerShippingAddress;
	}

	public void setCustomerShippingAddress(int customerShippingAddress) {
		this.customerShippingAddress = customerShippingAddress;
	}
    
    

}
