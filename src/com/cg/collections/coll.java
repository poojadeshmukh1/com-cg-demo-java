package com.cg.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class coll {
	

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		System.out.println(myList.size());
		myList.add(10);
		myList.add(20.75);
		myList.add("Abc");
		System.out.println(myList.size());
		System.out.println(myList.get(1));
		
		List list = new ArrayList();
		List list2 = new LinkedList();
		list = list2;
		
		

	}

}
