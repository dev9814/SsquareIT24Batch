package multithreading;

public class LambdaThreadExample {

	public static void main(String[] args) {
		
		Runnable task = () -> System.out.println("Thread is running with help of lambda expression");
		Thread thread = new Thread(task);
		thread.start();
	}

}
