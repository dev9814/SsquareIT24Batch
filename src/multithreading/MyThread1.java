package multithreading;

public class MyThread1 extends Thread{

	public MyThread1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+ " is running. Iteration: " + i);
			try {
				Thread.sleep(1000, 500000);
				// Sleep for 1000 milliseconds plus 500,000 nanoseconds (0.5 milliseconds)
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}
	
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1("Thread-1");
		MyThread1 thread2 = new MyThread1("Thread-2");
		
		thread1.start();
		thread2.start();	
	}
}
