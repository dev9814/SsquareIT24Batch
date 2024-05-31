package inheritance;

// This is the part of single inheritance when one class inherits
// other class

class Parent {
	
	private int age;
	private String name;
	
	public void set_age(int ag) {
		this.age = ag;
	}
	
	public void set_name(String nm) {
		this.name = nm;
	}
	
	public int get_age() {
		return age;
	}
	
	public String get_name() {
		return name;
	}
	
	public void method() {
		System.out.println("Parent class");
	}
	
}

public class Single_Inherits extends Parent{
	
	// overrides method
	@Override
	public void method()
	{
		System.out.println("Child class");
	}
	
	// overrides get_age
	@Override
	public int get_age()
	{
		System.out.println("Part of child class");
		return 0;
		
	}

	public static void main(String[] args) {
		
		Parent obj = new Single_Inherits();
		
		obj.method();
		
		System.out.println(obj.get_age());

	}

}
