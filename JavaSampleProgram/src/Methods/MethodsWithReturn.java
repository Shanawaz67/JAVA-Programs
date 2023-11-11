package Methods;

public class MethodsWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Methods on the return type
		System.out.println("hello main");
		int num=5;
		int fact1=fact(num);
		System.out.println(fact1);
		System.out.println("bye bye main");
	}

	public static int fact(int num) {
		// TODO Auto-generated method stub
		System.out.println("hii fact");
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("bye bye fact");
		return fact;
	}

}
