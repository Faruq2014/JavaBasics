package codingChallenge;

import java.util.Scanner;

public class JavaOutPutFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * input format
		 * every line of input will contain a String followed by 
		 * an integer will be inclusive range from 0 to 999
		 * 
		 * output format
		 * in each line of output there should be two columns:
		 * the first column contains the string and is left justified usinng exactly 15 character
		 * The second column contains the integer, express in exactly 3 digits, if the orginal inputs has less
		 * than three digits you must pad your outputs leading digits with zeros.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("===========");
		for (int i = 0; i <3; i++) {
			String s1=sc.next();
			int x=sc.nextInt();	
			System.out.printf("%-15s%03d\n",s1,x);
			// %s=String,-15= at the most 15 character, %d=integer, 3= at the most 3 digits,   \n= next line
		}
		
		System.out.println("=============");
	}

}
