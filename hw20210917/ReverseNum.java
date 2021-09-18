package com.syntax;

import java.util.Scanner;

public class ReverseNum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		scan.close();
		if(number.length()<3)
		{
			System.out.println("Please give a number having length greater than or equal to 3");
		}
		else {
		String rev="";
		for(int i=number.length()-1;i>=0;i--) {
			rev+=number.charAt(i);
		}
		System.out.println(rev);
		}


}}
