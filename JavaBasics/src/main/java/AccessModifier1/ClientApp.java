package AccessModifier1;

public class ClientApp {

	public static void main(String[] args) {
		BankOfAmerica boa = new BankOfAmerica();
		boa.setCheckingbalance(3000);
		
		ChaseBank cb= new ChaseBank();
		
		cb.chackingBalance=2000;
		cb.savingBalance=3000;
		cb.totalBlance();
		
		
		WellsfargoBank.checkingBalance=2000;
		WellsfargoBank.savingBalance=2000;
		WellsfargoBank.totalBalance();
		
		CityBank cb1= new CityBank();
		cb1.checkingBalance=1000;
		cb1.savingBalance=1000;
		cb1.totalBalance();
	

	}

}
