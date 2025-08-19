package com.wipro.basic;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 1;
	        int sum = 0;

	        while (i <= 100) {
	            if (i % 2 == 0) {
	                sum += i;
	            }
	            i++;
	        }

	        System.out.println("Sum of all even numbers from 1 to 100 is: " + sum);
	}

}
