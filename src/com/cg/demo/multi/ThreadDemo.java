package com.cg.demo.multi;

public class ThreadDemo {
	
	public static void main(String[] args) {
		for (int i=1; i<=10;i++) {
			try {
				Thread.sleep(250);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
	}
	public void run() {
		this.printloop();
	}
	private void printloop() {
		// TODO Auto-generated method stub
		
	}
	

}
