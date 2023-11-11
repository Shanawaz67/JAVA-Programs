package ArrayProject;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8,9,};
		int res[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			res[i]=a[i];
		}
		for(int i=0,j=a.length;i<b.length;i++,j++) {
			res[j]=b[i];
		}
		System.out.println(Arrays.toString(res));
	}

}
