package com.wipro.basic;
import java.time.LocalDate;
public class FormData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname = "Supriya Shintre";
		LocalDate myDate = LocalDate.parse("2025-07-22");
		char gender = 'F';  // 'M' for Male, 'F' for Female
		long phoneNumber = 9876543210L;
		String email = "supriya@example.com";
		String facebook = "Facebook";
		int numberOfTickets = 3;
		char creditcard  = 'c';
		
		 System.out.println("Full Name: " + fullname);
	        System.out.println("Date: " + myDate);
	        System.out.println("Gender: " + gender);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Email: " + email);
	        System.out.println("Facebook: " + facebook);
	        System.out.println("Number of Tickets: " + numberOfTickets);
	        System.out.println("Payment Method: " + creditcard);





	}

}
