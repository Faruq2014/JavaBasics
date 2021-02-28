package methods;

public class MethodOverRiding extends MethodOverloading{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverRiding mr= new MethodOverRiding();
		mr.userRegistration("Mili", 333444555);
	}
	
	
	//two arguments  instance method
		public void userRegistration(String name, long pNum) {
			String Lname= "Krim";
			System.out.println("Name is "+name+" " +Lname+ " phnone number is "+pNum);
		}

}
