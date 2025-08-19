package com.wipro.collection;

public class ArrayList {

    public static void main(String[] args) {
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original List: " + numbers);

        numbers.remove(2);

        System.out.println( numbers);

        numbers.add(70);

        System.out.println(numbers);
    }
}
