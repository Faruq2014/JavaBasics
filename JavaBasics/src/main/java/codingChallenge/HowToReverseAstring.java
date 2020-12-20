package codingChallenge;

public class HowToReverseAstring {
/*
 * 
 * Write a string and reverse it.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWithStringBuilder("Hello"));
	}
public static String reverseWithStringBuilder(String str) {
	
	return new StringBuilder(str).reverse().toString();
	
}
}
