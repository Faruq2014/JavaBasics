package variables;

public class LocalVariables {
	
	
	public static void main(String[] args) {
		age();
		name();
	}
	
	public static void age() {
		// variable is a place holder.
		final int age=23;
		System.out.println(age);
		//int is a data type, you must declare data type for variable
		// faruq is the name of the variable, must have a name for variable.
		//= is a operator
		
		
		//23= is the value of the variable.
		// local variable must declare value 
		//scope of the local variable is only inside the method
		// local variable can not have any other modifier but final
		
		int chocklet=5;
		int soda=5;
		int total= chocklet+soda;	
		System.out.println(total);
		int fromHome=20;
		int Return=fromHome-total;
		System.out.println(Return);
		
	}
	
	public static void name() {
		String Fname= "Faruq";
		String Lname="Molla";
		String fullName=Fname+" "+Lname;
		System.out.println(fullName);
		
	}







}




