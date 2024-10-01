package association;

import java.util.*;

// class 1
// Bank class
class Bank {
	
	private String bankName;
	private Set<Employee> employees;
	
	// constructor of bank class
	public Bank(String bankName)
	{
		this.bankName = bankName;
	}
	
	// Method of bank class
	public String getBankName()
	{
		return this.bankName;
	}
	
	public void setEmployees(Set<Employee> employees)
	{
		this.employees = employees;
	}
	
	public Set<Employee> getEmployees()
	{
		return this.employees;
	}
	
}


// class
// employee class
class Employee {
	
	// attribute of employee
	private String name;
	
	// Constructor of Employee class
	public Employee(String name)
	{
		this.name = name;
	}
	
	// Method of Employee class
	public String getEmployeeName() 
	{
		return this.name;
	}
	
}


public class Association1 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Dev");
		Employee emp2 = new Employee("Dutta");
		
		// adding the employee to a set
		Set<Employee> employees = new HashSet<>();
		
		employees.add(emp1);
		employees.add(emp2);
		
		// Creating a Bank object
		Bank bank = new Bank("ICICI");
		
		// setting the employees for the Bank object
		bank.setEmployees(employees);
		
		for(Employee emp: bank.getEmployees())
		{
			System.out.println(emp.getEmployeeName()
                    + " belongs to bank "
                    + bank.getBankName());
		}
		
	}
}
