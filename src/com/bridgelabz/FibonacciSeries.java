package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of whic you want Fibonacci Series : ");
		int number = sc.nextInt();
		
		int number1 = 0, number2 = 1, number3;

		for (int i = 1; i<=number; i++) {
			System.out.print(number1 + " ");
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
		}
		
		
	}

}
