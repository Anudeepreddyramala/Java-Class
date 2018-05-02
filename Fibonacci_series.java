package com.fibonacci;

import java.util.Scanner;

public class Fibonacci_series {

	int a = 0, b = 1, c;

	public int fib(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
		return a;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in fibonacci series");
		int n = s.nextInt();

		System.out.println("Fibonacci Series");

		Fibonacci_series fs = new Fibonacci_series();
		fs.fib(n);

	}
}
