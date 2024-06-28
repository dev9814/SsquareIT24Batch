package overriding;

class Bank{
	int getRateOfInterest() {return 0;}
}

class SBI extends Bank{
	
	int getRateOfInterest() {return 8;}
}

class ICICI extends Bank{
	
	int getRateOfInterest() {return 7;} 
}

class AXIS extends Bank{
	int getRateOfInterest() {return 9;}
}

public class Override3 {

	public static void main(String[] args) {
		
		Bank s = new SBI();
		Bank i = new ICICI();
		Bank a = new AXIS();
		
		System.out.println("SBI rate "+ s.getRateOfInterest());
		System.out.println("ICICI rate "+ i.getRateOfInterest());
		System.out.println("AXIS rate "+ a.getRateOfInterest());

	}

}
