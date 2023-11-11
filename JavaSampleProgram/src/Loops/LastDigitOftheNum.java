package Loops;

import java.util.Scanner;

public class LastDigitOftheNum {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		lastDigit(a);
		
	}
	private static void lastDigit(int a) {
		for(int i=1;i<=a;i++) {
			int lastd=a%10;
			System.out.println(lastd);
		}
		// TODO Auto-generated method stub
		
	}

}
