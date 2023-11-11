package Loops;

import java.util.Scanner;

public class MtoNdivBy7 {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of m");
		int m=scan.nextInt();
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		int count=0;
		for(int i=m;i<=n;i++) {
			if(i%7==0) {
				count++;
				System.out.println(i+" it is divisible by 7");
			}
			else {
				System.out.println(i+" it is not divisible by 7");
			}
		}
		System.out.println(count);
	}

}
