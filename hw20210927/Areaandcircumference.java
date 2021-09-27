package com.work.hw20210927;

import java.util.Scanner;

public class Areaandcircumference {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter radius");
		int n1 = scan.nextInt();
		System.out.println("Enter operation");
		String operator = scan.next();
		scan.close();
		if(operator.equalsIgnoreCase("area")) {
			System.out.println("The Area is " + area(n1));
		}
		else {
			System.out.println("The Cirumference is " + circumference(n1));
		}

	}
	public static double area(int a) {
		return ((Math.PI)*(a*a));
	}
	public static double circumference(int a) {
		return (2*(Math.PI)*a);
	
	}
}
