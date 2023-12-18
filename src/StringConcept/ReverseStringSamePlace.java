package StringConcept;

//import java.util.Arrays;

public class ReverseStringSamePlace {
	
	//WAF to reverse string same place
	
	public static String stringReverse(String str) {
	
		String rev = "";
		String str2= "";
		int len=str.length();
		
		
		for (int i= len-1;i>=0; i--) {
			rev= rev+str.charAt(i);
		}
			String [] strg= rev.split(" ");
		    int length= strg.length;
		//System.out.println("Lenght of array string=" + length);
		
		
		for (int j =length-1; j>=0; j-- ) {
			
			str2= str2 + strg[j]+ " ";
			//System.out.println(str2);
		}
		return str2;
	}

	public static void main(String[] args) {
		
		System.out.println(stringReverse("Selenium with Java I Love"));
	  }
}