package SwitchCase;

import java.util.Scanner;

public class Nday1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num which reflects the day:");
		int num=scan.nextInt();
		if(num<=7) {
			switch(num) {
			case 1:{
				System.out.println(num+" it is a sunday");
				break;
			}
			case 2:{
				System.out.println(num+" it is a monday");
				break;
			}
			case 3:{
				System.out.println(num+" it is a tuesday");
				break;
			}
			case 4:{
				System.out.println(num+" it is a wensday");
				break;
			}
			case 5:{
				System.out.println(num+" it is a thursday");
				break;
			}
			case 6:{
				System.out.println(num+" it is a friday");
				break;
			}
			case 7:{
				System.out.println(num+" it is a saturday");
				break;
			}
			default:{
				System.out.println("it is not there");
			}
			}
		}
	}

}
