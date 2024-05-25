package inheritance;

public class Derived_Class extends Base_Class{

	@Override
	public void show()
	{
		System.out.println("show derived class");
	}
	
	public static void main(String[] args) {
		
		
		Base_Class obj = new Derived_Class();
		
		obj.show();

	}

}
