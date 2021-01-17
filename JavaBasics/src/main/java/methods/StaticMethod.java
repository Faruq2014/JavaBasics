package methods;

public class StaticMethod {
	
    public static void main(String[] args) {
    	//public is one of the access modifier that means who will have access or not
    	// main method is alway public.
    	// static is access specifier, which means it is ready to use from open to end of the class. 
    	// void is the return type. main method is always void. it does not return anything.
    	// main is the method name
    	//String[] args, it means inbuilt argument for main method.
    	
	mili();//static method. static to static = direct access
	
	StaticMethod sm = new StaticMethod();
	sm.jui(); // instance methos, instance to static= class reference variable access.
	sm.student("youness");// perameterized method, you must pass the argument.
	studentId(100);

}

// static method
	public static void mili() {
			
		System.out.println("my name is Mili");
	}
	
	// instance method
	public void jui() {
		
		System.out.println("my name is jui");
	}
	
	// instance method with parameter
	public  void student(String name) {
		
		System.out.println("my name is "+name);
	}
	// static method with parameter.
  public static void studentId(double id) {
		
		System.out.println("my ID is "+id);
	}
	
	
}
