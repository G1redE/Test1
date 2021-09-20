package com.syntax;

public class MissinNum {
	public static void main(String args[]) {
		int[] list = {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
		int listsum=0;
		int n=15;
		int actualsum = (n*(n+1))/2;
		for(int i=0;i<list.length;i++){
			listsum=listsum+list[i];
		}
		n=actualsum-listsum;
		System.out.println("The missing number is : " + n);
	}
}
