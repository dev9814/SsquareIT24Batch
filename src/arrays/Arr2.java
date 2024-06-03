package arrays;

// Here we created a class called student , and than creating array
// of class Student so that we can store objects of Student.
// In below code the std array of type Student , behaves similarly 
// like int , String and other primitive class.

class Student{
	
	private int roll;
	private String name;
	
	Student(int roll , String name){
		this.roll = roll;
		this.name = name;
	}
	
	public int get_roll() {
		return roll;
	}
	
	
	public String get_name() {
		return name;
	}
	
	// Here we override toString method of Class String.
	@Override
	public String toString() {
		return name;
		
	}
}

public class Arr2 {

	public static void main(String[] args) {
		
		Student std[] = new Student[4];
		
		std[0] = new Student(1, "Dev");
		std[1] = new Student(2, "Dutta");
		std[2] = new Student(3, "Dey");
		std[3] = new Student(4, "Aman");
		
		for(Student s : std) {
			System.out.println("student name-> "+ s.get_name()+", roll number-> "+ s.get_roll());
						
		}
	}
}
