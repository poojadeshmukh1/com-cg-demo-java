package com.cg.demo;

public class Employee {

    int id;
    String name;
    public double salary;
    
  public Employee(){
	  System.out.println("default constructor");
  }
  Employee (int id,String name){
	  this.id =id;
	  this.name =name;
	  
	  System.out.println("two parameterized constrctor");
	  
	  
}
  public Employee(int id,String name, double salary){
	  this.id =id;
	  this.name =name;
	  this.salary=salary;
	  System.out.println("three parameterized constrctor");
	  
	  
}


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";


}
}