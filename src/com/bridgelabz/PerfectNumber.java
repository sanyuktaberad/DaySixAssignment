package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
	public static void main (String[] args) {
		int number, sum = 0;
		
		System.out.println("Enter the number you want to check the number is perfect or not : ");
		Scanner sc = new Scanner (System.in);
		number = sc.nextInt();
		
		for (int i = 1; i<number; i++) {
			if(number%i == 0) {
				sum = sum + i;
			}
		}
		if (number == sum) {
			System.out.println("The given number is perfect number.");
		}
		else {
			System.out.println("The given number is not perfect number.");
		}
	}
}
