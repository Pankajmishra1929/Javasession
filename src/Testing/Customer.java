package Testing;

public class Customer {
	
	public String name;//once public it can be access by other package class
	public int age;
	public boolean isActive;


	public Customer(String name, int age, boolean isActive) {
		//super();
		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}


	
}
