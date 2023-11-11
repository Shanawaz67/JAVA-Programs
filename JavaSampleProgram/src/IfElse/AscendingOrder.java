package IfElse;

import java.util.Scanner;

public class AscendingOrder {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a:");
		int a=scan.nextInt();
		System.out.println("Enter the value of b:");
		int b=scan.nextInt();
		System.out.println("Enter the value of c:");
		int c=scan.nextInt();
		if(a<b&&a<c&&b<c) {
			System.out.print(a+","+b+","+c);
		}
		else if(a<b&&a<c&&c<b) {
			System.out.println(a+","+c+","+b);
		}
		else if(c<a&&c<b&&a<b) {
			System.out.println(c+","+a+","+b);
		}
		else if(c<b&&c<a&&b<a) {
			System.out.println(c+","+b+","+a);
		}
		else if(b<c&&b<a&&c<a) {
			System.out.println(b+","+c+","+a);
		}
		else if(b<a&&b<c&&a<c) {
			System.out.println(b+","+a+","+c);
		}
	}

}
