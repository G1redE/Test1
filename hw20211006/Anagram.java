package com.syntax.hw20211006;

import java.util.Scanner;



public class Anagram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		str = str.toLowerCase();
		String c;
		boolean flag = true;
		for(char i = 'a';i<='z';i++) {
			c=String.valueOf(i);
			
			if(str.contains(c)) {
				flag = true;
			}
			else {
				flag = false;
					break;
			}
		}
		if(flag==true) {
			System.out.println(flag);
		}
		else {
			System.out.println(flag);
		}

	}

}
