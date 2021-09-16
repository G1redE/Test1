package com.work.hw20210916;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		System.out.println("Please provide Input");
		Scanner scan = new Scanner(System.in);
		String ScanInput = scan.nextLine();
		scan.close();
		char c;
		boolean flag = true;
		System.out.println("The input from user is " + ScanInput);
		for(int i=0;i<ScanInput.length();i++) {
			c = ScanInput.charAt(i);
			if((c>='A' && c<='Z') || (c>='a' && c<='z')) {
				System.out.println("Enter a valid input with no Alphabets");
				flag=false;
				break;
			}
			
		}
		if(flag) {
		int integer = Integer.valueOf(ScanInput);
		System.out.println("The integer value of input is " + integer);
		char character = ScanInput.charAt(0);
		System.out.println("The character value of input is " + character);
		byte bytevalue = (byte) integer ;
		System.out.println("The byte value of input is " + bytevalue );
		short shortvalue = (short) integer;
		System.out.println("The short value of input is " + shortvalue );
		long longvalue = integer;
		System.out.println("The long value of input is " + longvalue );
		float floatvalue = integer;
		System.out.println("The float value of input is " + floatvalue );
		double doublevalue =integer;
		System.out.println("The double value of input is " + doublevalue );
		boolean booleanvalue;
		if(integer>0) {
			booleanvalue= true;
		}
		else {
			booleanvalue=false;
		}
		System.out.println("The boolean value of input is " + booleanvalue );
	}

}
}