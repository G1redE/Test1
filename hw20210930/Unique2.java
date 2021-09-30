package com.syntax.hw20210929;

import java.util.Arrays;

public class Unique2 {

	public static void main(String[] args) {
		int arr[] = {20,10,30,20,10,40,20,30,40,0};
		Arrays.sort(arr);
		int count[] = new int[arr[arr.length-1]+1];
		
		for(int i = 0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					count[arr[i]]++;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(count[arr[i]]==0){
			System.out.println(arr[i]);
			
			
		}
	
		
		}
	}
}

