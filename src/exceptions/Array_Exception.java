package exceptions;

public class Array_Exception {

	public static void main(String[] args) {
	
		int[] a = new int[2];
		
		try {
			a[2] = 3;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of index-> "+ e);
		}
		finally {
			System.out.println("This block will execute every time.");
		}

	}

}
