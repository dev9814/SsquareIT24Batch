package multithreading;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is running with interface Runnable.");
	}
	
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
	}

}
