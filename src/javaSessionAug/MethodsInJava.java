package javaSessionAug;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsInJava {
	
	//Variables
	String name;
	
	//1.No input and No return
	// void can't return any value
	public void test() {
		System.out.println("test method----");
	}
	
	//2. No Input but some Return
	public int getInfo() {
		int a=10;
		int b=20;
		int c=a+b;
		//System.out.println(c);
		return c;
	}
	
		
	//3. Return type String
	public String getName() {
		System.out.println("Get name method----");
		String name= "Shreya";
		return name;
		//System.out.println(c);
	}
	
	// Can we return multiple value Method?
	//Nooo
	public ArrayList<String> getEmpNames() {
		System.out.println("Get Employee names method----");
		String em1= "Tushar";
		String em2= "Sachin";
		
		ArrayList<String> empList= new ArrayList<String>();
		empList.add(em1);
		empList.add(em2);
		return empList;}
	//Static Array to define store multiple value
		public String[] getEmployee(){
			String emp [] = {"Shyam", "Jagdeesh"};
			return emp;
		}
		
	// Some input some return
		public int sum(int a, int b) {
			System.out.println("Sum Method");
			int total= a+b;
			return total;
		}
		
	// Restaurant bill to calculate we can pass multiple data type
		public float getBillAmount(int foodBill, int drinkBill, float tax) {
			float totalBill= foodBill+drinkBill+tax;
			return totalBill;
		}
//		String em3= em1 + " " + em2;
//		System.out.println(em3);
//		return em3;
	
	
	public static void main(String[] args) {
		
		MethodsInJava obj = new  MethodsInJava();
		obj.name= "Tom";
		obj.test();
		
		System.out.println(obj.name);
		int s= obj.getInfo();
		System.out.println(s+20-10);
		
		String n1=obj.getName();
		System.out.println(n1 +" Automation lab");
		
		ArrayList<String> eList= obj.getEmpNames();
		System.out.println(eList.size());
		System.out.println(eList);
		
		String employee []= obj.getEmployee();
		System.out.println(employee.length);
		System.out.println(Arrays.toString(employee));
		
		int sumTotal = obj.sum(2,5); // argument/value;
		System.out.println(sumTotal);
		
		float finalBill= obj.getBillAmount(10, 25, 5.5f); 
		System.out.println("get the bill amount" + "= "+ (finalBill-20));
		
	}

}
