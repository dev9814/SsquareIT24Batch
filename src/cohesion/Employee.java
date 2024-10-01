package cohesion;

// Read package-info.java for further update.


public class Employee {

	private String name;
	private double salary;
	
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	public String getName()
	{
		return this.name;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
}
