package StringConcept;

import java.util.Arrays;

	public class ReverseStringSplit {
		
		//WAF to reverse string
		//Initialize String str
		
		public static String stringReverse (String str) {
			//String str = "Hi i love Java";
			int len = str.length();
			System.out.println("Length of the String ="+ len);
			String [] strg= str.split(" ");
			System.out.println(Arrays.toString(strg));
			//System.out.println(strg[1]);
			int length= strg.length;
			System.out.println("Lenght of array string=" + length);
			
			String str2= "";
			for (int i =length-1; i>=0; i-- ) {
				
				str2= str2 + strg[i]+ " ";
				//System.out.println(str2);
			}
			
			return str2;
		}
			
			
		public static void main(String[] args) {
			
			System.out.println(stringReverse("Selenium Java i don't know "));
			
			//System.out.println(rev.stringReverse("I love Selenium"));
			//System.out.println(rev.stringReverse("i love java"));

		}

	}



