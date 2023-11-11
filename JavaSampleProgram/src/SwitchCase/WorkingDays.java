package SwitchCase;

import java.util.Scanner;

public class WorkingDays {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num which reflects the working day:");
		int i=scan.nextInt();
		if(i<=7) {
			switch(i) {
			case 1:{
				System.out.println(i+" its sunday so its not working day");
				break;
			}
			case 2:{
				System.out.println(i+" its monday so its working day");
				break;
			}
			case 3:{
				System.out.println(i+" its tuesday so its working day");
				break;
			}
			case 4:{
				System.out.println(i+" its wednesday so its working day");
				break;
			}
			case 5:{
				System.out.println(i+" its thursday so its working day");
				break;
			}
			case 6:{
				System.out.println(i+" its friday so its working day");
				break;
			}
			case 7:{
				System.out.println(i+" its saturday so its not working day");
				break;
			}
			default:System.out.println("Given data is not given");
			}
		}
	}

}
