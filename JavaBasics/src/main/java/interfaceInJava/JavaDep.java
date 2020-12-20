package interfaceInJava;
	public  class JavaDep implements FaruqAcademy{
	
	public static void main(String[] args) {
		
		
		// static binding polymorphism
		System.out.println("=====static binding polymorphism=====");
		JavaDep jDep = new JavaDep();
		jDep.deptName("Java");
		jDep.teacherInfo("Khaled");
		jDep.courseinfo();
		
		// dynamic binding polymorphism
		System.out.println("=====dynamic binding polymorphism=====");
		FaruqAcademy jdAcademy = new JavaDep();
		System.out.println(jdAcademy.universityName);
		jdAcademy.deptName("Java");
		jdAcademy.teacherInfo("Khaled");
		jdAcademy.courseinfo();
		// can not create object out of interface.
		//FaruqAcademy fdAcademy = new FaruqAcademy();
		
	
	}
		@Override
		public void deptName(String deptName) {
			deptName="Selenium";
			System.out.println("My department name is "+deptName);
			
		}
	
		@Override
		public void teacherInfo(String teacherName) {
			teacherName="Faruq";
			System.out.println("My name is"+teacherName);
			
		}
		@Override
		public void courseinfo() {
			
			System.out.println("Three months basic summer course with intermidate concept.");
			
		}
	
		
	
	}
