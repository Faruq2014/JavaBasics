package dataTypes;

public class Premitive {

	public static void main(String[] args) {
		Premitive pre= new Premitive();
		pre.intDataType(32, 20);

	}
	
	public int intDataType(int hour, int wages) {
		int total=hour*wages;
		System.out.println(total);
		return total;
		
	}

}
