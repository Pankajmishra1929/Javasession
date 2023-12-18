package javaSessionAug;

public class LoopsConcept {

	public static void main(String[] args) {
		//While loop
//		int i=1;
//		while(i<=100)
//		{
//			//break;// become unreachable code
//			System.out.println(i);//1,2,3
//			//i++;
//			i=i+2;
//		    //i=i+3;
//			break;
//		}
//		
//		int j=1;
//		while(j<=50) 
//		{
//		  System.out.println(j);
//		  if(j%5==0)  // modulus compare the remainder of the division
//		  {
//			  System.out.println("Hi");
//			  break;
//		  }
//		  j++;
//		}
//		
//		for(float c=1.1f; c<=5.5; c++) {
//			System.out.println(c);
//		}
		
		// Character a-z
		// print with ASCII value
		for(char ch= 'a'; ch<'z'; ch++) {
			System.out.println(ch +" = " +(byte)ch); 
		
		   }
		
		System.out.println("----------");
		//Break Statement
		for(int n=1; n<=50; n++) {
			System.out.println(n);
			if(n%5==0) {
				System.out.println("Bye");
				break;
			}
			//break;
		}
		// Infinite loop ;; in case break is not there
		for(;;) {
			System.out.println("Welcome to Selenium");
			break;
		}
		System.out.println("----------");
		// to print even and odd number from 1 to 100
		for (int n =1; n<=100; n++) {
			//System.out.println(n);
			if(n%2==0) {
				System.out.println("Even number="+n);
	
		}
			else {
				System.out.println("Odd Number="+n);
			}
		}
		System.out.println("----------");
		// do while loop
		// do give chance to execute statement first then it check condition
		int s=0;
		do {
			s++;
			System.out.println(s);
		}
		while (s<=1);
	
		// true or false in while loop
		System.out.println("----------");
		boolean flag = false;
		while(flag) {
			System.out.println("test boolean value");
			break;
		}
		// reverse of string program
	}
		
}


