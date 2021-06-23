package com.cg.demo.encap;

//inheritance




public class PhoneDemo {

	public static void main(String[] args) {

		Phone phone = new Phone();

		phone.sms();
		phone.call();
		FeaturePhone featurePhone = new FeaturePhone();
		featurePhone.music();
		featurePhone.call();
		featurePhone.sms();
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call();
		smartPhone.sms();
	    smartPhone.music();
	    smartPhone.camera();
	}
}
