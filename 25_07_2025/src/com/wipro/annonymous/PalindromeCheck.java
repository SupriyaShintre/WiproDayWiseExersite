package com.wipro.annonymous;

import java.util.function.Predicate;

public class PalindromeCheck {
    public static void main(String[] args) {
        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversed); // case-insensitive check
        };

        String test1 = "madam";
       

        System.out.println(test1 + " is palindrome? " + isPalindrome.test(test1));
    }
}

