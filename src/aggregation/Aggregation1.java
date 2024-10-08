package aggregation;

// Address
class Address{
	
	String city, state, country;
	
	public Address(String city, String state, String country)
	{
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
}

class Employee{
	
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display()
	{
		System.out.print(id+" "+name);
		System.out.print(" ");
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
}

public class Aggregation1 {

	public static void main(String[] args) {
		
		Address address1 = new Address("noida", "UP", "india");
		Address address2 = new Address("meerut", "UP", "india");
		
		Employee e1 = new Employee(111, "dev", address1);
		Employee e2 = new Employee(222, "dutta", address2);
		
		e1.display();
		e2.display();
		
	}

}
