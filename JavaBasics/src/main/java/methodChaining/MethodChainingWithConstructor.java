package methodChaining;
class Students{
	
	int stdentId;
	double grade;
	float tutionFee;
	String studentName;
	public Students(int stdentId, double grade, float tutionFee, String studentName) {
		super();
		this.stdentId = stdentId;
		this.grade = grade;
		this.tutionFee = tutionFee;
		this.studentName = studentName;
	}
	
	public void diplay() {
		System.out.println("Student id : "+stdentId+" student name: "+studentName+
				" grade: "+ grade+ " Tution fee: "+tutionFee);
	}
	
	public Students passOrFail() {
		
		if (grade>2.5) {
			System.out.println(studentName+"  you pass");
		}else {
			System.out.println(studentName+" you fail");
		}
		return this;
	}
	
	public Students feePaidOrNot() {
		double fee=500;
		if(tutionFee<fee) {
			System.out.println( fee-tutionFee +"  need to pay as your tution fee");
		}
		return this;
	}

	
}
public class MethodChainingWithConstructor {

	public static void main(String[] args) {
		
		Students khaled = new Students(01, 4.0, 400, "Khaled Chowdhury");
		khaled.passOrFail().feePaidOrNot().diplay();
		
		Students Faruq = new Students(02, 2.0, 600, "Faruq molla");
		Faruq.passOrFail().feePaidOrNot().diplay();
	}

}
