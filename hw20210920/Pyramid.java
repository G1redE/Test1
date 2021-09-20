package com.syntax;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for (int i=1;i<=n;i++) {
			{
			for(int j=i;j<n;j++){
			System.out.print(" ");
			
			}
			for(int r=1;r<(2*i);r++) {
			System.out.print("*");
			
			}
			System.out.println("");
			
		}

	}

}
}
