package Test;


import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		scan.close();
		String num = Integer.toString(n);
		System.out.println("The Digits in " +num+ " are " + num.length() );

}
}