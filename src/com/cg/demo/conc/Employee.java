
package com.cg.demo.conc;

	 

	import java.util.concurrent.Callable;
	import java.util.concurrent.ExecutionException;
	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	import java.util.concurrent.Future;

	 

	import com.cg.demo.col.Employee;

	 

	//public class CallableDemo implements Callable<Integer> {
	public class Employee implements Callable<Employee> {
	    public static void main(String[] args) throws InterruptedException, ExecutionException {
	        Employee obj = new Employee();

	        ExecutorService service = Executors.newSingleThreadExecutor();

	        Future<Employee> future = service.submit(obj);
	        Object num = future.get();
	        System.out.println(num);
	        service.shutdown();

	 

	    }

	 

	    @Override
	    public Employee call() throws Exception {
//	        int num = 0;
//	        for (int i = 0; i <= 10; i++) {
//	            num += i;
//	        }
//	        
//	        return num;
	        Employee obj = new Employee(0, null, null);
	        obj.setId(1235);
	        obj.setSalary(45.00);
	        obj.setName("pratik");
	        return obj;
	        
	    }

	 

	}
}
