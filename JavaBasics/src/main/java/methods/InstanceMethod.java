			package methods;
			
			public class InstanceMethod {
			
				public static void main(String[] args) {
					
					
				}
				
				public void  m1() {
					System.out.println("i am m1+0 argement");
					m1(25);
					m1(45,"NJ");
					m2();
				}
				public  void  m1(int age) {
					   System.out.println("i am m1+int argument");
					}
				public  void  m1(int age, String city) {
					   System.out.println("i am m1+ int and string argument");
					}
				
				// same method name but different parameter argument= method overloading
				// method name + parameter argument = method signature =m1(int age, String city).
				
				
				
			   public static void  m2() {
				   System.out.println("i am m2+0 arg");
				   m2(" name");
				   
				   InstanceMethod ins1= new InstanceMethod();
				  ins1.m1();
				}
			   
			      public static void  m2(String name) {
				   System.out.println("i am m2+String arg");
				}
			
			
			
			}
