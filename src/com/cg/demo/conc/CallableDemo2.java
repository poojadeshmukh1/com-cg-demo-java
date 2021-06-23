package com.cg.demo.conc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.cg.demo.Empolyee;

public class CallableDemo2 implements Callable<Empolyee>{
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableDemo2 obj = new CallableDemo2();
		ExecutorService service= Executors.newSingleThreadExecutor();
		Future<Empolyee> future= service.submit(obj);
		
		Empolyee num = future.get();
		
		System.out.println(num);
		service.shutdown();
	}

	@Override
	public Empolyee call() throws Exception {
		
		Empolyee obj = new Empolyee();
		return obj;
		// TODO Auto-generated method stub
		
	}
	

}
