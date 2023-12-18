package StringConcept;

import java.util.Arrays;

public class ReverseString {
	
	//WAF to reverse string
	//Initialize String str
	
	public String stringReverse (String str) {
		//String str = "Hi i love Java";
		int len = str.length();
		System.out.println("Length of the String ="+ len);
		String revs = "";
		String [] strg= str.split(" ");
		System.out.println(Arrays.toString(strg));
		//System.out.println(strg[1]);
		int length= strg.length;
		System.out.println(length);
		
		String str2= "";
		for (int i =length-1; i>=0; i-- ) {
			
			str2= str2 + strg[i]+ " ";
			
			System.out.println(str2);
		}
		
		//return str2;
		
		for (int i = len-1; i>=0; i-- ) { // have to pass len-1. at length it give Array index out of bound exception
			revs=revs + str.charAt(i);
		     //System.out.println(revs);
		}
		return revs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rev= new ReverseString();
		//rev.stringReverse("Selenium");
		System.out.println(rev.stringReverse("Selenium Java i don't know "));
		
		//System.out.println(rev.stringReverse("I love Selenium"));
		//System.out.println(rev.stringReverse("i love java"));

	}

}
