package SwitchCase;

import java.util.Scanner;

public class VRN {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the character:");
		char ch=scan.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			switch(ch)	{
			case'a':{
				System.out.println(ch+" it is a vowl");
				break;
			}
			case'A':{
				System.out.println(ch+" it is a vowl");
				break;
			}
			case'e':{
				System.out.println(ch+" it is a vowl");
				break;
			}
			case'E':{
				System.out.println(ch+" it is a vowl");
				break;
			}
			case'i':{
				System.out.println(ch+" it is a vowl");
				break;
			}
			case'I':{
				System.out.println(ch+" it is a vowl");
				break;
			}
			case'o':{
				System.out.println(ch+" it is a vowl");
				break;
			}
			case'O':{
				System.out.println(ch+" it is a vowl");
				break;
			}
			default:{
				System.out.println(ch+" it is a constant");
			}
			}
		}
	}

}
