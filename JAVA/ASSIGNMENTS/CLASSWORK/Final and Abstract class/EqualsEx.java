//equals()
class Employee{	//class Employee extends Object{
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
	/* public boolean equals(Object obj){
	  		return this == obj;
	   }
	 */
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	
}
public class EqualsEx {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Sandeep", 33, 45000.50f);
		Employee emp2 = new Employee("Sandeep", 33, 45000.50f);
		
		if( emp1.equals(emp2 ) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
