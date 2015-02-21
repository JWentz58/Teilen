package com.telien.user.rest;

import java.util.ArrayList;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.telien.user.User;

public class UserManagementService {

	//Mem Storage for Users
	ArrayList<User> systemUsers = new ArrayList();
	
	//Logger
	public UserManagementService(){
		//Adding System Admin User
		User admin = new User("System_Admin","AdminPassword","ADMIN");
		systemUsers.add(admin);
		System.out.println();
	}
	
	public String addUser(String username,String password,String firstname,
			String lastname, String phonenumber, String emailaddress){
    	User user = new User(username,password, firstname, lastname, emailaddress, phonenumber,"USER");
    	systemUsers.add(user);
    	System.out.println("**Added User to System**");
        return user.getUserUUID();
	}
	
	public boolean deleteUser(String userId){
		for(User u : systemUsers){
			if(u.getUserUUID().equals(userId)){
				systemUsers.remove(u);
		    	System.out.println("**Deleted User to System**");
				return true;
			}
		}
		return false;
	}
	
	public boolean updateUser(String userId,String username,String password,String firstname,
			String lastname, String phonenumber, String emailaddress){
		for(User u : systemUsers){
			if(u.getUserUUID().equals(userId)){
				systemUsers.remove(u);
		    	User updatedUser = new User(userId,username,password, firstname, 
		    			lastname, emailaddress, phonenumber,"USER");
		    	systemUsers.add(updatedUser);
		    	System.out.println("**Updated User to System**");
		    	return true;
			}
		}
		return false;
	}
	
	public String getUser(String userId){
		for(User u : systemUsers){
			if(u.getUserUUID().equals(userId)){
		    	System.out.println("**Fetched User from System**");
		    	return u.toJson();
			}
		}
		return "";
	}
	
	public boolean login(String username,String password){
		for(User u : systemUsers){
			if(u.getUserName().equals(username) && u.getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}
	
	public String getAllUsers(){
		String json="{\"users\":[";
		for(User u : systemUsers){
		    System.out.println("**Fetched User from System**");
		    	json+=u.toJson()+",";
		}
		json =json.substring(0, json.length()-1);
		json=json+"]}";
		return json;
	}
	
}
