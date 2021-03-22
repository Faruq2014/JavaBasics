package variables;

public class InstanceVariable {
	String name;
	int age;
	
	/*scope= inside the class but out side of the method as a results variables are common 
	 * for all the methods
	 * common variable, and use again and again, then we declare instance.
	 * instance variable must declare data type
	 * must declare name
	 * instance variable  does not have to declare value
	 * if you do not declare value than it takes default value.
	 * instance varible can take any modifier
	 * 
	 */
	
	

	public static void main(String[] args) {
		InstanceVariable ins = new InstanceVariable();
		ins.name();
		ins.age();

	}
	
	public  void name() {
		name="Faruq";
		System.out.println(name);
	}
	
public  void age() {
	name="Sajid";
	System.out.println(name);
	}

}
