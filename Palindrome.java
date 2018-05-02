package com.pal;

import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {

		String inpstring;
		String revstring;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to check if it is a palindrome");
		inpstring = s.nextLine();

		inpstring = inpstring.replace(" ", "");
		revstring = new StringBuilder(inpstring).reverse().toString();
		if (inpstring.equalsIgnoreCase(revstring)) {
			System.out.println(inpstring + " is a Palindrome");
		} else
			System.out.println(inpstring + " is not a Palindrome");
	}
}
