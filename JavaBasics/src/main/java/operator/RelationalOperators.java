package operator;

/**
 * @author Faruq
 * this class is demonstrating relational operator and few functionality.
 *
 */
public class RelationalOperators {

	
	public static void main(String[] args) {
		//= is arithmetical operator
		//== logical operator for integer 
		int a=40;
		int b=30;
		System.out.println(a==b);
		
		// for string you have few different equals methods.
		String name ="Faruq";
		String name1="faruq";
		
		System.out.println(name==name1);// pointint to the value
		
		System.out.println(name.equals(name1));// making sure both side is true.
		
		
		System.out.println(name.equalsIgnoreCase(name1));// ignoring capital or small letter.
		
		
		int age=40;
		int age1=50;
		System.out.println("this is not equal"+(age!=age1));// not eaual
		//concatinating between string and boolean condition
		System.out.println("this is greater than"+(age>age1));
		System.out.println(age<age1);
		System.out.println(age<=age1);// = should be after < or > sign
		

	}

}
