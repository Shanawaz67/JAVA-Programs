package StandardPrograms;

import java.util.Scanner;

public class CheckPolindrome {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a:");
		int a=scan.nextInt();
		revNum(a);
	}
	public static void revNum(int a) {
		int b=a;
		int num=0,rev=0;
		while(a!=0) {
			num=a%10;
			rev=rev*10+num;
			a/=10;
		}
		if(rev==b) {
			System.out.println(rev+" it is a polindrome num");
		}
		else {
			System.out.println(rev+" it is not a polindrome num");
		}
	}

}
