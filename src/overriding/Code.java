package overriding;

class Parent{
	
	public int add(int a, int b)
	{
		System.out.println("This is part of Parent class");
		return a+b;
	}
	
}

class Child extends Parent{
	
	@Override
	public int add(int a, int b)
	{
		System.out.println("This is part of child class");
		return a+b;
	}
}

public class Code {

	public static void main(String[] args) {
		
		Parent c = new Child();
		
		System.out.println(c.add(4, 5));

	}

}
