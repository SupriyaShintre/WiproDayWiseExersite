package com.wipro.test;

import com.wipro.exception.InvalidVoterException;

public class CustomExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkVotingAge(21);
		}catch(InvalidVoterException e) {
			e.printStackTrace();
		}
		

	}
	static void checkVotingAge(int age)throws InvalidVoterException
	{
		if(age<18) {
			throw new InvalidVoterException("Invalid voting stage");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}

}
