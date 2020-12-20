package codingChallenge;

import java.util.Scanner;

public class StdInputAndStdOutpot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * input format
 * The first line contain integer
 * The second line contain double
 * The third line contain a String 
 * 
 * Output Format
 * first line print string
 * Second line print double 
 * Third line print int.
 * 
 */
		// standard input
		Scanner scan = new Scanner(System.in);
		int i=scan.nextInt();
		double d=scan.nextDouble();
		scan.nextLine();  
		// you must write empty scan.nextLine(); to clear the buffer, 
		//otherwise it will not print the string properly.
		String s=scan.nextLine();
		
		
		// standard output.
		System.out.println("String"+s);
		System.out.println("Double"+d);
		System.out.println("integer"+i);
	}

}
