package com.syntax.hw20211012;

import java.util.HashMap;
import java.util.Scanner;

public class Maxmin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		int min = Integer.MAX_VALUE;
		int minindex=0;
		int max = Integer.MIN_VALUE;
		int maxindex=0;
		int count =1;
		String str = scan.nextLine();
		str = str.toLowerCase().replace(" ","");
		scan.close();
		if(!str.isEmpty()) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(count>max) {
				max = count;
				maxindex=i;
			}
			if(count<min) {
				min = count;
				minindex=i;
			}
			
			count=1;
			
		}

		System.out.println("MAX> "+str.toUpperCase().charAt(maxindex)+"-"+(max));
		System.out.println("MIN> "+str.toUpperCase().charAt(minindex)+"-"+(min));
		
		}
		
  }

}
