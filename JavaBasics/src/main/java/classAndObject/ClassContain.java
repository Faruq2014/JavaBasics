		package classAndObject;
		
		public class ClassContain {
			/*class contains five things
			 *  variable
			 * constructor
			 * instance block
			 * static block
			 * method
			 */
				
			
			String name;
			int eye;
			double hair;
			
			static String  familyname="Sikder";
			
			public ClassContain(String name, int eye, double hair) {
				this.name = name;
				this.eye = eye;
				this.hair = hair;
			}
			
			public static void main(String[] args) {
				ClassContain faruq = new ClassContain("Mohammed", 2, 100000.778);
				faruq.time(7);
				faruq.pray(35);
				
				ClassContain shahin=new ClassContain("Farid", 4, 200000.778);
				shahin.time(12);

			}
			


			
			int counter=0;
			{  counter ++;  }// instance block
			
			
			static{ System.out.println(familyname);     }// static block
		
			
			
			
		  public void time(int time) {
			if(time==8) {System.out.println("eat breakfast");
			}else if(time==8) {
				System.out.println("eat lunch");
			}else if(time==9) {
				System.out.println("eat dinner");
			}
		}
		
		  public static void pray(int age) {
			  if (age==10) {
				  System.out.println("must pray");
			}
			
		}
		  
		  
		  
		}
