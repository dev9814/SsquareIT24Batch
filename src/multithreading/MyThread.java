package multithreading;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<5 ; i++) {
			System.out.println("Thread running: "+ i);
		}
		
	}
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
