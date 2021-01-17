package accessModifier;

	public class Sister {
	
		public static void main(String[] args) {
			Sister sis = new Sister();
			sis.personalProperties();
			sis.roomAccess();
			houseAccess();
			sis.libraray();
	
		}
		private  float money;
		
		// private is the most restricted access, only class can have access to it.
		private void personalProperties() { 
			//money=30000;
			System.out.println("Fiminane stuff"+ money);
			
		}
		
		 void roomAccess() {
			 money=40000;
			System.out.println("room access");
		}
		 
		 protected static void houseAccess() {
			 System.out.println("house access");
		 }
		 
		 public void libraray() {
			 System.out.println("Library");
			// personalProperties(); // in the same class, so it can access private method.
		 }

}
