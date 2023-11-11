package IfElse;

import java.util.Scanner;

public class MiddleOf3 {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a:");
		int a=scan.nextInt();
		System.out.println("Enter the value of b:");
		int b=scan.nextInt();
		System.out.println("Enter the value of c:");
		int c=scan.nextInt();
		if((b>a&&b<c)||(a>b&&b>c)) {
			System.out.println(b+" it is the middle num");
		}
		else if ((a>b&&c>a)||(a<b&&a>c)) {
			System.out.println(a+" it is the middle num");
		}
		else {
			System.out.println(c+" it is the middle num");
		}
	}

}
