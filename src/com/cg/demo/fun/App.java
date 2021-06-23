package com.cg.demo.fun;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.cg.demo.Employee;

public class App {

	public static void main(String[] args) {
		List <Employee> emplist = new ArrayList<>();
		emplist.add(new Employee (101,"Vaman", 10000));
		emplist.add(new Employee (102,"Va", 18000));
		emplist.add(new Employee (103,"Vam", 12000));
		emplist.add(new Employee (104,"Vama", 15000));
		emplist.add(new Employee (105,"V", 20000));
		
		System.out.println(emplist);
	
		//empList.foreach(emp -> Sys)
		
		Stream<Employee> empStream = empList.filter((e) -> e.salary>15000);
		
	
	}
	
}
