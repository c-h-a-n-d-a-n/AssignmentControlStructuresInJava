package com.nissan.app;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner (System.in);
			//Storing data either from file or database
			// dummy data
			int trainId=101;
			int pnr=9999, inputPnr=0;
			String trainName="Jan Shadabti";
			String passengerName="Sumitra";
			//Aplication is executing
			try {
				System.out.println("Enter PNR no : ");
				//inputPnr=scanner.nextInt();
				inputPnr=Integer.parseInt(scanner.nextLine());
				
				//check condition
				if(inputPnr==pnr) {
					System.out.println("Seat Confirmed");
				}else {
					System.out.println("Seat Not Confirmed");
				}
				scanner.close();
			}
			catch(Exception e) {
				System.out.println("Invalid entry . .");
			}
	}

}
