package ArrayProject;

import java.util.Arrays;

public class Updation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1,5,2,5,6,8,7,5,6, 2, 3, 4 };
		int new_ele = 7;
		int old_ele = 3;
		int ind = search(a, old_ele);
		if (a.length == 0) {
			System.out.println("Array is empty");
		} else if (ind == -1) {
			System.out.println("Replacing element is not present");
		} else {
			for (int i = 0; i < a.length; i++) {
				if (i==ind) {
					a[i] = new_ele;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}

	private static int search(int[] a, int old_ele) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			if(a[i]==old_ele) {
				return i;
			}
		}
		return -1;
	}

}
