package com.syntax.hw20210928;

import java.util.Scanner;

public class Minnum {

	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++) {
			
			arr[i] = scan.nextInt();
			
		}
		scan.close();
		for(int i=0;i<n;i++) {
			
			if(arr[i]<min) {
				min = arr[i];
			}
			
		
			
		}
		System.out.println("Minunum: " + min);
	}

}
