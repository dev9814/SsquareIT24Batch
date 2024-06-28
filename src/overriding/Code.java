package overriding;

class Parent{
	
	public int add1(int a, int b)
	{
		System.out.println("This is part of Parent class");
		return a+b;
	}

	public int add(int a, char b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Child extends Parent{
	
	@Override
	public int add1(int a, int b)
	{
		System.out.println("This is part of child class");
		return a+b;
	}
}

class Child1 extends Parent{
	
	@Override
	public int add(int a, char b) 
	{
		return a+b;
	}
}

public class Code {

	public static void main(String[] args) {
		
		Parent c = new Child();
		
		System.out.println(c.add1(4, 5));
		
		Parent c1 = new Child1();
		
		System.out.println(c1.add(3, 'c'));

	}

}
