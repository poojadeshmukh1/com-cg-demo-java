package com.cg.demo.abs;
// Polymorphism - methods with the name having different functionlaties
// two types polymorphism 1)complie time polymoephsim -method overloading -early binding (both static and non static ways
//1. different number of aguments of arguments
//2. different order of arguments 
//3. different order of arguments
public class PolyDemo {
	
	public int add(int i, byte j) {
		return i+j;
	}
	public int add(int i, int j)
	{
		return i+j;
	}
	public int add(int i, int j, int k) {
		return (int)(i+j+k);
	}
	
	public int add(int i, int j, int k, int l) {
		return i+j+k+l;
	}
	public static void main(String[] args) {
		
		PolyDemo polyDemo = new PolyDemo();
		System.out.println(polyDemo.add(10,20));
		System.out.println(polyDemo.add(10,20,30));
		System.out.println(polyDemo.add(10,20,30,40));
		byte arg1=10;
		int arg2=20;
		System.out.println(polyDemo.add(arg2, arg1));
		System.out.println(polyDemo.add(arg1, arg2));
	}

}
