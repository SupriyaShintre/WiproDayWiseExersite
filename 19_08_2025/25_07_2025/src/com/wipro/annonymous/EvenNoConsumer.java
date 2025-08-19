package com.wipro.annonymous;

import java.util.function.Consumer;

public class EvenNoConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Consumer<Integer> printNextEven = number -> {
	            int nextEven = (number % 2 == 0) ? number + 2 : number + 1;
	            System.out.println("Next even number: " + nextEven);
	        };

	        printNextEven.accept(5);     
	        
	}

}
