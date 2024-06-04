package wrapper_classes;

import java.util.ArrayList;

public class Character_Class {

	public static void main(String[] args) {
		
		char ch = 'a';
		
		// Autoboxing - primitive to Character object
		// conversion
		Character a;
		
		Character b ;
		
		
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		String str = "Dev Dutta Dey";
		
		
		for(int i=0; i<str.length() ; i++) {
			
			if(str.charAt(i)==' ') {
				continue;
			}
			
			a = str.charAt(i);
			
			list.add(a);
		}
		
		
		for(int i=0 ; i<list.size() ; i++) {
			
			System.out.println(list.get(i));
		}
		
		
	}

}
