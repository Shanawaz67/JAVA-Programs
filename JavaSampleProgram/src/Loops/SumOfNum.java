package Loops;

import java.util.Scanner;

public class SumOfNum {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num:");
		int num=scan.nextInt();
		remOfNum(num);
	}
	public static void remOfNum(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num!=0) {
			int num1=num%10;
			sum=sum+num1;
			num/=10;
		}
		System.out.println(sum);
	}
}
