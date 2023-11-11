package Loops;

import java.util.Scanner;

public class ReversingNum {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		int b=0;
		while(a>0) {
			b=a%10;
			a/=10;
			System.out.print(b);
		}
	}

}
