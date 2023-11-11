package Methods;

public class MethodsSumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Odd Summation
		System.out.println("hello main");
		int num=7895;
		sum(num);
		System.out.println("bye main");
	}
	public static void sum(int num) {
		int odd1=0;
		while(num!=0) {
			
			int odd=0;
			odd=num%10;
			System.out.println(odd);
			num=num/10;
			if(odd%2==1) {
				odd1=odd1+odd;
			}
			
		}
		System.out.println(odd1);
		System.out.println("bye summation");
	}
}
