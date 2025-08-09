package com.wipro.basic;

public class Exrcise7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double num1 = 25.586;
        double num2 = 25.589;

        long n1 = Math.round(num1 * 1000);
        long n2 = Math.round(num2 * 1000);

        System.out.println("Input floating-point number: " + num1);
        System.out.println("Input floating-point another number: " + num2);

        if (n1 == n2) {
            System.out.println("They are the same up to three decimal places.");
        } else {
            System.out.println("They are different.");
        }

	}

}
