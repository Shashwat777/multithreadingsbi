package multithreadingsbi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class main {
	
	public static void main(String[] args) {
		
		stimulate stimu = new stimulate();
		stimu.run();
		long startTime = System.currentTimeMillis();
		ExecutorService pool = Executors.newFixedThreadPool(1);
		Runnable r1 = new computation();
		Runnable r2 = new computation();
	Runnable r3 = new computation();
	Runnable r4 = new computation();
		pool.execute(r1);
		pool.execute(r2);
	pool.execute(r3);
	pool.execute(r4);
		pool.shutdown();
		
		
		if(!pool.isTerminated())	{	
			pool.shutdown();	
			try {
				pool.awaitTermination(5L,	TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	}
		long endTime = System.currentTimeMillis();
		long  time = (endTime - startTime);
        System.out.println("\nElapsed Time is:  " + time);

		

	}

}
