package com.work.hw20210927;

import java.util.Scanner;

public class Sumandmultiply2 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter First operand");
		int n1 = scan.nextInt();
		System.out.println("Enter Second operand");
		int n2 = scan.nextInt();
		System.out.println("Enter operation");
		String operator = scan.next();
		scan.close();
		if(operator.equalsIgnoreCase("add")) {
			System.out.println("The Sum is " + add(n1,n2));
		}
		else {
			System.out.println("The product is " + multiply(n1,n2));
		}

	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static int multiply(int a,int b) {
		return a*b;
	}
}
