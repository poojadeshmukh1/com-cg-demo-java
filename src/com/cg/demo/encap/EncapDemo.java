package com.cg.demo.encap;
// Encapsulation - binding data and code together.
// make fields as private and 
// create public  getters and setters
// constructors getters setters should be auto generated
public class EncapDemo {
	
	public static void main(String[] args) {
		
//		BankCustmor obj = new BankCustmor();
//		// obj.balance=10000;
//		 System.out.println(obj.checkBalance());
//		 obj.deposit(15000);
//		 System.out.println(obj.checkBalance());
//		 obj.withdraw(2000);
//		 System.out.println(obj.checkBalance());
		Demo demo=new Demo();
//		demo.num =10; //CE
		System.out.println(demo.getNum());
		demo.setNum(10);
		System.out.println(demo.getNum());
		
		

	}
	

}
