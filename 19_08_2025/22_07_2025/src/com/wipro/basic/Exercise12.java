package com.wipro.basic;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {100, 67, 98, 678, 45, 123};
        int max = numbers[0];  

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];  // update max if current is larger
            }
        }

        System.out.println("The largest number is: " + max);

	}

}
