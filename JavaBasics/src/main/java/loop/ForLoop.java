package loop;

public class ForLoop {

		public static void main(String[] args) {
			ForLoop fl= new ForLoop();
			//fl.premitiveForLoop();
			fl.arrayLoop();
			fl.StringLoop();
	
		}
		
		public void premitiveForLoop() {
			
			for (int i = 0; i <=10; i++) {
				System.out.println(i);
			}
		}
		
	
	public void arrayLoop() {
		
		int[] apple= {5,6,7,5,5,7,8,9,0,6,8,4,7};
		
		System.out.println("the size of the array "+apple.length);
		
		for (int j = 0; j < apple.length; j++) {
			System.out.println(apple[j]);
		}
	}
	
	public void StringLoop() {
		String [] name= {"Faruq","sales","Mili","Younes"};
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
	}
	

}