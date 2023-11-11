package IfElse;

import java.util.Scanner;

public class AsciiValue {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the character:");
		char ch1=scan.next().charAt(0);
		int asscii=ch1;
		if((ch1>='a' && ch1<='z')||(ch1>='A' && ch1<='Z')||(ch1>='0' && ch1<='9')) {
			System.out.println(asscii+" it is the asscii value of given character");
			if(asscii%2==0) {
				System.out.println(asscii+" it is the even asscii value of given character");
			}
			else {
				System.out.println(asscii+" it is the odd asscii value of given character");
			}
		}
		else {
			System.out.println(asscii+" it is the asscii value of spl char");
			if(asscii%2==0) {
				System.out.println(asscii+" it is the even asscii value of spl char");
			}
			else {
				System.out.println(asscii+" it is the odd asscii value of spl char");
			}
		}
	}

}
