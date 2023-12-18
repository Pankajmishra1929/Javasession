package OOP_Inheritence;

public class BMW extends Car{// tomake child class use extends keyword

	@Override // Good practice to write just to show
	
	// Method Override
	// When we have parent and child class
	//1. with the same method name
	//2. with the same number of parameter// with the same sequesnc
	//3. with the same return type
	public void start() {// Override method same method exist in Parent class
		System.out.println(" BMW -----Start");
	
		
	}
	
	public void autoParking() {// Individual
		System.out.println(" BMW -----autoParking");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW Engine----");
	}
	
	//@Override  Static method can't be override
	// it can be inherited
	// Named as Method hiding
	public static void billing() {
		System.out.println("BMW billing----");
	}
	
	private void tyrePressure() {
		System.out.println("BMW ---- tyre pressure");
	}
}
