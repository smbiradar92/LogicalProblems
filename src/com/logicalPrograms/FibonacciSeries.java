package com.logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		FibonacciSeries fb = new FibonacciSeries(); // object
		int prev = 0;
		int current = 1;
		int count;

		System.out.println("Please enter the Number of elements in the series");

		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();

		fb.printFibonacciSeriesNumbers(prev, current, count); // Method
		sc.close();
	}

	private int printFibonacciSeriesNumbers(int prev, int current, int count) {
		if (count == 0) {
			return 0;
		} else {
			System.out.println(current + "\t");
		}
		return printFibonacciSeriesNumbers(current, prev + current, --count);
	}
}
