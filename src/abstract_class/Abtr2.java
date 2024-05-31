package abstract_class;

// In this Java file we have created an abstract class called Abtr
// we again extend the above class in class called Abtr1 but 
// we only implemented two methods in class Abtr1.
// Hence we have to declare Abtr1 as abstract.
// For total implementation we created a new public class Abtr2
// and than implemented the rest methods.

abstract class Abtr{
	
	// non-abstract method
	public void nonabsMethod()
	{
		System.out.println("non-abstract method");
	}
	
	// abstract methods
	public abstract int absMethod1();
	
	public abstract char absMethod2();
	
	public abstract String absMethod3();
	
}

abstract class Abtr1 extends Abtr{

	@Override
	public int absMethod1() {
		System.out.println("Abstract method integer ");
		return 0;
	}

	@Override
	public char absMethod2() {
		System.out.println("Abstract method character");
		return 0;
	}


	
	
	
}

public class Abtr2 extends Abtr1{
	
	@Override
	public String absMethod3() {
		System.out.println("Abstract method String");
		return null;
	}


	public static void main(String[] args) {
		
		Abtr2 ab = new Abtr2();
		
		ab.absMethod1();
		
		ab.absMethod2();
		
		ab.absMethod3();

	}


}
