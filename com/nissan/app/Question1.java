package com.nissan.app;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		/*Consider an electricity billing calculation. There are two types of customers. 
		 	Domestic and Industry. If it is domestic, the slabs are like this,
			The reading in the range,0-100 then amt=units* Rs.1 
																100-200amt=units*1.5
																200-500amt=units*2
																>500amt = units*5
									If it is industrial, the amt =units*10.*/
		try {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter Option-1 for Domestic And Option-2 for Industry Option-3 for Exit");
		int customers = sc.nextInt();
		
		switch (customers) {
		  case 1:
			  System.out.println("Enter unit For Domestic :-");
			  double unitForDomestic=sc.nextInt();
		    System.out.println(domestic(unitForDomestic));
		    break;
		  case 2:
			  System.out.println("Enter unit For Industry :-");
			  double unitForIndustry=sc.nextInt();
		    System.out.println(industry(unitForIndustry));
		    break;
		  case 3:
			  System.out.println("Exit");
			  break;
		  default:
			  System.out.println("Enter 1,2or3 Options Only.");
		}
		sc.close();
		}
		catch(Exception e) {
			System.out.println("Invalid Entry..");
		}
	}
	private static double domestic(double unit) {
		double amount = 0;
		if (unit >=0 && unit <100) {
			 amount=unit*1;
		}
		else if (unit >=100 && unit <200) {
			amount= unit*1.5;
		}
		else if (unit >=200 && unit <500) {
			amount= unit*2;
		}
		else if(unit >=500) {
			amount= unit*5;
		}
	
		return amount;
	}
	
	private static double industry(double unit) {
		
		return unit*10;
	}

}
