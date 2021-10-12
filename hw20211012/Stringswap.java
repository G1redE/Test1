package com.syntax.hw20211012;

public class Stringswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello";
		String str2="world";
		System.out.println(str1);
		System.out.println(str2);
		str1 = str1.concat(str2);
		str2 =str1.replace("world","");
		str1=str1.replace("hello","");
		System.out.println(str1);
		System.out.println(str2);
		

	}

}
