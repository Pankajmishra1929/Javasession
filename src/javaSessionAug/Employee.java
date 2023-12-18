package javaSessionAug;

public class Employee {
	String name;
	int id;
	String dept;
	boolean isPerm;
	double salary;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Employee e = new Employee(); // e- object referance, new Employee()- Object
		 e.name= "Rahul";
		 e.id=123;
		 e.dept= "QA";
		 e.isPerm= true;
		 e.salary= 12.55;
		 System.out.println(e.name);
		 System.out.println(e.id);
		 System.out.println(e.name + " " + e.id + " " + e.salary);
		 
		 //
		 Employee e1 = new Employee();
		 e1.name= "Disha";
		 e1.id=345;
		 e1.dept= "QA";
		 e1.isPerm= true;
		 e1.salary= 15.55;
		 System.out.println(e1.name);
		 System.out.println(e1.id);
		 
		 
		 Employee e2 = new Employee();
		 e2.name= "Disha";
		 e2.id=345;
		 e2.dept= "QA";
		 e2.isPerm= true;
		 e2.salary= 13.55;
		 System.out.println(e2.name);
		 System.out.println(e2.id);
		 
		 System.out.println("---------------");
		 e= e1;
		 System.out.println(e.name + " " + e.id + " " + e.salary);
		 
		 System.out.println("---------------");
		 e1=e2;
		 System.out.println(e.name + " " + e.id + " " + e.salary);
		 System.out.println(e1.name + " " + e1.id + " " + e1.salary);
		 System.out.println(e2.name + " " + e2.id + " " + e2.salary);
		 
		 
		 
	}

}
