package aggregation;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	private String studentName;
	private int studentId;
	
	public Student(String studentName, int studentId)
	{
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
}

class Department{
	
	private String deptName;
	private List<Student> students;
	
	public Department(String deptName, List<Student> students)
	{
		this.deptName = deptName;
		this.students = students;
	}
	
	public List<Student> getStudents()
	{
		return students;
	}
	
	public void addStudent(Student student)
	{
		students.add(student);
	}
}

class Institute{
	
	private String instituteName;
	private List<Department> departments;
	
	public Institute(String instituteName, List<Department> departments)
	{
		this.instituteName = instituteName;
		this.departments = departments;
	}
	
	public void addDepartment(Department department)
	{
		departments.add(department);
	}
	
	public int getTotalStudentsInstitute()
	{
		int noOfStudents = 0;
		List<Student> students = null;
		
		for (Department dept : departments)
		{
			students = dept.getStudents();
			
			for(Student s : students)
			{
				noOfStudents++;
			}
		}
		
		return noOfStudents;
	}
	
	
}

public class Aggregation2 {

	public static void main(String[] args) {
		
		Student s1 = new Student("dev", 1);
		Student s2 = new Student("dutta" , 2);
		Student s3 = new Student("dey", 1);
		Student s4 = new Student("aman", 2);
		
		// creating a list of CSE students
		List<Student> cse = new ArrayList<Student>();
		cse.add(s1);
		cse.add(s2);
		
		// creating a list of EE students 
		List<Student> ee = new ArrayList<Student>();
		ee.add(s3);
		ee.add(s4);
		
		
		Department Cse = new Department("CSE", cse);
		Department Ee = new Department("EE", ee);
		
		// creating an initial list of Department
		List<Department> departments = new ArrayList<Department>();
		departments.add(Cse);
		departments.add(Ee);
		
		// creating an institute object with Department List
		// using aggregation (Institute "has" Departments )
		Institute institute = new Institute("BITS", departments);
		
		// Display message for better readability
		System.out.println("total students in institute: ");
		
		// calling method to get total number of students
		System.out.println( institute.getTotalStudentsInstitute() );	
		
	}
}
