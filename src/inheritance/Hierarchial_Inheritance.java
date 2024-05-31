package inheritance;

// This is a part of Hierarchial Inheritance 
// Parents class is a super class.
// Child1, Child2 and Child3 are inheriting features of its SuperClass
// classes inheriting are overriding method of Parents class.

class Parents{
	
	int age = 7;
	
	public void print_age() {
		System.out.println("Part of Parent class");
		System.out.println("age-> "+ age);
	}
}

class Child1 extends Parents{
	
	int age = 1;
	
	@Override
	public void print_age() {
		System.out.println("Part of child1 class");
		System.out.println("age-> "+ age);
	}
	
}

class Child2 extends Parents{
	
	int age = 2;
	
	@Override
	public void print_age() {
		System.out.println("Part of child2 class");
		System.out.println("age-> "+ age);
	}
	
}

class Child3 extends Parents{
	
	int age = 3;
	
	@Override
	public void print_age() {
		System.out.println("Part of child3 class");
		System.out.println("age-> "+ age);
	}
	
}

public class Hierarchial_Inheritance {

	public static void main(String[] args)
	{
		
		Parents obj1 = new Child1();
		obj1.print_age();	
		
		Parents obj2 = new Child2();
		obj2.print_age();
		
		Parents obj3 = new Child3();
		obj3.print_age();
		
	}	
}
