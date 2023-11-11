package Loops;

import java.util.Scanner;

public class AlphaReadNum {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num to fetch the alphabet:");
		int num=scan.nextInt();
		if(num<1||num>26) {
			System.out.println("You entered the is wrong num");
		}
		else {
			char c = 0;
			for(int i=0;i<num;i++) {
				 c= (char)('A'+i);
//				System.out.println(c+" ");
			}
			System.out.println(c+" ");
		}
	}

}
