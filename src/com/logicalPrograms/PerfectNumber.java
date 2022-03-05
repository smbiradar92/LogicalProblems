package com.logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int N,i,sum = 0;
		System.out.println("Please enter a number");
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for (i = 1;i <= N/2;i++) {
		if(N%i == 0) {
			sum += i;
		}
		sc.close();
		}if (sum == N) {
			System.out.println("The entered number is a Perfect number");
		}else {
			System.out.println("The number is not perfect");
		}
	}
}