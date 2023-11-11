package Loops;

import java.util.Scanner;

public class MultiplesOF2 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num1:");
		int num1=scan.nextInt();
		System.out.println("Enter the value of num2");
		int num2=scan.nextInt();
			while(num1<=num2) {
				if(num1%2==0) {
					System.out.println(num1);
				}
				num1++;
			}
	}

}
