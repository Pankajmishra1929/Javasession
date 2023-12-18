package javaSessionAug;

public class callByRef {
	
	public static void sendMail(callByRef ref) {
		System.out.println("Send mail method----");
		//callByRef obj = new callByRef();// call by creating a object inside the method.

		                               // in case multiple method are there need to create multiple objects  
                                       // That reason call by reference come into picture 		
		//obj.readMail();
		ref.readMail();		
	}
	
	public void readMail() {
		System.out.println("Read mail method---");
		//callByRef obj=new callByRef();
		//callByRef.sendMail(ref);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		callByRef obj = new callByRef();
		obj.readMail();
		callByRef.sendMail(obj);
		
		
		

	}

}
