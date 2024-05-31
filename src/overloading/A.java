package overloading;

public class A {
	
	static int a=1;
	
	// 1
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	// 2
	public void add(String a , String b)
	{
		System.out.println(a+b);
	}
	
	//3
	public void add(char c, int a) {
		System.out.println(c+a);
	}
	
	// 4
	public void add(int a, char c)
	{
		System.out.println(c+a);
	}

	public static void main(String[] args) {
		
		A a = new A();
		
		a.add('a', 1); // 3
		
		a.add(2, 'f'); // 4
		
		
		a.add("dev", " dutta"); // 2
		
		//
		A.add(1 ,3);

	}

}
