package type_casting;

public class Type_Casting_2 {
	
	public void add(int a , int b) {
		System.out.println("Used void add");
		System.out.println("add a and b->"+ (a+b));
	}
	
	
	public float addf(float a, float b) {
		System.out.println("Used float add");
		return a+b;
	}

	public static void main(String[] args) {
		
		short s1 = 10;
		short s2 = 20;
		
		Type_Casting_2 tc = new Type_Casting_2();
		
		tc.add(s1, s2);
		
		System.out.println(tc.addf(s1, s2));
	}
}
