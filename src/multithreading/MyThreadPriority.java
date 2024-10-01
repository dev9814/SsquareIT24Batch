package multithreading;

public class MyThreadPriority extends Thread{

	// constructor
	public MyThreadPriority(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=0 ; i<3 ; i++) {
			System.out.println(Thread.currentThread().getName() + " with priority "+ Thread.currentThread().getPriority() + " is running. ");
		}
	}
	
	public static void main(String[] args) {
		
		MyThreadPriority thread1 = new MyThreadPriority("Thread-1");
		MyThreadPriority thread2 = new MyThreadPriority("Thread-2");
		MyThreadPriority thread3 = new MyThreadPriority("Thread-3");
	
		// set the priorities
		thread1.setPriority(MIN_PRIORITY); // Priority 1
		thread2.setPriority(NORM_PRIORITY); // Priority 2
		thread3.setPriority(MAX_PRIORITY); // Priority 3
		
		// start the threads
		thread1.start();
		thread2.start();
		thread3.start();
		
        // Display the priorities
        System.out.println(thread1.getName() + " priority: " + thread1.getPriority());
        System.out.println(thread2.getName() + " priority: " + thread2.getPriority());
        System.out.println(thread3.getName() + " priority: " + thread3.getPriority());	
	}
}
