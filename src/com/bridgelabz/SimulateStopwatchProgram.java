package com.bridgelabz;

import java.util.Scanner;

public class SimulateStopwatchProgram {
    /*public static void main(String[] args) {
       
        long start = System.currentTimeMillis();
        long stop = System.currentTimeMillis();
        
        float timeElapsed = (float) (stop - start) / 1000;
        
        System.out.println("Time = " + timeElapsed + " Seconds");
    }*/
	 public static void main(String[] args) {
	        System.out.println("Enter any character and press Enter to start the stop watch");
	        Scanner sc = new Scanner(System.in);
	        char start = sc.next().charAt(0);
	        long startch = System.currentTimeMillis();
	        
	        System.out.println("Enter any character and press Enter to stop the stop watch");
	        char stopch = sc.next().charAt(0);
	        long stop = System.currentTimeMillis();
	        
	        float timeElapsed = (float) (stop - start) / 1000;
	        
	        System.out.println("Time = " + timeElapsed + " Seconds");
	    }
}
