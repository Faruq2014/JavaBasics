package variables;

public class StaticAndNoStaticArea {
	
	
	//in java class there are two types of are, static and non static.
    //you must declare a static key word to make it static
	// by default everything is non static means instance.
	// access specifier
	// static property will have direct acees to any area
	// instance to instance direct access
	// instance to static indirect access
	
	 static String name="Tania";
	 String name1="Nahida";
	
	public static void main(String[] args) {
		StaticAndNoStaticArea sta=new StaticAndNoStaticArea();
		sta.m1();
		m2();

	}
	
	public void m1() {
		System.out.println(name);
		System.out.println(name1);
	}
	
	public static void m2() {
		System.out.println(name);
		// class referential access
		// class name,  variable , = new class name 
		
		StaticAndNoStaticArea sta= new StaticAndNoStaticArea();
		System.out.println(sta.name1);
	}
	
	
	
    public void m3() {
    	System.out.println(name);
	}
	
	
	
	
	
	
	

}
