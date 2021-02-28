package operator;

/**
 * @author Faruq
 * logical operators normally come with conditional statement
 * in java there are two popular conditional statement 
 * if and else condition
 * switch and break condition. 
 *
 */
public class LogicalOperators {

	public static void main(String[] args) {
		//first condition is <=65 we should turn on heater
		
		int censor=77;
		
		if (censor>=0 && censor ==50 ) { // if block
			System.out.println("turn heater on");
		} else if(censor==51 && censor<=70){  //else if block, we can have as many as we want
			
			System.out.println("turn it off");
		}else if(censor==71 && censor<=110){
			
			System.out.println("turn air condition on");
		}else { // else block 
        System.out.println("turn heater off");
		}
		
		// and condition both condition must be tre
		int age=18;
		int age1=25;
		
		if ((age<age1)&&(age<age1)) {
		System.out.println("you can run for elections");	
		}
		//or condition is one of the arguments should be true
		if ((age<age1)|(age>age1)) {
			System.out.println("you can run for elections");	
			}
		// not eaual
		double money=200000;
		double bankBalance = 300000;
		if(bankBalance!=money) {
			System.out.println(" you need "+(money-bankBalance)+" more");
		}
			
		
        // and condition
		if((bankBalance==money)&(bankBalance>money)) {
			System.out.println(" you need "+(money-bankBalance)+" more");
		}

	}

}
