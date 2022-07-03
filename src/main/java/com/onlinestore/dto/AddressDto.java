package com.onlinestore.dto;

public class AddressDto 
{
	int doorno;
	String streetName;
	String layout;
	String city;
	int pincode;
	
	
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLayout() {
		return layout;
	}
	public void setLayout(String layout) {
		this.layout = layout;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return " [doorno=" + doorno + ", streetName=" + streetName + ", layout=" + layout + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}
	
	
	
	

}
