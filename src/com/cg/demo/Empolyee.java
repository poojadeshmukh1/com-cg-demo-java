package com.cg.demo;

public class Empolyee {

	int id;
	String name;
	double salary;

	public Empolyee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empolyee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}