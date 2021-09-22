package com.work.hw20210921;

import java.util.Scanner;

public class Capitalize {
	
	public String capital(String input) {
		input =input.toUpperCase();
		return input;
	}
	
	public static void main(String args[]) {
		System.out.println("Please enter a string");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		Capitalize obj = new Capitalize();
		str = obj.capital(str);
		System.out.println(str);
	}
}
