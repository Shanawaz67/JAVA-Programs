package StandardPrograms;

import java.util.Scanner;

public class ProOfNum {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num:");
		int num=scan.nextInt();
		proNum(num);
	}
	public static void proNum(int num) {
		// TODO Auto-generated method stub
		int num1=0,pro=1;
		while(num!=0) {
			num1=num%10;
			pro=pro*num1;
//			It gives product of individual num's
			System.out.println(pro);
			num/=10;
		}
	}

}
