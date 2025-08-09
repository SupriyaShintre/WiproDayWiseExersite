package com.wipro.basic;

public class Exercise6 {
    public static void main(String[] args) {
        double number = 5;


        if (number == 0) {
            System.out.println("Zero");
        } else {
            if (number > 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
            
            if (Math.abs(number) < 1) {
                System.out.println("Small");
            } else if (Math.abs(number) > 1000000) {
                System.out.println("Large");
            }
        }
    }
}
