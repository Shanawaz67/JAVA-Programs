package StandardPrograms;

import java.util.Scanner;

public class SumOfNum {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the value of num:");
		int num=scan.nextInt();
		sumMation(num);
	}
	private static void sumMation(int num) {
		// TODO Auto-generated method stub
		int num1=0,sum=0;
		while(num!=0) {
			num1=num%10;
			sum=sum+num1;
//			It gives the individual sum values 
			System.out.println(sum);
			num/=10;
		}
	}

}
