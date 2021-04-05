package AccessModifier1;

public class ChaseBank {
	// deafalut access modifier
	// inside the  class has access 
	// same package will have access.
	// different package no acess.
	
	float chackingBalance;
	float savingBalance;
	
	void totalBlance() {
		float total=chackingBalance+savingBalance;
		System.out.println(total);
	}

}
