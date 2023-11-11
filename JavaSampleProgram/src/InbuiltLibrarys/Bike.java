package InbuiltLibrarys;

public class Bike {
	String bN;
	int price;
	int cc;
	public Bike(String bN,int price,int cc) {
		this.bN=bN;
		this.price=price;
		this.cc=cc;
	}
	public void drive() {
		System.out.println("ride the royal enfield");
	}
}
