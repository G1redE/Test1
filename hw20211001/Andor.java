package com.work.hw20211001;

import java.util.Scanner;

public class Andor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a  = scan.nextInt();
		System.out.println("Enter the 2nd number");
		int b = scan.nextInt();
		System.out.println("The Result of AND operation between two numbers is: "+ (a&b));
		System.out.println("The Result of OR operation between two numbers is: "+ (a|b));

	}

}
