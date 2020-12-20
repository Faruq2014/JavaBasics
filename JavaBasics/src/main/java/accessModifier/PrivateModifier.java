package accessModifier;

public class PrivateModifier {

	public static void main(String[] args) {
		PrivateModifier pm= new PrivateModifier();
	pm.m4(24);
	pm.m3(5);
		
	}
		
			public void m1(long salary) {
		if (salary>=30000) {
			System.out.println("keep working");
		}
			   }
		
			
		
			protected  static void m2(String name) {
		     if (name.equalsIgnoreCase("Faruq")) {
				System.out.println("lets make reltionship");
			} else {
             System.out.println("we do not know you");
			}
			}
			
			
			void m3(int n) {
				
				for (int i = 0; i <= n; i++) {
					System.out.println(i);
				}
			}
			
		
			private void m4(int age) {
		    if (age >=18) {
			System.out.println("yes you can vote");
		           }
			}
			
			
		
		}
