package returnType;

public class ArrayReturn {

	public static void main(String[] args) {
		// since name method has return type, we can any function.
		
	String []list=name("Shahin", "Habib", "Shimul", "Razu");
	// creating reference variable list of String [] type
    System.out.println(list[0]);
    System.out.println(list[1]);
    System.out.println(list[2]);
    System.out.println(list[3]);
    // printing by loop
    for(String size : list) { System.out.println("\n printing from loop"+" "+size);}
    
// changing the value of all the array list
    String stu3 =list[3]="Mohammed";
    String stu2 =list[2]="Farid";
    String stu1 =list[1]="Uddin";
    String stu0 =list[0]="Sikder";
    System.out.println("\n"+stu3+" "+stu2+" "+stu1+" "+stu0);
    //String fullName= stu3+stu2+stu1+stu0;
   // System.out.println(fullName);
    
    
    // Changing the value again but not storing the value.
    list[0]="Arif";
    list[1]="Kamal";
    list[2]="Kazi";
    list[3]="Farid";
    System.out.println();// just to create empty space
    System.out.println(list[0]);
    System.out.println(list[1]);
    System.out.println(list[2]);
    System.out.println(list[3]);

	}
	
	public static String[] name(String Shahin,  String Habib, String Shimul,String Razu) {
		String[] array = new String[4];
		array[0]=Shahin;
		array[1]=Habib;
		array[2]=Shimul;
    	array[3]=Razu;
		return array;
		
	}

}
