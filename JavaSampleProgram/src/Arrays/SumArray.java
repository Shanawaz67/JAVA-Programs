package Arrays;

import java.util.Scanner;

public class SumArray {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int k = 0;
		System.out.println("enter the size :");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the index value of " + i);
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < size; i++) {
			k = arr[i] + k;
		}
		System.out.println("the sum of given inputs are : " + k);
	}
}