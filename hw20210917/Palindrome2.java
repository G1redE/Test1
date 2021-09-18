package com.syntax;

import java.util.Scanner;

public class Palindrome2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String fo palindrome check");
		String input = scan.next();
		scan.close();
		boolean flag=false;
		int count =(input.length()-1);
		input=input.toLowerCase();
		for(int i=0;i<=count/2;i++) {
			if(input.charAt(i)!=input.charAt(count-i)) {
				flag = true;
				break;
			}
		}
		if(flag!=true) {
			System.out.println("Is Palindrome");	
		}
		else{
			System.out.println("Is Not Palindrome");
		}
		}

}
