package GlobalMembers;

public class SProgramP4 {
	static double d=10.5;
	public static void run() {
		System.out.println("From Run");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From Main");
		System.out.println(d);
		System.out.println(SProgramP4.d);
		SProgramP4.run();
		double d=22.6;
		System.out.println(d);
		System.out.println("Main Ends");
	}

}
