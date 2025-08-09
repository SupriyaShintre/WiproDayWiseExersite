package com.wipro.basic;

public class Exercise22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sentence = "supriya shintre";
	        String[] words = sentence.split(" "); 

	        String shortest = words[0]; 
	        for (String word : words) {
	            if (word.length() < shortest.length()) {
	                shortest = word;
	            }
	        }

	        System.out.println("The shortest word is: " + shortest);
	}

}
