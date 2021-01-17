package methods;

public class MethodOverloading {

	public static void main(String[] args) {
		
		companyName("Saks");
		companyName("Saks", 2000000000 );
		
		MethodOverloading mol= new MethodOverloading();
		mol.userRegistration("Younes", 1112223333);
		//MethodOverloading mol1 = new MethodOverloading(); //	
		mol.userRegistration("mili", 222333444, "Nebraska");
		mol.userRegistration("Faruq", 333444555, false);
		
	}
	/*
	 * // method overloading 
	 * // method name must be same 
	 * // method signature must be different: method signature= method name+ argument.
	 * method overloading is static binding pollimorphism.
	 */	
	
	// one argument static method
	public static void companyName(String cName) {
		System.out.println("company name is "+ cName);
	}
	// two arguments static method
	public static void companyName(String cName, float salary) {
		System.out.println("company name is "+ cName + " salary is "+ salary);
	}
	
	//zero arguments  instance method
			public void userRegistration() { //static coding
				System.out.println("my name is Mili");
			}
		
	
	//one arguments  instance method
		public void userRegistration(String name) {
			System.out.println("Name is "+name);
		}
	
	//two arguments  instance method
	public void userRegistration(String name, long pNum) {
		System.out.println("Name is "+name+ " phnone number is "+pNum);
	}
	//three arguments  instance method
	public void userRegistration(String name, long pNum, String address) {
		System.out.println("Name is "+name+ " phnone number is "+pNum +" the address is "+ address);
	}
	//three arguments  instance method but data type is different from previous method
	public void userRegistration(String name, long pNum, boolean military) {
		System.out.println("Name is "+name+ " phnone number is "+pNum +" is military "+ military);
	}

}
