package Loops;

import java.util.Scanner;

public class DivisibleBy7 {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of M");
		int M=scan.nextInt();
		if(M%7==0) {
			System.out.println(M+" It is divisible by 7");
		}
		else {
			System.out.println(M+" It is not divisible by 7");
		}
	}

}
