package coupling;

class Engine {
	
	String engineclass;
	
	public void start() {
		System.out.println("Engine started");
		System.out.println("Engine class: "+ engineclass);
	}
	
}

class Car {
	private Engine engine;
	
	public Car() {
		this.engine = new Engine(); // Direct instantiation
	}
	
	public void start() {
		engine.start();
	}
	
	public void setEngineClass(String ec) {
		engine.engineclass = ec;
	}	
}

public class TightCoupling {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setEngineClass("Bharatclass1");
		car1.start();
		
		Car car2 = new Car();
		car2.setEngineClass("Bharatclass2");
		car2.start();
		
	}
}
