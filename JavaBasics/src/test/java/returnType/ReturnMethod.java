package returnType;

public class ReturnMethod {

	public static void main(String[] args) {
		String shout =upperCase("why you are eating my food");
		System.out.println(shout);
	}
public static  String upperCase(String s) {
	return s.toUpperCase();
}
}
