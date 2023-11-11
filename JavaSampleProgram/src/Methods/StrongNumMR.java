package Methods;

public class StrongNumMR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Strong Num by using Methods with return-type
		int num=145,num1=num;
		int strong1=strong(num);
		System.out.println(strong1);
		if(strong1==num1) {
			System.out.println("it is a strong num");
		}
		else {
			System.out.println("it is not a strong num");
		}
	}
	public static int strong(int num) {
		int rem=0,sum=0,fact=1;
		while(num>0) {
			rem=num%10;
			System.out.println(rem);
			sum=sum+fact(rem);
			num=num/10;
		}
		return sum;
	}
	public static int fact(int rem) {
		int fact=1;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		return fact;
	}
}
