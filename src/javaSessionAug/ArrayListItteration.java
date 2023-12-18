package javaSessionAug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListItteration {

	public static void main(String[] args) {
		
		ArrayList<Integer> numList= new ArrayList();
		numList.add(100);//0
		numList.add(200);//1
		numList.add(300);//2
		numList.add(400);//3
		numList.add(500);//4
		System.out.println(numList);
		
		//iterate the ArrayList using for Loop
		
		for (int i =0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		
		// For each loop
		System.out.println("----------");
		for(Integer e : numList) {
			System.out.println(e);
		}
		
		
        // Can't escape segment between two Array List. Index memory allocation
		ArrayList<String> studentList= new ArrayList<String>();
		studentList.add("Rahul");//0
		studentList.add("Amit");//1
		studentList.add("Roshan");//2
        
		//studentList.add(4, "Sreyansh"); // IOB
		System.out.println(studentList);
		
		// Replace the value of 0th index and 0 the index value shifted to Right
		System.out.println("-----------------");
		ArrayList<String> studentList11= new ArrayList<String>();
		studentList11.add("Rahul");//0
		studentList11.add("Amit");//1
		studentList11.add("Roshan");//2
		System.out.println(studentList11);
        
		studentList.add(0, "Sreyansh"); // Replace the value of 0th index and 0 the index value shifted to Right
		System.out.println(studentList);
		System.out.println(studentList.get(0));
		
		// to replace the value use set
		System.out.println("-----------------");
		studentList11.set(1, "Pooja");
		System.out.println(studentList11);
		
		//to Reverse the string
		//use of asList method
		System.out.println("-----------------");
		ArrayList<String> studentName= new ArrayList<String>(Arrays.asList("Varun" , "Pooja", "Peter"));
	    System.out.println(studentName);
	    System.out.println(studentName.size());
	    for(int st=studentName.size()-1; st>=0; st--) {
	    	System.out.println(studentName.get(st));
	     }
	    
	    System.out.println("-----------------");
	    Collections.reverse(studentName);
	    System.out.println(studentName);
	    	
		//Sublist method to create the list out of Main list
	    System.out.println("-----------------");
	    ArrayList<String> portion = new ArrayList<String>(studentName.subList(1,3));
	    System.out.println(portion);
		
	    // to print the string in the format as like 0= RED---
	    ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at index " + i + " is " + colors.get(i));
        }
        
        //For each loop
        // use counter for increase
        int counter=0;
        for ( String e : colors) {
        	System.out.println(counter + " = " +e);
        	counter++;
        }
	}

}
