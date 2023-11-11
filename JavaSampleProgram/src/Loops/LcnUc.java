package Loops;

import java.util.Scanner;

public class LcnUc {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		while(ch>='A'&&ch<='Z') {
			System.out.println(ch+" "+(char) (ch+32));
			ch++;
		}
	}

}
