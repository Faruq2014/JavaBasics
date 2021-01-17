package constructor;

public class Default1 {
 

	public static void main(String[] args) {
		Default1 d = new Default1();// default constructor
		d.m1();

	}
	/* inside the class if you don't declare at least one
	 *  constructor, compiler will automatically create zero 
	 *  argument or empty parameter (Default) constructor.
	 * default constructor access modifier is same as class modifier(except private and protected)
	 *  in this case compiler will write 
	 *  public default{ super();}
	 */
void m1(){//instance method
	System.out.println("m1 method");
}
}
