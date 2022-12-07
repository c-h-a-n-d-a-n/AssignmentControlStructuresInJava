package com.nissan.app;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {		
				/*
				 Write a program that uses an if-else-if ladder to determine which season a particular
				Month is in.
				Months 1, 2 and 12 are come under winter season.
				Months 3, 4 and 5 are come under spring season.
				Months 6, 7 and 8 are come under summer season.
				Months 9, 10 and 11 are come under autumn season.
				Accept a number for month from user and print the result accordingly.
				 */ 
		try {
				System.out.println("Enter Month In Number");
				Scanner sc = new Scanner(System.in);
				int month=sc.nextInt();
				sc.close();
				season(month);
		}
		catch(Exception e) {
			System.out.println("Invalid Entry..");
		}
				
			}
			
			private static void season(int month) {
				
				switch (month) {
				  case 1:
				    System.out.println("Winter Season");
				    break;
				  case 2:
				    System.out.println("Winter Season");
				    break;
				  case 3:
				    System.out.println("Spring Season");
				    break;
				  case 4:
				    System.out.println("Spring Season");
				    break;
				  case 5:
				    System.out.println("Spring Season");
				    break;
				  case 6:
				    System.out.println("summer season");
				    break;
				  case 7:
				    System.out.println("Summer season");
				    break;
				  case 8:
					    System.out.println("Summer season");
					    break;
				  case 9:
					    System.out.println("Autumn Season");
					    break;
				  case 10:
					    System.out.println("Autumn Season");
					    break;
				  case 11:
					    System.out.println("Autumn Season");
					    break;
				  case 12:
					    System.out.println("Winter Season");
					    break;
				
				default :
					System.out.println("Enter Correct Month Number");
				
			}

		

			}
}


