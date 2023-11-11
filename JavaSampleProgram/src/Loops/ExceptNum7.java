package Loops;

import java.util.Scanner;

public class ExceptNum7 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a:");
		int a=scan.nextInt();
		System.out.println("Enter the value of b:");
		int b=scan.nextInt();
//		calling the values of the num 
		callingNum(a,b);
	}
	public static void callingNum(int a, int b) {
		// TODO Auto-generated method stub
//		loop a to b
		for(int i=a;i<=b;i++) {
//			if num dose not contain 7 print it
			if(!contatinsSeven(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean contatinsSeven(int i) {
		// TODO Auto-generated method stub
//		convert integer into string
		String str=Integer.toString(i);
//		loop for each character of a string
//		Here we intialise the n=0 because it checks the index vaules of string that 
//		we converted .
		for(int n=0;n<str.length();n++) {
			if(str.charAt(n)=='7') {
				return true;
			}
		}
//		if num is not 7 then retun false
		return false;
	}

}
