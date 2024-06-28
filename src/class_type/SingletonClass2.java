package class_type;

class Singleton2{
	
	private static Singleton2 instance;
	
	private Singleton2() {}
	
	public static synchronized Singleton2 getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton2();
		}
		
		return instance;
	}
	
}

public class SingletonClass2 {

	public static void main(String[] args) {
		
		Singleton2 singleton1 = Singleton2.getInstance();
		Singleton2 singleton2 = Singleton2.getInstance();
		
		System.out.println("Both objects are the same instance.");

	}

}
