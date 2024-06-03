package arrays;

// Below in this file we have created a class Arr1 , 
// declaring and initializing array arr1 , arr2 , arr3 
// through array literal.

import java.lang.reflect.Array;

public class Arr1 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3};
		System.out.println("length-> "+ arr1.length);
		
		int arr2[] = {1,2,3,4};
		System.out.println("length-> "+ arr2.length);
		
		int[] arr3 = new int[5];
		System.out.println("length-> "+ arr3.length);
		
		try {
			arr3[5] = 4;
		}catch (Exception e) {
			System.out.println("error message-> "+ e.getMessage());
			System.out.println("error-> "+ e.getStackTrace());
		}
	}
}
