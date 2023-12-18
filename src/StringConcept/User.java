package StringConcept;

public class User {

	public static void main(String[] args) {
		
		// using literals
		String s2= "Hello";
		
	   //Using new keyword
		String s1 = new String("Hello"); // 2 -heap, scp
		//System.out.println();
		
		String s3= "Hello";// 0
		String s4= new String("Hello");// 1-heap as another Hello already present in scp
		
		System.out.println(s1==s3);// false It compare the memory not the value
		
		System.out.println(s1.equals(s3)); // true  Always use .equal to compare the string
		
		System.out.println(s1==s4);// false
		System.out.println(s1.equals(s4));// true
		
		String s5= "Hello";// 0
		System.out.println(s3==s5); // true
		
		String s6= "hello";// 1 scp as hello is different from Hello
		
		String s7 = new String ("Joy");// 2-heap,1 scp
		
		String s8= s7.intern();// intern method returns reference inside the scp.Start pointing to the value in scp. Now s8 pointing to Joy 
		System.out.println(s7.equals(s8));// true
		String s9 = "Hello"; 
		System.err.println(s9);
		
		StringBuilder sb = new StringBuilder(); 

	}

}
