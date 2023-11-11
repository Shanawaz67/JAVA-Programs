package Loops;

import java.util.Scanner;

public class Count5 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a:");
		int a=scan.nextInt();
		System.out.println("Enter the value of b:");
		int b=scan.nextInt();
		callingNum(a,b);
	}
	public static void callingNum(int a, int b) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=a;i<=b;i++) {
			if(containsNum5(i)) {
				count++;
			}
		}
		System.out.println("The num of num's between "+a+" and "+b+" that have 5 in them is "+count);
	}
	public static boolean containsNum5(int i) {
		// TODO Auto-generated method stub
		String str=Integer.toString(i);
//		Here we intialise the n=0 because it checks the index vaules of string that 
//		we converted .
		for(int n=0;n<str.length();n++) {
			if(str.charAt(n)=='5') {
				return true;
			}
		}
		return false;
	}

}
