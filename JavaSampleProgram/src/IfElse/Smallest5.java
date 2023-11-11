package IfElse;

import java.util.Scanner;

public class Smallest5 {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num a");
		int a=scan.nextInt();
		System.out.println("Enter the num b");
		int b=scan.nextInt();
		System.out.println("Enter the num c");
		int c=scan.nextInt();
		System.out.println("Enter the num d");
		int d=scan.nextInt();
		System.out.println("Enter the num e");
		int e=scan.nextInt();
		if(a<b&&a<c&&a<d&&a<e) {
			System.out.println(a+" it is the smallest value");
		}
		else if(b<c&&b<d&&b<e) {
			System.out.println(b+" it is the smallest value");
		}
		else if(c<d&&c<e) {
			System.out.println(c+" it is the smallest value");
		}
		else if(d<e) {
			System.out.println(d+" it is the smallest value");
		}
		else {
			System.out.println(e+" it is the smallest value");
		}
	}

}
