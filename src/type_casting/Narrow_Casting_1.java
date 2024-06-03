package type_casting;

public class Narrow_Casting_1 {

	public static void main(String[] args) {
		
		double d = 100.333;
		
		long l = (long)d;
		
		int i = (int)l;
		
		System.out.println("Before conversion: "+ d);
		
		System.out.println("After conversion into long type: "+ l);
		
		System.out.println("After conversion into int type: "+ i);	
	}	
}
