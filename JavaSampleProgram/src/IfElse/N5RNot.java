package IfElse;

import java.util.Scanner;

public class N5RNot {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num:");
		int num=scan.nextInt();
		num=num%10;
		if(num==5) {
			System.out.println(num+" it is 5 only");
		}
		else {
			System.out.println(num+" it is not 5");
		}
	}

}
