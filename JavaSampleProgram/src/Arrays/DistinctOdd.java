package Arrays;

import java.util.Scanner;

public class DistinctOdd {
	static Scanner scan = new Scanner(System.in);
	static int count;

	public static void main(String[] args) {
		int index = 0;
		System.out.println("enter the size");
		int size = scan.nextInt();
		int arr[] = new int[size];
		int newaArray[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the values " + i);
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i] % 2 == 1) {
					count++;
					newaArray[index++] = arr[i];
					break;
				}
			}
		}
		System.out.println(count);
		int k[] = new int[count];
		for (int i = 0; i < count; i++) {
			k[i] = newaArray[i];
		}
		System.out.print("[");
		for (int m : k) {
			System.out.print(m);
		}
		System.out.println("]");
	}
}
