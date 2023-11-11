package Methods;

public class MethodsFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Factorial in method formal arguments
		System.out.println("hello main");
		int num=5,fact=1;
		fact(num,fact);
	}
	public static void fact(int num,int fact) {
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
