package OOP_Inheritence;

public class Car extends Vechile {
  // Final Method can't be overridden
	// Final class: can not be a parent class
	// To prevent the method inheritance
	public void start() {
		System.out.println(" Car -----Start");
	}
	public void stop() {
		System.out.println(" Car -----Stop");
	}
	public void refuel() {
		System.out.println(" Car -----Refuel");
	}
	
	public static void billing() {
		System.out.println("Car billing----");
	}
	
	//@Override private method can't be overridden
	private void tyrePressure() {
		System.out.println("Car ---- tyre pressure");
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
