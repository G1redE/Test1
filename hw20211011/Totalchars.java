package com.syntax.hw20211011;

import java.util.Scanner;

public class Totalchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		scan.close();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);

	}

}
