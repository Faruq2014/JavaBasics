package accessModifier;

import AccessModifier1.CityBank;
import AccessModifier1.WellsfargoBank;

public class ClientApp extends WellsfargoBank {

	public static void main(String[] args) {
		WellsfargoBank.checkingBalance=2000;
		WellsfargoBank.savingBalance=2000;
		WellsfargoBank.totalBalance();
		
		CityBank cb= new CityBank();
		cb.checkingBalance=1000;
		cb.savingBalance=1000;
		cb.totalBalance();

	}
	

	
	

}
