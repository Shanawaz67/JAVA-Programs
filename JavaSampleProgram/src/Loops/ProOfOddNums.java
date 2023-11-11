package Loops;

import java.util.Scanner;

public class ProOfOddNums {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of M");
		int M=scan.nextInt();
		System.out.println("Enter the value of N");
		int N=scan.nextInt();
		int pro=1;
		while(M<N) {
			if(M%2!=0) {
				System.out.println(M);
				pro=pro*M;
			}
			M++;
		}
		System.out.println(pro);
	}

}
