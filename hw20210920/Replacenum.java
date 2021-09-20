package com.syntax;

import java.util.Scanner;

public class Replacenum {

	public static void main(String[] args) {
		int[] arr = {1,2,4,6,8,12,76,23,64};
		System.out.print("The Input array is :  [");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+ arr[i] + " ");
			
		}
		System.out.println(" ]");
		System.out.println("Enter a number to replace with Zero");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean flag =false;
		scan.close();
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				flag = true;
				arr[i] = 0;
				break;
			}
		}
		if(flag==true) {
			System.out.print("The Output array is :  [");
			for(int i=0;i<arr.length;i++) {
				System.out.print(" "+ arr[i] + " ");
			}
			System.out.println(" ]");
		}
		else {
			System.out.print("Give an input which is already present in array");
		}
		

	}

}
