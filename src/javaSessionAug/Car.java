package javaSessionAug;

public class Car {

	
	String name;
	int price;
	String chaisNumber;
	final static int wheels=4;// Static means common value for all the object.
	                  //Static can't declare as local variable
	                  // static value can changed
	                  //Final means constraint value can't change  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1= new Car();
		c1.name = "BMW";
		c1.price=25;
		c1.chaisNumber="3245341226816";
		//c1.wheels=4;// Once define static access as like static
		//Car.wheels=4;
		System.out.println(c1.name +" " + c1.chaisNumber+" " + c1.price+ " " + Car.wheels);
		
		Car c2= new Car();
		c2.name = "ODD";
		c2.price=50;
		c2.chaisNumber="3GFDH245341226816";
		//c2.wheels=4;
		//Car.wheels=5;
		System.out.println(c2.name +" " + c2.chaisNumber+" " + c2.price+ " " + Car.wheels);
		
		Car c3= new Car();
		c3.name = "HONDA";
		c3.price=15;
		c3.chaisNumber="3ASDGFDH245341226816";
		//c3.wheels=4;
		//Car.wheels=7;
		System.out.println(c3.name +" " + c3.chaisNumber+" " + c3.price+ " " + Car.wheels);
		

	}

}
