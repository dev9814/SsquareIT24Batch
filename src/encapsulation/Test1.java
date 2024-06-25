package encapsulation;

class Student{
	
	private String name;
	private int rollno;
	
	public void setName(String nam)
	{
		this.name = nam;
	}
	
	public void setRollNo(int roll)
	{
		this.rollno = roll;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRollNo()
	{
		return rollno;
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Student[] st = new Student[3];
		
		s1.setName("dev");
		s1.setRollNo(1);
		
		s2.setName("dutta");
		s2.setRollNo(2);
		
		s3.setName("dey");
		s3.setRollNo(3);
		
		st[0] = s1;
		st[1] = s2;
		st[2] = s3;
		
		for(int i=0; i<st.length; i++) {
			System.out.println("Name "+ st[i].getName() +", Roll Number "+ st[i].getRollNo() );
			
		}
		
		
		

	}

}
