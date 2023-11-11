package Loops;

import java.util.Scanner;

public class SumOf5Div {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of m");
		int m=scan.nextInt();
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		int sum=0;
		for(int i=m;i<=n;i++) {
			if(i%5==0) {
				sum=sum+i;
				System.out.println(i+" it is divisible by 5");
			}
			else {
				System.out.println(i+" it is not divisible by 5");
			}
		}
		System.out.println(sum);
	}

}
