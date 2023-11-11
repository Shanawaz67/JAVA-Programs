package Methods;

public class MethodsWithReturnIndividualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello main");
		int num=777;
		int sum1=sum(num);
		System.out.println(sum1);
		System.out.println("bye bye main");
	}
	public static int sum(int num) {
		int rem=0,sum=0;
		while(num>0) {
			rem=num%10;
			System.out.println(rem);
			num=num/10;
			if(rem%2==1) {
				sum=sum+rem;
			}
		}
		return sum;
	}
}
