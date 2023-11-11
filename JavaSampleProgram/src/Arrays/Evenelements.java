package Arrays;

import java.util.Scanner;

public class Evenelements {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the size :");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the index value of " + i);
			arr[i] = scan.nextInt();
		}
		System.out.println("even numbers are :");
		System.out.print("[ ");
		for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			i++;
		}
			System.out.println("]");

	}
}