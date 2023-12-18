package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		
//		Employee e = new Employee();
//		
//		e.setName("Saheed");
//		e.setId(123);
//		e.setCity("Zakarta");
//		e.setPerm(true);
//		
//		System.out.println(e.getName());
//		System.out.println(e.getId());
//		System.out.println(e.getCity());
//		System.out.println(e.isPerm());
		
Employee e = new Employee("Naheed", 124, "Banglore", true);	
//Act as a setter Kind of Post, Put\Patch
System.out.println(e.getName()); //GET API Call
System.out.println(e.getId());
System.out.println(e.getCity());
System.out.println(e.isPerm());

//Use in update the information with setter
e.setName("Pradeep");
e.setId(198);
e.setCity("Pune");
e.setPerm(true);

System.out.println(e.getName());
System.out.println(e.getId());
System.out.println(e.getCity());
System.out.println(e.isPerm());
//CRUD- Create Retrive, Update and Delete

	}

}
