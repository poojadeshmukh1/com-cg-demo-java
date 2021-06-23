package com.cg.demo.fun;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo {

	public static void main(String[] args) {
		Integer num =11;
		Predicate <Integer> predicate=(n) ->{
			if (n%2 ==0)
				return true;
			return false;
		};
		System.out.println(predicate.test(num));
		
		Consumer <String> consumer = (name) ->{
			System.out.println(name);
			
		};
		
		consumer.accept("Sonu");
		
		Supplier<Integer> supplier = () ->{
			Random randon = new Random();
			return random.nextInt();
		};
	}


}
