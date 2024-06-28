package class_type;

class Singleton1{
	
	private static final Singleton1 instance = new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return instance;
	}
	
}

public class SingletonClass1 {

	public static void main(String[] args) {
		
		Singleton1 singleton1 = Singleton1.getInstance();
		Singleton1 singleton2 = Singleton1.getInstance();			
				
		if(singleton1 == singleton2)
		{
			System.out.println("Both objects are the same instance.");
		}
		
		

	}

}
