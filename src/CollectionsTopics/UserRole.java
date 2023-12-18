package CollectionsTopics;

import java.util.Arrays;
import java.util.HashMap;

public class UserRole {
	
	public static String getUserCredentials(String role) {
	
	HashMap <String, String> userMap= new HashMap<String, String>();
	userMap.put("admin", "admin:@admin123");
	userMap.put("seller", "seller:@seller123");
	userMap.put("vendor", "vendor:@vendor23");
	userMap.put("manager","manager:@manager123");
	
    //return.getUserCredentials(role);
	return userMap.get(role);
	
	
	}
	
	public static void doLogin(String un, String pwd) {
		System.out.println("Login with:" + " " + un + ":" + "pwd");
	}

	
	
	public static void main(String[] args) {
		String credData= getUserCredentials("manager");
		System.out.println(credData);
		String userCred[]=credData.split(";");
		System.out.println(Arrays.toString(userCred));
		 
		//System.out.println(userCred[0]);
		
		String userName = credData.split(":")[0];
		
		String password= credData.split(":")[1];
		
		doLogin(userName, password);
		

	}

}
