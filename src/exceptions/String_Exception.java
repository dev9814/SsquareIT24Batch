package exceptions;

public class String_Exception{
	
	public static void main(String[] args) {
		
		try {
			String name = "Dev Dutta Dey";
			char c = name.charAt(50);
		}
		catch(Exception e)
		{
			System.out.println("String index out of bound exception");
			System.out.println("e-> "+ e);
		}
		finally {
			System.out.println("It will be executed");
		}
		
	}
	
}