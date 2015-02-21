package com.telien.user;

import java.util.UUID;

import com.google.gson.Gson;

public class User {
	
	
	private String userUUID;
	
	private String userName;
	private String password;
	
	//User Information
	private String firstName;
	private String lastName;
	
	//Contact Information
	private String emailAddress;
	private String phoneNumber;
	
	private String role;
	
	
	public User(String userName, String password, String firstName, 
			String lastName, String emailAddress, String phoneNumber, String role){
		this.userUUID = UUID.randomUUID().toString();
		this.userName=userName;
		this.password=password;
		this.lastName=lastName;
		this.emailAddress=emailAddress;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}
	
	public User(String userUUID, String userName, String password, String firstName, 
			String lastName, String emailAddress, String phoneNumber, String role){
		this.userUUID = userUUID;
		this.userName=userName;
		this.password=password;
		this.lastName=lastName;
		this.emailAddress=emailAddress;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}
	
	public User(String userName, String password, String role){
		this.userUUID = UUID.randomUUID().toString();
		this.userName=userName;
		this.password=password;
		this.role = role;
	}
	
	public String getUserUUID() {
		return userUUID;
	}

	public void setUserUUID(String userUUID) {
		this.userUUID = userUUID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public String toJson(){
		Gson gson = new Gson();
		String json = gson.toJson(this);
		return json;
	}

}
