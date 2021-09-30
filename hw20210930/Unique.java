package com.syntax.hw20210929;

import java.util.HashMap;

public class Unique {

	public static void main(String[] args) {
		int arr[] = {20,10,30,20,30};
		int min=Integer.MAX_VALUE;
		int minkey = 0;
		HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		for(int i =0;i<arr.length;i++) {
			if(!(map1.containsKey(arr[i]))) {
				map1.put(arr[i],1);
			}
			else {
				map1.put(arr[i],(map1.get(arr[i])+1));
			}
		
		}
		for(int i=0;i<arr.length;i++) {
			if(map1.get(arr[i])<=min) {
				min = map1.get(arr[i]);
				minkey = arr[i];
			}
		}
		System.out.println(minkey);
		
		 
	}
	
	
}
