package com.cg.demo.access;

import com.cg.demo.method.DemoClass;
import com.cg.demo.Employee;

public class App {
	
	public static void main(String[] args) {
		
			DemoClass obj = new DemoClass();
			System.out.println(obj.publicField);
//			System.out.println(obj.protectedField);
//			System.out.println(obj.privetField);
//			System.out.println(obj.packageField);
			 
			
			//FQN - fuly qualified name of,class
			
			com.cg.demo.method.Employee emp =new  com.cg.demo.method.Employee();
			com.cg.demo.pc2.Employee emp2 =new com.cg.demo.pc2.Employee();
	}
}