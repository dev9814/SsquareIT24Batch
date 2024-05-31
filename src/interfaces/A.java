package interfaces;

// Here we create a interface I1 and class A implements interface I1.

interface I1
{
	int number=1;
	// The above integer created is same as
	// final static int number=1;
	
	final static String name="Devdutt";
	
	// abstract methods
	public void method1();
	
	int method2();
	
	char method3();
	
	String method4();
}

public class A implements I1{

	@Override
	public void method1() {
		System.out.println("void method");
	}
	
	@Override
	public int method2() {
		System.out.println("int method");
		return 0;
	}

	@Override
	public char method3() {
		System.out.println("char method");
		return 0;
	}

	@Override
	public String method4() {
		System.out.println("String method");
		return null;
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.method1();
		a.method2();
		a.method3();
		a.method4();

	}

}
