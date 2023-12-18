package SuperThisKeyword;

public class Car {
	
	int speed = 100;
	
	public Car() {// default const...
		System.out.println("Car const....");
	}
	
	
	public Car(int a) {
		System.err.println("Car const......=" +a);
	}
	
	public Car(int a, int b) {
		System.err.println("Car const......="+ (a+b));
		}
	
	public void displayInfo() {
		System.out.println("Car info.....");
	}

}
