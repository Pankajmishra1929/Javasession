package ConstructorConcept;

public class Employee {

	String name;
	int id;
	double salary;
	
	// Constructor have same name as class name
    // Constructor can overload
	//const.. will be called once initialized object
	// no return type;
	// restrict to create unnecessary object
//	public Employee() {// 0 Parameter
//		System.out.println("default const.....");
//		
//	}
//	
//	public Employee(int a) {// 1 param
//		System.out.println("1 param const......");
//		
//	
//	}
	
	public Employee(String name) {
	this.name= name; // to call class name global variable use this keyboard in local
	}
	
	public Employee(String name, int id) {
		this.name= name; // to call class name global variable use this keyboard in local
		this.id=id;
		}
	
	public Employee(String name, int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public void test() {
		System.out.println("test method......");
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Tom");// once create the object const.. will be called
		System.out.println(e1.name);// we assign "Tom" to name but it is printing Null default value.
		
		
		//Employee e2= new Employee("Employee Name"); // Const.. stop crating unnecessary object
		
		Employee e2= new Employee("Kiran", 123);
		e2.salary=12.897;
		System.out.println(e2.name + " " + e2.id + " " + e2.salary);
		
		//Employee e4= new Employee("Kiran", 123, 34.45, "DHSFJ");// We can't defined the object which are not matched with constructor.
		//System.out.println(e4.name + " " + e4.id + " " + e4.salary);
		
		
		
		Employee e3= new Employee("Jhon", 123, 12.98);
		System.out.println(e3.name + " " + e3.id + " " + e3.salary);
		
	}

}
