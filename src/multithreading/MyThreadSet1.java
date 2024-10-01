package multithreading;

public class MyThreadSet1 extends Thread{

	public MyThreadSet1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Thread is running: "+ getName());
	}
	
	public static void main(String[] args) {
		MyThreadSet1 thread1 = new MyThreadSet1("Thread-A");
		MyThreadSet1 thread2 = new MyThreadSet1("Thread-B");
		
		thread1.start(); // start thread1
		thread2.start(); // start thread2
		
		// change the name of thread1
		thread1.setName("Renamed-Thread-A");
		
	    System.out.println("Thread1 new name: " + thread1.getName());
	    System.out.println("Thread2 name: " + thread2.getName());	
	}
}
