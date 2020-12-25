package methodChaining;

public class ChaniningWithStringBuilder {

	public static void main(String[] args) {
		// java start execution from top to botoom and left to right. 
		// in method chaining same thing happen. 
		
		
		// String
		String name= "Molla";
		String fullName=name.concat(" ").concat("Academy ").toUpperCase();
		System.out.println(fullName);
	
		// String Builder
		StringBuilder sBuilder1 = new StringBuilder();
		StringBuilder reverse = sBuilder1.append("Molla").append("Academy").reverse();
		System.out.println(reverse);
		// String Buffer
		StringBuffer sBuffer = new StringBuffer();
		StringBuffer insert = sBuffer.append("Molla").append("Academy").insert(5, " ");
		System.out.println(insert);

		// mix match
		StringBuilder sBuilder2 = new StringBuilder();
		String upperCase = sBuilder2.append("Molla").append("Academy").toString().toUpperCase();
		System.out.println(upperCase);
	}

}
