package dataTypes;

public class StringDataType {

	public static void main(String[] args) {
		concatinetion();

	}
	public static void concatinetion() {
		String Fname= "Saleh";
		String Lname= "Chowdhury";
		//+ is the only operator who is doing two function
		// one is addition
		// second is concatenation
		// this is why it is called overloaded operator.
		String fullName= Fname+" "+Lname;
		
		System.out.println("His full name is   "+fullName);
	}

}
