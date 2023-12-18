package CollectionsTopics;

import java.util.HashMap;;
public class HashMapConcept {
	

	public static void main(String[] args) {
		
		HashMap<Integer, String> userMap= new HashMap<Integer, String>();
		
		userMap.put(1, "Tom");
		userMap.put(2, "Naveen");
		userMap.put(null, "Naveen");
		userMap.put(null, "Rahul");
		userMap.put(3, "Naveen");
		userMap.put(2, "Naveen");
		
		System.out.println(userMap.get(1));// get to retrive the value
		
		HashMap <String, String> empMap= new HashMap<String, String>();
		
		empMap.put("Naveen", null); //
		empMap.put("Naveen", "QA");
		empMap.put("Rahul", null);
		empMap.put(null, "Rahul");
		empMap.put("Rahul", "QA");
		empMap.put(null, "Naveen");
		System.out.println(empMap.get("Naveen"));// get to retrieve the value
		System.out.println(empMap);// No order Maintain
		                           // duplicates are allowed but it maintain unique value for key not for value.
		                           // value can be same   
		
		
		
	
	}

}
