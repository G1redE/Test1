package com.work.hw20210922;

import java.util.Scanner;

public class Revsentence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String ");
		String input = scan.nextLine();
		scan.close();
		String[] inputStr = input.split(" ");
		String temp ="";
		int count =(inputStr.length-1);
		for(int i=0;i<=count/2;i++) {
			temp = inputStr[count-i];
			inputStr[count-i] =inputStr[i];
			inputStr[i]=temp;
			}
		System.out.println(String.join(" ",inputStr));
		}

	}


