package com.syntax;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String fo palindrome check");
		String input = scan.next();
		scan.close();
		input=input.toLowerCase();
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			rev+=input.charAt(i);
		}
		if(input.equals(rev)) {
			System.out.println("Is Palindrome");	
		}
		else{
			System.out.println("Is Not Palindrome");
		}
		}

}
