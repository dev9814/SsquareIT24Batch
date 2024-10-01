package multithreading;

class MyRunnable1 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<5 ;i++) {
			System.out.println(Thread.currentThread().getName()+ " is running. Count " + i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableExample {

	public static void main(String[] args) {
		MyRunnable1 myrunnable = new MyRunnable1();
		
		Thread thread1 = new Thread(myrunnable);
		Thread thread2 = new Thread(myrunnable);
		
		thread1.start();
		thread2.start();
	}
}
