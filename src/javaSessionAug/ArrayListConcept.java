package javaSessionAug;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arr = new ArrayList();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(true);
        arr.add(12.345);
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println(arr.get(0));
       
        // After defining specific type user can store only that type of value
        //IOB will through run time in case try to print apart from PC
		ArrayList<Integer> arr11 = new ArrayList<Integer>(20);
        arr11.add(100);
        arr11.add(300);
        System.out.println(arr11.size());
        System.out.println(arr11);
        System.out.println(arr11.get(1));
        
        //Want to store any kind of data in array list use concept of Object class
        
        ArrayList<Object> infoList= new ArrayList<Object>();
        infoList.add("Selenium");
        infoList.add("4.12.2");
        infoList.add(true);
        infoList.add('A');
        //PC=4, VC=6
        System.out.println(infoList);
	}

}
