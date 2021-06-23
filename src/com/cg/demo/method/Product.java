package com.cg.demo.method;

public class Product {
	int product_no ;
	String product_name;
	double product_price;
	
	void outputProduct() {
		System.out.println("product is working now ......");
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int product_no, String product_name, double product_price) {
		super();
		this.product_no = product_no;
		this.product_name = product_name;
		this.product_price = product_price;
	}
	public Product(int product_no, String product_name) {
		super();
		this.product_no = product_no;
		this.product_name = product_name;
	}
	@Override
	public String toString() {
		return "Product [product_no=" + product_no + ", product_name=" + product_name + ", product_price="
				+ product_price + "]";
	}
}
	
	
