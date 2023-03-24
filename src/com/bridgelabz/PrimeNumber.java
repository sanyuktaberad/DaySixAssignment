package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
	public static void main (String[] args) {
		int count = 0;
		System.out.println("Enter the number you want to check prime number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for (int i = 2 ; i<=number; i++) {
			if (number%i == 0) {
				count++;
			}
			if (count == 2) {
				System.out.print(i + " is prime number.");
			}
			else {
				System.out.print(i + " is prime number.");
			}
		}
	}

}
