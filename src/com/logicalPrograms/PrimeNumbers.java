package com.logicalPrograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int N, i;
		int flag = 0;

		System.out.println("Enter a Number");

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		if (N == 0 || N == 1) {
			System.out.println(+N + " is not a Prime Number");
		} else {
			for (i = 2; i <= N/2; i++) {
				if (N % i == 0) {
					System.out.println(+N + " is not a Prime Number");
					flag = 1;
					break;
				}
				sc.close();
			}
			if (flag != 1) {
				System.out.println(+N + " is a Prime Number");
			}
		}
	}
}