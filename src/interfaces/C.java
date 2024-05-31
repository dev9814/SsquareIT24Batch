package interfaces;

// normally in Java we cannot have multiple inheritance but
// with the help of interface we can apply multiple inheritance.

public class C implements I4, I5{

	public void method1()
	{
		System.out.println("void method1 from I4");
	}
	
	public int method2()
	{
		System.out.println("int method2 from I4");
		
		return 4;
	}
	
	public char method3()
	{
		System.out.println("char method3 from I5");
		
		return 'd';
	}
	
	public String method4()
	{
		System.out.println("String method4 from I5");
		
		return "Devdutt";
	}
	
	public static void main(String[] args) {
		
		C obj = new C();
		
		obj.method1();
		
		obj.method2();
		
		obj.method3();
		
		obj.method4();

	}
}
