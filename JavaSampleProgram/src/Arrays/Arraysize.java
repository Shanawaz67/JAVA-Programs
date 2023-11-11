package Arrays;

import java.util.Scanner;

public class Arraysize {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size");
		int size=scan.nextInt();
		int[] array = new int[size];
		
		for(int i=0; i<size;i++) {
			System.out.println("enter the index of " + i);
			array[i]=scan.nextInt();
		}
		System.out.println("the inputs are printed below");
		System.out.print("[");
		for(int i=0; i<size;i++) {
			System.out.print(array[i] +",");
		}
		System.out.println("]");
	}
}