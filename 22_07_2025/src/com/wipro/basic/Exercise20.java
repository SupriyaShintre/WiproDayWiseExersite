package com.wipro.basic;
import java.util.Arrays;

public class Exercise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "race";
		String str2 = "care";
		 char[] arr1 = str1.toLowerCase().toCharArray();
	        char[] arr2 = str2.toLowerCase().toCharArray();

	        // Sort the character arrays
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // Compare sorted arrays
	        if (Arrays.equals(arr1, arr2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
		
		

	}

}
