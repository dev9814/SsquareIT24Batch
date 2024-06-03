package exceptions;

public class NumberFormat_Exception {

	public static void main(String[] args) {
		
		try{
			// "dev" is not a number
			String name = "dev";
			int num = Integer.parseInt(name);
			
			System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println("Number format exception");
			System.out.println("e-> "+ e);
		}
		finally {
			System.out.println("This block will always execute.");
		}

	}

}
