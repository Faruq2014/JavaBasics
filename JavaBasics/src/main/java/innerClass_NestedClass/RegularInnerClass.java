package innerClass_NestedClass;


class Outer{
	int age=20;
	
	public Outer multipy() {
		int a=20, b=30;
		System.out.println(b-a);
		return this;
	}
	
	
	class Inner{
		public String name="Faruq";
		
		public Inner add() {
			int a=20, b=30;
			System.out.println(a+b);
			return this;
					
		}
		
		public Inner minus() {
			int a=20, b=30;
			System.out.println(b-a);
			return this;
					
		}
	}
}

public class RegularInnerClass {
	public static void main(String[] args) {
		Outer out = new Outer();
		//out.new Inner().add().minus();
		//out.multipy();
		
		
		Outer.Inner inner= out.new Inner();
		
		System.out.println(inner.add()+inner.name+" "+ out.age);
		out.multipy();
	}
    
    

}
