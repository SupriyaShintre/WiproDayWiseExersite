package com.wipro.annonymous;

import java.util.function.Function;

public class FractionalPart {
	 public static void main(String[] args) {

	        Function<Double, Double> getFraction = num -> num - Math.floor(num);

	        double number = 123.454;
	        double result = getFraction.apply(number);

	        System.out.println("Fractional part is: " + String.format("%.2f", result));
	    }
}
