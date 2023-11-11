package IfElse;

import java.util.Scanner;

public class Sof2 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a:");
		double a=scan.nextDouble();
		System.out.println("Enter the value of b:");
		double b=scan.nextDouble();
		if(a<b) {
			System.out.println(a+" is the smallest num");
		}
		else {
			System.out.println(b+" is the smallest num");
		}
	}

}
