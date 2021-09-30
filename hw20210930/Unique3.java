package com.syntax.hw20210929;

public class Unique3 {

	public static void main(String[] args) {
		int arr[] = {3,0,1,6,4,5};
		
		int a=0;
		int i=0;
		for(;i<arr.length;i++) {
		a = a^arr[i]^i;
		}
		a= a^i;
		System.out.println(a);
	}

}
