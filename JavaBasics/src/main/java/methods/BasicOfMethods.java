	package methods;
	
	public class BasicOfMethods {
	
		public static void main(String[] args) {
			// main method is always static.
			// Essays access
			// it is always loaded.
			// java execution always starts from main method. 
			BasicOfMethods bom = new BasicOfMethods(); // class referential variable
			bom.m1();
			m2();
			bom.m3();
		}
	
		// this is instance method
		public void m1() {
			System.out.println("this is m1");
		}
		// this is static method
		public static  void m2() {
			System.out.println("this is m2");
		}
		public void m3() {
			System.out.println("this is m3");
		}
	
	}
