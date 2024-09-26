import java.util.*;

class Employee{
    private int empid;
    private String name;
    private float salary;

    public Employee(){}
    public Employee(int empid,String name,float salary){
        this.empid=empid;
        this.name=name;
        this.salary=salary;
    }

    public String toString(){
        return this.empid+" "+this.name+" "+this.salary;
    }

}
public class Iterator {
    public static void main(String[] args) {
        List<Employee> list1=new ArrayList<Employee>();

        Employee e1=new Employee(1001,"rama",4551.2f);
        Employee e2=new Employee(1007,"reema",455788.2f);
        Employee e3=new Employee(1071,"radhha",455221.2f);
        Employee e4=new Employee(10741,"ramesh",1554551.2f);

        list1.add(e1);
        list1.add(e2);
        list1.add(e3);
       

        List<Employee> list2=new ArrayList<Employee>();
        list2.add(e4);
        list2.add(e1);


         System.out.println("********************************************");

        //2. using Iterator	==> will be used to iterate any Collection object
        java.util.Iterator<Employee> itr=list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());}

        System.out.println("********************************************");
         //3. using ListIterator	==> will be used to iterate any Collection object
         ListIterator<Employee> emp=list2.listIterator();
         while(emp.hasNext())
         System.out.println(emp.next());
    
    }
}
