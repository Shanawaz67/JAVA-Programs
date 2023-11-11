package IfElse;

import java.util.Scanner;

public class SpecialCheck {
	static Scanner ayeshu=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the character:");
		char ch1=ayeshu.next().charAt(0);
		if((ch1>='a' && ch1<='z')) {
			System.out.println(ch1+" it is not a special character");
		}
		else if((ch1>='a' && ch1<='z')) {
			System.out.println(ch1+" it is not a special character");
		}
		else if((ch1>='0' && ch1<='9')) {
			System.out.println(ch1+" it is not a special character");
		}
		else {
			System.out.println(ch1+ " it is a special character");
		}
	}

}
