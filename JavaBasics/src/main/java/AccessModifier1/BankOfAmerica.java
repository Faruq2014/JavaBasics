package AccessModifier1;


public class BankOfAmerica {
 private float Checkingbalance;
 
 private float Savingbalance;
 
 public float getCheckingbalance() {
	return Checkingbalance;
}

public void setCheckingbalance(float checkingbalance) {
	Checkingbalance = checkingbalance;
}

// private method and variable
 // only access inside its own class
 // no aceess out side of the class.
 // getter and setter will give access to the other class.

 private void checkingAccountBalance(float Checkingbalance) {
	 if (Checkingbalance<2000) {
		System.out.println("you do not have enough balance");
	}
 }
 
}
