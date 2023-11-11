package Loops;

import java.util.Scanner;

public class WithOutMul {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of M");
		int M=scan.nextInt();
		for(int i=1;i<=10;i++) {
			int result=0;
			for(int j=1;j<=i;j++) {
				result+=M;
			}
			System.out.println(M+"*"+i+"="+result);
		}
	}

}
