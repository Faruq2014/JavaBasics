package dataTypes;

public class IntegerDataType {

	public static void main(String[] args) {
		sameRangeOfIntegerData();
		
		differntRangeOfIntegerData();
	}
	public static void sameRangeOfIntegerData() {
		int age=30;
		// int = data type, age is the name of the variable and = is a operator and 30 is the value.
		int age1=20;
		int Total=age+age1;
		System.out.println(Total);
	}
	public static void differntRangeOfIntegerData() {
		long balance=30000000000l;
		int balance1= 400;
		long total = balance+balance1;
		System.out.println(total);
		
		// smaller range
		long cash=3000000000000000000l;
		int cash1= 400;
		int cashTotal = (int) (cash+cash1);
		System.out.println(cashTotal);
	}

}
