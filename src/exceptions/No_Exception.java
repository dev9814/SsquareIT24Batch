package exceptions;

public class No_Exception {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/10);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception-> "+ e);
		}
		finally {
			System.out.println("This code will always execute");
		}

	}

}
