package com.nissan.app;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/*
		 Create the following output using for loop
			..........
			.........
			........
			.......
			......
			.....
			....
			...
			..
			.
			*/
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number Of Rows : ");
			//User Input
			int rows=sc.nextInt();
			//Function call
			starPattern(rows);
			sc.close();
		}
		catch(Exception e) {
			System.out.println("Invalid Entry..");
		}
	}
		private static void starPattern(int rows) {
			//outer loop
			for(int i=rows-1;i>=0;i--) {
				//inner loop
				for(int j=0;j<=i;j++) {
					System.out.print("*" +" ");
				}
				System.out.println();
		}
	}
}
