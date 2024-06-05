package wrapper_classes;

public class Wrapper_Class2 {

	public static void change(Integer a, Integer b) {
		Integer c = a;
		a = b;
		b = c;
			
		System.out.println("a and b "+ a + ' ' + b);
	}
	
	public static void main(String[] args) {
	
		Integer a = 11;
		Integer b = 44;
		
		System.out.println("a and b "+ a + ' ' + b);
		
		change(a,b);
		
		System.out.println("a and b "+ a + ' ' + b);

	}

}
