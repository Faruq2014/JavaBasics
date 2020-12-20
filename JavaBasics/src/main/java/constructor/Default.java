package constructor;

public class Default {
	int salary;
	String name;
	String  companyName;
	
	Default(){}
	
	public Default(String companyName) {
	
		this.companyName = companyName;
		System.out.println(companyName);
	}



	public Default(int salary, String name) {
		
		this.salary = salary;
		this.name = name;
		
	}
	
	public Default(double salary, String name) {
		
		this.salary = (int) salary;
		this.name = name;
		
	}
	
public static void main(String[] args) {
	Default d = new Default();
	d.m1(17);
}





	public void m1(int age) {
		if (age>=18) {
			System.out.println("you can work");
		}else {System.out.println("you can not work here");}
	}
		
	
	
  
}
