package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_Exception {

	public static void main(String[] args) {
		
		try {
			File file = new File("E://file.txt");
			FileReader fr = new FileReader(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist");
			System.out.println("e: "+ e);
		}
		finally {
			System.out.println("It will execute");
		}

	}

}
