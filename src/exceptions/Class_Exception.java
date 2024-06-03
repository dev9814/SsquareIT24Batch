package exceptions;

public class Class_Exception {

	public static void main(String[] args) {
		
		try{
			Class.forName("Class1"); // class1 is not defined
			
		}catch(Exception e)
		{
			System.out.println("Class Not Found....");
			System.out.println(e);
		}
		finally {
			System.out.println("This block of code will work.");
		}

	}

}
