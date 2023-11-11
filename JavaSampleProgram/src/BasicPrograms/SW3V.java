package BasicPrograms;

import java.util.Scanner;

public class SW3V {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter tha value of a : ");
		int a=scan.nextInt();
		System.out.println("Enter the value of b : ");
		int b=scan.nextInt();
		int c;
		System.out.println("Before swap a:" + a);
		System.out.println("Before swap b:" + b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swap a:" + a);
		System.out.println("After swap b:" + b);
	}

}
