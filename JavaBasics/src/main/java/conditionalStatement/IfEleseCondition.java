package conditionalStatement;

public class IfEleseCondition {

	public static void main(String[] args) {
		
		IfEleseCondition is = new IfEleseCondition();
		//is.ageMethod(18);
		is.studentScore(50);
	}
	
	
	
	public void ageMethod(int age) {
	if (age>=18) {
		System.out.println("you can vote");
	} else {
         System.out.println("you are too young to vote");
	}
	}
	
	public void studentScore(int marks) {
		
		if (marks<33) {
			System.out.println("you fail");
		}else if(marks>=33 ) {
			System.out.println("you have third division");
		}
		else if(marks>45 ) {
			System.out.println("you have second division");
		}
		else {
			System.out.println("i am not sure");

		}
		
	}

}
