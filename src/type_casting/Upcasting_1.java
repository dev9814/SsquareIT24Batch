package type_casting;

class Animal{
	
	String name;
	
	public void nature(){
		System.out.println("Animal");
	}
}

class Fish extends Animal{
	
	String color;
	
	@Override
	public void nature() {
		System.out.println("Aquatic Animal");
	}
	
}

public class Upcasting_1 {

	public static void main(String[] args) {
		
		Animal a = new Fish();
		
		a.name = "GoldFish";
		
//		a.color();
//		The object 'a' has access to only to the parent's properties.
//      That is, the color property.
//		It will throw a compile time error.
		
		Fish f = new Fish();
		
		f.name = "Whale";
		f.color = "Blue";
		
		// Printing the 'a' properties
		System.out.println("Object a");
		System.out.println("Name: "+ a.name);
		
		a.nature();
		
		System.out.println("------------------------------");
		
		System.out.println("Object f");
		System.out.println("Name: "+ f.name);
		System.out.println("Color: "+ f.color);
		f.nature();	
	}
}
