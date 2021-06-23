package com.cg.demo;



public class App {
    public static void main(String[] args) {

    	 

        int num = 10;
        
       

 

        Employee obj = new Employee();
        
        
        obj.id = 101;
        obj.name = "Abc";
        obj.salary = 10.5;
        System.out.println(obj.toString());
        
        Employee obj2 = new Employee();
        obj2.id = 101;
        obj2.name = "bbc";
        obj2.salary = 15.5;
        System.out.println(obj2.toString());
        
        Employee obj3 = new Employee();
        obj3.id = 101;
        obj3.name = "cbc";
        obj3.salary = 16.5;
        System.out.println(obj3.toString());
        
        Employee obj4 = new Employee(104,"ddd", 45.85);
        System.out.println(obj4.toString());
        
        Employee obj5 = new Employee(104,"dhd",20.5);
        System.out.println(obj5.toString());
        
        Employee obj6 = new Employee(104,"ddd");
        System.out.println(obj6.toString());



 

    }


}
	


