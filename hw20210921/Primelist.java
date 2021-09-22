package com.work.hw20210921;

import java.util.Scanner;

public class Primelist {
	
	public boolean prime(int n ) {
		boolean flag = false;
		if(n==0||n==1) {
			return true;
		}
		else {
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					return true;
				}
		}
			if(!flag) {
				return false;
			}
			
			
	}
		return false;
		
		
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lowest number");
		int n1 = scan.nextInt();
		System.out.println("Enter the highest number");
		int n2 = scan.nextInt();
		scan.close();
		Primelist obj = new Primelist();
		
		for(int i =n1;i<=n2;i++) {
			if(obj.prime(i) == false) {
				System.out.println(i);
			}
		
		}
		
	}

}
