package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable2 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<5 ; i++) {
			System.out.println(Thread.currentThread().getName() + " is running. Count: " + i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableWithExecutorExample {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		MyRunnable2 myrunnable = new MyRunnable2();
		
        executorService.submit(myrunnable);
        executorService.submit(myrunnable);

        executorService.shutdown();
	}
}
