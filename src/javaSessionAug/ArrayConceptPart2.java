package javaSessionAug;

import java.util.Arrays;

public class ArrayConceptPart2 {

	public static void main(String[] args) {
		// We can define Array as byte, short, float, double, string
		
//		byte b[] = new byte[3];// 0 to 2
//		short sh[] = new short[5]; //0 to 4
//		double d[] = new double[5]; //0 to 4
		float marks[] = new float[3]; //0 to 2
		
		marks[0]= 12.33f;
		marks[1]= 23.33f;
		marks[2]= 100;
	System.out.println(Arrays.toString(marks));
	
    // default value of the string will be null
	String empName[]= new String[3];// 0 to 2
	
	System.out.println(empName.length); // length is the variable
	empName[0]= "Mahesh";
	empName[1]= "Kiran";
	empName[2]= "Rahul";
	System.out.println(Arrays.toString(empName));
	// index based loop
	for (int i=0; i<empName.length; i++) {
	     if(empName[i].equals("Mahesh"))
	     {
	    	 System.out.println("Promote to SDET 2");
	    	 //break;
	     }
	 } 
	
	// For each loop: enhanced for loop
	System.out.println("-------------");
	for (String e: empName) {
		System.out.println(e);
		if(e.equals("Rahul")) {
			System.out.println("Promote to SDET2");
		}
	}
	
	//Default value of character
	char ch[]= new char[5];
	System.out.println((byte)ch[0]);//'\u0000 or 0
	ch[0]='A';
	ch[1]='a';
	ch[2]='9';
	ch[4]='$';
	System.out.println(Arrays.toString(ch));
	// for each loop
	for (int e : ch) {
		System.out.println(e);
	}
	
	//empInfo : Name(String), age(int),salary(double),dob(string),isActive(boolean),gendar(char)
	
	// For different type of data type we use Object Array
	// Object is non primitive data type
	// Each non primitive data type store default value Null
	Object empInfo[]= new Object[6];
	System.out.println(Arrays.toString(empInfo));
	empInfo[0]= "Kiran";
	empInfo[1]= 30;
	empInfo[2]= 12.55;
	empInfo[3]= "15-08-1985";
	empInfo[4]= true;
	empInfo[5]= 'M';
	System.out.println(Arrays.toString(empInfo));
	
	//Index loop
	for(int e=0; e<empInfo.length; e++) {
		System.out.println(empInfo[e]);
	}
	
	for(int e=0; e<empInfo.length; e++) {
		System.out.println(e +" = "+ empInfo[e]);
	}
	
	System.out.println("For Each Loop ----");
	// For each loop
	//we can use index in for each loop also by creating our own index
	// internally it is using index
	int count=0;
	for (Object e :empInfo) {
		System.out.println(count +" = " + e);
		count++;
	}
	
    }
	

	}


