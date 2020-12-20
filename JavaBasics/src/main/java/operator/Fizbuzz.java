	package operator;
	
	/**
	 * Write a number n.
	 * if n is divided by 3 and 5 then print Fizbuz
	 * if n is divided by 3 but not by 5 then print Fiz
	 * if n is divided by 5 but not by 3 then print Buz
	 * any other condition print the n
	 * @author Faruq
	 *
	 */
	public class Fizbuzz {
	
		public static void main(String[] args) {
			fizzBuzz(20);
			fizzBuzz2(15);
			fizzBuzz3(15);
			fizzBuzz4(15);
	
		}
		
		/*
	     * Complete the 'fizzBuzz' function below.
	     *
	     * The function accepts INTEGER n as parameter.
	     */
	
	    public static void fizzBuzz(int n) {
	    // Write your code here
	    
	if((n%3==0)&&(n%5==0)){
	    System.out.println("fizbuz");
	}else if ((n%3==0)&&(n%5>0)) {
	    System.out.println("fiz");
	}else if ((n%5==0)&&(n%3 >0)) {
	    System.out.println("buzz");
	}
	 else {
	    System.out.println(n);
	}
	    }
	    
	    public static void fizzBuzz2(int n) {
	        // Write your code here
	            
	    if((n%3==0)&&(n%5==0)){
	        System.out.println("FizzBuzz");
	    }else if ((n%3==0)&&(n%5!=0)) {
	        System.out.println("Fizz");
	    }else if ((n%5==0)&&(n%3!=0)) {
	        System.out.println("Buzz");
	    }
	     else {
	        System.out.println(n);
	    }
	        }
	    
	    public static void fizzBuzz3(int n) {
	        // Write your code here
	    	for (int i = 1; i <=n; i++) {          
	    if((i%3==0)&&(i%5==0)){
	        System.out.println("FizzBuzz");
	    }else if (i%3==0) {
	        System.out.println("Fizz");
	    }else if (i%5==0) {
	        System.out.println("Buzz");
	    }
	     else {
	        System.out.println(i);
	    }
	    	}
	        }
	    
	    public static void fizzBuzz4(int n) {
	        // Write your code here
	    	for (int i = 1; i <=n; i++) {
	            // Write your code here
	            
	    	    if((i%3==0)&&(i%5==0)){
	    	        System.out.println("FizzBuzz");
	    	    }else if ((i%3==0)&&(i%5!=0)) {
	    	        System.out.println("Fizz");
	    	    }else if ((i%5==0)&&(i%3!=0)) {
	    	        System.out.println("Buzz");
	    	    }
	    	     else {
	    	        System.out.println(i);
	    	    }
	    	        }
	        }
	
	
	}
	
	
