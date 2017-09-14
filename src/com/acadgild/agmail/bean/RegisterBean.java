package com.acadgild.agmail.bean;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
public class RegisterBean {

	@NotEmpty(message="Frist Name is mandatory.")
	private String firstName;
	@NotEmpty(message="Last Name is mandatory.")
	private String lastName;
	@NotEmpty(message="Password is mandatory.")
	private String password;
	@NotEmpty(message="Email is mandatory.")
	private String email;
	@Length(max=10,min=10,message="Mobile Number is not valid. Should be of length 10.")
	@NotEmpty(message="Mobile Number is mendatory.") @NumberFormat(style= Style.NUMBER)
	private String mobileNum;
	private String gender;
	@NotEmpty(message="Address is mandatory.")
	private String address;
	@NotEmpty(message="City is mandatory.")
	private String city;
	@NotEmpty(message="Pincode is mandatory.")
	private String pincode;
	@NotEmpty(message="State is mandatory.")
	private String state;
	@NotEmpty(message="Country is mandatory.")
	private String country;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
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
	
	
}
