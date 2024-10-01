package cohesion;

public class Cohesion1 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("dev", 100000);
		
		SalaryCalculator sc = new SalaryCalculator();
		ReportPrinter rp = new ReportPrinter();
		EmailService es = new EmailService();
		
		double d1 = sc.calculateAnnualSalary(emp1);
		
		System.out.println(d1);
		rp.printEmployeeReport(emp1);
		es.sendEmail("dev@gmail.com", "Raise my salary");
		
	}
	
}
