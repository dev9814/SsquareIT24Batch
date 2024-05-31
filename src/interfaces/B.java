package interfaces;

// created class B and which implements interface I3 , 
// but because I3 also extends I2 the class B
// has to implement all the methods of interface I2 and I3.

public class B implements I3{

	public static void main(String[] args) {
		
		B b = new B();
		
		b.method1();
		b.method2();
		b.method3();
		b.method4();
		b.method5();
		
		System.out.println(b.number);
		System.out.println(b.name);

	}

	@Override
	public int method1() {
		System.out.println("int method1");
		return 0;
	}

	@Override
	public char method2() {
		System.out.println("int method2");
		return 0;
	}

	@Override
	public String method3() {
		System.out.println("int method3");
		return null;
	}

	@Override
	public int method4() {
		System.out.println("int method4");
		return 0;
	}

	@Override
	public String method5() {
		System.out.println("int method5");
		return null;
	}

}
