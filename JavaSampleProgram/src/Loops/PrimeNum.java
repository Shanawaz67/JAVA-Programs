package Loops;

import java.util.Scanner;

public class PrimeNum {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of m");
		int m=scan.nextInt();
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		for(int i=m;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
