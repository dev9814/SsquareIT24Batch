package multithreading;

public class MyThreadInterrupt extends Thread{

	public MyThreadInterrupt(String name) {
		super(name);
	}	
	@Override
	public void run() {
		while( !isInterrupted() ) {
			System.out.println(Thread.currentThread().getName() + " is running.");
			try {
				Thread.sleep(2000); // sleep for 1 second
			}
			catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+ " was interrupted during sleep. ");
				interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName()+ " has finished.");
	}	
	public static void main(String[] args) {
		MyThreadInterrupt thread1 = new MyThreadInterrupt("Thread-1");
		
		thread1.start();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		thread1.interrupt();
	}
}
