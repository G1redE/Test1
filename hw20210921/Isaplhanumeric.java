package com.work.hw20210921;

import java.util.Scanner;

public class Isaplhanumeric {
	
	public void Isalpha(String input) {
		int c = 0;
		boolean flag = false;
		for(int i=0;i<input.length();i++) {
			c = input.charAt(i);
			if(!((c>='A' && c<='Z')|| (c>='a' && c<='z')||(c>='0' && c<='9'))) {
				System.out.println("The Given string  contains characters which are not Alphannumeric ");
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("The Given string  contains characters which are only Alphannumeric ");
			
		}
	}

	public static void main(String[] args) {
		System.out.println("Please enter a string");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		Isaplhanumeric obj =  new Isaplhanumeric();
		obj.Isalpha(str);

	}

}
