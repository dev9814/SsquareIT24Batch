package abstract_class;

// Here we have created an abstract class abs and created
// a child class which inherited the abstract class

 abstract class Abs{
	
	int number;
	
	static  char c='a';
	
	static final String name="Devdutt";
	
	// non-abstract method
	public void nonabsMethod1()
	{
		System.out.println("non-abstract method absm1");
	}
	
	public int nonabsMethod2()
	{
		System.out.println("non-abstarct method absm2");
		
		return 4;
	}
	
	public String nonabsMethod3()
	{
		System.out.println("non-abstract method absm3");
		
		return "Devdutt";
	}
	
	// static method
	public static char nonabsMethod4()
	{
		System.out.println("non-abstract method absm4");
		
		return 'd';
	}
	
	
	// abstract method
	public abstract void absMethod1();
	
	public abstract int absMethod2();
	
	public abstract String absMethod3();
	
//	public static abstract char absMethod4();
//	we cannot add static to abstract method.
	
	
	
}

public class Abs1 extends Abs{

	public static void main(String[] args)
	{
		
		//	Abs ab = new Abs();
		// Abs is a abstract class hence cannot create objects or 
		// cannot initiate 
		
		Abs1 ab = new Abs1();
		
		ab.absMethod3();
		
	}

	@Override
	public void absMethod1() {
		System.out.println("void abstratc method");
		
	}

	@Override
	public int absMethod2() {
		
		System.out.println("integer abstract method");
		
		return 0;
	}

	@Override
	public String absMethod3() {
		System.out.println("string abstract method");
		
		return null;
	}
	
}
