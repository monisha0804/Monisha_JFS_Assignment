package com.example.demo;

public class UserAddress {

	private int zipcode;
	private String state;
	private String country;
	private String city;
	
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "UserAddress [zipcode=" + zipcode + ", state=" + state + ", country=" + country + ", city=" + city + "]";
	}
	public UserAddress(int zipcode, String state, String country, String city) {
		super();
		this.zipcode = zipcode;
		this.state = state;
		this.country = country;
		this.city = city;
	}

	
	
}
