package multithreading;

public class MyThread2 extends Thread{

	public MyThread2(String name) {
		super(name); // Set the name of the thread
	}
	
	@Override
	public void run() {
		for (int i=0 ; i<5; i++) {
			 System.out.println(Thread.currentThread().getName() + " is running. Iteration: " + i);
			 try {
				 Thread.sleep(1000); // sleep for 1000 milliseconds (1 second) 
			 }
			 catch(InterruptedException e) {
				 System.out.println(Thread.currentThread().getName() + " was interrupted.");
	             return; // Exit the run method if interrupted
			 }
		}
	}
	
	public static void main(String[] args) {
		MyThread2 thread1 = new MyThread2("Thread-1");

		thread1.start(); // start thread1
		
		try {
			Thread.sleep(3000);
			thread1.interrupt();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
