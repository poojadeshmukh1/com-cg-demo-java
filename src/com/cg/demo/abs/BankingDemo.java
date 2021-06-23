package com.cg.demo.abs;
// abstract can be public protected and private
// abstract class is only applicable to inheritance
interface  CentralGovRules{
	public abstract void payInterst();
}
interface StateGovRules{
	public abstract void giveloan();
}

abstract class RBI{// method signature only means what to do not how to do
	
	abstract void  dokyc(); {// what ?? yes  how ??// no
	}
	public void openAccount () {
		System.out.println("Open Account...");
	}
    
}
class HDFC extends RBI implements CentralGovRules,StateGovRules{// concrete class
	
	void dokyc() {
		// should have same method name as abstract 
		// what ?? yes  how ??// yes
		System.out.println("Aadhaar");
	}
	public void giveLoan() {
		System.out.println("hdfc giving loan...");
	}
	public void payInterest() {
		System.out.println("pay interest....");
	}
}
class ICICI {
	
}
public class BankingDemo {
	
	public static void main(String[] args) {
		
		HDFC hdfc = new HDFC();    
	}

}
