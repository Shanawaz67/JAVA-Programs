package SwitchCase;

import java.util.Scanner;

public class Day1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num which reflects the day:");
		int i=scan.nextInt();
		if(i<=7) {
			switch(i) {
			case 1:{
				System.out.println(" its sunday");
			}
			case 2:{
				System.out.println(" its monday");
//				break;
			}
			case 3:{
				System.out.println(" its tuesday");
//				break;
			}
			case 4:{
				System.out.println(" its wednesday");
//				break;
			}
			case 5:{
				System.out.println(" its thursday");
//				break;
			}
			case 6:{
				System.out.println(" its friday");
//				break;
			}
			case 7:{
				System.out.println(" its saturday");
				break;
			}
			default:System.out.println("Given data is not given");
			}
		}
	}

}
