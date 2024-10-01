package multithreading;

public class MyThreadAlive2 extends Thread{
	
	public MyThreadAlive2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<5 ;i++) {
			System.out.println(Thread.currentThread().getName()+ " is running. Iteration: " + i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyThreadAlive2 thread1 = new MyThreadAlive2("Thread-1");
		thread1.start();
		
		while(thread1.isAlive()) {
			System.out.println("Waiting for Thread-1 to finish..");
			try {
				Thread.sleep(200);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread-1 has finished.");
	}
}
