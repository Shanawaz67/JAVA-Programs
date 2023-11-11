package IfElse;

import java.util.Scanner;

public class EnO {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num:");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println(num+" is a even");
		}
		else {
			System.out.println(num+" is a odd");
		}
	}

}
