package com.cg.demo.fun;

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		MyInt obj = new MyInt() {
			
			public void absMethod() {
				System.out.println("absmethod");
			}
		};
		
		obj.absMethod();
	}
//	class InnerClass{
//		
//	}
//	static class InnerClass1 {
//		
//	}
}
