package com.syntax.hw20211011;

import java.util.Scanner;

public class VowelConsonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		scan.close();
		int vowels=0;
		int consonants=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				vowels++;
			}
			else if(!Character.isAlphabetic(str.charAt(i))) {
				
			}
			else {
				consonants++;
			}
			
			
		}
		System.out.println("Vowels:" + vowels);
		System.out.println("Consonants:" + consonants);

		}
	}


