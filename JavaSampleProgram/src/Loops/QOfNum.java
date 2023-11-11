package Loops;

import java.util.Scanner;

public class QOfNum {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the divi value");
		int divi=scan.nextInt();
		System.out.println("Enter the divisor value");
		int divisor=scan.nextInt();
		int q=divi/divisor;
		System.out.println(q);
	}

}
