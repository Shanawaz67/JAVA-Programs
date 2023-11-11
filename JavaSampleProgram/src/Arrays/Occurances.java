package Arrays;

import java.util.Scanner;

public class Occurances{
     static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;          
		System.out.println("enter the size");
		int size =scan.nextInt();
		int arr[] = new int[size];
		
		
		for(int i=0;i<size;i++) {
			System.out.println("enter the values " + i);
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<size;i++) {
			 count=0;
			for(int j=0;j<size;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
				
			}
			System.out.println("occurence of "+ arr[i] + "is" + count) ;
		}
	}

}
