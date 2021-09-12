package Test;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		scan.close();
		boolean flag = false;
		if(n==0||n==1) {
			System.out.println("It's not a prime");
		}
		else {
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					flag=true;
					System.out.println("It's not a prime");
					break;
				}
		}
			if(!flag) {
				System.out.println("It's a Prime");
			}
			
	}

}}
