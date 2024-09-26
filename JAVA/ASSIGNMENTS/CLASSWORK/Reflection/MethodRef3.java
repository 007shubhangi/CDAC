class Employee{
   String name;

    public String getName(){
    return this.name;
     }
     public String toString(){
        return (String)this.name;
     }
}
interface  Sample{
    String getDetails(Employee emp);
}
public class MethodRef3 {
    public static void main(String[] args) {
        Employee emp=new Employee();
        Sample s1=(Employee e)->emp.getName();
        //Sample s1=Employee::getName;

    }
}
