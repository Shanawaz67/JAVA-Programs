package Methods;

public class Methods2 {
	public static void main(String[] args) {
		System.out.println("main starts");
		login();
		System.out.println("main ends");
	}
	static public void login() {
		String userName="rita";
		String pasWrd="rita@123";
		System.out.println("login of " + userName + " is successful");
		System.out.println("login of password " + pasWrd + " is correct");
	}
}
