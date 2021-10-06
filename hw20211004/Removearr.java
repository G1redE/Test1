package com.syntax.hw20211004;

public class Removearr {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,7,5};
		int ele = 5;
		int j= 0;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]==ele) {
				arr[j]=arr[i+1];
				j++;
				i++;
			}
			else {
				arr[j]=arr[i];
				j++;
			}
		}
		
		for(int i = 0 ; i<j;i++) {
			System.out.println(arr[i]);
		}


	}

}
