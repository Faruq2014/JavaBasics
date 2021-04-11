	package returnType;
	
	public class BasicsOfReturnAndVoidMethod {
	
	
		public static void main(String[] args) {
			BasicsOfReturnAndVoidMethod brm = new BasicsOfReturnAndVoidMethod();
			brm.m1();
			String name=brm.m2();	
			System.out.println(name.toUpperCase());
			brm.m3();
	
		} 
	
	
	
		/**
		 * void method has no return option
		 * you can not modify method any where else.
		 */
	
		public void m1() {
			String FirstName="faruq";
			System.out.println(FirstName);
		}
	
		/**
		 * return method has option to edition, modification 
		 *  you must declare data type
		 *  you must return same data type
		 *  return must be the last statement
		 *  
		 * @return
		 * 
		 */
		public String m2() {
			String FirstName="faruq";
	
			int money=3000;
			System.out.println(FirstName+" "+money);
			return FirstName;
	
		}
		public int m3() {
	
			int checking=2000;
			int saving=1000;
			int total = checking+saving;
			System.out.println(total);
			return checking;// even you choose different variable it will bring the logic.
	
		}
	
	}
	
	
	
	
	
	
	
