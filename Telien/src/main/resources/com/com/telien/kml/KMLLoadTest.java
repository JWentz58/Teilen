package com.telien.kml;
import com.telien.kml.*;
import com.telien.user.User;
import com.telien.user.rest.UserManagementService;

public class KMLLoadTest {

	public static void main(String[] args) {
		/*
		String filePath = "C:\\Users\\Jacob\\workspace\\SENG691Z\\KML_Project\\Telien\\Test Data\\KMZ2.kmz";
		KMLLoader loader = new KMLLoader(filePath);
		String output = loader.loadFileFromDisk();
		System.out.println(output);
		KMLParser parser = new KMLParser(output);
		parser.loadPoints();
		*/
		UserManagementService ums = new UserManagementService();
		/*
		User jim = new User("JimBob","password","Jim","Bob","JimBob@gmail.com","304-612-1232","USER");
		User jim2 = new User("JimBob2","password","Jim","Bob","JimBob@gmail.com","304-612-1232","USER");
		User jim3 = new User("JimBob3","password","Jim","Bob","JimBob@gmail.com","304-612-1232","USER");
		*/
		String jimUUID = ums.addUser("JimBob","password","Jim","Bob","304-612-1232","JimBob@gmail.com");
		String jimJson = ums.getUser(jimUUID);
		System.out.println("jimJson="+jimJson);
		ums.updateUser(jimUUID,"JimBob","password","Jim","Bob","304-612-1232","JimBob2@gmail.com");
		jimJson = ums.getUser(jimUUID);
		System.out.println("jimJson="+jimJson);
		ums.deleteUser(jimUUID);
		jimJson = ums.getUser(jimUUID);
		System.out.println("jimJson="+jimJson);
		jimUUID = ums.addUser("JimBob","password","Jim","Bob","304-612-1232","JimBob@gmail.com");
		String jimUUID2 = ums.addUser("JimBob2","password2","Jim2","Bob2","304-612-1232","JimBob@gmail.com");
		String userData = ums.getAllUsers();
		System.out.println("all user data ="+userData);

		boolean login = ums.login("Fake", "fake");
		System.out.println("login:"+login);
		login = ums.login("JimBob", "password");
		System.out.println("login:"+login);
		
	}

}
