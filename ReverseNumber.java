package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		
		int revNum = 0;
		while(num > 0) {
			revNum = (revNum*10) + num%10;
			num = num/10;
		}
		System.out.println("reverse number is: " +revNum);
	}
}
