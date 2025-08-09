package com.wipro.stream;
import java.util.Arrays;
import java.util.List;

public class AvgStream {
	
	 public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

	        double average = numbers.stream()
                    .mapToDouble(n -> n) 
                    .average()
                    .orElse(0);

	        System.out.println("Average: " + average);
	    }

}
