	package codingChallenge;
	
	import java.util.Scanner;
	
	public class NumberRangeIfElse {
	/*
	 * given an integer, n, perform the following conditional actions
	 * if n is odd, print Wired; 
	 * if n is even and in the inclusive range of 6 to 20 print Weird
	 * if n is even and greater than 20, print not Weird.
	 */
		public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	String answer="";
	if (n%2==1) {
		answer="Very Wired";
	} else {
	if (n>=6&& n<=20) {
		answer="Wired";
	}
	else {
		answer=" not Wired";
	}
	}
	System.out.println(answer);
		}
	
	}
