package javaSessionAug;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
	
		int i[]= new int[4];
		System.out.println(i.length);
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[4]=50;//AIOB
		//printing array list
		System.out.println(Arrays.toString(i));
		
		//using for loop we can write logic
	    for(int k=0; k<=i.length-1; k++) {
	    	System.out.println(i[k]);
	    	if (i[k]==20){
	    		System.out.println("We are at 2nd index");
	    		break;// it will break loop not if condition
	    	}
	    }
	    
		// default value store in Array as 0
	    int pop[] /* datatype*/ = new int[5];
	    pop[0]= 100;
	    pop[2]=200;
	    pop[4]=400;
	    System.out.println(Arrays.toString(pop));
	    

	}

}
