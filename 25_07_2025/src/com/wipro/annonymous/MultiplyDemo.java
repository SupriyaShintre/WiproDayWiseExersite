package com.wipro.annonymous;

public class MultiplyDemo {
	
	public static void main(String[] args) {

        Multiply mul = (a, b) -> a * b;

        int result = mul.multiply(3, 20);

        System.out.println(result);
    }
}
