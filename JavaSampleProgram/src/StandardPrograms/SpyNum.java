package StandardPrograms;

import java.util.Scanner;

public class SpyNum {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num:");
		int num=scan.nextInt();
		spyNum(num);
	}
	public static void spyNum(int num) {
		// TODO Auto-generated method stub
		int a=num;
		int num1=0,sum=0,pro=1;
		while(num!=0) {
			num1=num%10;
			sum=sum+num1;
			pro=pro*num1;
			num/=10;
		}
//		for spy num sum and pro value should be equal
		if(sum==pro) {
			System.out.println(a+" it is a spy num");
		}
		else {
			System.out.println(a+" it is not a spy num");
		}
	}

}
