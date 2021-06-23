package com.cg.demo.conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExPatDemo implements Runnable{
	
	public static void main(String[] args) {
		
//		for (int i=1; i<=10; i++) {
//			Thread thread = new Thread (new App());
//			thread.start();
//		}
		ExPatDemo exp = new ExPatDemo();
		
		//1.using newSingleThreadExecutor() method
		// creates an executor that uses a single worker thead operating 
		// unbounded queue
		
		//ExecutorService exService= Executors.newSingleThreadScheduledExecutor();
	
		//2.using newCachedThreadpool()method
		// creates a thread pool that creates new threads but will reuse
		// previously constructed threads when they are available
		
		//ExecutorService exService= Executors.newCachedThreadPool();
		
		//3. using newFixedThreadPool()meyhod
		//creates a thread pool that reuses a fixed number of thraedsoperating
		//ExecutorService exService= Executors.newFixedThreadPool(3);
		//4
		//ExecutorService exService= Executors.newScheduledThreadPool(3);
		
		ScheduledExecutorService exService= Executors.newScheduledThreadPool(3);
		
		for (int i= 1; i<=10; i++) {
			exService.execute(exp);
		}
		
		exService.shutdown();
	
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "-" + i);
		
	}
	
	

}
}