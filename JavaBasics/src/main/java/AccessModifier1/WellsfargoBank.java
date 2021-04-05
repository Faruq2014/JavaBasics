package AccessModifier1;

public class WellsfargoBank {
	
	//in the same class has acess
	// same package has access
	// Different package access through relationship(extends)
protected static double checkingBalance;
protected static double savingBalance;

protected  static void totalBalance() {
	double total=checkingBalance +savingBalance;
	System.out.println("WeelsFargo balance:  "+total);
}
}
