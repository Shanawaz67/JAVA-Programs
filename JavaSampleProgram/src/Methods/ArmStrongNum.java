package Methods;

public class ArmStrongNum {

	public static void main(String[] args) {
		int num=1633,rem,sum=0,count=0,n=num;
		while(num>0) {
			count++;
			num/=10;
		}
		num=n;
		while(n>0) {
			rem=n%10;
			sum=sum+count(rem,count);
			n/=10;
		}
		if(num==sum) {
			System.out.println(num+" is a Armstrong num");
		}
		else {
			System.out.println(num+" is not an Armstrong num");
		}
	}
	public static int count(int rem,int count) {
		int pro=1;
		for(int i=1;i<=count;i++) {
			pro=pro*rem;
		}
		return pro;
	}

}
