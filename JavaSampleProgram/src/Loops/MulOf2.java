package Loops;

import java.util.Scanner;

public class MulOf2 {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of M");
		int M=scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d\n",M,i,M*i);
		}
	}

}
