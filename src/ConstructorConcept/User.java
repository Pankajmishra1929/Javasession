package ConstructorConcept;

public class User {// Template class  no main method is there

	String name;
	String email;
	int userId;
	String dob;
	String city;
	
	
	// CReate user on basis of following criteria
			// Name
			// name, email
			// name, userId
			// name, email, dob
			// name, email, userId, dob, city
			// name, city
	        // need to define all above type of constructor
	
	public User(String name) {
		this.name = name;
	}


	public User(String name, String email /*or city*/) {
		this.name = name;
		this.email = email;
	}


	public User(String name, int userId) {
		//super();
		this.name = name;
		this.userId = userId;
	}


	public User(String name, String email, String dob) {
		//super();
		this.name = name;
		this.email = email;
		this.dob = dob;
	}


	public User(String name, String email, int userId, String dob, String city) {
		//super();
		this.name = name;
		this.email = email;
		this.userId = userId;
		this.dob = dob;
		this.city = city;
	}


//	    public User(String name, String city) {
//		//super();
//		this.name = name;
//		City = city;
//	}
	
	/*public static void main(String[] args) {
		
}*/

  public String[] getUserOrderDetails(String name) {
	  
	  if (name.equals("Avinash")) {
	  
	  String orderDetails[]= {"Laptop", "Mous", "USB Cable"};
      return orderDetails;
  }
	  else {
		  String orderDetails[]= {"Laptop", "Mous"};
	      return orderDetails;
	  }
  }
}
