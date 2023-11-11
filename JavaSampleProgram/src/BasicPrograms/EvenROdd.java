package BasicPrograms;

import java.util.Scanner;

public class EvenROdd {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a: ");
		int a=scan.nextInt();
		System.out.println((a%2==0)?(a+(" is a even")):(a+(" is a odd")));
	}

}
