package com.wipro.basic;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 19, 1, 3};
		int target = 9;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
		    for (int j = i + 1; j < arr.length; j++) {
		        if (arr[i] + arr[j] == target) {
		            System.out.println("Pair found at indices: " + i + ", " + j);
		            found = true;
		            break;
		        }
		    }
		    if (found) break;
		}

		if (!found) {
		    System.out.println("No pair found " + target);
		}


	}

}
