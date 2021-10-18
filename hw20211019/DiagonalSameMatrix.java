package com.syntax.hw20211019;

import java.util.Scanner;

public class DiagonalSameMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No of rows");
		int rows = scan.nextInt();
		System.out.println("Enter No of columns");
		int col = scan.nextInt();
		int[][] arr = new int[rows][col];
		System.out.println("Enter the Numbers");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		
		scan.close();
		int num = arr[0][0];
		boolean flag =true;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				if(i==j && arr[i][j]!=num) {
					flag = false;
					break;
				}
				}
				if(flag==false) {
					break;
				}
			}
		System.out.println(flag);
		}
	}


