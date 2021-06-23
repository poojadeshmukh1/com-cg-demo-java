package com.cg.demo.method;

import com.cg.demo.Employee;

public class App2 {
	
	public static void main(String[] args) {
		
		int num = 10;
		
        Product obj = new Product();        
        
        obj.product_no = 1;
        obj.product_name = "A";
        obj.product_price = 100;
        System.out.println(obj.toString());
        
        Product obj2 = new Product();
        obj2.product_no = 2;
        obj2.product_name = "B";
        obj2.product_price = 110;
        System.out.println(obj2.toString());
        
        Product obj3 = new Product();
        obj3.product_no = 3;
        obj3.product_name = "C";
        obj3.product_price = 120;
        System.out.println(obj3.toString());
        
        Product obj4 = new Product(104,"ddd", 45.85);
        System.out.println(obj4.toString());
        
        Product obj5 = new Product(104,"dhd",20.5);
        System.out.println(obj5.toString());
        
        Product obj6 = new Product(104,"ddd");
        System.out.println(obj6.toString());



	}

}
