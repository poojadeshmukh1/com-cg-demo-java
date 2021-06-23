package com.cg.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDemo {
	
	public static void main(String[] args) {
		
		String email = "6pooja@gmail.com";
		String regex="[^\\d][\\w-.][a-z]+@[^\\d][\\w][a-z]+.[a-z]+";
		
		Pattern p= Pattern.compile(regex);
		Matcher m = p.matcher(email);
		System.out.println(m.matches());
	}///check regular expression patterns n practice4
 
	

}
