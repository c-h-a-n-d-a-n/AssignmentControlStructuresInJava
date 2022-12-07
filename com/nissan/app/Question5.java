package com.nissan.app;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
/*
 Create a menu driven program using do-while and switch-case which implements a
  help system for Java’s selection and iteration statements. You have to display the syntax 
  of selected control statement.
	Help on:	1. if
					2. switch
					3. while
					4. do-while
					5. for
					Choose one: 4
								The do-while:
						do {
								statement;
							  } while (condition);
*/
		
	        
	        try (Scanner scn = new Scanner(System.in)) {
				do {
				System.out.println("Enter number accordingly :");
				System.out.println("1 - if");
				System.out.println("2 - switch");
				System.out.println("3 - while");
				System.out.println("4 - do while");
				System.out.println("5 - for");
				
				int month = scn.nextInt();
				
				if(month < 1 || month > 5) {
				    System.out.println("!! Enter valid number !!");
				    continue;
				}
				
				
				switch (month) {
				  case 1:
				    System.out.println("if(condition){" + "\n" + "statement" + "\n" + "}");
				    break;
				  case 2:
				      System.out.println("switch(case){" + "\n" + "case 1 :" + "\n" + "statement" + "\n" + "break;" + "\n" + "case 2 :" + "\n" + "statement2" + "\n" + "break;" + "\n" + "default :" + "\n" + "statement" + "\n");
				        break;
				  case 3:
				        System.out.println("while(condition){" + "\n" + "statement" + "\n" + "}");
				        break;
				  case 4:
				        System.out.println("do{" + "\n" + "statement" + "\n" + "}while(condition)");
				        break;
				  case 5:
				        System.out.println("for(int i=0; i<n; i++){" + "\n" + "statement" + "\n" + "}");
				        break;    
				  default:
				    System.out.println("That's all folk's");  
				}
				
				System.out.println();
				
				
   }while(true);
			}
	    }    
	    
	    
	}
