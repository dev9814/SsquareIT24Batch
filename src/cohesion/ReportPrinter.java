package cohesion;

public class ReportPrinter {

	public void printEmployeeReport(Employee employee)
	{
		System.out.println("Employee Report: "+ employee.getName()+", Salary: "+ employee.getSalary() );
		
	}
	
}
