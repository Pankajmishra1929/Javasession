package OOP_Inheritence;

public class TestCar {

	public static void main(String[] args) {
		BMW bm= new BMW();
		
		bm.start(); //override method
		
		bm.stop();// concept of re usability// Inherited
		bm.refuel();// inherited
	    bm.autoParking();//individual
	    
	    bm.engine();//overridden
	    // To access static method use class name 
	    BMW.billing();// In case BMW billing is not there it call the parent class billing method
	                  // Means static method can be inherited
	    
	    //Car class 
	    Car c= new Car();
	    c.engine();
	    c.start();
	    c.start();
	    
	    

	}

}
