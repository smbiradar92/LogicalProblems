package com.logicalPrograms;

import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
	
		int N;
		int reverse=0;
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		while(N > 0 ) {
			int remainder = N %10;
			reverse = reverse*10 + remainder;
			N = N/10;
		}
			System.out.println("The Reverse number is : "+reverse);
			sc.close();
	}
	

}
