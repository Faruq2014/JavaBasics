package dataTypes;

public class HowToDeclareStringDataType {

	public static void main(String[] args) {
	String firstName="Mohammed0@*)9";
	String lastName="Faruq";
	
	//String is the data type  
	//it has not limitation for range
	// you must put value inside the ""
	
	String fullName=firstName+lastName;
	System.out.println(fullName);
	// Concatenation
	// "+" is doing two function in java. first one is adding function as arithmatical operator and 
	// second one is Concatination as a string operator. so "+" is called over loading operator in java.
	
	String fullName1=firstName+" "+lastName;
	System.out.println(fullName1);
	
	String middleName="O";
	
	String fullName2=firstName+" "+middleName+" "+lastName;
	System.out.println(fullName2);
		

	}

}
