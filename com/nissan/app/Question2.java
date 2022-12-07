package com.nissan.app;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		/* You are a Software developer in XYZ Company and you are asked 
		    to create a program to verify a user’s PIN code when a user visits an ATM.
		     To implement this concept, you must use decisional statements to make 
		     appropriate decisions when a use’s PIN code matches with the pin code 
		     assigned to that user. For that, you have created a class named Verify, in 
		     which a user has to enter some numeric value as the PIN code during runtime.
		      Apart from that, you have initialized a variable y with some numeric value and
		       compare the value stored in the variable y with the value accepted from a user.*/
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter your 4 Digit ATM Pin");
		int userATMPin=sc.nextInt();
		sc.close();
		verify(userATMPin);
	}
	private static void verify(int pin) {
		int y=7862;
		if (y==pin) {
			System.out.println("User Have Access");
		}
		else {
			System.out.println("Wrong ATM Pin.");

		}
	}
}
