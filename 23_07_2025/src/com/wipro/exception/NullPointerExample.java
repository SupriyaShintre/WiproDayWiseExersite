package com.wipro.exception;

public class NullPointerExample {
    public static void main(String[] args) {
        String fName = null;

        try {
            String upperName = fName.toUpperCase();
            System.out.println("Uppercase Name: " + upperName);
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: fName is null.");
        }

        System.out.println("Program continues after handling exception.");
    }
}

