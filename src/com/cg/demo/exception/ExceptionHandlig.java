package com.cg.demo.exception;

public class ExceptionHandlig {
	
	// throw demo
	public static void m1() {
		System.out.println(10/5);
	}
	public static void m2() {
		ExceptionHandlig.m1();
	}
	public static void m3() {
		ExceptionHandlig.m2();
		
	}
	public static void main(String[] args) {
		System.out.println("Start");
		ExceptionHandlig.m3();
		System.out.println("end");
	}
}
