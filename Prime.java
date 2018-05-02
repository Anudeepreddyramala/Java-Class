package com.prime;

import java.util.Scanner;

public class Prime {
	static boolean isPrime = true;

	public static void prime1(int a) {
		if (a < 0)
			System.out.println("Please enter positive number");

		else if (a == 0 || a == 1) {
			System.out.println(a + " is not a prime number ");
		} else {
			for (int i = 2; i <= a / 2; i++) {
				if (a % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				System.out.println(a + " is a prime number");
			else
				System.out.println(a + " is not a prime number");

		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check if it is prime or not");
		int a = s.nextInt();
		prime1(a);
	}
}
