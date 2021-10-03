package com.work.hw20211001;

import java.util.Arrays;

public class Missinnum {

	public static void main(String[] args) {
		int arr[] = {1,5,8,6,5,1,6,2,2,0};
		Arrays.sort(arr);
		int a=0;
		for(int i = 0;i<arr.length;i++) {
			a=a^arr[i];
			}
			
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]^arr[j])==a) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
			
		}
		
		
		

	}

}
