package multithreading;

public class MyThreadAlive1 extends Thread{
	public MyThreadAlive1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<5 ; i++) {
			System.out.println(Thread.currentThread().getName()+ " is running. Iteration: "+ i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		MyThreadAlive1 thread1 = new MyThreadAlive1("Thread-1");

		System.out.println("Before starting, is Thread-1 alive? " + thread1.isAlive());
		
		thread1.start(); // start thread1
		
		System.out.println("After starting, is Thread-1 alive? "+ thread1.isAlive());
		
		try {
			thread1.join(); // wait for thread1 to finish
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After finishing, is Thread-1 alive? " + thread1.isAlive());
	}
}
