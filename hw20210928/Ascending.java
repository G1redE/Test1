package com.syntax.hw20210928;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		int temp;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++) {
			
			arr[i] = scan.nextInt();
			
		}
		scan.close();
		for(int i=0;i<n-1;i++) {
			temp = arr[i+1];
			if(arr[i]>temp) {
				flag = false;
				break;
			}
		}
		if(flag==false) {
		System.out.println("FALSE");
	}
		else {
			System.out.println("TRUE");
		}

}
}