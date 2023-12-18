package StringConcept;

public class StringManipulation {

	public static void main(String[] args) {
		String str="Hi This is my Java code and i am so happy";
		System.out.println(str.length());
		System.out.println("LI="+0);
		System.out.println("HI=" + (str.length()-1));
		System.out.println(str.charAt(0));
		
		//System.out.println(str.charAt(41));  // exception String out of boundexception
		//System.out.println(str.charAt(-1));  negative index not allowed in java SIOB
		
		System.out.println(str.indexOf("H"));
		
		System.out.println(str.indexOf("i"));//1st occurrence of i
		
		
		
		 

	}

}
