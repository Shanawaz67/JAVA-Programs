package Loops;

import java.util.Scanner;

public class CountDigits {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		int count=0;
		while(a>0) {
//			count=a%10;
			a/=10;
			count++;
		}
		System.out.println(count);
	}

}
