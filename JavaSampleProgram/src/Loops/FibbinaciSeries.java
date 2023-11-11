package Loops;

import java.util.Scanner;

public class FibbinaciSeries {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of M");
		int m=scan.nextInt();
		System.out.println("Enter the value of N");
		int n=scan.nextInt();
		int a=0;
		int b=1;
		System.out.println("Fibbinaci Series between "+m+" to "+n);
		for(int i=1;i<=n;i++) {
			if(i>=m) {
				System.out.print(a+",");
			}
			int c=a+b;
			a=b;
			b=c;
		}
	}

}
