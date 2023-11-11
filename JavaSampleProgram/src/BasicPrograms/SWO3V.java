package BasicPrograms;

import java.util.Scanner;

public class SWO3V {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a:");
		int a=scan.nextInt();
		System.out.println("Enter the value of b:");
		int b=scan.nextInt();
		System.out.println("Before swap a " + a);
		System.out.println("Before swap b " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap a " + a);
		System.out.println("After swap b " + b);
	}

}
