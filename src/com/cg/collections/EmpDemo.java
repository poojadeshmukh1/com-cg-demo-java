package com.cg.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import com.cg.demo.Employee;
class Delete{
	
}
public class EmpDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Delete delete = new Delete();
 //        stack <Tnteger> = new Stack<Integer>;
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(emp);
		empList.add(new Employee());
		empList.add(new Employee(103, "Aaa", 10.5));
		
		for (int i =0;i<empList.size();i ++) {
			System.out.println(empList.get(i).toString());
		}
		
		System.out.println("Iterate sing for each loop");
		
		for (Employee e: empList) {
			System.out.println(e.toString());
		}
		System.out.println("Iterater using Iterator");
		Iterator <Employee> iterator = empList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
//		empList.add("Aaa"); // CE
//		empList.add(delete); // CE
//		Stack stack= new Stack();
//		
//		Vector vector =new new Vector(3, 3);
//		System.out.println(stack.size());
//		System.out.println(stack.capacity());
//		System.out.println(empList);
	}

}