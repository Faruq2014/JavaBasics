package variables;

public class Local {
  

	public static void main(String[] args) {
		Local v2= new Local();
		v2.faruq();
		khaled();
		v2.jui();

	}

	private void faruq() {
      int age=35;
      System.out.println(" faruq is "+age);
	}

	public static void khaled() {
		
		int age = 30;
	      System.out.println(" khaled is "+age);
	     
	}
	
	public void jui() {
		double hair=300000000.444;
		System.out.println(hair);
	}

}
