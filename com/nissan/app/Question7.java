package com.nissan.app;

import java.util.Scanner;

public class Question7 {
	 
		    
		    
		    static class Cube{
		        
		        int w;
		        int h;
		        int d;
		        
		        Cube(){
		            
		        }
		        
		        Cube(int w, int h, int d){
		            this.w = w;
		            this.h = h;
		            this.d = d;
		        }
		        
		        int volume(){
		            return w * h * d;
		        }
		        
		        
		    }
		    
		    public static void main(String[] args) {
		        
		        Scanner scn = new Scanner(System.in);
		        
		        System.out.println("Enter 3 dimensions for first cube:");
		        Cube c1 = new Cube();
		        
		        int w = scn.nextInt();
		        int d = scn.nextInt();
		        int h = scn.nextInt();
		        c1 = new Cube(w,d,h);
		        
		        System.out.println("Enter 3 dimensions for second cube:");
		        Cube c2 = new Cube();
		        
		        w = scn.nextInt();
		        d = scn.nextInt();
		        h = scn.nextInt();
		        
		        c2 = new Cube(w,d,h);
		        
		            System.out.println("Volumes of cubes are :");
		            System.out.println(c1.volume());
		            System.out.println(c2.volume());
		        
		        
		        
		        
		    }
		    
		    
		}
	