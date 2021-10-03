package com.work.hw20211001;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a  = scan.nextInt();
		if((a|1)>a) {
			System.out.println("The Given number is even");
			
		}
		else {
			System.out.println("The Given numvber is odd");
		}
	}

}
