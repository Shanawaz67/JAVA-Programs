package StandardPrograms;

import java.util.Scanner;

public class ReverseNum {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of num:");
		int num=scan.nextInt();
		int rev=reveseNum(num);
		System.out.println(rev);
	}
	public static int reveseNum(int num) {
		int rem=0,rev=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
//		System.out.println(rev);
		return rev;
	}

}
