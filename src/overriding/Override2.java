package overriding;

class Vehicle {
	
	void run()
	{
		System.out.println("Vehicle is running");
	}
	
}

class Bike extends Vehicle{
	
	void run()
	{
		System.out.println("Bike is running");
	}
}

class Car extends Vehicle{
	
	void run()
	{
		System.out.println("Car is running");
	}
}

public class Override2 {

	public static void main(String[] args) {
		

	}

}
