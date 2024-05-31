package inheritance;

// This is an Example of multilevel inheritance where class A is 
// inherited by class B and class B is inherited by class Multilevel_Inheritance
// also classes are overriding methods of super classes


class A{
	
	private int age=4;
	
	float height = 5.8f;
	
	public void print_age()
	{
		System.out.println("Part of class A");
		System.out.println("age-> "+ age);
	}
	
	public void height()
	{
		System.out.println("Part of class A");
		System.out.println("height-> "+ height);
	}
	
}

class B extends A{
	
	int age = 7;
	private String name = "Devdutt";
	
	public void print_name()
	{
		System.out.println("Part of class B");
		System.out.println("Name-> "+name);
	}
	
	@Override
	public void print_age()
	{
		System.out.println("Part of class B");
		System.out.println("age-> "+age);
	}
	
}


public class Multilevel_Inheritance extends B{

	String name = "Dey";
	
	@Override
	public void print_name()
	{
		System.out.println("Part of class Multilevel");
		System.out.println("name-> "+ name);
	}
	
	public static void main(String[] args) {
		
		A obj1 = new Multilevel_Inheritance();
		
		obj1.height();
		obj1.print_age();
		
		
		System.out.println("----------------------------------");
		B obj2 = new Multilevel_Inheritance();
		
		obj2.height();
		obj2.print_age();
		obj2.print_name();
		
	}
}
