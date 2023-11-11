package IfElse;

import java.util.Scanner;

public class LofNum {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num:");
		int num=scan.nextInt();
		num=num%10;
		System.out.println(num+" it is a last digit of num");
	}

}
