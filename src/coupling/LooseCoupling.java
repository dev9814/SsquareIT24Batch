package coupling;

interface Enginee {
	
	void start();
}

class DieselEngine implements Enginee {
	
	@Override
	public void start() {
		System.out.println("Diesel Engine started.");
	}
}

class ElectricEngine implements Enginee {
	
	@Override
	public void start() {
		System.out.println("Electric Engine started.");
	}
}

class Vehicle {	
	private Enginee engine;
	
	public Vehicle(Enginee engine) {
		this.engine = engine;
	}
	
	public void start() {
		engine.start();
	}
}

public class LooseCoupling {
	public static void main(String[] args) {
		
		Vehicle carWithDieselEngine = new Vehicle(new DieselEngine());
		carWithDieselEngine.start();
	
		Vehicle carWithElectricEngine = new Vehicle(new ElectricEngine());
		carWithElectricEngine.start();
	}
}
