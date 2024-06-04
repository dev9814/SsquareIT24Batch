package wrapper_classes;

public class Wrapper_Class {

	public static void main(String[] args) {
		
		byte a = 1;
		// wrapping around Byte object
		Byte byteobj = Byte.valueOf(a);
		
		int b = 10;
		// wrapping around Integer object
		Integer intobj = Integer.valueOf(b);
		
		float c = 18.6f;
		// wrapping around Float object
		Float floatobj = Float.valueOf(c);
		
		double d = 250.5;
		// wrapping around Double object
		Double doubleobj = Double.valueOf(d);
		
		char e = 'a';
		// wrapping around Character object
		Character charobj = Character.valueOf(e);
		
		System.out.println("Values of wrapper objects (printing as objects)");
		
		System.out.println("\nByte object byteobj: "+ byteobj);

		System.out.println("\nInteger object intobj: "+ intobj);
		
		System.out.println("\nFloat object floatobj: "+ floatobj);

		System.out.println("\nDouble object doubleobj: "+ doubleobj);
		
		System.out.println("\nCharacter object charobj: "+ charobj);
		
/////////////////////////////////////////////////////////////////
		
		byte bv = byteobj;
		int iv = intobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;
		
		System.out.println("------------------------------------");
		System.out.println("\nValues of primitive ");
		
		System.out.println("\nPrimitive Byte: "+ bv);
		
		System.out.println("\nPrimitive int: "+ iv);
		
		System.out.println("\nPrimitive float: "+ fv);
		
		System.out.println("\nPrimitive double: "+ dv);
		
		System.out.println("\nPrimitive char: "+ cv);
		
		
	}

}
