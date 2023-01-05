package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		
		for(int i = 1; i < num; i++) {
			boolean isPrime = true;
			for(int k = 1; k < num/2; k++) {
				if(k % i == 0) {
					isPrime = false;
					break;
				}
			}

			if(isPrime == true)
				System.out.println(num+" is Prime");
			else
				System.out.println(num+" is not prime");
		}
	}
}
