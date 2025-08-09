package com.wipro.collection;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LocalDate date = LocalDate.of(2023, 11, 1);

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	        String formattedDate = date.format(formatter);
	       // System.out.println("Formatted Date: " + formattedDate);
	        
	        
	        
//	        LocalDate dt11 = LocalDate.of(1990, 1, 10);
//	        int age = getAge(dt11);
//	        System.out.println("Age is: " + age + " years");
	        
	        
//	        LocalDate dt1 = LocalDate.of(2024, 12, 25);
//	        LocalDate dt2 = LocalDate.of(2025, 01, 06);
//	        getDateDiff(dt1, dt2);
	        
	        
	        
	        
	        LocalDate date1 = LocalDate.of(2025, 3, 1); 

	        System.out.println(isLeapYear(date1));
	        

	}
//			public static int getAge(LocalDate dt) {
//	        LocalDate today = LocalDate.now();
//	        return Period.between(dt, today).getYears();
//			}
//			
	
	
	
	
			
//	public static void getDateDiff(LocalDate dt1, LocalDate dt2) {
//	    LocalDate startDate;
//	    LocalDate endDate;
//
//	    if (dt1.isAfter(dt2)) {
//	        System.out.println("Date 1 (" + dt1 + ") is greater than Date 2 (" + dt2 + ")");
//	        startDate = dt2;
//	        endDate = dt1;
//	    } else {
//	        startDate = dt1;
//	        endDate = dt2;
//	    }
//
//	    Period diff = Period.between(startDate, endDate);
//
//	    int years = diff.getYears();
//	    int months = diff.getMonths();
//	    int days = diff.getDays();
//
//	    System.out.println("Difference is " + years + " years, " + months + " months, and " + days + " days.");
//	}
	
	
	
	public static boolean isLeapYear(LocalDate dt1) {
	    return dt1.isLeapYear();
	}



}
