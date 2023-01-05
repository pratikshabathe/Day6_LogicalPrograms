package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		
		int factorSum = 1;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				factorSum = factorSum + i;    //calculate sum of factors
			}
			
			if(factorSum == num) {  //compares sum with number
				System.out.println("it is perfect numbers");
			}else {
				System.out.println("is is not perfect numbers");
			}
		}
	}
}
