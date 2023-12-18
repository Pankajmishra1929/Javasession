package SuperThisKeyword;

public class BMW extends Car {
 
	
   int speed = 200;
  
   public BMW() {
	   // super(10);// by super we able to access the constructed which we want
	    // it will always be the first line statement
	    
	    super(10,20);// two super keyword not allowed
		System.out.println("BMW const....");
	}
	
//	public BMW(int a) {
//		System.out.println("BMW const......=" +a);
//	}
//	
//	public BMW(int a, int b) {
//		System.out.println("BMW const......="+ a+b);
//		}
   
    @Override
	public void displayInfo() {
		System.out.println("BMW info.....");
	}
   
	
	public void displayBMWInfo() {
		System.out.println("BMW info.....");
		System.out.println(speed);//bmw class
		// to access car class spped use super keyword
		System.out.println(super.speed);// car class
		
		displayInfo();// bmw info
		
		super.displayInfo();// car info
		
		
		
		
	}

}
