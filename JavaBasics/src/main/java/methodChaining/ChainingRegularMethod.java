		package methodChaining;
		
		
		class number{  // pojo class
			// two insatace variables
		private int age;
		String name;
		
		// constructor// 
		// requirement is we must add number of age with every age in put by the method.
		public number(int constructorAge) {
			age=constructorAge;
		}
		
		public number add(int reagAge) {
	// to chain a method, method: data type must be the class type. our class name is number.
	// and method has to be a return type method
	// can not be a void method.
			age+=reagAge;
			return this;
		}  
		
		public number name(String name) {
			// to chain a method, method: data type must be the class type. our class name is number.
			this.name=name;
			return this;
			
		}
		public void print() {
			// it is a void method.
			System.out.println(age+" "+name);
		}
		}
		
		public class ChainingRegularMethod {
		
			public static void main(String[] args) {
				number num= new number(4);
				num.add(35).name("Faruq").print();
				// add and name is a return type but print is void method.
				// as a result: we can not call print method in the begaining or 
				// in the middle. because void method can not have any return.
		
			}
			
		
		}
