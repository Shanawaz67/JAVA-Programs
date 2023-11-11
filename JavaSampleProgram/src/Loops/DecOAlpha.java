package Loops;

public class DecOAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='z';
		int i=26;
		while(i>=1) {
			System.out.println(ch+" "+(char)(ch-32));
			i--;
			ch--;
		}
	}

}
