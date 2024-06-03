package exceptions;

public class Null_Exception {

	public static void main(String[] args) {
		
		try {
			String n = null;
			System.out.println(n.charAt(0));
		}
		catch(Exception e)
		{
			System.out.println("Null pointer exception");
			System.out.println("e-> "+ e);
		}
		finally {
			System.out.println("It will be executed");
		}

	}

}
