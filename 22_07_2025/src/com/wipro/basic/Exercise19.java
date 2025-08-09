package com.wipro.basic;

public class Exercise19 {

	public static void main(String[] args) {
		String str = "madaM";
        
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

	}

}
