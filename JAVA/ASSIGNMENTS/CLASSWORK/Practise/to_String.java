class Employee{
    private String name;
    private int empid;
    private float salary;

    public Employee()
    {

    }
    public Employee(String name, int empid, float salary)
    {
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }
    //@Override
    /*/public String toString() {	//Method of java.lang.Object
        return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
        //Employee@36baf30c
    }*/
 
    public String toString() {
       // String str = this.empid + " " + this.name + " " + this.salary;
        //return str;
        return Employee [name + " " + salary];
    }
} 
public class to_String {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("shubhangi",1002,12.5f);
        System.out.println(e2.toString());//Employee@36baf30c 
                     //or
        String.valueOf(e2.toString());
    }
}
