package constructor;

public class ConstructorBasics {

	public static void main(String[] args) {
		Students stu1 = new Students("Sajid",001, 1000, "summer");
		stu1.semester(); stu1.studentFee(500);
		
		Students stu2 = new Students("Mili",002, 1000, "summer");
		stu2.semester(); stu2.studentFee(300);
	}

}


class Students{
	
	
	
	/**
	 * constructor has same name as class
	 * it is not void nor it has return type.
	 * java create default constructor for you.
	 * user can create any number of constructor.
	 * constructor instantiate instance variable
	 * if you create user define constructor, java will not create default constructor.
	 */
	/*
	public Students() {
		super();	//default constructor.	
	}
*/
	String name;
	int id;
	double  fee;
	String semester;
	
	//user define constructor
	public Students(String name,int id, double fee, String semester) {
		super();
		this.name=name;
		this.id = id;
		this.fee = fee;
		this.semester = semester;
		System.out.println(name+" "+id+" "+fee+" "+semester);
	}

	static String college;
	
	 
	public void studentFee(double admisionFee) {
		System.out.println(fee+admisionFee);
	}
	public String  semester() {
		System.out.println(semester);
		return null;
		
	}
	
}
