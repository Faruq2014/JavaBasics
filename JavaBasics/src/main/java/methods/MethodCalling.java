package methods;

public class MethodCalling {

	public static void main(String[] args) {
		//MethodCalling mc = new MethodCalling();
	    address("3333 , va");
		
	}
	
	
	public void userName(String name) {
		System.out.println("this is name method "+name);
	
	}
	
	public void userPhone(Double phone) {
		System.out.println("this is phone method "+phone);
		
	}
	
	public void isUserMilitary(boolean military) {
		System.out.println("this is military method "+military);
		userName("Faruq");
	}
	
	public static void address(String address) {
		
		MethodCalling mc=new MethodCalling(); // calling instance method from static method
		mc.userName("Faruq");
		
		System.out.println(address);
		
		/* java execution start from main method
		 * it execute top to bottom and left to right.
		 * your method calling will happen same way you place them in order.
		 * 
		 */
		
	}
	
	

}
