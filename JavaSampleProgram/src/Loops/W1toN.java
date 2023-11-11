package Loops;

import java.util.Scanner;

public class W1toN {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num1:");
		int num1=scan.nextInt();
		System.out.println("Enter the num2:");
		int num2=scan.nextInt();
		while(num1<=num2) {
			System.out.println(num1);
			num1++;
		}
	}

}
