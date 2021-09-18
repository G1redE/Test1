package com.syntax;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		scan.close();
		name+='\n';
		int length=0;
		while(name.charAt(length)!='\n') {
			length++;
		}
		if(length<4) {
			System.out.println("less");
		}
		else {
			System.out.println("more");
		}
	}

}
