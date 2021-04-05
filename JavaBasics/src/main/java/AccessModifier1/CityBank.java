package AccessModifier1;


public class CityBank {

	public int checkingBalance;
	public int savingBalance;
	
	public void totalBalance() {
		int total=checkingBalance+savingBalance;
		System.out.println("City bank balance: "+total);
	}
}
