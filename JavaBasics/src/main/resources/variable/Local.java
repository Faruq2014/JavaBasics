package variable;

public class Local {

	public static void main(String[] args) {
		Local v = new Local();
		 v.m1();
		//non static method or variable access through referential object
			
		 Local.m2();  // non static method or variable access directly
		

	}
	
	public void m1(){
		int age1=35;
		
		String name="Faruq";
	  System.out.println("non static method age" +"  "+ age1+" "+ name);
	  }
		
	   static void m2(){	
		final int age=10; //only final access modifier
	    System.out.println("this is static method age" +"  "+ age);
		  //System.out.println("non static method age" +"  "+ age+" "+ name);

	}

}
