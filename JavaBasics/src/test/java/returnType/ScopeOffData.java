package returnType;

public class ScopeOffData {

	public static void main(String[] args) {

		ScopeOffData sc=new ScopeOffData();
		sc.m2(); 
		sc.m4();
	}

	public int m1() {
		int checking =2000;
		System.out.println("i am int data type"+checking);
		return checking;
	}
	/**
	 * we can increase the scope of data 
	 * @return
	 */
	public double m2() {
		double balance=m1();
		System.out.println("i am double data type "+balance);
		return balance;
	}

	public double m3() {
		double checking =2000;
		System.out.println("i am int double type on m3 "+checking);
		return checking;
	}
	/**
	 * we can not  decrease the scope of data 
	 * @return
	 */
	public int m4() {
		int balance=(int) m3();
		System.out.println("i am int data type om m4 "+balance);
		return balance;
	}
}
