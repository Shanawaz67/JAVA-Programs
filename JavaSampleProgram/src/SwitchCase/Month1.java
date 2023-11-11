package SwitchCase;

import java.util.Scanner;

public class Month1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num of the months which reflects the num of days");
		int i=scan.nextInt();
		if(i<=12) {
			switch(i) {
			case 1:{
				System.out.println(i+" jan num of days are 31");
				break;
			}
			case 2:{
				System.out.println(i+" feb num of days are 28");
				break;
			}
			case 3:{
				System.out.println(i+" mar num of days are 30");
				break;
			}
			case 4:{
				System.out.println(i+" april num of days are 31");
				break;
			}
			case 5:{
				System.out.println(i+" may num of days are 30");
				break;
			}
			case 6:{
				System.out.println(i+" jun num of days are 31");
				break;
			}
			case 7:{
				System.out.println(i+" july num of days are 30");
				break;
			}
			case 8:{
				System.out.println(i+" agust num of days are 30");
				break;
			}
			case 9:{
				System.out.println(i+" sep num of days are 30");
				break;
			}
			case 10:{
				System.out.println(i+" oct num of days are 30");
				break;
			}
			case 11:{
				System.out.println(i+" nov num of days are 30");
				break;
			}
			case 12:{
				System.out.println(i+" dec num of days are 31");
				break;
			}
			default:System.out.println("given condition is wrong");
			}
		}
	}

}
