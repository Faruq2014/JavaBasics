	package methods;
	
	public class MethodOverloading1 {
	
		public static void main(String[] args) {
			MethodOverloading1 mo = new MethodOverloading1();
			mo.faruq(23);
			mo.faruq("babba");
			mo.faruq(10000000.00f, "car");
		}
	
		// method name=faruq(). duplicate method are not allow
		// method body={}
		// method signature=method name+ parameter ex: faruq(String name)
		// 
	
		public void faruq(String name) {
	
			System.out.println("Name is " + name);
		}
	
		public void faruq(int age) {
	
			System.out.println("Age is " + age);
		}
		public void faruq(float money, String property) {
	
			System.out.println("money is " + money);
			System.out.println("property is " + property);
		}
	
	
	}
