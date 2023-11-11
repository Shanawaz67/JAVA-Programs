package Loops;

import java.util.Scanner;

public class AlphaHorizontal {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the character:");
		char ch=scan.next().charAt(0);
		while((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.print(ch+" ");
			ch++;
		}
	}

}
