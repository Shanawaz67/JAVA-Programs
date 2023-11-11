package BasicPrograms;

import java.util.Scanner;

public class LNS3N {
static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a:");
		int a=s.nextInt();
		System.out.println("Enter the value of b:");
		int b=s.nextInt();
		System.out.println("Enter the value of c:");
		int c=s.nextInt();
		int res=(a>b)?((b>c)?b:c):((a>c)?a:c);
		System.out.println(res +" is the largest num");
		System.out.println("***********");
		System.out.println("Enter the value of a1:");
		int a1=s.nextInt();
		System.out.println("Enter the value of b1:");
		int b1=s.nextInt();
		System.out.println("Enter the value of c1:");
		int c1=s.nextInt();
		int res1=(a1<b1)?((a1<c1)?a1:c1):((b1<c1)?b1:c1);
		System.out.println(res1 +" is the smallest num");
	}

}
