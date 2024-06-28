package composition;

import java.util.ArrayList;
import java.util.List;

class Office {
	
	public String name;
	public String address;
	
	Office(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
}

// create a class for company that has more than Office
class Company {
	
	public String name;
	
	private List<Office> offices = null;
	
	Company(String name, List<Office> offices)
	{
		this.name = name;
		this.offices = offices;
	}
	
	public List<Office> getTotalOfficesOfCompany()
	{
		return offices;
	}
	
}

public class Composition1 {

	public static void main(String[] args) {
		
		Office o1 = new Office("Google", "Banglore ");
		Office o2 = new Office("Google", "Gurgaon");
		Office o3 = new Office("Google", "Hyderabad");
		Office o4 = new Office("Google", "Mumbai");
		
		List<Office> offices = new ArrayList<Office>();
		
		offices.add(o1);
		offices.add(o2);
		offices.add(o3);
		offices.add(o4);
		
		Company company = new Company("Google", offices);
		System.out.println(company.name+ " offices:");
		
		List<Office> data = company.getTotalOfficesOfCompany();
		
		for(Office office:data) {
			System.out.println("Name: "+ office.name + " and " + "Address: "+ office.address);
		}
		
		

	}

}
