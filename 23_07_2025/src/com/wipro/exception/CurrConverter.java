package com.wipro.exception;

public class CurrConverter {
	 public static int changeCurrency(int number) throws NumberFormatException {
	        if (number == 0) {
	            throw new NumberFormatException("Invalid Number");
	        }
	        return number * 80;
	    }

	    public static void main(String[] args) {
	        int input = 0; // Try changing this to non-zero for success case

	        try {
	            int result = changeCurrency(input);
	            System.out.println("Converted amount: " + result);
	        } catch (NumberFormatException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }

	        System.out.println("Program continues...");
	    }

}
