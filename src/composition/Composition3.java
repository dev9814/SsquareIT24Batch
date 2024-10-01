package composition;

import java.util.*;

class Department {
	
	public String departmentName;
	
	public Department(String departmentName)
	{
		this.departmentName = departmentName;
	}
	
	public String getDepartmentName()
	{
		return departmentName;
	}
	
}

class Company1 {
	
	// Reference to refer to list of books
	private String companyName;
	private List<Department> departments;
	
	// Constructor of company class
	public Company1(String companyName)
	{
		this.companyName = companyName;
		this.departments = new ArrayList<Department>();
	}
	
	// Method
	// to add new Department to the Company
	public void addDepartment(Department department)
	{
		departments.add(department);
	}
	
	public List<Department> getDepartments()
	{
		return new ArrayList<>(departments);
	}
	
	// Method
	// To get total number of Departments in the Company
	public int getTotalDepartments()
	{
		return departments.size();
	}
	
}

public class Composition3 {

	public static void main(String[] args) {
		
		Company1 google = new Company1("google");
		
		google.addDepartment(new Department("engineering"));
		google.addDepartment(new Department("Operations"));
		google.addDepartment(new Department("Human Resources"));
		google.addDepartment(new Department("Finance"));
		
		
		int d = google.getTotalDepartments();
		System.out.println("Total Departments: " + d);
		
		System.out.println("Department names: ");
		for(Department dept : google.getDepartments())
		{
			System.out.println("- " + dept.getDepartmentName());
		}		

	}

}
