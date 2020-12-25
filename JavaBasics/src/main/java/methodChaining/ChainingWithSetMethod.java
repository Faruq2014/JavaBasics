package methodChaining;
class Human{
	int eye;
	double hair;
	String name;
	
	public Human setEye(int eye) {
		this.eye = eye;
		return this;
	}
	public Human setHair(double hair) {
		this.hair = hair;
		return this;
	}
	public Human setName(String name) {
		this.name = name;
		return this;
	}
	
	public void display() {
		System.out.println(name+" has "+eye+" eye, "+hair+" hair");
	}
	
}

public class ChainingWithSetMethod {

	public static void main(String[] args) {
	Human faruq = new Human();
	faruq.setName("Faruq Molla").setEye(2).setHair(23344).display();
	faruq.setName("Fabiha Molla").setEye(2).setHair(56344).display();
	faruq.setName("Faiza Molla").setEye(2).setHair(98344).display();

	}

}
