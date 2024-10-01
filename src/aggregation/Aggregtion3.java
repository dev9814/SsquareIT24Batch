package aggregation;

class Engine{
	
	private String engineType;
	
	public Engine(String engineType)
	{
		this.engineType = engineType;
	}
	
	public String getEngineType()
	{
		return engineType;
	}
	
	public void work()
	{
		System.out.println("Engine of car has been started");
	}
	
}

class Car{
	
	private Engine engine;
	
	public Car(Engine engine)
	{
		this.engine = engine;
	}
	
	public void move()
	{
		if(engine != null)
		{
			engine.work();
			System.out.println("Car is moving");
		}
		else
		{
			System.out.println("Car cannot start without engine");
		}
	}
	
}

public class Aggregtion3 {

	public static void main(String[] args) {
	
		Engine engine = new Engine("V10");
		
		Car car = new Car(engine);
		
		car.move();
		System.out.println("Engine Type: "+ engine.getEngineType());

	}

}
