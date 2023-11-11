package BasicPrograms;

import java.util.Scanner;

public class LO2N {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a: ");
		int a=scan.nextInt();
		System.out.println("Enter the value of b: ");
		int b=scan.nextInt();
		int res=(a>b)?(a):(b);
		System.out.println(res+" It is the largest variable");
	}

}
