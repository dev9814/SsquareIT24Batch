package inheritance;

class Bike{
	
	private int gears;
	private int brakes;
	private String name="Bike"; 
	
	public Bike(int gears ,int brakes )
	{
		this.brakes = brakes;
		this.gears = gears;
	}
	
	public void number_gear() {
		System.out.println("number of gear-> "+ gears);
	}
	
	public void number_brakes() {
		System.out.println("number of brakes-> "+ brakes);
	}

	public void name() {
		System.out.println("name of product-> "+ name);
	}
	
}

class Mountain_Bike extends Bike{
	
	private int speed;
	
	private String name = "Mountain Bike"; 
	
	public Mountain_Bike(int gears, int brakes, int speed) {
		super(gears, brakes );
		
		this.speed = speed;
	}

	public void number_speed() {
		System.out.println("Speed-> "+ speed);
	}
	
	@Override
	public void name() {
		System.out.println("name of product-> "+ name);
	}
}

public class Inherit_Constructor {

	public static void main(String[] args) {
		
		Bike bk = new Mountain_Bike(4 , 2 , 50);
		
		bk.number_gear();
		
		bk.number_brakes();
		
		bk.name();
		
		System.out.println("----------------------------");
		Mountain_Bike mbk = new Mountain_Bike(3, 1 , 25);
		
		mbk.number_speed();
		
		mbk.name();
		
	}
}
