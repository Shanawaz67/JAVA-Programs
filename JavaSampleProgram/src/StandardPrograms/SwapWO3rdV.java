package StandardPrograms;

import java.util.Scanner;

public class SwapWO3rdV {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num1:");
		int num1=scan.nextInt();
		System.out.println("Enter the value of num2:");
		int num2=scan.nextInt();
//		First we have to add the 2 values
		num1=num1+num2;
//		Then we have to sub num1-num2 to get the value of num2
		num2=num1-num2;
//		Then we have to sub num1-num2 to get the vulue of num1
		num1=num1-num2;
//		Then it swaps the both the value to the variables
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}

}
