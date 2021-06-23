package com.cg.demo.reg;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//import java.util.Date;

public class DateTimeDemo {
	
	public static void main(String[] args) {
		// Date date = new Date();
		// System.out.println(date.toString());
		 
		 LocalDate date = LocalDate.now();
		 System.out.println(date.toString());
		 
		 //LocalDate iDay =LocalDate.of(1947,8,15);
		 //
		 //System.out.println(iDay.toString());
		 
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy"+ "");
		 LocalDate myDate =LocalDate.parse("08-15-1947",formatter);
		 System.out.println(myDate.toString());
		 System.out.println(myDate.format(formatter));
		 System.out.println(myDate.EPOCH);//ALL MODERN WILLTAKE THIS DATE AS STARTING POINT
		 System.out.println(LocalDate.MIN);
		System.out.println(LocalDate.MAX);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDate manDate =LocalDate.now();
		LocalDate expDate =manDate.plusDays(6);
		LocalDate expDate2 =manDate.plusMonths(6);
		
		System.out.println("Manufacturing Date" + manDate.toString());
		System.out.println("Expiry date 1 :" + expDate.toString());
		System.out.println("Expiry date 2 :" + expDate2.toString());
		
		LocalDate expDate3 = manDate.minusDays(180);
		System.out.println("Expiry date 3: " + expDate3.toString());
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2021, 12, 31);
		System.out.println(date1.datesUntil(date2).toString());
		System.out.println(date2.compareTo(date1));
		// most important Y2K 
		 
		  //formatting date
		 //compare 
	}
	

}
