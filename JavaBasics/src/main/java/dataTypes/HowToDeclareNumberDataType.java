package dataTypes;

/**
 * @author Faruq
 *this class is to show, how to declare number or primitive data type.
 */
public class HowToDeclareNumberDataType {

	public static void main(String[] args) {
		// full number data type
		byte balance = 123;
		//byte balance1 = 9876;// you might go out of range
		int checkingBalance = 1234567890;
		//int checkingBalance1 = 9876543210;// you might go out of rance
		//int checkingBalance1 = 9876543210;//even thoug it still 10 digit but no gurentee that java will allow.
		long savingBalance = 1234567890123456789l;// l at the end

		// decimal number
		float money = 123456789.8773f;// f at the end
		double money1 = 123456.656;
		// boolean data type
		boolean b = true;
		boolean f = false;

		// character;
		char faruq = 'F';
	
	}

}
