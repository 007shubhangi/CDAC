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

    // public static void display( List<Employee> list1){
    //     for(Object ele:list1){
    //         System.out.println(ele+" ");
    //     }
    //     System.out.println(" ");
    // }   
}
public class Demo3{
    public static void main(String args[]){
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

        /*To print elements of list 
        System.out.println(list1);
        System.out.println(list2);

        for(Employee emp:list1){
            System.out.println(emp+" ");
        }
            */

        //Employee.display(list1);
       list1.addAll(list2);
        System.out.println(list2+ " ");//[10741 ramesh 1554551.2, 1001 rama 4551.2] 
        for(Employee e:list1){
            System.out.println(e);
        }
        System.out.println(" ");

        System.out.println("***********************************");
        list1.remove("ramesh");
        System.out.println(list1+ " ");
        //[1001 rama 4551.2, 1007 reema 455788.2, 1071 radhha 455221.2, 10741 ramesh 1554551.2, 1001 rama 4551.2] 

        for(Employee e:list1){
            System.out.println(e);
        }
        System.out.println(" ");

        System.out.println("*************************************");
        


    }
}