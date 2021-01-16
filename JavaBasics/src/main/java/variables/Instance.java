package variables;

	public class Instance {
		
	   int age; // Instance variable
	
		public static void main(String[] args) {
			Instance v2= new Instance();
			v2.faruq();
			khaled();
			mili();
			v2.sana();
	
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
		
	 public void sana() {
		 age=21;
		 System.out.println("sana is "+age+" years old");
	 }
	 public static void mili() {
		 Instance ins = new Instance();
		 ins.age=20;
	 }
}
