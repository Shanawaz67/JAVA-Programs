package Loops;

import java.util.Scanner;

public class ReverseANum {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		int rev=0,rem=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
			
		}
		System.out.println(rev);
	}

}
