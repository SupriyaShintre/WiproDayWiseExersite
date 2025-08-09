package com.wipro.annonymous;

import java.util.function.Predicate;

public class UpptoLowCase {
	
	public static void main(String[] args) {

        Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());

        Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());

        String test1 = "HELLO";
       
        System.out.println(isUpperCase.test(test1));
       
    }

}
