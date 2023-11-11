package SwitchCase;

import java.util.Scanner;

public class Nday2 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the day which reflects the day num:");
		String s=scan.next();
		switch(s) {
		case "Monday":{
			System.out.println(s+" its day is 1");
			break;
		}
		case "Tuesday":{
			System.out.println(s+" its day is 2");
			break;
		}
		case "Wednesday":{
			System.out.println(s+" its day is 3");
			break;
		}
		case "Thursday":{
			System.out.println(s+" its day is 4");
			break;
		}
		case "Friday":{
			System.out.println(s+" its day is 5");
			break;
		}
		case "Saturday":{
			System.out.println(s+" its day is 6");
			break;
		}
		case "Sunday":{
			System.out.println(s+" its day is 7");
			break;
		}
		default:System.out.println("Given data is not valid");
		}
	}

}
