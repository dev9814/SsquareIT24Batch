package exceptions;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
//		catch(Exception e) {
//			
//			System.out.println("I handled the code-> "+ e);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Arithmetic exception ->"+ e);
//		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Arithmetic exception ->"+ e);
		}
		finally {
			System.out.println("This block will execute every time");
		}

	}

}
//Arithmetic exception ->java.lang.ArithmeticException: / by zero