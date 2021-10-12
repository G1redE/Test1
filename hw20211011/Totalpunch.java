package com.syntax.hw20211011;

import java.util.Scanner;

public class Totalpunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		scan.close();
		int count=0;
		for(int j=0;j<str.length();j++) {
			int i = (int)str.charAt(j);
			
			if((i>=33 && i<=47)||(i>=58 && i<=64)||(i>=91 && i<=96)||(i>=123 && i<=126))count++;

		}
		System.out.println(count);

	}

}
