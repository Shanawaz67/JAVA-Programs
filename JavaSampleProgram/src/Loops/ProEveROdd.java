package Loops;

import java.util.Scanner;

public class ProEveROdd {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num");
		int num=scan.nextInt();
		proDuct(num);
	}
	public static void proDuct(int num) {
		// TODO Auto-generated method stub
		int num1=0,pro=1;
		while(num>0) {
			num1=num%10;
			checkProEveROdd(pro=pro*num1);
			num/=10;
		}
	}
	public static void checkProEveROdd(int i) {
		// TODO Auto-generated method stub
		if(i%2==0) {
			System.out.println(i+" it is a even num");
		}
		else {
			System.out.println(i+" it is a odd num");
		}
	}

}
