package com.cg.demo.conc;

 

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

 

public class Employe implements Callable<Employe> {
    
    public Employe(int i, String string, double d) {
    	i=01;
    	string="Pooja";
    	d=10000.0;
    	
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
        Employe obj = new Employee();
        
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        Future<Employe> future = service.submit(obj); 
        Employe emp = future.get();
        System.out.println(emp);
        service.shutdown();
    }
    @Override
    public Employe call() throws Exception {
        
        Employe em = new Employe(101 , "Sanket" , 20.5);
        
        return em;
    }

 

}
