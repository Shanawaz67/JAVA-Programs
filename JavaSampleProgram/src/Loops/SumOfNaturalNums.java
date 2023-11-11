package Loops;

import java.util.Scanner;

public class SumOfNaturalNums {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of M");
		int M=scan.nextInt();
		System.out.println("Enter the value of N");
		int N=scan.nextInt();
		int sum=0;
		for(int i=M;i<=N;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
