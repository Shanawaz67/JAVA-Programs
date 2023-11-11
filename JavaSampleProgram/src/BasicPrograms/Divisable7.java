package BasicPrograms;

import java.util.Scanner;

public class Divisable7 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num:");
		int num=scan.nextInt();
		System.out.println((num%7==0)?(num+" it is divisble by 7"):(num+" it is not divisble by 7"));
	}

}
