package dataTypes;

public class Premitive {

	public static void main(String[] args) {
		Premitive premitive= new Premitive();
	   premitive.byteDataType((byte) 127);// if we input valid data we will get exact output, otherwise will loose data.
	    premitive.shorttDataType((short) 12345);
		premitive.intDataType(1234567890, 1);
		premitive.longDataType(0, 0);
		premitive.floatDataType(0, 0);
		premitive.doubleDataType(0, 0);

	}
	
	public byte  byteDataType( byte wages) {
		/*
		This can hold whole number between -128 and 127. 
		Mostly used to save memory and when you are certain that the numbers would be in the limit specified 
		by byte data type.
        Default size of this data type: 1 byte.
         Default value: 0
		*/
		 // so byte can take maximum 3 digits, and only can take less than 127  
		//wages=127;// 127 is maximum byte can handle
		//wages=128// too big for byte 
		//wages=-128;
		//wages=-129;too big.
	 
		System.out.println(wages+ " Byte can take maximum 3 digits and less then 127 and -128");
		return wages;
		
		
	}
	
	public  short shorttDataType(short hour) {
		
		
		//short total=hour*wages;// it is tough to do arithmetical operation with short or byte 
		//short total=(short) (hour*wages);// if your result  have more than short range you will loose the data.
		System.out.println(hour+ "so short can take maximum 5 digits");
		return hour =123;
		
	}

	public int intDataType(int hour, int wages) {
		/*
		int: Used when short is not large enough to hold the number,
		 it has a wider range: -2,147,483,648 to 2,147,483,647
		Default size: 4 byte
		Default value: 0
		*/
		hour =1234567890; // so int can take maximum 10 digits, 
		wages=1;
		int total=hour*wages;
		System.out.println(total+" "+"so int can take maximum 10 digits");
		return total;
		
	}
	
	public long longDataType(long hour, long wages) {
		/*
		Used when int is not large enough to hold the value, it has wider range than int data type,
		 ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        size: 8 bytes
         Default value: 0
		*/
		hour =1234567890; // so long can take maximum 10 digits, 
		wages=1234567;
		long total=hour*wages;
		System.out.println(total+" "+"so long can take maximum  digits");
		return total;
		
	}
	
	public double floatDataType(float hour, float wages) {
		/*
		float: Sufficient for holding 6 to 7 decimal digits
size: 4 bytes
		*/
		hour =12345678922223.1233f; // so long can take maximum  digits,make sure to write f to mention float 
		wages=1234567;
		float total=hour*wages;
		System.out.println(total+" "+"so float can take maximum  digits");
		return total;
		
	}

	
	public double doubleDataType(double hour, double wages) {
		/*
		double: Sufficient for holding 15 decimal digits
            size: 8 bytes
		*/
		hour =1234567890.123; // so long can take maximum 10 digits, 
		wages=1234567;
		double total=hour*wages;
		System.out.println(total+" "+"so double can take maximum  digits");
		return total;
		
	}
	
	
}
