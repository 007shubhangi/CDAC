
//nested
class Person{	//Parent class / Super class
	class Date{	//Nested class
		public void print( ) {
			System.out.println("Inside nested class");
		}
	}
}

class Employee extends Person{	//Child class :  Sub class
	
}

public class Program5 {
	public static void main(String[] args) {
		Person.Date dt1 = new Person().new Date();
		dt1.print();
		
		Employee.Date dt2 = new Employee().new Date();
		dt2.print();
	}
}
