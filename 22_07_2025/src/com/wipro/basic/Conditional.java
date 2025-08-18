package com.wipro.basic;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char name = 'S';
//		if(name=='R') {
//			System.out.println("Rectangel");
//		}
//		else if(name=='C'){
//			System.out.println("Circle");
//		}
//		else if(name=='S'){
//			System.out.println("Square");
//		}
//		else {
//			System.out.println("Other");
//		}
		
		
		char name = 'S';

        switch (name) {
            case 'R':
                System.out.println("Rectangle");
                break;
            case 'C':
                System.out.println("Circle");
                break;
            case 'S':
                System.out.println("Square");
                break;
            default:
                System.out.println("Other");
        }
		
		
		
	}

}
