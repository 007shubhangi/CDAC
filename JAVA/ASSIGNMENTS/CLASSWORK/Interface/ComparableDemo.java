//see program file for comparator interface example

import java.util.Arrays;

class Employee implements Comparable<Employee>{
    String name;
    int empid;
    float salary;

    public Employee(String name,int empid,float salary){
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }
    public Employee(){}
    public String toString(){
        return String.format("%-10s%-5d%-20f", this.name,this.empid,this.salary);
    }
    //Employee this current instance 
    //Employee other other instance
    public int compareTo(Employee Other){
        // if(this.empid>Other.empid)
        //     return +1;
        // else if(this.empid<Other.empid)
        //      return -1;
        // else
        //     return 0;

        //return this.empid-Other.empid;
        //return this.name.compareTo(Other.name);
        return (int)(this.salary-Other.salary);
    }
}
public class ComparableDemo {
    public static Employee[] getArray(){
        Employee[] emp=new Employee[3];
        emp[0]=new Employee("shubh", 1002, 1002.4f);
        emp[1]=new Employee("prath", 1402, 7402.4f);
        emp[2]=new Employee("raj", 452, 87922.4f);
        return emp;
    }
    private static void print(Employee[]arr ){
        for(Employee emp: arr){
            System.out.println(emp.toString());
           
        }
    }
    public static void main(String[] args) {
        Employee[] emp=ComparableDemo.getArray();
        ComparableDemo.print(emp);
         System.out.println("***************************");
         Arrays.sort(emp);
        ComparableDemo.print(emp);
   
    }
}
