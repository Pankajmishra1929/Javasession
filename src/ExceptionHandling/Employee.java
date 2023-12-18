package ExceptionHandling;

public class Employee {

	public static void main(String[] args) {
	
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {// issue statement
		int i=9/0;
		}
		catch(ArithmeticException e ) {
			System.out.println("AE is comming");
			e.printStackTrace();
		}
		
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		
		
	}

}
