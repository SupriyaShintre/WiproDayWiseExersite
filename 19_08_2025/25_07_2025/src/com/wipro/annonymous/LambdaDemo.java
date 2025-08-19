package com.wipro.annonymous;

public class LambdaDemo {
	 public static void main(String[] args) {

	        Greeting greet = () -> System.out.println("Hello Lambda");

	        greet.sayHello();
	    }
}
