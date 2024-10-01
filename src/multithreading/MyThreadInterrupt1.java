package multithreading;

public class MyThreadInterrupt1 extends Thread {
	public MyThreadInterrupt1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			if(isInterrupted()) {
				System.out.println(Thread.currentThread().getName()+ " was interrupted.");
				break;
			}
            System.out.println(Thread.currentThread().getName() + " is running. Iteration: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted during sleep.");
                break;
            }
		}
		System.out.println(Thread.currentThread().getName()+ " has finished.");
	}
	
	public static void main(String[] args) {
		MyThreadInterrupt1 thread1 = new MyThreadInterrupt1("Thread-1");
		
		thread1.start(); // start thread1
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		thread1.interrupt();
	}
}
