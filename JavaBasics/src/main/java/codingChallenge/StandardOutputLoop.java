package codingChallenge;

import java.util.Scanner;

public class StandardOutputLoop {

	public static void main(String[] args) {
	// given an integer, N, print the first 10 multiple, 
	//	each multiple N*i(where 1<1<10)
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
for (int i = 0; i <=10; i++) {
	int result= n*i;
	System.out.printf("%d x %d =%d\n",n,i,result);
	// %d=integer, \n= next line
}
	}

}
