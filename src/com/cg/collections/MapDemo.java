package com.cg.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		Map <Integer, String> map = new HashMap<>();
		
		map.put(10, "India");
		map.put(20, "Chaina");
		map.put(40,"Us");
		map.put(30,"Uk");
		
		System.out.println(map);
		System.out.println(map.get(20));
		
		Map<String, String> states = new HashMap<>();
		
		states.put("TS", "Telangana");
		states.put("Mh", "Maharshtra");

	}

}
