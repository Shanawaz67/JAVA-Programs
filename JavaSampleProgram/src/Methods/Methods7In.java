package Methods;

public class Methods7In {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Methods with formal arguments ex:3
		System.out.println("hello main");
		String uN="chote";
		String pwd="shaju";
		login(uN,pwd);
		System.out.println("bye bye main");
	}
	public static void login(String uN1,String pwd1) {
		uN1="chote";
		pwd1="shaju";
		System.out.println("hii login");
		System.out.println("login is "+uN1+" is successful");
		System.out.println("login password is "+pwd1+" is correct");
		user2("ammi","rajiya");
		System.out.println("bye login");
	}
	public static void user2(String uN,String pwd) {
		System.out.println("hi user2");
		System.out.println(uN);
		System.out.println(pwd);
		String uN2="Ismail";
		String pwd2="dad";
		dad(uN2,pwd2);
		System.out.println("bye bye user2");
	}
	public static void dad(String uN2,String pwd2) {
		System.out.println("hello dad");
		System.out.println(uN2);
		System.out.println(pwd2);
		System.out.println("bye dad");
	}
}
