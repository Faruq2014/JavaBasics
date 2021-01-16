package dataTypes;

public class DoubleDataType {

	public static void main(String[] args) {
		differntRangeOfDecimalData();
		differntRangeOfDecimalData();
	}
	
	public static void sameRangeOfDecimalData() {
		float age = 30.5f;
		// int = data type, age is the name of the variable and = is a operator and 30
		// is the value.
		double age1 = 200000000000.6777d;
		double Total = age + age1;
		System.out.println(Total);
	}
	public static void differntRangeOfDecimalData() {
		
		double balance=30000000000.44456777888888d;
		float balance1= 400.9999999999999999999999f;
		double total = balance+balance1;
		System.out.println(total);
		
		// smaller range
		double cash=3000000000000000000d;
		float cash1= 400.89899f;
		float cashTotal = (float) (cash+cash1);
		System.out.println(cashTotal);
	}

}
