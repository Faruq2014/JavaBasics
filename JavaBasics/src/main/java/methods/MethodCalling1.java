	package methods;
	
	/**
	 * @author Faruq
	 * instance to instance=direct
	 * static to static= direct
	 *static to instance= direct
	 *instance to static= indirect-> referential class variable
	 */
	public class MethodCalling1 {
	
		public static void main(String[] args) {
		
			MethodCalling1 mc = new MethodCalling1();
			mc.m1();
			// m1 is called by main
			//m3 is called by m1
			// this scenario is called inner method calling. 
		}
		
		
	public void m1() {
		System.out.println("this is m1, and i am instance");
		m3();
		// m3 is instance method.
		// m1 is instance method 
		// so direct calling
		m2();
	}
	
	
	public static void m2() {
		System.out.println("this is m2, static");
		m4();
	}
	
	public void m3() {
		System.out.println("this is m3");
		 m4();// static coming inside the instance
	}
	
	public static void m4() {
		System.out.println("this is m4 static");
		MethodCalling1 cc= new MethodCalling1();
		cc.m5(); // instance coming inside the static 
	
	}
	
	public  void m5() {
		System.out.println("this is m5 instance");
	}
	
	
	 
	}
