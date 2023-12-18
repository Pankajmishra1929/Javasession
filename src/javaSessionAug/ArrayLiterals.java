package javaSessionAug;

public class ArrayLiterals {

	public static void main(String[] args) {
		//with new keyboard
		// when not sure about value
		//int i[]= new int[10];
		// Limitation of Array
//		1. fixed length
//		2. static array
		
		//Array literals
		// When already having values 
		// int array
		int num[]= {1,2,3,4,5,6};
		System.out.println(num.length);
//		
//		for (int e : num) {
//			System.out.println(e);
//		}

		// reverse order
		for (int r = num.length-1; r>=0; r--) {
			System.out.println(num[r]);
		}
	}

}
