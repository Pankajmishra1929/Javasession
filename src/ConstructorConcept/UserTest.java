package ConstructorConcept;

import java.util.Arrays;

import Testing.Customer;

public class UserTest {// caller class main method is defined here
	
    public static void main (String [] args){
	User u1= new User("Avinash");
	System.out.println(u1.name);
	User u2= new User("Avinash", 123);
	System.out.println(u2.name + " " + u2.userId);
	
	String avinashDetails[]=u1.getUserOrderDetails("Sanjay");
	
	System.out.println(Arrays.toString(avinashDetails));
	
	//User u1= new User();// this constructor not defined
	 
	// Can we call different a class of different package variable in another package
	
	// yes. Need to import the class
	
	Customer c1= new Customer("Sadex", 32, true);
	
	System.out.println(c1.name + " " + c1.age + " " + c1.isActive);
    }
}
