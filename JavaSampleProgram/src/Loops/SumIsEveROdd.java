package Loops;

import java.util.Scanner;

public class SumIsEveROdd {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num:");
		int num=scan.nextInt();
		sumMation(num);
	}
	public static void sumMation(int num) {
		// TODO Auto-generated method stub
		int num1=0,sum=0;
		while(num!=0) {
			num1=num%10;
			checkEveROdd(sum=sum+num1);
			num/=10;
		}
		
	}
	public static void checkEveROdd(int i) {
		// TODO Auto-generated method stub
		if(i%2==0) {
			System.out.println(i+" it is a even");
		}
		else {
			System.out.println(i+" it is a odd");
		}
	}

}
