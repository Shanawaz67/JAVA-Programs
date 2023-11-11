package Loops;

import java.util.Scanner;

public class ProductMtoN {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pro=1;
		System.out.println("Enter the value of M");
		int M=scan.nextInt();
		System.out.println("Enter the value of N");
		int N=scan.nextInt();
		for(int i=M;i<=N;i++) {
			pro=pro*i;
		}
		System.out.println(pro);
	}

}
