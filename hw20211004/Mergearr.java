package com.syntax.hw20211004;

public class Mergearr {

	public static void main(String[] args) {
		int j=0;
		int[] arr2 = {4,5,6,7,8};
		int[] arr1 = {1,2,3,4};
		int n =arr1.length+arr2.length;
		int[] arr3 = new int[n];
		for(int i=0;i<arr1.length;i++) {
			arr3[j] = arr1[i];
			j++;
	}
		for(int i=0;i<arr2.length;i++) {
			arr3[j] = arr2[i];
			j++;
	

}
		for(int i =0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}}
		}
