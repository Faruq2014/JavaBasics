package variables;

public class Instance {
   int age; // Instance variable

	public static void main(String[] args) {
		Instance v2= new Instance();
		v2.faruq();
		v2.khaled();

	}

	private void faruq() {
      age=35;
      System.out.println(" faruq is "+age);
	}

	public static void khaled() {
		Instance v2= new Instance();
		v2.age=30;
	      System.out.println(" khaled is "+v2.age);
	}

}
